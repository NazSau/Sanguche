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
    @Test
    public CalcularTotalTest() {
    Producto p1=new Producto("Milanesa", 100, 100, null, 75);
    Producto p2=new Producto("Lomito", 100, 101, null, 90);
    Producto p3=new Producto("Mexicano", 100, 102, null, 150);
    Producto p5=new Producto("Cerveza", 2, 105, null, 80.00);
    Producto p6=new Producto("Coca Cola", 50, 106, null, 40.00);
    
    
    p1.addComponente(new Agregado("tomate", false));
    p1.addComponente(new Agregado("lechuga", false));
    p1.addComponente(new Agregado("mayonesa", false));
    p1.addComponente(new Agregado("mostaza", false));
    
    
    p2.addComponente(new Agregado("tomate", false));
    p2.addComponente(new Agregado("lechuga", false));
    p2.addComponente(new Agregado("mayonesa", false));
    p2.addComponente(new Agregado("mostaza", false));
    
    Venta venta = new Venta();
    venta.addProducto(p1);
    venta.addProducto(p6);
    
    double res = venta.calcularTotal();
    double esperado = 115.00;
    
    assertEquals(esperado, res);
    }
    
}
