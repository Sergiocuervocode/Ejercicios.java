//8.a.5.
package Practica8;
public abstract class Vehiculo {
  private double precioCompra;
  private String marca;

  public Vehiculo(double precioCompra, String marca) {
      this.precioCompra = precioCompra;
      this.marca = marca;
  }

  public double getPrecioCompra() {
      return precioCompra;
  }

  public String getMarca() {
      return marca;
  }

  public abstract double precioVenta();
}
