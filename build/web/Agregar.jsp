<%-- 
    Document   : Agregar
    Created on : 20-nov-2020, 22:25:56
    Author     : Robot
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="styleAdmin.css" rel="stylesheet">
        <title>Agregar</title>
    </head>
    <body>
            <div class="titulo">
                <header>Agregar Producto</header>
            </div>
        <form action="controlador" method="POST" enctype="multipart/form-data">

            <table class="tabla" border="1">

                    <tr>
                        <th>Nombre</th>
                        <td><input type="text" name="txtNombre"/></td>
                    </tr>
                    <tr>
                        <th>Categoria</th>
                        <td><input type="text" name="txtCategoria"/></td>
                    </tr>
                    <tr>
                        <th>Modelo</th>
                        <td><input type="text" name="txtModelo"/></td>
                    </tr>
                    <tr>
                        <th>Precio</th>
                        <td><input type="text" name="txtPrecio"/></td>
                    </tr>
                    <tr>
                        <th>Imagen</th>
                        <td><input type="file" name="fileFoto"/></td>
                    </tr>
                    <tr>
                        <th>Acciones</th>
                        <td>
                        <input class="boton" type="submit" value="Nuevo" name="accion" />
                        <a  class="link" href="controlador?accion=listar2">Volver</a>
                        </td>
                    </tr>
            </table>
        </form>
    </body>
</html>
