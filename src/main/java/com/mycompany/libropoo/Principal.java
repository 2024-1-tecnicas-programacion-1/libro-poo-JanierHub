package com.mycompany.libropoo;
 import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /////////////////////////////////////////////////// Este codigo es de complejidad constante o(1)
        System.out.print("Ingrese el título del libro: ");
        String titulo = scanner.nextLine();
        System.out.print("Ingrese el nombre del autor del libro: ");
        String autor = scanner.nextLine();
        System.out.print("Ingrese el género del libro: ");
        String genero = scanner.nextLine();
        System.out.print("Ingrese el año de publicación del libro: ");
        int anoPublicacion = scanner.nextInt();

        
        Libro libro = new Libro(titulo, autor, genero, anoPublicacion);

        
        libro.marcarLeido();

       
        System.out.println("Datos del libro:");
        System.out.println(libro.mostrarInformacion());
        
        if (libro.esAntiguo()) {
            System.out.println("El libro es antiguo.");
        } else {
            System.out.println("El libro no es antiguo.");
        }

        scanner.close();
    }
}
