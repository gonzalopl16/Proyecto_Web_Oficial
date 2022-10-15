/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControladorBD;

import Modelo.detalle;
import Modelo.reserva;
import java.util.List;

/**
 *
 * @author usuario
 */
public class pruebasbd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        reservaBD r = new reservaBD();
        reserva re = new reserva("R00001", "", "",3, "2022-10-16");
        reserva re2 = r.consultaReserva(re.getCodigoReserva());
        System.out.println(re2.getFecha());
    }
    
}
