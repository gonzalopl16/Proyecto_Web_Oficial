/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Modelo.*;
import java.util.ArrayList;

/**
 *
 * @author Sebastian Palomino Vivanco <your.name at your.org>
 */
public interface Imesa {
    public mesa consultarMesa(String ID_Mesa);
    public ArrayList<mesa> listar(); 
}
