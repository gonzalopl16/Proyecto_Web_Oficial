
package ControladorBD;

import Modelo.mesa;
import java.sql.Connection;
import java.util.List;
import ConexionBD.MySQLConexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
public class mesaBD {
    public List<mesa> listaTotal() {
        Connection cn = MySQLConexion.getConexion();
        List<mesa> lista=new ArrayList();
        mesa m=null;
        try {
            String sql="select codigoMesa, tipo, estado from mesa";
            PreparedStatement pr = cn.prepareStatement(sql);
            ResultSet rs = pr.executeQuery();
            while(rs.next()){
            m=new mesa();
            m.setCodigoMesa(rs.getString(1));
            m.setTipo(rs.getString(2));
            m.setEstado(rs.getString(3));
            lista.add(m);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
       return lista;
    }
}
