package com.company.objects;

public class Roles {
    int codRol;
    String descripcion;

    public Roles(){

    }

    public Roles( int codRol){
        this.codRol = codRol;
    }

    public Roles( int codRol, String descripcion){
        this. codRol = codRol;
        this.descripcion = descripcion;
    }

    public void setCodRol( int codRol){
        this.codRol = codRol;
    }

    public int getCodRol(){
        return this.codRol;
    }

    public void setDescripcion(String descripcion){
       this.descripcion = descripcion;
    }

    public String getDescripcion(){
        return  this.descripcion;
    }
}
