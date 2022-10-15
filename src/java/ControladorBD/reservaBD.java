package ControladorBD;

import Interfaces.*;
import Modelo.*;
import java.util.List;
import ConexionBD.MySQLConexion;
import java.sql.*;
import java.util.ArrayList;

public class reservaBD implements Ireserva {

    @Override/*funciona*/
    public void añadirReserva(reserva r) {
        Connection cn = MySQLConexion.getConexion();
        try {
            String sql="insert into reserva(codigoReserva,codigoUsuario,codigoMesa,personas,Fecha)values(?,?,?,?,?)";
            PreparedStatement pr = cn.prepareStatement(sql);
            pr.setString(1, r.getCodigoReserva());
            pr.setString(2, r.getCodigoUsuario());
            pr.setString(3, r.getCodigoMesa());
            pr.setInt(4, r.getPersonas());
            pr.setString(5, r.getFecha());
            pr.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override/*funciona*/
    public void modificarReserva(reserva r) {
        Connection cn = MySQLConexion.getConexion();
        try {
            String sql = "update reserva set personas=?, Fecha=? where codigoReserva=?";
            PreparedStatement pr = cn.prepareStatement(sql);
            pr.setInt(1, r.getPersonas());
            pr.setString(2, r.getFecha());
            pr.setString(3, r.getCodigoReserva());
            pr.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }

    @Override/*funciona*/
    public List<reserva> listaTotalReserva() {
        Connection cn = MySQLConexion.getConexion();
        List<reserva> list = new ArrayList();
        reserva r=null;
        try {
            String sql = "select codigoReserva,codigoUsuario,codigoMesa,personas,Fecha from reserva";
            PreparedStatement pr = cn.prepareStatement(sql);
            ResultSet rs = pr.executeQuery();
            while(rs.next()){
                r = new reserva();
                r.setCodigoReserva(rs.getString(1));
                r.setCodigoUsuario(rs.getString(2));
                r.setCodigoMesa(rs.getString(3));
                r.setPersonas(rs.getInt(4));
                r.setFecha(rs.getString(5));
                list.add(r);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } 
        return list;
    }

    @Override
    public List<reserva> listaReserva(String codUsuario) {
        return null;
    }

    @Override/*funciona*/
    public reserva consultaReserva(String codigoReserva) {
        Connection cn = MySQLConexion.getConexion();
        reserva r = null;
        try {
            String sql = "select codigoReserva, codigoUsuario, codigoMesa, personas, Fecha from reserva where codigoReserva=?";
            PreparedStatement pr = cn.prepareStatement(sql);
            pr.setString(1, codigoReserva);
            ResultSet rs = pr.executeQuery();
            if (rs.next()) {
                r = new reserva();
                r.setCodigoReserva(rs.getString(1));
                r.setCodigoUsuario(rs.getString(2));
                r.setCodigoMesa(rs.getString(3));
                r.setPersonas(rs.getInt(4));
                r.setFecha(rs.getString(5));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return r;
    }

    /*funciona*/
    public int fechareserva(String fecha) {
        Connection cn = MySQLConexion.getConexion();
        int tope=0;
        try {
            String sql = "SELECT COUNT(r.Fecha)\n" +
                         "from reserva r\n" +
                         "where r.Fecha=?";
            PreparedStatement pr = cn.prepareStatement(sql);
            pr.setString(1, fecha);
            ResultSet rs = pr.executeQuery();
            if(rs.next()){
            tope=rs.getInt(1);
            }
        } catch (Exception e) {
        }
        
        return tope;
    }
    
}
