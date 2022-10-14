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
public interface Ireserva {
    public void agregarReserva(reserva r);
    public void modificarReserva(reserva r);
    public List<reserva> listaTotal();
    public List<reserva> listaFiltro(String codigo);
    public reserva consultaReserva(String codigo);
    public usuario consultaUsuario(String codigo);
    public usuario consultaMesa(String codigo);
}