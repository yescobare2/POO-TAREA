package Encapsulacion;

public class Main {

	public static void main(String[] args) {
		Persona();
		Rectangulo();
		Producto();
		Cuenta();
		Libro();
        Calculadora();
	}
	//ejercicio 1
    private static void Persona()  {
    	Persona persona1 = new Persona("Yesmy", "Escobar", 19 );
    	Persona persona2 = new Persona("Franklin", "Jimenez", 19);
    	Persona persona3 = new Persona ("Denisha", "Escobar", 13);
    	
    	System.out.println("PERSONAS AGREGADAS");
    	
    	System.out.println(persona1.mostrar());
    	System.out.println(persona2.mostrar());
    	System.out.println(persona3.mostrar());
    }
    //ejercicio 2
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
    //ejercicio 3
    public static void Producto() {
        System.out.println("PRODUCTOS CON DESCUENTO");
        Producto p1 = new Producto("A101", "Monitor Gaming", 2500.00);
        Producto p2 = new Producto("B202", "Teclado Mecánico", 600.00);
        p1.aplicarDescuento(15); // 15% de descuento
        p2.aplicarDescuento(10); // 10% de descuento
        p1.mostrarInformacion();
        p2.mostrarInformacion();
    }
    //ejercicio 4
    public static void Cuenta() {
        System.out.println("CUENTA BANCARIA");
        Cuenta miAhorro = new Cuenta("Estudiante", 500);
        miAhorro.depositar(250);
        miAhorro.retirar(1000); // Esto debe fallar por saldo insuficiente
        miAhorro.retirar(150);  // Esto debe funcionar
        miAhorro.mostrarSaldo();
    }
    //ejercicio 5
    public static void Libro() {
        System.out.println("LIBROS CON MAS DE 300 PAGINAS");
        Libro l1 = new Libro("La teoria de Kim", "Jay Sandoval", 450);
        Libro l2 = new Libro("El jardin de las mariposas", "Dot Hutchinson", 236);
        Libro l3 = new Libro("Al final mueren los dos", "Adam silvera", 255);
        
        Libro[] biblioteca = {l1, l2, l3};
        System.out.println("Listado de libros que cumplen la condición (>300 páginas):");
        for (Libro l : biblioteca) {
            if (l.esLargo()) {
                System.out.println("- " + l.getTitulo());
            }
        }
    }
    //ejercicio 6
    public static void Calculadora() {
        System.out.println("\n--- 6. CLASE CALCULADORA ---");
        Calculadora calc = new Calculadora();
        double a = 10, b = 2;
        double c = 0;
        System.out.println("Suma: " + calc.sumar(a, b));
        System.out.print("Validación División entre cero: ");
        calc.dividir(a, c);
    }
    }
    

