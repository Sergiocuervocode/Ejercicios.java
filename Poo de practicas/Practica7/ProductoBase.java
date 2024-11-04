package Practica7;
public abstract class ProductoBase implements Producto {
  private String nombre;
  private double peso;
  private double precioKilo;

  public ProductoBase(String nombre, double peso, double precioKilo) {
      this.nombre = nombre;
      this.peso = peso;
      this.precioKilo = precioKilo;
  }

  public String getNombre() {
      return nombre;
  }

  public double getPeso() {
      return peso;
  }

  public double getPrecioKilo() {
      return precioKilo;
  }

  @Override
  public double calcularPrecio() {
      return peso * precioKilo;
  }
}
