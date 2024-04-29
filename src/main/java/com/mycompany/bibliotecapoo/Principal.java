package com.mycompany.bibliotecapoo;

import java.util.LinkedList;
import java.util.Scanner;


public class Principal {
    // TODO: Aquí va tu código
    public static void main(String[] args) {
       
        Biblioteca libro2 = new Biblioteca();
        System.out.println("1) Ingresar libro");
        System.out.println("2) Mostrar todos los libros");
        System.out.println("3) Buscar libro");
        System.out.println("4) Marcar libro como leido");
        System.out.println("5) Mostrar libros no leidos");
        System.out.println("0) Finalizar proceso");
        Scanner sc = new Scanner(System.in);
        
        int opcion = sc.nextInt();
        
      do{
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
         libro2.registrarLibro(libro);
             break;
          case 2:
              libro2.MostrarLibros();
             break;
          case 3:
              System.out.println("Ingrese el libro a buscar: ");
              String palabrabusqueda = sc.next();
              Libro libro3 = libro2.buscarLibro(palabrabusqueda);
               if(libro3.getTitulo() != null){
              System.out.println(libro2.buscarLibro(palabrabusqueda));
               }else{
                   System.out.println("Libro no fue encontrado");
               }
             break;
          case 4:
              System.out.println("Ingrese libro a marcar leido");
              String libroleido = sc.next();
              Libro lectura = libro2.buscarLibro(libroleido);
              if(lectura!=null){
                  System.out.println("El libro se a marcado correctamente");
              }else{
                  System.out.println("El no fue encontrado");
              }
             break;
          case 5:
              String sinleer = libro2.mostrarLibrosNoLeidos();
                  System.out.println(sinleer);
                    
             break;
          case 0:
              System.out.println("Finalizo el proceso");
               default:
             break;
    }
      }while(opcion!=0);
         System.exit(opcion);
  }
}
