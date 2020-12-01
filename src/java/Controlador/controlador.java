/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Modelo.Producto;
import ModeloDAO.ProductoDAO;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author Robot
 */
@MultipartConfig
@WebServlet(name = "controlador", urlPatterns = {"/controlador"})

public class controlador extends HttpServlet {
    ProductoDAO dao;
    

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
         String accion=request.getParameter("accion"); //igualando a la varibale accion del index
        List<Producto>productos=new ArrayList<>();//iniciliazando la lista -instancia
        
        switch(accion){
            case "listar3":
                dao = new ProductoDAO();//para ejecutar el codigo de Persona DAO
                productos = dao.getProductos();//esto agregara todo los objetos de la BD
                request.setAttribute("Productos", productos);//preparamos para eviar al index
                request.getRequestDispatcher("productos.jsp").forward(request, response);//movernos al index segun el teacher :v
                break;
           case "listar2":
                dao = new ProductoDAO();//para ejecutar el codigo de Persona DAO
                productos = dao.getProductos();//esto agregara todo los objetos de la BD
                request.setAttribute("Productos", productos);//preparamos para eviar al index
                request.getRequestDispatcher("Admin.jsp").forward(request, response);//movernos al index segun el teacher :v
                break;
                
            case "agregar":
                request.getRequestDispatcher("Agregar.jsp").forward(request, response);
                break;
                
            case "Nuevo":
                int r=0;

                String nombre=request.getParameter("txtNombre");
                String categoria=request.getParameter("txtCategoria");
                String modelo=request.getParameter("txtModelo");
                float Precio=Float.parseFloat(request.getParameter("txtPrecio"));
                Part part=request.getPart("fileFoto");
                InputStream inputStream=part.getInputStream();
                Producto p=new Producto();
                p.setNombre(nombre);
                p.setCategoria(categoria);
                p.setModelo(modelo);
                p.setPrecio(Precio);
                p.setImagen(inputStream);
                r=dao.add(p);
                if(r==1){
                    request.setAttribute("Mensaje", "Se agrego con exito");
                    request.getRequestDispatcher("Mensaje.jsp").forward(request, response);

                }else{
                    request.setAttribute("Mensaje", "Error al guradar  la BD");
                    request.getRequestDispatcher("Mensaje.jsp").forward(request, response);
                } 
            case "editar":
                int codigo=Integer.valueOf(request.getParameter("codigo"));
                Producto producto=dao.getCodigo(codigo);
                request.setAttribute("producto", producto);
                request.getRequestDispatcher("Editar.jsp").forward(request, response);
                break;
            case "Actualizar":
                int new_r=0;
                String newNombre=request.getParameter("txtNombre");
                String newCategoria=request.getParameter("txtCategoria");
                String newModelo=request.getParameter("txtModelo");
                Float newPrecio=Float.parseFloat(request.getParameter("txtPrecio")); 

                int newCodigo=Integer.valueOf(request.getParameter("txtCodigo"));

    
                Producto pro=new Producto();
                
                pro.setNombre(newNombre);
                pro.setCategoria(newCategoria);
                pro.setModelo(newModelo);
                pro.setPrecio(newPrecio);
                pro.setCodigo(newCodigo);//enviar nuevo promedio   

                new_r=dao.update(pro);
                if(new_r!=0){
                    request.setAttribute("Mensaje", "Se actualizo con exito");
                    request.getRequestDispatcher("Mensaje.jsp").forward(request, response);
                }else{
                    request.setAttribute("Mensaje", "Error al actualizar con la BD papu");
                    request.getRequestDispatcher("Mensaje.jsp").forward(request, response);
                }
            case "eliminar":
                int Codigo=Integer.parseInt(request.getParameter("codigo"));
                int res=dao.delete(Codigo);
                if(res!=0){
                    request.setAttribute("Mensaje", "Se elimino con exito");
                    request.getRequestDispatcher("Mensaje.jsp").forward(request, response);
                }else{
                    request.setAttribute("Mensaje", "Error al eliminar en la BD");
                    request.getRequestDispatcher("Mensaje.jsp").forward(request, response);
                }
        }

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
