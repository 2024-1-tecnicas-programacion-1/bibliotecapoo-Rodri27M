package com.mycompany.bibliotecapoo;

public class Libro {
    // TODO: Aquí va tu código
      private String titulo;
    private String autor;
    private int anoPublicacion;
    private boolean leido;
    private String genero;

    public Libro(String titulo, String autor, int anoPublicacion, String genero){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacion = anoPublicacion; 
        this.leido = false;
        this.genero = genero;
        
    }
    public String mostrarInformacion(){// Tiempo constante 0(1) 
        
        return "Titulo: " + titulo + " Autor: " + autor + " Año de publicación: " + anoPublicacion + " Genero: " + genero;
        
    }
    public void marcarLeido(){// Tiempo constante 0(1) 
        leido=true;
        
    }
     
    public boolean esAntiguo(){// Tiempo constante 0(1)  
         return (2024-anoPublicacion >= 50);
      }  

    public boolean isLeido() {// Tiempo constante 0(1) 
        return leido;
    }
}
