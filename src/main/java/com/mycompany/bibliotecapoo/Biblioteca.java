package com.mycompany.bibliotecapoo;

import java.util.LinkedList;

public class Biblioteca {
    // TODO: Aquí va tu código  
    private LinkedList <Libro> Libros;
    
    
    public Biblioteca() {
        this.Libros = new LinkedList<>();
    }

   

    public void registrarLibro (Libro libro){

        Libros.add(libro);
      
       
    }


    public Libro buscarLibro(String palabrabusqueda){

        for (Libro libro: Libros){
            if (libro.getTitulo().equals(libro) || libro.getAutor().equals(libro) || libro.getAutor().equals(libro)){

                return libro;

            }
            
                

        }
        return null;

    }

    public void MostrarLibros (){

        for(Libro libros:Libros) {
            System.out.println(libros);
        }


    }


    public String mostrarLibrosNoLeidos(){
        String librosLeidos= "";
        for(Libro leido: Libros){
          if(leido.getmarcarLeido()==false){
              librosLeidos += leido;
          }
        }
        return librosLeidos;
    }
}
       
      
   

