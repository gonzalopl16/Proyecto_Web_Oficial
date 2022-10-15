package Configuracion;

import ControladorBD.*;
import Modelo.*;
import java.io.IOException;
import java.util.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.util.Date;
import java.text.SimpleDateFormat;
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
        
        String valor=request.getParameter("accion");
        String pagina="";
        int sesionPrendida=0;
        
        if(valor.equals("AgregarReserva")){
        pagina="reserva/agregar.jsp";
        }
        if(valor.equals("IniciarSesion")){
        sesionPrendida=1;
        pagina="reserva/agregar.jsp";
        }
        if(valor.equals("RegistrarReserva")){
        reservaBD rbd=new reservaBD();
        String codigoR=request.getParameter("codR");
        String codigoU=request.getParameter("codU");
        String codigoM=request.getParameter("mesa");
        int cantidadP=Integer.parseInt(request.getParameter("cantidadP"));
        String añoMes=request.getParameter("fecha");
        String dia=request.getParameter("dia");
        String fecha=añoMes+"-"+dia;
        reserva r = new reserva(codigoR, codigoU, codigoM, cantidadP, fecha);
        int capacidad = rbd.fechareserva(fecha);
        if(capacidad>30){
        pagina="reserva/agregar.jsp";
        }
        if(capacidad<=30){
        rbd.añadirReserva(r);
        sesionPrendida=1;
        request.setAttribute("codR", codigoR);
        request.setAttribute("codU", codigoU);
        request.setAttribute("fecha", fecha);
        pagina="reserva/agregar.jsp";
        }
        }
        if(valor.equals("RegistrarDetalle")){
        String codigoU=request.getParameter("codigoU");
        String codigoD=request.getParameter("codigoD");
        String codigoR=request.getParameter("codigoR");
        String codigoP=request.getParameter("codigoP");
        String fecha=request.getParameter("fecha");
        int cantidadP=Integer.parseInt(request.getParameter("cantidadP"));
        platoBD pbd=new platoBD();
        double precioT=cantidadP*pbd.consulta(codigoP).getPrecio();
        detalle d = new detalle(codigoD, codigoR, codigoP, cantidadP, precioT);
        detalleBD dbd=new detalleBD();
        dbd.añadirDetalle(d);
        request.setAttribute("codD", codigoD);
        request.setAttribute("codR", codigoR);
        sesionPrendida=1;
        pagina="reserva/agregar.jsp";
        }
        
        
        if(sesionPrendida==1){
        String codigoUsuario = "U00001";
        request.setAttribute("codU", codigoUsuario);
        detalleBD dbd=new detalleBD();
        List<detalletabla> lista=dbd.listaTabla(codigoUsuario);
        request.setAttribute("listaDT", lista);
        }
        if(valor.equals("EliminarDetalle")){
        detalleBD dbd= new detalleBD();
        String codigoD=request.getParameter("codigo");
        dbd.eliminarDetalle(codigoD);
        sesionPrendida=1;
        pagina="reserva/agregar.jsp";
        }
        
        mesaBD mbd = new mesaBD();
        List<mesa> listaMesa=mbd.listaTotal();
        request.setAttribute("listaM", listaMesa);
        
        platoBD pbd = new platoBD();
        List<platos> listaPlatos=pbd.listaTotal();
        request.setAttribute("listaP", listaPlatos);
        
        RequestDispatcher rd = request.getRequestDispatcher(pagina);
        rd.forward(request, response);
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
