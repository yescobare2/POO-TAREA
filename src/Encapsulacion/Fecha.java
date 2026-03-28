package Encapsulacion;

public class Fecha {
    private int dia, mes, año;

    // Constructor 
    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    // Método para validar rangos básicos de día (1-31) y mes (1-12)
    public boolean esValida() {
        return (dia >= 1 && dia <= 31) && (mes >= 1 && mes <= 12);
    }

    // Método para imprimir la fecha
    public String imprimir() {
        return dia + "/" + mes + "/" + año;
    }
}