package com.company;

import com.company.objects.Categorias;
import com.company.objects.Compras;
import com.company.objects.Roles;
import com.company.objects.Vehiculo;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //JOptionPane.showMessageDialog(null,"Hola mundo");
        Vehiculo v = new Vehiculo();
        Vehiculo v2 = new Vehiculo("MIY106");
        Vehiculo v3 = new Vehiculo("WER456","2010","Mazda","Negro","Fernando");
        v.setPlaca("QEJ426");

        System.out.println("La placa es v: " + v.getPlaca());
        System.out.println("La placa es v2: " + v2.getPlaca());
        System.out.println("La placa es v3: " + v3.getPlaca());

       // JOptionPane.showMessageDialog(null,"La placa es v: " + v.getPlaca());
       // JOptionPane.showMessageDialog(null,"La placa es v2: " + v2.getPlaca());
       // JOptionPane.showMessageDialog(null,"La placa es v3: " + v3.getPlaca());

        Compras c = new Compras();
        c.setCodCompra(1);
        Compras c2 = new Compras(2);
        Compras c3 = new Compras(3,"MMSH5","17/02/2023","azabaleta@sena.edu.co","10033272","6737822",1500000);
        System.out.println("El codigo de la compra c es: " + c.getCodCompra());
        System.out.println("El codigo de la compra c2 es: " + c2.getCodCompra());
        System.out.println("El codigo de la compra c3 es:" + c3.getCodCompra());
        System.out.println("El idTransaccion de la compra c3 es:" + c3.getIdTransaccion());
        System.out.println("La fecha de la compra c3 es: " + c3.getFecha());
        System.out.println("El email regisrado de la compra c3 es:" + c3.getEmail());
        System.out.println("El id del cliente de nuestra pagna registrada en la compra c3 es:" + c3.getId_cliente() );
        System.out.println("El id del titular del medio financiero de la compra  c3 es:" + c3.getId_titular() );
        System.out.println("El total de la compra es:" + c3.getTotal());

        Categorias cat = new Categorias();
        cat.setCodCategoria(1);
        cat.setNombreCat("Ropa interior");
        Categorias cat2 = new Categorias(2,"Pijamas");
        System.out.println("El codido de la cat1 es: " + cat.getCodCategoria());
        System.out.println("El nombre de la cat1 es: " + cat.getNombreCat());
        System.out.println("El codido de la cat2 es: " + cat2.getCodCategoria());
        System.out.println("El nombre de la cat2 es: " + cat2.getNombreCat());

        Roles rol1 = new Roles();
        rol1.setCodRol( 1);
        rol1.setDescripcion("Cliente");
        Roles rol2 = new Roles(2,"Administrador");

        System.out.println("El codido del rol1 es: " + rol1.getCodRol());
        System.out.println("La descripcion del rol1 es: " + rol1.getDescripcion());
        System.out.println("El codido del rol2 es: " + rol2.getCodRol());
        System.out.println("El nombre del rol2 es: " + rol2.getDescripcion());

    }
}
