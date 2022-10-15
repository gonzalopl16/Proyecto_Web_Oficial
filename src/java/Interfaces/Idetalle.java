
package Interfaces;

import Modelo.*;
import java.util.List;

public interface Idetalle {
    public void añadirDetalle(detalle d);
    public void eliminarDetalle(String codigoDetalle);
    public void modificarDetalle(detalle d);
    public List<detalle> listaTotal();
    public List<detalle> listaDetalle(String codigoReserva);
    public detalle consultaDetalle(String codigoDetalle);
}
