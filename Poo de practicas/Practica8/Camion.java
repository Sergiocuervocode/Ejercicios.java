package Practica8;

public class Camion extends Vehiculo {
  private double tamanoRemolque;
  private int numeroEjes;

  public Camion(double precioCompra, String marca, double tamanoRemolque, int numeroEjes) {
      super(precioCompra, marca);
      this.tamanoRemolque = tamanoRemolque;
      this.numeroEjes = numeroEjes;
  }

  public double getTamanoRemolque() {
      return tamanoRemolque;
  }

  public int getNumeroEjes() {
      return numeroEjes;
  }

  @Override
  public double precioVenta() {
      return getPrecioCompra() * 1.60 * numeroEjes;
  }
}
