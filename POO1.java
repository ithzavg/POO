/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo1;

/**
 *
 * @author ithzamary.vilchis
 */
public class POO1 {

    
    public static void main(String[] args) {
     
        // new -> apartar un pedazo de memoria para alojar el objeto
        // NombreObjeto/Clase nombre = new NombreObjeto/Clase(); los parentesis significan constructor por default;
        // NombreObjeto/Clase nombre = new NombreObjeto/Clase(parametro1, parametro2, parametro3); // Si dentro de los parentesis hay parametros
        // entonces lo que estamos usando es un constructor con parametros
        
        Gato gato1 = new Gato();
        Gato gato2 = new Gato("Gris", "Persa", 2, 4);
        
        System.out.println("Gato 1");
        System.out.println(gato1.getColor());
        
        System.out.println("Gato 2");
        System.out.println(gato2.getColor());
        
        System.out.println("Gato 1");
        gato1.setColor("naranja");
        System.out.println(gato1.getColor());
        
        System.out.println("Gato 2");
        gato2.setColor("Blanco");
        System.out.println(gato2.getColor());
        
        
        System.out.println("Gato 1");
        System.out.println(gato1.getRaza());
        
        
        
    }
    
}
