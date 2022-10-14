<%-- 
    Document   : agregar
    Created on : 12/10/2022, 05:54:15 PM
    Author     : usuario
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="text/javascript" src="script/funcion.js"></script>
    </head>
    <body>
        
        <h1>PAGINA DE RESERVACION</h1>
        <a href="Confi_reserva?accion=sesion">Iniciar Sesion</a>
        
        
        
        
        <h3>INGRESAR SU RESERVA</h3>
        <form method="post" action="Confi_reserva">
            Su codigo es:<br><input type="text" value="${codigoUsuario}"><br>
            Ingresar la cantidad de personas que asistira:<br>
            <input type="number" name="cantidadP"><br>
            Seleccione el tipo de mesa:<br>
            <select name="mesa">
                <c:forEach var="listaM" items="${tipoM}">
                    <option value="${listaM.getCodigoMesa()}">${listaM.getTipo()}</option>
                </c:forEach>
            </select><br>
            Ingresar la fecha a la que asistira al restaurante:<br>
            Indique el mes:<input type="month" id="mes" oninput="m()"><br>
            Seleccione el dia a reservar:<br>
            <div style="text-align: center; font-size: 13px;">
                <table>
                    <tr>
                        <td>Lunes</td>
                        <td>Martes</td>
                        <td>Miercoles</td>
                        <td>Jueves</td>
                        <td>Viernes</td>
                        <td>Sabado</td>
                        <td>Domingo</td>
                    </tr>
                    <tr><td><input type="button" onclick="d1()" value="1"></td><td><input type="button" onclick="d2()" value="2"></td><td><input type="button" onclick="d3()" value="3"></td><td><input type="button" onclick="d4()" value="4"></td><td><input type="button" onclick="d5()" value="5"></td><td><input type="button" onclick="d6()" value="6"></td><td><input type="button" onclick="d7()" value="7"></td></tr>
                    <tr><td>8</td><td>9</td><td>10</td><td>11</td><td>12</td><td>13</td><td>14</td></tr>
                    <tr><td>15</td><td>16</td><td>17</td><td>18</td><td>19</td><td>20</td><td>21</td></tr>
                    <tr><td>22</td><td>23</td><td>24</td><td>25</td><td>26</td><td>27</td><td>28</td></tr>
                    <tr><td id="29">29</td><td id="30">30</td><td id="31">31</td></tr>
                </table>
            </div><br>
            <input type="text" name="diaR" id="diaR">
         </form>
        
           
        
        
        
        
        <%--<div>
            <form method="post" action="Confi_reserva">
            Elija su plato a reservar:<br>
            <select name="platos">
                <c:forEach var="lista" items="${listaP}">
                    <option value="${lista.getCodigoPlato()}">${lp.getNombre()}</option>
                </c:forEach>
            </select><br>
            Indique la cantidad de plato elegido a reservar:<br>
            <input type="text" name="cantidad"><br>
            <input type="submit" value="AgregarDetalle" name="accion">
        </form><br>
        
        
        
        
        <h3>REGISTRO DE PLATOS</h3>
        <form method="post" action="Confi_reserva">
            <table border="1">
                <tr>
                    <td>Nombre del plato</td>
                    <td>Cantidad del plato</td>
                    <td>Precio del plato</td>
                    <td>Eliminar plato</td>
                </tr>
                 <c:forEach var="lrp" items="${platosD}">
                        <tr>
                        <td>${lrp.getPlato().getNombre()}</td>
                        <td>${lrp.getCantidadplatos()}</td>
                        <td>${lrp.getPrecio()}</td>
                        <td><a href="">Eliminar</a></td>
                        </tr>
                 </c:forEach>
            </table>
        </form>
</div>--%>
        
    </body>
</html>
