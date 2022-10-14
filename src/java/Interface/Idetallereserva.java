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
public interface Idetallereserva {
    public void añadirDetalle(detalle d);
    public void modificarDetalle(detalle d);
    public void eliminarDetalle(String codigo);
    public List<reserva> listaTotal();
    public detalle ConsultarDetalle(String codigo);
    
}
