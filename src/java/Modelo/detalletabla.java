
package Modelo;

public class detalletabla {
    private String codigoD;
    private String fecha;
    private String nombreP;
    private int cantidadP;
    private double precioP;

    public detalletabla() {
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public int getCantidadP() {
        return cantidadP;
    }

    public void setCantidadP(int cantidadP) {
        this.cantidadP = cantidadP;
    }

    public double getPrecioP() {
        return precioP;
    }

    public void setPrecioP(double precioP) {
        this.precioP = precioP;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCodigoD() {
        return codigoD;
    }

    public void setCodigoD(String codigoD) {
        this.codigoD = codigoD;
    }
    
}
