package Encapsulacion;

public class Rectangulo {
	private double base;
	private double altura;
	//Constructor
	public Rectangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	
	//funcion para la area
	public double area() {
		return base * altura;
	}
	
	//funcion para el perimetro
	public double perimetro() {
		return (base*2) + (altura*2);
				
	}
}
