package com.mycompany.bibliotecapoo;

import java.util.LinkedList;
import java.util.Scanner;


public class Principal {
    // TODO: Aquí va tu código
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        
        int opcion = 0;
        
      do{
        System.out.println("1) Ingresar libro");
        System.out.println("2) Mostrar todos los libros");
        System.out.println("3) Buscar libro");
        System.out.println("4) Marcar libro como leido");
        System.out.println("5) Mostrar libros no leidos");
        System.out.println("0) Finalizar proceso");
        
        opcion = sc.nextInt();
          
        switch(opcion){
            
          case 1:
         System.out.println("Ingrese el libro:");
         String titulo = sc.next();
         System.out.println("Ingrese autor:");
         String autor = sc.next();
         System.out.println("Ingrese año de publicacion:");
         int anoPublicacion = sc.nextInt();
         System.out.println("Ingrese genero");
         String genero = sc.next();
         Libro libro = new Libro(titulo, autor, anoPublicacion, genero);
         biblioteca.registrarLibro(libro);
             break;
             
          case 2:
              LinkedList<Libro> libros = biblioteca.MostrarLibros();
              for (int i = 0; i < libros.size(); i++) {
                  Libro libroVisitado = libros.get(i);
                  System.out.println("Libro " + i + " :"+ libroVisitado.mostrarInformacion());
              }
             break;
             
          case 3:
              System.out.println("Ingrese el libro a buscar: ");
              String palabrabusqueda = sc.next();
              Libro libro3 = biblioteca.buscarLibro(palabrabusqueda);
                 if(libro3.getTitulo() != null){
              System.out.println(biblioteca.buscarLibro(palabrabusqueda));
                 }else{
                   System.out.println("Libro no fue encontrado");
               }
             break;
             
          case 4:
              System.out.println("Ingrese libro a marcar leido");
              String palabraBusqueda = sc.next();
              Libro lectura = biblioteca.buscarLibro(palabraBusqueda);
              lectura.marcarLeido();
             break;
             
          case 5:
              LinkedList <Libro> sinleer = biblioteca.mostrarLibrosNoLeidos();
                for (int i = 0; i < sinleer.size(); i++) {
                   Libro sinLectura = sinleer.get(i);
                 System.out.println(" Libro " + i + " sin leer " + sinLectura.mostrarInformacion());
              }
                  
             break;
             
          case 0:
              System.out.println("Finalizo el proceso");
               default:
               
         }
      }while (opcion != 0);
         sc.close();
  }
}
