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
        <title>Venta</title>
    </head>
    <body>
        <!-- BANNER HEADER-->
        <header class="header1">
            <div class="wrapper">
                <div class="logo">
                    PeruDelivery
                </div>
                <nav class="navegador">              
                <ul class="menu">
                    <li><a href="index.jsp">Inicio</a></li>
                    <li><a href="controlador?accion=listar3">Products</a></li>
                    <li><a href="">About</a> </li>
                    <li  class="sesion"><a  href="#">Iniciar Secion <img  src="icon/user1.ico"> </a>
                        <ul class="submenu">
                            <li><a href="Admin.jsp">Login</a></li>
                        </ul>
                    </li>
                </ul>
         
                </nav>
                
            </div>
        </header>
        <!-- slider principal-->
        <section class="slider">
            <div class="slider-content">
                <h1>Bienvenido a la mejor tienda only del pais.</h1>
                 <a href="controlador?accion=listar3">Ver producto</a>
            </div>
        </section>
        <!-- Conten GRID-->
        <div class="grid1">
            <div class="textos-hero1">
                <h1 class="textos-h1" >Los mejores Productos de pais</h1>
                <p class="parrafo1">Productos importados, desde los andes y de otras partes del pais con los mejores materiales de seguridad</p>
            </div>
            <div class="img-1">
                <img src="image/pre3.jpg">
            </div>
        </div>
        <div class="grid2">
            <div class="img-2">
                <img src="image/pre1.jpg">
            </div>
            <div class="textos-hero2">
                <h1 class="textos-h1" >Nos familiarizamos con todos nuestros clientes</h1>
                <p class="parrafo2">Para poder sentir sus nesecidades y comprender su situaciones y para poder facilitarlos un mejor precio a todos</p>
            </div>
        </div><hr>
               <!-- Conten GRID-->
        <div class="grid1">
            <div class="textos-hero1">
                <h1 class="textos-h1" >Trabajamos con las mejores empresas del pais</h1>
                <p class="parrafo1">Empresas reconocidas nos abastesen productos de calidad con tecnologias avanzadas que te pueden salvar la vida</p>
            </div>
            <div class="img-1">
                <img src="image/empresas.jpg">
            </div>
        </div>
        <div class="grid2">
            <div class="img-2">
                <img src="image/familiafeliz.jpg">
            </div>
            <div class="textos-hero2">
                <h1 class="textos-h1" >Use producto de seguridad y podra regresar a casa!</h1>
                <p class="parrafo2">Segun las estadisticas cada 1 de 9 personas que usa productos de seguridad, se salva de una muerte fatal</p>
            </div>
        </div><hr>
        <!-- slider Productos-->
        
        <!-- services-->
        <main>
            <section class="services">
                <section class="grid">
                    <div class="items">
                        <div class="item1">
                            <img class="ico" src="icon/manos.ico" alt="">
                            <h3 class="titulo-services">Confianza</h3>
                            <p>El 10 de cada 10 clientes confia en la empresa Peru Delivery por su eficiencia y responsabilidad y sobre todo los que nos identifica es que todos nuestras marcas son peruanas
                            apoyando siempre al pais.</p>
                        </div>
                        <div class="item2">
                            <img class="ico" src="icon/fast.ico" alt="">
                            <h3 class="titulo-services">Rapidos</h3>
                            <p>Tenemos trabajadores trabajando 24/7 para complacerlos, y las entregas en otras ciudades son tan rapidas como flash</p>
                        </div>
                        <div class="item3">
                            <img class="ico" src="icon/candado.ico" alt="">
                            <h3 class="titulo-services">Seguro</h3>
                            <p>Lo que nos identifica, es la seguridad que tenemos en nuestras paginas con sus datos personales, evite las estafas, el incumpliento y los productos
                            piratas, todo en un solo lugar Peru Delivery</p>
                        </div>
                    </div>
                    
                </section>
            </section>
        </main>
        <!-- footer -->
        <footer class="footer">
            <div class="footer-left">
                <img class="ico" src="icon/candado.ico" alt="">
                <p>Tu tienda favorita e efisiente Peru Delivery</p>

            
            </div>
            <ul class="footer-right">
                <li>
                    <h2>Product</h2>
                    <ul class="box">
                        <li><a  href="">Cabeza</a></li>
                        <li><a  href="">Piernas</a></li>
                        <li><a  href="">Brazos</a></li>
                        <li><a  href="">Vista</a></li>
                        <li><a  href="">Pies</a></li>
                        <li><a  href="">Cuerpo Completo</a></li>
                    </ul>
                </li>
                <li class="feacture">
                    <h2>Colaboradores</h2>
                    <ul class="box">
                        <li><a  href="">Senati.pe</a></li>
                        <li><a  href="">Tublocg.pe</a></li>
                        <li><a  href="">ecomerce.com</a></li>
                        <li><a  href="">Amazon.com</a></li>
                        <li><a  href="">Peypal.com</a></li>
                        <li><h1>Regrese pronto!</h1></li>

                    </ul>
                </li>
                <li>
                    <h2>Contactos</h2>
                    <ul class="box">
                        <li><a  href="">Telf: 975687987</a></li>
                        <li><a  href="">Correo: perudelyvery@peru.pe</a></li>
                        <li><a  href="">Ubicacion: Jr.Amazanos 345</a></li>
                        <div class="socials">
                           <a href="#"><img class="ico" src="icon/fb1.ico" alt=""></a>
                           <a href="#"><img class="ico" src="icon/w1.ico" alt=""></a>   
                        </div>
                    </ul>
                </li>
            </ul>
            <div class="footer-bottom">
                <p>All right reserved by Noe</p>
            </div>
        </footer>
    </body>
</html>

