package com.company.objects;

public class Categorias {
    int codCategoria;
    String nombreCat;

    public Categorias(){

    }

    public Categorias(int codCategoria){
        this.codCategoria = codCategoria;
    }


    public Categorias(int codCategoria,String nombreCat){
        this.codCategoria = codCategoria;
        this.nombreCat = nombreCat;
    }

    public void setCodCategoria( int codCategoria){
        this.codCategoria = codCategoria;
    }

    public int getCodCategoria(){
        return this.codCategoria;
    }
    public void setNombreCat( String nombreCat){
        this.nombreCat = nombreCat;
    }

    public String getNombreCat(){
        return  this.nombreCat;
    }
}
