package Encapsulacion;

public class Main {

	public static void main(String[] args) {
		Persona();

	}
    private static void Persona()  {
    	Persona persona1 = new Persona("Yesmy", "Escobar", 19 );
    	Persona persona2 = new Persona("Franklin", "Jimenez", 19);
    	Persona persona3 = new Persona ("Denisha", "Escobar", 13);
    	
    	System.out.println("PERSONAS AGREGADAS");
    	
    	System.out.println(persona1.mostrar());
    	System.out.println(persona2.mostrar());
    	System.out.println(persona3.mostrar());
    }
    
    
    
    }
    

