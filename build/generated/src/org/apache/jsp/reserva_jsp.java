package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reserva_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        .mes{\n");
      out.write("            width: 80px;\n");
      out.write("        }\n");
      out.write("        .mes:hover{\n");
      out.write("            background-color: #CCDF95;\n");
      out.write("        }\n");
      out.write("        .semana{\n");
      out.write("            width: 80px;\n");
      out.write("        }\n");
      out.write("        .semana:hover{\n");
      out.write("            background-color: #CCDF95;\n");
      out.write("        }\n");
      out.write("        .dias{\n");
      out.write("            width: 80px;\n");
      out.write("        }\n");
      out.write("        .dias:hover{\n");
      out.write("            background-color: #CCDF95;\n");
      out.write("        }\n");
      out.write("        .general-semana {\n");
      out.write("            position: absolute;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        <h1>Pagina de reserva</h1><br>\n");
      out.write("\n");
      out.write("        <div>\n");
      out.write("            <table border=\"1\" style=\"text-align: center;\">\n");
      out.write("                <tr>\n");
      out.write("                    <td><button class=\"mes\" onclick=\"mesEne()\" id=\"enero\" value=\"Enero\">Enero</button></td>\n");
      out.write("                    <td><button class=\"mes\" onclick=\"mesFeb()\">Febrero</button></td>\n");
      out.write("                    <td><button class=\"mes\" onclick=\"mesMar()\">Marso</button></td>\n");
      out.write("                    <td><button class=\"mes\" onclick=\"mesAbr()\">Abril</button></td>\n");
      out.write("                    <td><button class=\"mes\" onclick=\"mesMay()\">Mayo</button></td>\n");
      out.write("                    <td><button class=\"mes\" onclick=\"mesJun()\">Junio</button></td>\n");
      out.write("                    <td><button class=\"mes\" onclick=\"mesJul()\">Julio</button></td>\n");
      out.write("                    <td><button class=\"mes\" onclick=\"mesAgo()\">Agosto</button></td>\n");
      out.write("                    <td><button class=\"mes\" onclick=\"mesSet()\">Setiembre</button></td>\n");
      out.write("                    <td><button class=\"mes\" onclick=\"mesOct()\">Octubre</button></td>\n");
      out.write("                    <td><button class=\"mes\" onclick=\"mesNov()\">Noviembre</button></td>\n");
      out.write("                    <td><button class=\"mes\" onclick=\"mesDic()\">Diciembre</button></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </div><br>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div id=\"m1\" style=\"visibility: collapse;\" class=\"general-semana\">\n");
      out.write("        <table border=\"1\" style=\"text-align: center;\">\n");
      out.write("            <tr>\n");
      out.write("                <td><button class=\"semana\" onclick=\"lunes()\" id=\"lunes\" value=\"Lunes\">Lunes</button></td>\n");
      out.write("                <td><button class=\"semana\">Martes</button></td>\n");
      out.write("                <td><button class=\"semana\">Miercoles</button></td>\n");
      out.write("                <td><button class=\"semana\">Jueves</button></td>\n");
      out.write("                <td><button class=\"semana\">Viernes</button></td>\n");
      out.write("                <td><button class=\"semana\">Sabado</button></td>\n");
      out.write("                <td><button class=\"semana\">Domingo</button></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><button class=\"dias\" onclick=\"dia1()\" id=\"dia1\" value=\"1\">1</button></td>\n");
      out.write("                <td><button class=\"dias\">2</button></td>\n");
      out.write("                <td><button class=\"dias\">3</button></td>\n");
      out.write("                <td><button class=\"dias\">4</button></td>\n");
      out.write("                <td><button class=\"dias\">5</button></td>\n");
      out.write("                <td><button class=\"dias\">6</button></td>\n");
      out.write("                <td><button class=\"dias\">7</button></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><button class=\"dias\">8</button></td>\n");
      out.write("                <td><button class=\"dias\">9</button></td>\n");
      out.write("                <td><button class=\"dias\">10</button></td>\n");
      out.write("                <td><button class=\"dias\">11</button></td>\n");
      out.write("                <td><button class=\"dias\">12</button></td>\n");
      out.write("                <td><button class=\"dias\">13</button></td>\n");
      out.write("                <td><button class=\"dias\">14</button></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><button class=\"dias\">15</button></td>\n");
      out.write("                <td><button class=\"dias\">16</button></td>\n");
      out.write("                <td><button class=\"dias\">17</button></td>\n");
      out.write("                <td><button class=\"dias\">18</button></td>\n");
      out.write("                <td><button class=\"dias\">19</button></td>\n");
      out.write("                <td><button class=\"dias\">20</button></td>\n");
      out.write("                <td><button class=\"dias\">21</button></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><button class=\"dias\">22</button></td>\n");
      out.write("                <td><button class=\"dias\">23</button></td>\n");
      out.write("                <td><button class=\"dias\">24</button></td>\n");
      out.write("                <td><button class=\"dias\">25</button></td>\n");
      out.write("                <td><button class=\"dias\">26</button></td>\n");
      out.write("                <td><button class=\"dias\">27</button></td>\n");
      out.write("                <td><button class=\"dias\">28</button></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><button class=\"dias\">29</button></td>\n");
      out.write("                <td><button class=\"dias\">30</button></td>\n");
      out.write("                <td><button class=\"dias\">31</button></td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div id=\"m2\" style=\"visibility: collapse;\" class=\"general-semana\">\n");
      out.write("        <table border=\"1\" style=\"text-align: center;\">\n");
      out.write("            <tr>\n");
      out.write("                <td><button class=\"semana\">Lunes</button></td>\n");
      out.write("                <td><button class=\"semana\">Martes</button></td>\n");
      out.write("                <td><button class=\"semana\">Miercoles</button></td>\n");
      out.write("                <td><button class=\"semana\">Jueves</button></td>\n");
      out.write("                <td><button class=\"semana\">Viernes</button></td>\n");
      out.write("                <td><button class=\"semana\">Sabado</button></td>\n");
      out.write("                <td><button class=\"semana\">Domingo</button></td>\n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("            function mesEne() {\n");
      out.write("                var mes1 = document.getElementById(\"m1\");\n");
      out.write("                var mes2 = document.getElementById(\"m2\");\n");
      out.write("                if (mes2.style.visibility = \"visible\") {\n");
      out.write("                    mes2.style.visibility = \"collapse\";\n");
      out.write("                }\n");
      out.write("                mes1.style.visibility = \"visible\";\n");
      out.write("                var e = document.getElementById(\"enero\").value;\n");
      out.write("                document.getElementById(\"mes\").value =e;\n");
      out.write("            }\n");
      out.write("            function mesFeb() {\n");
      out.write("                var mes2 = document.getElementById(\"m2\");\n");
      out.write("                var mes1 = document.getElementById(\"m1\");\n");
      out.write("                if (mes1.style.visibility = \"visible\") {\n");
      out.write("                    mes1.style.visibility = \"collapse\";\n");
      out.write("                }\n");
      out.write("                mes2.style.visibility = \"visible\";\n");
      out.write("            }\n");
      out.write("            function lunes(){\n");
      out.write("                var semana = document.getElementById(\"lunes\").value;\n");
      out.write("                document.getElementById(\"semana\").value=semana;  \n");
      out.write("            }\n");
      out.write("            function dia1(){\n");
      out.write("                var dia = document.getElementById(\"dia1\").value;\n");
      out.write("                document.getElementById(\"dia\").value=dia;  \n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("        <div style=\"position: absolute; top: 350px;\">\n");
      out.write("            Mes:<br><input type=\"text\" id=\"mes\"><br>\n");
      out.write("            Dia de la semana:<br><input type=\"text\" id=\"semana\"><br>\n");
      out.write("            Numero de la semana:<br><input type=\"text\" id=\"dia\"><br>\n");
      out.write("            Nombre:<br><input type=\"text\" id=\"dia\"><br>\n");
      out.write("            Apellido:<br><input type=\"text\" id=\"dia\"><br>\n");
      out.write("            Correo:<br><input type=\"text\" id=\"dia\"><br>\n");
      out.write("            Dni:<br><input type=\"text\" id=\"dia\"><br>\n");
      out.write("            cantidad de personas:<br><input type=\"text\" id=\"dia\"><br>\n");
      out.write("            tipo de mesa:\n");
      out.write("            <select>\n");
      out.write("                <option>t1</option>\n");
      out.write("                <option>t1</option>\n");
      out.write("                <option>t1</option>\n");
      out.write("                <option>t1</option>\n");
      out.write("            </select>\n");
      out.write("            <input type=\"submit\" value=\"hhh\">\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
