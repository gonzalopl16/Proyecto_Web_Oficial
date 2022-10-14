package ControladorBD;

import Interface.Ireserva;
import Modelo.*;
import java.util.List;
import ConexionBD.MySQLConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BDreserva implements Ireserva {

    usuario u = new usuario();
    BDusuario bu = new BDusuario();
    detalle d = new detalle();
    BDdetallereserva bdr = new BDdetallereserva();
    mesa m = new mesa();
    BDmesa bm = new BDmesa();
    
    @Override
    public void agregarReserva(reserva r) {
        Connection cn = MySQLConexion.getConexion();
        try {
            String sql = "insert into reserva (codigoReserva, codigoUsuario, codigoMesa, personas, Fecha) values (?,?,?,?,?)";
            PreparedStatement pr = cn.prepareStatement(sql);
            pr.setString(1, r.getCodigoReserva());
            pr.setString(2, r.getUsuario().getCodigoUsuario());
            pr.setString(3, r.getMesa().getCodigoMesa());
            pr.setInt(4, r.getPersonas());
            pr.setString(5, r.getFecha());
            pr.executeQuery();
        } catch (SQLException ex) {
        } finally {
            try {
                cn.close();
            } catch (SQLException ex) {

            }
        }
    }

    @Override
    public void modificarReserva(reserva r) {
        Connection cn = MySQLConexion.getConexion();
        try {
            String sql = "update reserva set codigoReserva=?, codigoUsuario=?, mesa=?, personas=?, Fecha=? where codigoReserva=" + r.getCodigoReserva();
            PreparedStatement pr = cn.prepareStatement(sql);
            pr.setString(1, r.getCodigoReserva());
            pr.setString(2, r.getUsuario().getCodigoUsuario());
            pr.setString(3, r.getMesa().getCodigoMesa());
            pr.setInt(4, r.getPersonas());
            pr.setString(5, r.getFecha());
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
    public List<reserva> listaTotal() {
        Connection cn = MySQLConexion.getConexion();
        reserva r;
        ArrayList<reserva> list = new ArrayList<>();
        try {
            String sql = "select * from reserva";
            PreparedStatement pr = cn.prepareStatement(sql);
            ResultSet rs = pr.executeQuery();
            while(rs.next()){
                r = new reserva();
                r.setCodigoReserva(rs.getString("codigoReserva"));
                u = bu.consultaUsuario(rs.getString("codigoUsuario"));
                m = bm.consultarMesa(rs.getString("mesa"));
                r.setUsuario(u);
                r.setPersonas(rs.getInt("personas"));
                r.setMesa(m);
                r.setFecha(rs.getString("Fecha"));
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

    @Override
    public reserva consultaReserva(String codigo) {
        reserva r = null;
        Connection cn = MySQLConexion.getConexion();
        try {
            String sql = "select codigoReserva, codigoUsuario, codigoMesa, personas, Fecha from reserva where codigoReserva=" + codigo;
            PreparedStatement st = cn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                r = new reserva();
                r.setCodigoReserva(rs.getString(1));
                u = bu.consultaUsuario(rs.getString(2));
                r.setUsuario(u);
                m = bm.consultarMesa(rs.getString(3));
                r.setMesa(m);
                r.setPersonas(rs.getInt(4));
                r.setFecha(rs.getString(5));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                cn.close();
            } catch (Exception e2) {

            }
        }
        return r;
    }

    public int topeReserva(){
        return 0;
    }
}
