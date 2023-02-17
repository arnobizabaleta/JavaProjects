package com.company.objects;

public class Compras {
    int codCompra;
    String idTransaccion;
    String fecha;
    String status;
    String email;
    String id_cliente;
    String id_titular;
    float total;

    public Compras(){

    }
    public Compras(int codCompra){
        this.codCompra = codCompra;

    }

    public Compras(int codCompra, String idTransaccion, String fecha, String email, String id_cliente, String id_titular, float total){
        this.codCompra = codCompra;
        this.idTransaccion = idTransaccion;
        this.fecha = fecha;
        this.email = email;
        this.id_cliente = id_cliente;
        this.id_titular = id_titular;
        this.total = total;
    }

    public void setCodCompra (int codCompra){
        this.codCompra = codCompra;
    }
    public int getCodCompra(){
        return this.codCompra;
    }

    public void setIdTransaccion(String idTransaccion){
        this.idTransaccion = idTransaccion;
    }

    public String getIdTransaccion(){
        return this.idTransaccion;
    }

    public void setFecha( String fecha){
        this.fecha = fecha;
    }

    public String getFecha(){
        return  this.fecha;
    }

    public void setEmail( String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }
    public void setId_cliente( String id_cliente){
        this.id_cliente = id_cliente;
    }
    public String getId_cliente(){
        return this.id_cliente;
    }
    public void  setId_titular( String id_titular){
        this.id_titular = id_titular;
    }
    public  String getId_titular(){
        return this.id_titular;
    }

    public void setStatus( String status){
        this.status = status;
    }
    public String getStatus(){
        return this.status;
    }
    public void setTotal(float total){
        this.total = total;
    }

    public  float getTotal(){
        return this.total;
    }
}
