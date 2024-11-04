package Practica8;
public class Coche extends Vehiculo {
  private int puertas;

  public Coche(double precioCompra, String marca, int puertas) {
      super(precioCompra, marca);
      this.puertas = puertas;
  }

  public int getPuertas() {
      return puertas;
  }

  @Override
  public double precioVenta() {
      return getPrecioCompra() * 1.60;
  }
}
