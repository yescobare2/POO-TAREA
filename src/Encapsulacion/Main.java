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
    
    private static void Rectangulo() {
        System.out.println("AREA DE RECTANGULO");

         Rectangulo rectangulo1 = new Rectangulo(12, 8);
         Rectangulo rectangulo2 = new Rectangulo(18, 10);

         double area1 = rectangulo1.area();
         double area2 = rectangulo2.area();

        System.out.println("El area del rectangulo 1 es: " + area1);
        System.out.println("El area del rectangulo 2 es: " + area2);

        if (area1 > area2) {
            System.out.println("Rectangulo 1: ");
        } else if (area2 > area1) {
            System.out.println("El rectangulo 2 tiene mayor area");
        } else {
            System.out.println("Ambos tienen la misma area");
        }
    
    }
    }
    

