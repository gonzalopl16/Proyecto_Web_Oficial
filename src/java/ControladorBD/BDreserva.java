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
    detalle d = new detalle();
    BDdetallereserva bdr = new BDdetallereserva();
    mesa m = new mesa();
    BDmesa bm = new BDmesa();
    
    @Override
    public void agregarReserva(reserva r) {
        Connection cn = MySQLConexion.getConexion();
        try {
            String sql = "insert into reserva (ID_Reserva, usuario, detalle, cantidadPersonas, mesa, fecha) values (?,?,?,?,?,?)";
            PreparedStatement pr = cn.prepareStatement(sql);
            pr.setString(1, r.getCodigoReserva());
            pr.setString(2, r.getUsuario().getCodigoUsuario());
            pr.setString(3, r.getMesa().getCodigoMesa());
            pr.setInt(4, r.getPersonas());
            pr.setString(5, r.getFecha());
            ResultSet rs = pr.executeQuery();
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
            String sql = "update reserva set usuario=?, detalle=?, cantidadPersonas=?, mesa=?, fecha=? where ID_Reserva=" + r.getCodigoReserva();
            PreparedStatement pr = cn.prepareStatement(sql);
            pr.setString(1, r.getUsuario().getCodigoUsuario());
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
                r.setCodigoReserva(rs.getString("ID_Reserva"));
                u = consultaUsuario(rs.getString("ID_Usuario"));
                r.setUsuario(u);
                r.setPersonas(rs.getInt("CantidadPersonas"));
                m = bm.consultarMesa(rs.getString("ID_Mesa"));
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public usuario consultaUsuario(String codigo) {
        Connection cn = MySQLConexion.getConexion();
        usuario c = null;
        try {
            String sql = "select r.ID_Usuario"
                    + " from reserva r inner join usuario u on(r.ID_Usuario=u.ID_Usuario)"
                    + " where r.ID_Reserva=?";
            PreparedStatement pr = cn.prepareStatement(sql);
            pr.setString(1, codigo);
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                c = new usuario();
                /*c.setCodigo(rs.getString(1));*/
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return c;
    }

    @Override
    public usuario consultaMesa(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<reserva> listaFiltro(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int topeReserva(){
        return 0;
    }
}
