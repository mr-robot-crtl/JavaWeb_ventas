<%-- 
    Document   : index
    Created on : 25-nov-2020, 11:38:51
    Author     : Robot
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head >
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="myStyle.css" rel="stylesheet">
        <link href="styleAdmin.css" rel="stylesheet">
        <title>Venta</title>
    </head>
    <body>
        <!-- BANNER HEADER-->
        <header class="header2">
            <div class="wrapper">
                <div class="logo">
                    Administrador
                </div>
                  <nav class="navegador">              
                <ul class="menu">
                    <li><a href="index.jsp">Inicio</a></li>
                    <li><a href="controlador?accion=listar3">Products</a></li>
                    <li><a href="">About</a> </li>
                    <li  class="sesion"><a  href="#">Iniciar Secion <img  src="icon/user1.ico"> </a>
                        <ul class="submenu">
                            <li><a href="index.jsp">Salir</a></li>
                        </ul>
                    </li>
                </ul>
         
                </nav>
                
            </div>
        </header>
       
 
        <section class="CRUD_ADMIN">               
        <div  class="crud">
        <a  class="link" href="controlador?accion=listar2">Listar</a> <%--la variable accion va a hacer igual a listar --%>
        <a  class="link" href="controlador?accion=agregar">Agregar Nuevo</a>
        </div>
        <table class="tabla" border="1">
            <thead>
                <tr>
                    <th>Cdigoo</th>
                    <th>Nombre</th>
                    <th>Categoria</th>
                    <th>Modelo</th>
                    <th>Precio</th>
                    <th>Imagen</th>
                    <th>Acciones</th>
                </tr>
            </thead>
            <c:forEach var="producto" items="${Productos}"><%--variable que se envia --%>
                
            <tbody>
                <tr>
                    <td>${producto.codigo}</td>
                    <td>${producto.nombre}</td>
                    <td>${producto.categoria}</td>
                    <td>${producto.modelo}</td>
                    <td>${producto.precio}</td>
                    <td><img src="con2?codigo=${producto.codigo}" width="80" height="80"></td> 
                    <td>
                        <a class="link" href="controlador?accion=editar&codigo=${producto.codigo}">Editar</a>
                        <a class="link" href="controlador?accion=eliminar&codigo=${producto.codigo}">Eliminar</a>
                    </td>
                    
                </tr>
            </c:forEach>
            </tbody>
        </table>                                        
        </section>
        
    </body>
</html>

