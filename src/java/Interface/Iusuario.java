/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Modelo.*;
import java.util.List;
/**
 *
 * @author Sebastian Palomino Vivanco <your.name at your.org>
 */
public interface Iusuario {
    public void añadirUsuario(usuario u);
    public void modificarUsuario(usuario u, String idu);
    public void eliminarUsuario(String idu);
    public List<usuario> listaUsuario();
    public usuario consultaUsuario(String idu);
}
