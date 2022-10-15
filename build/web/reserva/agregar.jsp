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
        <script type="text/javascript" src="../script/funcion.js"></script>
    </head>
    <body>
        <h1>PAGINA DE RESERVA</h1>
        <a href="Confi_reserva?accion=IniciarSesion">Iniciar sesion</a><br>
        <div>
            <h3>REGISTRO DE RESERVA</h3>
            <form method="post" action="Confi_reserva">
                <c:out value="Codigo de reserva:"></c:out><br>
                <input type="text" name="codR"><br>
                <c:out value="Su codigo de usuario:"></c:out><br>
                <input type="text" value="${codU}" name="codU"><br>
                <c:out value="Seleccionar el tipo de mesa:"></c:out><br>
                <select name="mesa">
                <c:forEach var="lis" items="${listaM}">
                    <option value="${lis.getCodigoMesa()}">${lis.getTipo()}</option>
                </c:forEach>
                </select><br>
                <c:out value="Ingrese la cantidad de personas:"></c:out><br>
                <input type="text" name="cantidadP"><br><br>
                <c:out value="Ingrese la fecha de reserva:"></c:out><br>
                <c:out value="Ingrese el mes:"></c:out>
                <input type="month" name="mes" onchange="m()" id="mes"><br>
                <c:out value="Ingrese el dia:"></c:out><br>
                <table style="text-align: center; font-size: 11px;">
                    <tr>
                        <td>LUNES</td>
                        <td>MARTES</td>
                        <td>MIERCOLES</td>
                        <td>JUEVES</td>
                        <td>VIERNES</td>
                        <td>SABADO</td>
                        <td>DOMINGO</td>
                    </tr>
                    <tr>
                        <td><input type="button" value="1" onclick="b1()"></td>
                        <td><input type="button" value="2" onclick="b2()"></td>
                        <td><input type="button" value="3" onclick="b3()"></td>
                        <td><input type="button" value="4" onclick="b4()"></td>
                        <td><input type="button" value="5" onclick="b5()"></td>
                        <td><input type="button" value="6" onclick="b6()"></td>
                        <td><input type="button" value="7" onclick="b7()"></td>
                    </tr>
                    <tr>
                        <td><input type="button" value="8" onclick="b8()"></td>
                        <td><input type="button" value="9" onclick="b9()"></td>
                        <td><input type="button" value="10" onclick="b10()"></td>
                        <td><input type="button" value="11" onclick="b11()"></td>
                        <td><input type="button" value="12" onclick="b12()"></td>
                        <td><input type="button" value="13" onclick="b13()"></td>
                        <td><input type="button" value="14" onclick="b14()"></td>
                    </tr>
                    <tr>
                        <td><input type="button" value="15" onclick="b15()"></td>
                        <td><input type="button" value="16" onclick="b16()"></td>
                        <td><input type="button" value="17" onclick="b17()"></td>
                        <td><input type="button" value="18" onclick="b18()"></td>
                        <td><input type="button" value="19" onclick="b19()"></td>
                        <td><input type="button" value="20" onclick="b20()"></td>
                        <td><input type="button" value="21" onclick="b21()"></td>
                    </tr>
                    <tr>
                        <td><input type="button" value="22" onclick="b22()"></td>
                        <td><input type="button" value="23" onclick="b23()"></td>
                        <td><input type="button" value="24" onclick="b24()"></td>
                        <td><input type="button" value="25" onclick="b25()"></td>
                        <td><input type="button" value="26" onclick="b26()"></td>
                        <td><input type="button" value="27" onclick="b27()"></td>
                        <td><input type="button" value="28" onclick="b28()"></td>
                    </tr>
                    <tr>
                        <td><input type="button" value="29" onclick="b29()" id="d29"></td>
                        <td><input type="button" value="30" onclick="b30()" id="d30"></td>
                        <td><input type="button" value="31" onclick="b31()" id="d31"></td>
                    </tr>
                </table><br>
                <c:out value="La fecha seleccionada es:"></c:out><br>
                <c:out value="Mes seleccionado:"></c:out><input type="text" id="fecha" name="fecha"><br>
                <c:out value="Dia selecionado:"></c:out><input type="text" id="dia" name="dia"><br><br>
                <input type="submit" value="RegistrarReserva" name="accion">
            </form>
                
        </div>
                
                <div style="position: absolute; left: 600px; top: 100px;">
                    <h3>REGISTRO DE DETALLE</h3>
                    <c:out value="Fecha registrada:"></c:out><br>
                    <input type="text" value="${fecha}" name="fecha" disabled><br>
                    <c:out value="Codigo de usuario:"></c:out><br>
                    <input type="text" value="${codU}" name="codigoU" disabled><br>
                    <form method="post" action="Confi_reserva">
                    <c:out value="Codigo de detalle:"></c:out><br>
                    <input type="text" value="${codD}" name="codigoD"><br>
                    <c:out value="Su codigo de reserva es:"></c:out><br>
                    <input type="text" value="${codR}" name="codigoR"><br>
                    <c:out value="Elija el plato a consumir:"></c:out><br>
                    <select name="codigoP">
                    <c:forEach var="lis" items="${listaP}">
                        <option value="${lis.getCodigoPlato()}">${lis.getNombre()}</option>
                    </c:forEach>
                    </select><br>
                    <c:out value="Ingresar la cantidad del plato elegido"></c:out><br>
                    <input type="number" name="cantidadP"><br>
                    <input type="submit" value="RegistrarDetalle" name="accion">
                </form><br>
                
                <h3>MUESTRA DE TABLA DE DETALLE</h3>
                <form method="post" action="Confi_reserva">
                    <c:out value="Codigo de detalle:"></c:out><br>
                    <input type="text" value="${codD}" name="codigoD" disabled><br>
                    <c:out value="Codigo de usuario:"></c:out><br>
                    <input type="text" value="${codU}" name="codigoU" disabled><br>
                    <table border="1">
                        <tr>
                            <td>Fecha</td>
                            <td>Plato</td>
                            <td>Cantidad</td>
                            <td>Precio</td>
                            <td>Eliminar</td>
                        </tr>
                    <c:forEach var="listaD" items="${listaDT}">
                        <tr>
                            <td>${listaD.getFecha()}</td>
                            <td>${listaD.getNombreP()}</td>
                            <td>${listaD.getCantidadP()}</td>
                            <td>${listaD.getPrecioP()}</td>
                            <td><a href="Confi_reserva?accion=EliminarDetalle&codigo=${listaD.getCodigoD()}">Eliminar</a></td>
                        </tr>
                    </c:forEach>
                    </table>
                </form>
                    
                </div>
    </body>
</html>
