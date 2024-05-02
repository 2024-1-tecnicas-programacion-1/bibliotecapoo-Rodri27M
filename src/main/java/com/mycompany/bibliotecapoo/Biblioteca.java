package com.mycompany.bibliotecapoo;

import java.util.LinkedList;

public class Biblioteca {
    // TODO: Aquí va tu código  
    private LinkedList <Libro> libros;
    
    
    public Biblioteca() {
        this.libros = new LinkedList<Libro>();
    }

   

    public void registrarLibro (Libro libro){

        libros.add(libro);
    
    }


    public Libro buscarLibro(String palabraBusqueda){// Tiempo constante 0(1) 

        for (Libro libro: libros){
            if (libro.getTitulo().equals(palabraBusqueda) || libro.getAutor().equals(palabraBusqueda) || libro.getGenero().equals(palabraBusqueda)){

                return libro;

            }
            
                

        }
        return null;

    }

    public LinkedList <Libro> MostrarLibros (){// Tiempo constante 0(1) 
             
           return libros;

    }


    public LinkedList <Libro> mostrarLibrosNoLeidos(){// Tiempo constante 0(1) 
        LinkedList <Libro> noLeidos = new LinkedList<>();
        for(Libro libro: libros){
          if(libro.getmarcarLeido()==false){
                noLeidos.add(libro); 
          }
        }
        return noLeidos;
    }
}
       
      
   

