/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo1;

/**
 *
 * @author ithzamary.vilchis
 */
public class Factura {
    
    private String numeroPieza; //ID
    private String descripcionPieza; //nombre 
    private int totalPiezas; // total de piezas que vamos a comprar
    private double precio; // dinero, precio de la pieza

    public Factura(String numeroPieza, String descripcionPieza, int totalPiezas, double precio) {
        this.numeroPieza = numeroPieza;
        this.descripcionPieza = descripcionPieza;
        this.totalPiezas = totalPiezas;
        this.precio = precio;
    }

  

    
    /**
     * @return the numeroPieza
     */
    public String getNumeroPieza() {
        return numeroPieza;
    }

    /**
     * @param numeroPieza the numeroPieza to set
     */
    public void setNumeroPieza(String numeroPieza) {
        this.numeroPieza = numeroPieza;
    }

    /**
     * @return the descripcionPieza
     */
    public String getDescripcionPieza() {
        return descripcionPieza;
    }

    /**
     * @param descripcionPieza the descripcionPieza to set
     */
    public void setDescripcionPieza(String descripcionPieza) {
        this.descripcionPieza = descripcionPieza;
    }

    /**
     * @return the totalPiezas
     */
    public int getTotalPiezas() {
        return totalPiezas;
    }

    /**
     * @param totalPiezas the totalPiezas to set
     */
    public void setTotalPiezas(int totalPiezas) {
        this.totalPiezas = totalPiezas;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

   
    //devuelve un double
    
    //partes de un metodo
    public double obtenerMontoFactura(int cantidadPiezas, double precioPieza){
       //Si num piezas es negativo = 0
       //Si precio es negativo = 0
        if(cantidadPiezas < 0){
            cantidadPiezas = 0;
        }
        
        if(precioPieza < 0){
            precioPieza = 0;
        }
        
        double resultado = cantidadPiezas * precioPieza;
        
        return resultado;
    }
    
    public double obtenerMontoFactura1(){
        if(totalPiezas < 0){
            totalPiezas = 0;
        }
        
        if(precio < 0){
            precio = 0;
        }
        
        double resultado = totalPiezas * precio;
        
        return resultado;
    }
   
    
}
