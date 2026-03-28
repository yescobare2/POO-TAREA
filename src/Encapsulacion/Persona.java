package Encapsulacion;

public class Persona {

    private String name;
    private String apellido;
    private int edad;
    
	public Persona(String name, String apellido, int edad) {
		this.name = name;
		this.apellido = apellido;
		this.edad = edad;
	}
    
    public String mostrar() {
    	
    	System.out.println("Nombre: + nombre");
    	System.out.println("Apellido: + apellido");
    	System.out.println("Edad: + edad");
    	
    	return "";
    	
    }
}
