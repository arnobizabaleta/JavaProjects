package com.company.objects;

public class Vehiculo {
    String placa;
    String modelo;
    String marca;
    String color;
    String propietario;

    public Vehiculo() {

    }

    public Vehiculo(String placa) {
        this.placa = placa;
    }

    public Vehiculo(String placa, String modelo, String marca, String color, String propietario) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.propietario = propietario;
    }


    public void setPlaca(String placaL) {
        this.placa = placaL;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setModelo(String modeloL) {
        this.modelo = modeloL;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setMarca(String marcaL) {
        this.marca = marcaL;
    }

    public String getMarca() {
        return this.marca;
    }


    public void setColor(String colorL) {
        this.color = colorL;
    }

    public String getcolor() {
        return this.color;
    }

    public void setPropietario(String propietarioL) {
        this.propietario = propietarioL;
    }

    public String getPropietario() {
        return this.propietario;
    }














}
