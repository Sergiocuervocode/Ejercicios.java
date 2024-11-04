
package Practica7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Almacen {
    private List<Producto> productos;

    public Almacen() {
        productos = new ArrayList<>();
    }

    public void añadirProducto(Producto producto) {
        productos.add(producto);
    }

    public void listarProductos() {
        for (Producto producto : productos) {
            System.out.println("Nombre: " + producto.getNombre() + ", Precio: " + producto.calcularPrecio());
        }
    }

    public void listarCarnesFrescasEnPeligro() {
        for (Producto producto : productos) {
            if (producto instanceof CarneFresca) {
                CarneFresca carneFresca = (CarneFresca) producto;
                if (carneFresca.getDiasCaducidad() < 10) {
                    System.out.println("Nombre: " + carneFresca.getNombre() + ", Días de caducidad: " + carneFresca.getDiasCaducidad());
                }
            }
        }
    }

    public double calcularPrecioMedio() {
        double totalPrecio = 0;
        for (Producto producto : productos) {
            totalPrecio += producto.calcularPrecio();
        }
        return totalPrecio / productos.size();
    }

    public void eliminarCarnesEnBandeja() {
        Iterator<Producto> iterator = productos.iterator();
        while (iterator.hasNext()) {
            Producto producto = iterator.next();
            if (producto instanceof CarnePiezaEntera) {
                CarnePiezaEntera carnePiezaEntera = (CarnePiezaEntera) producto;
                if (carnePiezaEntera.isEnBandeja()) {
                    iterator.remove();
                }
            }
        }
    }
}
