/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

/**
 *
 * @author Juan Manuel
 */
public class ComprasOnline {
    
   private  String nombreCliente;
   private String libro1;
   private String libro2;
   private String libro3;
   private String libro4;
   private int idLi1;
   private int idLi2;
   private int idLi3;
   private int idLi4;
   private int idCompra;
   private int precio;
   private int tarjeta;
   
   
      public ComprasOnline(String nombreCliente, String libro1, String libro2, String libro3, String libro4, int idLi1, int idLi2, int idLi3, int idLi4, int idCompra, int precio, int tarjeta) {
        this.nombreCliente = nombreCliente;
        this.libro1 = libro1;
        this.libro2 = libro2;
        this.libro3 = libro3;
        this.libro4 = libro4;
        this.idLi1 = idLi1;
        this.idLi2 = idLi2;
        this.idLi3 = idLi3;
        this.idLi4 = idLi4;
        this.idCompra = idCompra;
        this.precio = precio;
        this.tarjeta = tarjeta;
    }

    public int getIdLi1() {
        return idLi1;
    }

    public void setIdLi1(int idLi1) {
        this.idLi1 = idLi1;
    }

    public int getIdLi2() {
        return idLi2;
    }

    public void setIdLi2(int idLi2) {
        this.idLi2 = idLi2;
    }

    public int getIdLi3() {
        return idLi3;
    }

    public void setIdLi3(int idLi3) {
        this.idLi3 = idLi3;
    }

    public int getIdLi4() {
        return idLi4;
    }

    public void setIdLi4(int idLi4) {
        this.idLi4 = idLi4;
    }
      
 

    public String getLibro1() {
        return libro1;
    }

    public void setLibro1(String libro1) {
        this.libro1 = libro1;
    }

    public String getLibro2() {
        return libro2;
    }

    public void setLibro2(String libro2) {
        this.libro2 = libro2;
    }

    public String getLibro3() {
        return libro3;
    }

    public void setLibro3(String libro3) {
        this.libro3 = libro3;
    }

    public String getLibro4() {
        return libro4;
    }

    public void setLibro4(String libro4) {
        this.libro4 = libro4;
    }

   

    public ComprasOnline() {
    }
    

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNombreLi() {
        return libro1;
    }

    public void setNombreLi(String nombreLi) {
        this.libro1 = nombreLi;
    }

    public int getIdLi() {
        return idLi1;
    }

    public void setIdLi(int idLi) {
        this.idLi1 = idLi;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(int tarjeta) {
        this.tarjeta = tarjeta;
    }
   
   
   
   
    
}
