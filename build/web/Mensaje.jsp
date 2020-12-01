<%-- 
    Document   : Mensaje
    Created on : 20-nov-2020, 22:45:59
    Author     : Robot
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="styleAdmin.css" rel="stylesheet">
        <title>Mensaje</title>
    </head>
    <body>
        ${Mensaje}!
        <form action="controlador" method="POST">
        <a  class="link" href="controlador?accion=listar2">Volver</a>
        </form>
    </body>
</html>
