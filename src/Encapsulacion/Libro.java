package Encapsulacion;

public class Libro {
    private String titulo;
    private String autor;
    private int paginas;

    // Constructor para inicializar los datos del libro
    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    // Método que retorna true si el libro tiene más de 300 páginas
    public boolean esLargo() {
        return paginas > 300;
    }

    // Método para obtener el título (usado en el listado del main)
    public String getTitulo() {
        return titulo;
    }
}
