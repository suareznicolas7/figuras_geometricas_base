package com.endes.figuras;

public class Cuadrado extends FiguraGeometrica {
      
    private double lado;    

   /**
    * 
    * @param nombre
    * @param color 
    * @param lado
    */
    public Cuadrado(String nombre, String color, double lado) {
        super(nombre, color);  
        this.lado = lado;
    }

    @Override
    public double area() {
       
        return lado * lado;
    }

    /**
     * 
     */
    @Override
    public double perimetro() {
       
        return 4 * lado;
    }
}
  