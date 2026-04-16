package Classes;

public class Prestamo {

    private String codigoPrestamo;
    private Usuario usuario;
    private Libro libro;
    private String fechaPrestamo;
    private String fechaDevolucion;

    public Prestamo(String codigoPrestamo, Usuario usuario, Libro libro, String fechaPrestamo) {
        this.codigoPrestamo = codigoPrestamo;
        this.usuario = usuario;
        this.libro = libro;
        this.fechaPrestamo = fechaPrestamo;
    }

    public void registrarPrestamo() {
        if (libro.isDisponible()) {
            libro.prestar();
            System.out.println("Préstamo realizado correctamente.");
        } else {
            System.out.println("El libro no está disponible.");
        }
    }

    public void registrarDevolucion(String fechaDevolucion) {
        if (!libro.isDisponible()) {
            libro.devolver();
            this.fechaDevolucion = fechaDevolucion;
            System.out.println("Libro devuelto correctamente.");
        } else {
            System.out.println("El libro ya estaba disponible.");
        }
    }
}