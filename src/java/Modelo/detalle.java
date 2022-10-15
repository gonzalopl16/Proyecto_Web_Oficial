
package Modelo;

public class detalle {
    private String codigoDetalle;
    private String codigoReserva;
    private String codigoPlato;
    private int cantidad;
    private double precio;

    public detalle() {
    }

    public detalle(String codigoDetalle, String codigoReserva, String codigoPlato, int cantidad, double precio) {
        this.codigoDetalle = codigoDetalle;
        this.codigoReserva = codigoReserva;
        this.codigoPlato = codigoPlato;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    
    public String getCodigoDetalle() {
        return codigoDetalle;
    }

    public void setCodigoDetalle(String codigoDetalle) {
        this.codigoDetalle = codigoDetalle;
    }

    public String getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(String codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    public String getCodigoPlato() {
        return codigoPlato;
    }

    public void setCodigoPlato(String codigoPlato) {
        this.codigoPlato = codigoPlato;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
   

    
}
