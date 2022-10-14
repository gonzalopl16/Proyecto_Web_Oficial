
package Modelo;

public class reserva {
    private String codigoReserva;
    private usuario usuario;
    private mesa mesa;
    private int personas;
    private String fecha;

    public reserva() {
    }

    public String getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(String codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    public usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(usuario usuario) {
        this.usuario = usuario;
    }

    public mesa getMesa() {
        return mesa;
    }

    public void setMesa(mesa mesa) {
        this.mesa = mesa;
    }

    public int getPersonas() {
        return personas;
    }

    public void setPersonas(int personas) {
        this.personas = personas;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
}
