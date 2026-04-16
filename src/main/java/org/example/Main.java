package org.example;

import Classes.Biblioteca;
import Classes.Libro;
import Classes.Prestamo;
import Classes.Usuario;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Biblioteca biblio = new Biblioteca("Biblioteca Central", "Managua");

        int opcion;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Registrar libro");
            System.out.println("2. Registrar usuario");
            System.out.println("3. Realizar prestamo");
            System.out.println("4. Mostrar libros");
            System.out.println("5. Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Codigo: ");
                    String cod = sc.nextLine();

                    System.out.print("Titulo: ");
                    String titulo = sc.nextLine();

                    System.out.print("Autor: ");
                    String autor = sc.nextLine();

                    biblio.agregarLibro(new Libro(cod, titulo, autor));
                    break;

                case 2:
                    System.out.print("ID: ");
                    String id = sc.nextLine();

                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Correo: ");
                    String correo = sc.nextLine();

                    biblio.registrarUsuario(new Usuario(id, nombre, correo));
                    break;

                case 3:
                    System.out.print("Codigo libro: ");
                    String codigoLibro = sc.nextLine();

                    Libro libro = biblio.buscarLibro(codigoLibro);

                    if (libro == null) {
                        System.out.println("Libro no encontrado.");
                        break;
                    }

                    System.out.print("ID usuario: ");
                    String idUser = sc.nextLine();

                    Usuario usuario = null;
                    for (Usuario u : biblio.getListaUsuarios()) {
                        if (u.getId().equals(idUser)) {
                            usuario = u;
                        }
                    }

                    if (usuario == null) {
                        System.out.println("Usuario no encontrado.");
                        break;
                    }

                    System.out.print("Fecha prestamo: ");
                    String fecha = sc.nextLine();

                    Prestamo p = new Prestamo("P1", usuario, libro, fecha);
                    p.registrarPrestamo();
                    break;

                case 4:
                    biblio.mostrarLibros();
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;
            }

        } while (opcion != 5);

        sc.close();
    }
}