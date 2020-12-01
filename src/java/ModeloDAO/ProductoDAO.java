/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Config.Conexion;
import Modelo.Producto;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;


/**
 *
 * @author Robot
 */
public class ProductoDAO{

   
    public List getProductos() {
        List<Producto>productos=new ArrayList<>();/*Listado*/
        String sql="SELECT * FROM producto GROUP BY Categoria";/*Sentencia SQL*/
        try {
            PreparedStatement ps=Conexion.Conectar().prepareCall(sql);/*Preparando para que se ejecute el sql*/
            ResultSet rs=ps.executeQuery();/*Para ejecutar la busqueda que queremos*/
            while(rs.next()){/*Mientras hay algo mas que usar, va guardar en la variable alumno de manera local */
            Producto p = new Producto();/*Objeto Instancia*/
            /*Optener cada uno de los datos con 'set'*/
            p.setCodigo(rs.getInt(1)); /*Buscar el elemento de la columna '1'*/
            p.setNombre(rs.getString(2)); /*Buscar el elemento de la columna '2'*/
            p.setCategoria(rs.getString(3)); /*Buscar el elemento de la columna '3'*/
            p.setModelo(rs.getString(4)); /*Buscar el elemento de la columna '4'*/
            p.setPrecio(rs.getFloat(5));
            p.setImagen(rs.getBinaryStream(6));
            
            
            productos.add(p);
            }
        } catch (Exception e) {
            System.err.println("Error: "+ e);/*Mostrar algun tipo de error*/
            
        }return productos;/*Retotna alumnos*/
    }
    
    
 
    public Producto getCodigo(int Codigo) {
        String sql="SELECT * FROM producto WHERE Codigo=?";
        Producto producto = new Producto();
        try {
            PreparedStatement ps = Conexion.Conectar().prepareStatement(sql);
            ps.setInt(1, Codigo);/*Guardamos en la posicion 1 y va obtener de la id que pondremos en la funcion*/
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            producto.setCodigo(rs.getInt(1));
            producto.setNombre(rs.getString(2)); /*Buscar el elemento de la columna '2'*/
            producto.setCategoria(rs.getString(3)); /*Buscar el elemento de la columna '3'*/
            producto.setModelo(rs.getString(4)); 
            producto.setPrecio(rs.getFloat(5)); 
            producto.setImagen(rs.getBinaryStream(6));
            }
        } catch (Exception e) {
            System.err.println("Error: "+ e);
        }
        return  producto;
    }

    

    public int update(Producto p) {
        int resultado=0;
        String sql="UPDATE producto SET Nombre=?,Categoria=?,Modelo=? ,Precio=?  WHERE Codigo=?";
        try {
            PreparedStatement ps=Conexion.Conectar().prepareStatement(sql);
            ps.setString(1, p.getNombre());
            ps.setString(2, p.getCategoria());
            ps.setString(3, p.getModelo());
            ps.setFloat(4, p.getPrecio());
            ps.setInt(5,p.getCodigo());
            resultado=ps.executeUpdate();
        } catch (Exception e) {
            System.err.println("Error para actulizar a la BD: "+ e);
        }return resultado;
        
    }
    
    public int delete(int codigo) {
        int resultado=0;
        String sql="DELETE FROM producto WHERE Codigo="+codigo;
        try {
            PreparedStatement ps=Conexion.Conectar().prepareStatement(sql);
            resultado=ps.executeUpdate();
        } catch (Exception e) {
            System.err.println("Error para eliminar a la BD: "+ e);
        }return resultado;
    } 
    public void listarImg(int codigo, HttpServletResponse response){
        String sql="SELECT * FROM producto WHERE Codigo="+codigo;
        InputStream inputStream = null;
        OutputStream outputStream = null;
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        response.setContentType("image/*");
        
        try {
            outputStream=response.getOutputStream();
            PreparedStatement ps=Conexion.Conectar().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                inputStream=rs.getBinaryStream("Imagen");
            }
            bufferedInputStream=new BufferedInputStream(inputStream);
            bufferedOutputStream=new BufferedOutputStream(outputStream);
            int i=0;
            while((i=bufferedInputStream.read())!=-1){
                bufferedOutputStream.write(i);
            }
        } catch (Exception e) {
        }
        
    }

    public  int add(Producto p) {
        int resultado=0;
        String sql="INSERT INTO producto(Nombre,Categoria,Modelo,Precio,Imagen)VALUES(?,?,?,?,?)";
        try {
            PreparedStatement ps=Conexion.Conectar().prepareStatement(sql);
            ps.setString(1, p.getNombre());
            ps.setString(2, p.getCategoria());
            ps.setString(3, p.getModelo());
            ps.setFloat(4, p.getPrecio());
            ps.setBlob(5, p.getImagen());
            
            resultado=ps.executeUpdate();
        } catch (Exception e) {
            System.err.println("Error para agregar a la BD: "+ e);
        }return resultado;
    }



}
