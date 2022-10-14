package ControladorBD;

import Interface.*;
import Modelo.*;
import java.util.List;
import ConexionBD.MySQLConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BDdetallereserva implements Idetallereserva{

    
    reserva r = new reserva();
    BDreserva bdr = new BDreserva();
    platos p = new platos();
    BDplato bp = new BDplato();

    @Override
    public void añadirDetalle(detalle d) {
        Connection cn = MySQLConexion.getConexion();
        try {
            String sql = "insert into reserva (codigoReserva, codigoUsuario, codigoMesa, personas, Fecha) values (?,?,?,?,?)";
            PreparedStatement pr = cn.prepareStatement(sql);
            pr.setString(1, d.getCodigoDetalle());
            pr.setString(2, d.getReserva().getCodigoReserva());
            pr.setString(3, d.getPlatos().getCodigoPlato());
            pr.setInt(4, d.getCantidad());
            pr.setDouble(5, d.getPrecio());
            pr.executeQuery();
        } catch (SQLException ex) {
        } finally {
            try {
                cn.close();
            } catch (SQLException ex) {

            }
        }}

    @Override
    public void modificarDetalle(detalle d) {
        Connection cn = MySQLConexion.getConexion();
        try {
            String sql = "update reserva set codigoDetalle=?, codigoReserva=?, codigoPlato=?, cantidad=?, precio=? where codigoDetalle=" + d.getCodigoDetalle();
            PreparedStatement pr = cn.prepareStatement(sql);
            pr.setString(1, d.getCodigoDetalle());
            pr.setString(2, d.getReserva().getCodigoReserva());
            pr.setString(3, d.getPlatos().getCodigoPlato());
            pr.setInt(4, d.getCantidad());
            pr.setDouble(5, d.getPrecio());
            pr.executeUpdate();
        } catch (SQLException ex) {
        } finally {
            try {
                cn.close();
            } catch (SQLException ex) {

            }
        }
    }

    @Override
    public void eliminarDetalle(String codigo) {
        Connection cn = MySQLConexion.getConexion();
        try {
            String sql = "delete from detallereserva where codigoDetalle=" + codigo;
            PreparedStatement pr = cn.prepareStatement(sql);
            pr.executeUpdate();
        } catch (SQLException ex) {
        } finally {
            try {
                cn.close();
            } catch (SQLException ex) {

            }
        }
    }

    @Override
    public detalle ConsultarDetalle(String codigo) {
    detalle d = null;
        Connection cn = MySQLConexion.getConexion();
        try {
            String sql = "select codigoDetalle, codigoReserva, codigoPlato, cantidad, precio from detallereserva where codigoDetalle=" + codigo;
            PreparedStatement st = cn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                d = new detalle();
                d.setCodigoDetalle(rs.getString(1));
                r = bdr.consultaReserva(rs.getString(2));
                d.setReserva(r);
                p = bp.consultarPlato(rs.getString(3));
                d.setPlatos(p);
                d.setCantidad(rs.getInt(4));
                d.setPrecio(rs.getDouble(5));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                cn.close();
            } catch (Exception e2) {

            }
        }
        return d;
    }
    
    @Override
    public List<reserva> listaTotal() {
        Connection cn = MySQLConexion.getConexion();
        detalle d;
        ArrayList<reserva> list = new ArrayList<>();
        try {
            String sql = "select * from reserva";
            PreparedStatement pr = cn.prepareStatement(sql);
            ResultSet rs = pr.executeQuery();
            while(rs.next()){
                d = new detalle();
                d.setCodigoDetalle(rs.getString("codigoDetalle"));
                r = bdr.consultaReserva(rs.getString("codigoReserva"));
                d.setReserva(r);
                p = bp.consultarPlato(rs.getString("codigoPlato"));
                d.setPlatos(p);
                d.setCantidad(rs.getInt("cantidad"));
                d.setPrecio(rs.getDouble("precio"));
                list.add(r);
            }
        } catch (SQLException ex) {
        } finally {
            try {
                cn.close();
            } catch (SQLException ex) {

            }
        }
        return list;
    }
    
}
