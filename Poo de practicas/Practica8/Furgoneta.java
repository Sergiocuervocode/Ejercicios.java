package Practica8;

public class Furgoneta extends Vehiculo {
  private double capacidadCarga;

  public Furgoneta(double precioCompra, String marca, double capacidadCarga) {
      super(precioCompra, marca);
      this.capacidadCarga = capacidadCarga;
  }

  public double getCapacidadCarga() {
      return capacidadCarga;
  }

  @Override
  public double precioVenta() {
      double precioVentaInicial = getPrecioCompra() * 1.60;
      if (capacidadCarga > 10) {
          precioVentaInicial *= 1.20;
      }
      return precioVentaInicial;
  }
}
