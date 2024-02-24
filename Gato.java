/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo1;

/**
 *
 * @author ithzamary.vilchis
 */
public class Gato {
    
    //Atributos
    private String color; //morado
    private String raza; // persa
    private int edad; //1 anio
    private int peso; // 2kg
    
    //Constructor por defectoo:
    public Gato(){
        
    }
    
    //Constructor con parametros:
    //Parametros: son variables que necesita un método o un constructor para funcionar
    //this -> hacer referencia a todo lo que existe en la clase o en el objeto
    public Gato(String color, String raza, int edad, int peso){
        this.color = color;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
    }
    
    
    //Encapsulamiento
    // public, protected, private
    // Método get y método set

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the raza
     */
    public String getRaza() {
        return raza;
    }

    /**
     * @param raza the raza to set
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    
}
