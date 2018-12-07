/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.experimental.theories.suppliers.TestedOn;
import static sandw.Sandwicheria.listaProductos;
import static sandw.Sandwicheria.listaRubros;
import sandw.dominio.Agregado;
import sandw.dominio.Producto;
import sandw.dominio.Rubro;
import sandw.dominio.Venta;

/**
 *
 * @author cnaza
 */

public class CalcularTotalTest {
   
    public CalcularTotalTest() {
    
    }
    //Calculo de Total con 1 producto
    @Test
    public void testCalcularTotal1(){
    Producto p1=new Producto("Milanesa", 100, 100, null, 75);
    Venta venta = new Venta();
    venta.addProducto(p1);
    
    double resultado = venta.calcularTotal();
    double esperado = 75;
    
    assertTrue(resultado == esperado);
    }

    //Calculo de Total con 2 productos
    @Test
    public void testCalcularTotal2(){
    Producto p1=new Producto("Milanesa", 100, 100, null, 75);
    Producto p6=new Producto("Coca Cola", 50, 106, null, 40.00);
    Venta venta = new Venta();
    venta.addProducto(p1);
    venta.addProducto(p6);
    
    double resultado = venta.calcularTotal();
    double esperado = 115;
    
    assertTrue(resultado == esperado);
    }
    
//Calculo de Total con 1 producto con 1 agregado premium
    @Test
    public void testCalcularTotalAgregadoPremium(){
    Producto p1=new Producto("Milanesa", 100, 100, null, 75);
    Venta venta = new Venta();
    p1.addPremiuns(new Agregado("Jamon", true,20));
    venta.addProducto(p1);
    
    double resultado = venta.calcularTotal();
    double esperado = 95;
    
    assertTrue(resultado == esperado);
    }
    
    //Calculo de Total con 1 producto con 2 agregado premium
    @Test
    public void testCalcularTotal2AgregadosPremium(){
    Producto p1=new Producto("Milanesa", 100, 100, null, 75);
    Venta venta = new Venta();
    p1.addPremiuns(new Agregado("Jamon", true,20));
    p1.addPremiuns(new Agregado("Huevo", true,20));
    venta.addProducto(p1);
    
    double resultado = venta.calcularTotal();
    double esperado = 115;
    
    assertTrue(resultado == esperado);
    }
    
    //Calculo de Total con 1 producto con 2 agregado premium
    @Test
    public void testCalcularTotal2Productos2AgregadosPremium(){
    Producto p1=new Producto("Milanesa", 100, 100, null, 75);
    Producto p6=new Producto("Coca Cola", 50, 106, null, 40.00);
    Venta venta = new Venta();
    p1.addPremiuns(new Agregado("Jamon", true,20));
    p1.addPremiuns(new Agregado("Huevo", true,20));
    p6.addPremiuns(new Agregado("Queso", true,30));
    p6.addPremiuns(new Agregado("Huevo", true,20));
    venta.addProducto(p1);
    venta.addProducto(p6);
    
    double resultado = venta.calcularTotal();
    double esperado = 205;
    
    assertTrue(resultado == esperado);
    }
}
