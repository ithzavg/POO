/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo1;

/**
 *
 * @author ithzamary.vilchis
 */
public class PruebaFactura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Factura factura1 = new Factura("5434534", "Tornillos", 5, 14.5);
        Factura factura2 = new Factura("5434534", "Tornillos", 5, -4.5);
        
        
        System.out.println("Total " + factura1.getTotalPiezas());
        System.out.println("Precio " + factura1.getPrecio());
        
        //factura1.setPrecio(11.0);
        //factura1.setTotalPiezas(2);
        
        System.out.println(factura1.obtenerMontoFactura1());
        System.out.println("*********");
        System.out.println(factura2.obtenerMontoFactura1());
        
        System.out.println("Metodo con parametros");
        int miTotalPiezas = factura1.getTotalPiezas(); // 5
        double miPrecio = factura1.getPrecio(); // 14.5
        
        
        System.out.println(factura1.obtenerMontoFactura(miTotalPiezas, miPrecio));
    }

}
