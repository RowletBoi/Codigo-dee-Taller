package Classes;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private String nombre;
    private String direccion;
    private List<Libro> listaLibros;
    private List<Usuario> listaUsuarios;

    public Biblioteca(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.listaLibros = new ArrayList<>();
        this.listaUsuarios = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        listaLibros.add(libro);
    }

    public void registrarUsuario(Usuario usuario) {
        listaUsuarios.add(usuario);
    }

    public Libro buscarLibro(String codigo) {
        for (Libro libro : listaLibros) {
            if (libro.getCodigo().equals(codigo)) {
                return libro;
            }
        }
        return null;
    }

    public void mostrarLibros() {
        if (listaLibros.isEmpty()) {
            System.out.println("No hay libros registrados.");
            return;
        }

        for (Libro libro : listaLibros) {
            libro.mostrarInfo();
            System.out.println("---------------------");
        }
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }
}