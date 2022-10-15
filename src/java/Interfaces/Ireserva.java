
package Interfaces;

import Modelo.*;
import java.util.List;

public interface Ireserva {
    public void añadirReserva(reserva r);
    /*public void eliminarReserva(String codigo);*/
    public void modificarReserva(reserva r);
    public List<reserva> listaTotalReserva();
    public List<reserva> listaReserva(String codUsuario);
    public reserva consultaReserva(String codigoReserva);
    
}
