package Configuracion;

import ControladorBD.*;
import Modelo.*;
import java.io.IOException;
import java.util.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "Confi_reserva", urlPatterns = {"/Confi_reserva"})
public class Confi_reserva extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       //////////////////////////////////////
       String valor = request.getParameter("accion");
       String pagina="";
       BDplato pbd=new BDplato();
       BDmesa mbd=new BDmesa();
       BDreserva rbd=new BDreserva();
       /////////////////////////////////////
       if(valor.equals("AgregarReserva")){
       pagina="reserva/agregar.jsp";
       }
       ////////////////////////////////////
       if(valor.equals("sesion")){
       String codigoU="U00001";
       request.setAttribute("codigoUsuario", codigoU);
       pagina="reserva/agregar.jsp";
       }
       ////////////////////////////////////
       /*Muestra de los platos*/
       List<platos> listaP=pbd.listaTotal();
       request.setAttribute("listaP", listaP);
       /*Muestra de las mesas*/
       List<mesa> listaM=mbd.listar();
       request.setAttribute("tipoM", listaM);
       ///////////////////////////////////
       /*Colorea el calendario dependiendo de la cantidad disponible en el restaurante*/
       int capacidad = rbd.topeReserva();
       String estado=(capacidad>30)?"Rojo":"Verde";
       request.setAttribute("estado", estado);
       ///////////////////////////////////
       RequestDispatcher rd = request.getRequestDispatcher(pagina);
       rd.forward(request, response);
       ///////////////////////////////////
       /*
       SELECT COUNT(day(Fecha)) as reservas, day(Fecha) as dia, month(Fecha) as mes
from reserva
GROUP BY day(Fecha)
       */
       
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
