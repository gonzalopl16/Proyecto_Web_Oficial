
package ControladorBD;

import ConexionBD.MySQLConexion;
import java.util.List;
import Modelo.platos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
public class platoBD {
    
      public List<platos> listaTotal() {
        Connection cn = MySQLConexion.getConexion();
        List<platos> lista=new ArrayList();
        platos p=null;
        try {
            String sql="select codigoPlato,nombre,origen,precio from plato";
            PreparedStatement pr = cn.prepareStatement(sql);
            ResultSet rs = pr.executeQuery();
            while(rs.next()){
            p=new platos();
            p.setCodigoPlato(rs.getString(1));
            p.setNombre(rs.getString(2));
            p.setOrigen(rs.getString(3));
            p.setPrecio(rs.getDouble(4));
            lista.add(p);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
       return lista;
    }
      public platos consulta(String codP){
      Connection cn = MySQLConexion.getConexion();
      platos p=null;
          try {
              String sql="select precio from plato where codigoPlato=?";
              PreparedStatement pr = cn.prepareStatement(sql);
              pr.setString(1, codP);
              ResultSet rs = pr.executeQuery();
              if(rs.next()){
              p=new platos();
              p.setPrecio(rs.getDouble(1));
              }
          } catch (Exception e) {
          }
          return p;
      }
    
}
