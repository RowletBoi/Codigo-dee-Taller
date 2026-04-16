package Classes;

public class Usuario {

    private String id;
    private String nombre;
    private String correo;

    public Usuario(String id, String nombre, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
    }

    public void mostrarUsuario() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Correo: " + correo);
    }

    public String getId() {
        return id;
    }
}