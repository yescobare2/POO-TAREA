package Encapsulacion;

public class Producto {
	 private String codigo;
	   private String nombre;
	   private double precio;
	
	   //Constructor
   public Producto(String codigo, String nombre, double precio) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
	}
    
   //Metodo para aplicar descuento 
   public void aplicarDescuento(double porcentaje) {
	   this.precio-=(this.precio * (porcentaje / 100));
   }
   
   //Metodo para ver el precio final
   public void mostrarInformacion() {
	   System.out.println("Producto: " + nombre + " [" + codigo + "] | Precio: Q" + String.format("%.2f", precio));
}  
}

