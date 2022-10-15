
package ControladorBD;
import Interfaces.*;
import Modelo.*;
import java.util.List;
import ConexionBD.MySQLConexion;
import java.sql.*;
import java.util.ArrayList;

public class detalleBD implements Idetalle{

    @Override/*funciona*/
    public void añadirDetalle(detalle d) {
       Connection cn = MySQLConexion.getConexion();
        try {
            String sql="insert into detallereserva(codigoDetalle,codigoReserva,codigoPlato,cantidad,Precio)values(?,?,?,?,?)";
            PreparedStatement pr = cn.prepareStatement(sql);
            pr.setString(1, d.getCodigoDetalle());
            pr.setString(2, d.getCodigoReserva());
            pr.setString(3, d.getCodigoPlato());
            pr.setInt(4, d.getCantidad());
            pr.setDouble(5, d.getPrecio());
            pr.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override/*funciona*/
    public void eliminarDetalle(String codigoDetalle) {
      Connection cn = MySQLConexion.getConexion();
        try {
            String sql="delete from detallereserva where codigoDetalle=?";
            PreparedStatement pr = cn.prepareStatement(sql);
            pr.setString(1, codigoDetalle);
            pr.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override/*funciona*/
    public void modificarDetalle(detalle d) {
       Connection cn = MySQLConexion.getConexion();
        try {
            String sql = "update detallereserva set codigoPlato=?, cantidad=?, precio=?"
                      + " where codigoDetalle=?";
            PreparedStatement pr = cn.prepareStatement(sql);
            pr.setString(1, d.getCodigoPlato());
            pr.setInt(2, d.getCantidad());
            pr.setDouble(3, d.getPrecio());
            pr.setString(4, d.getCodigoDetalle());
            pr.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override/*funciona*/
    public List<detalle> listaTotal() {
       Connection cn = MySQLConexion.getConexion();
        List<detalle> list = new ArrayList();
        detalle d=null;
        try {
            String sql = "select codigoDetalle, codigoReserva, codigoPlato, cantidad, precio from detallereserva";
            PreparedStatement pr = cn.prepareStatement(sql);
            ResultSet rs = pr.executeQuery();
            while(rs.next()){
                d = new detalle();
                d.setCodigoDetalle(rs.getString(1));
                d.setCodigoReserva(rs.getString(2));
                d.setCodigoPlato(rs.getString(3));
                d.setCantidad(rs.getInt(4));
                d.setPrecio(rs.getDouble(5));
                list.add(d);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
        return list;
    }

    @Override
    public List<detalle> listaDetalle(String codigoReserva) {
      
        return null;
    }

    @Override/*funciona*/
    public detalle consultaDetalle(String codigoDetalle) {
        Connection cn = MySQLConexion.getConexion();
        detalle d = null;
        try {
            String sql = "select codigoDetalle, codigoReserva, codigoPlato, cantidad, precio from detallereserva where codigoDetalle=?";
            PreparedStatement pr = cn.prepareStatement(sql);
            pr.setString(1, codigoDetalle);
            ResultSet rs = pr.executeQuery();
            if (rs.next()) {
                d = new detalle();
                d.setCodigoDetalle(rs.getString(1));
                d.setCodigoReserva(rs.getString(2));
                d.setCodigoPlato(rs.getString(3));
                d.setCantidad(rs.getInt(4));
                d.setPrecio(rs.getDouble(5));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return d;
    }
    
    /*funciona*/
    public List<detalletabla> listaTabla(String codU){
    Connection cn = MySQLConexion.getConexion();
      List<detalletabla> lista = new ArrayList();
      detalletabla d=null;
        try {
            String sql="SELECT p.nombre, dr.cantidad, dr.precio, r.Fecha, dr.codigoDetalle\n" +
                        "from usuario u inner join reserva r on(u.codigoUsuario=r.codigoUsuario)\n" +
                        "INNER join detallereserva dr on(dr.codigoReserva=r.codigoReserva)\n" +
                        "INNER join plato p on(p.codigoPlato=dr.codigoPlato)\n" +
                        "where u.codigoUsuario=?";
            PreparedStatement pr = cn.prepareStatement(sql);
            pr.setString(1, codU);
            ResultSet rs = pr.executeQuery();
            while(rs.next()){
            d=new detalletabla();
            d.setNombreP(rs.getString(1));
            d.setCantidadP(rs.getInt(2));
            d.setPrecioP(rs.getDouble(3));
            d.setFecha(rs.getString(4));
            d.setCodigoD(rs.getString(5));
            lista.add(d);
            }
           
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }
    
    
}
