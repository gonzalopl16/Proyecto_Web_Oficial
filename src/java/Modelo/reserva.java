
package Modelo;

public class reserva {
    private String codigoReserva;
    private String codigoUsuario;
    private String codigoMesa;
    private int personas;
    private String fecha;

    public reserva() {
    }

    public reserva(String codigoReserva, String codigoUsuario, String codigoMesa, int personas, String fecha) {
        this.codigoReserva = codigoReserva;
        this.codigoUsuario = codigoUsuario;
        this.codigoMesa = codigoMesa;
        this.personas = personas;
        this.fecha = fecha;
    }

    public String getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(String codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    public String getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(String codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public String getCodigoMesa() {
        return codigoMesa;
    }

    public void setCodigoMesa(String codigoMesa) {
        this.codigoMesa = codigoMesa;
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
