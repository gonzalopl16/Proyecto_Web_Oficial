
package Modelo;

public class detalle {
    private String codigoDetalle;
    private reserva reserva;
    private platos platos;
    private int cantidad;
    private double precio;

    public detalle() {
    }

    public String getCodigoDetalle() {
        return codigoDetalle;
    }

    public void setCodigoDetalle(String codigoDetalle) {
        this.codigoDetalle = codigoDetalle;
    }

    public reserva getReserva() {
        return reserva;
    }

    public void setReserva(reserva reserva) {
        this.reserva = reserva;
    }

    public platos getPlatos() {
        return platos;
    }

    public void setPlatos(platos platos) {
        this.platos = platos;
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
