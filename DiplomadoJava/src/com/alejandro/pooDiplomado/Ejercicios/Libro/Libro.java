package com.alejandro.pooDiplomado.Ejercicios.Libro;

import com.alejandro.pooDiplomado.Persona;

public class Libro {
    private Persona autor;
    private String titulo;
    private int cantidadPaginas;

    public Libro(Persona autor, String titulo, int cantidadPaginas) {
        this.autor = autor;
        this.titulo = titulo;
        this.cantidadPaginas = cantidadPaginas;
    }

    public Libro(String titulo, int cantidadPaginas) {
        this.titulo = titulo;
        this.cantidadPaginas = cantidadPaginas;
    }

    public String mostrarInfoLibro(){
        if(tieneAutor()){
            return "Titulo: "+ titulo + "\nAutor: "+autor.nombre+"\nNumero de paginas: "+cantidadPaginas;
        }else{
            return "Titulo: "+ titulo + "\nAutor: No encontrado"+"\nNumero de paginas: "+cantidadPaginas;
        }
    }

    public String libroMasLargo(Libro comparacion){
        if(this.cantidadPaginas > comparacion.getCantidadPaginas()){
            return "El mas largo es:"+this.titulo+" con "+this.cantidadPaginas+" paginas";
        }else {
            return "El mas largo es:"+comparacion.getTitulo()+" con "+comparacion.getCantidadPaginas()+" paginas";
        }
    }

    private boolean tieneAutor(){
        if(autor == null){
            return false;
        }else {
            return true;
        }
    }

    public Persona getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getCantidadPaginas() {
        return cantidadPaginas;
    }
}
