package com.endes.figuras;


public class Punto extends FiguraGeometrica {
    
    private double x;
    private double y;

    
    public Punto(String nombre, String color, double x, double y) {
        super(nombre, color); 
        this.x = x;
        this.y = y;
    }

    
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    
    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    
    public double distancia(Punto otro) {
        double dx = this.x - otro.x;
        double dy = this.y - otro.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    
    @Override
    public double area() {
        return 0; 
    }

    @Override
    public double perimetro() {
        return 0; 
    }



}
