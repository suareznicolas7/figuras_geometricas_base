package com.endes.figuras;

public class Circulo extends FiguraGeometrica  {

	private double radio;
	
	public Circulo(String nombre, String color, double radio, Object centro) {
		super(nombre, color);
		this.radio = radio;
	}

	@Override
	public double area() {
		
		return 2 * Math.PI * radio;
	}

	@Override
	public double perimetro() {
		return (radio * radio) * Math.PI;
	}

}
