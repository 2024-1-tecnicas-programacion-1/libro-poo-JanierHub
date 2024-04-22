package com.mycompany.libropoo;

public class Libro {
    private String titulo; 
    private String autor;
    private String genero; 
    private int anoPublicacion;
    private boolean leido; 

    public Libro(String titulo, String autor, String genero,int anoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.anoPublicacion = anoPublicacion;
        this.leido = false; 
    }
    
    public String mostrarInformacion(){
         return  "Titulo:"+titulo+";Autor:"+autor+";AñoPublicacion:"+anoPublicacion+";Genero:"+genero+"";
    } 
    
    public void marcarLeido(){
        System.out.println("El libro puede ser leido");  
    }
    
    public boolean esAntiguo(){
        if (anoPublicacion>50) {
            System.out.println("El libro no es antiguo");
        } else {
            System.out.println("El libro es antiguo");
        }
        return false; 
    }
    
    
   
}
