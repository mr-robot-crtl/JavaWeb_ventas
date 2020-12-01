<%-- 
    Document   : Editar
    Created on : 23-nov-2020, 16:15:30
    Author     : Robot
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="styleAdmin.css" rel="stylesheet">
        <title>Editar</title>
    </head>
    <body>
        
            <div class="titulo">
                <header>Editar Producto</header>
            </div>
        <form action="controlador" method="POST" enctype="multipart/form-data">
            <table class="tabla" border="1">
            <thead>
                <tr>
                    <th>Codigo</th>
                    <th>Nombre</th>
                    <th>Categoria</th>
                    <th>Modelo</th>
                    <th>Precio</th>

                    <th>Acciones</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td><input type="text" name="txtCodigo" value="${producto.codigo}" readonly="readonly"/></td>
                    <td><input type="text" name="txtNombre" value="${producto.nombre}"/></td>
                    <td><input type="text" name="txtCategoria" value="${producto.categoria}"/></td>
                    <td><input type="text" name="txtModelo" value="${producto.modelo}"/></td>
                    <td><input type="text" name="txtPrecio" value="${producto.precio}"/></td>

                    <td>
                      
                        <input class="boton"type="submit" name="accion" value="Actualizar">
                         
                        
                        <a  class="link" href="controlador?accion=listar2">Volver</a>
                    </td>
                </tr>
            </tbody>
            </table>
                </form>   
    </body>
</html>
