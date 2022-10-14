<%-- 
    Document   : sesion
    Created on : 12/10/2022, 05:40:10 PM
    Author     : usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Pagina de sesion</h1>
        <form method="post" action="Confi_reserva">
            Correo:<input type="text" name="cor">
            Contraseña: <input type="text" name="cont">
            <input type="submit" value="Ingresar" name="accion">
        </form>
    </body>
</html>
