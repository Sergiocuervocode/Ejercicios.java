package Practica7;
public class CarnePiezaTroceada extends CarneCongelada {
  private int numeroMedioPiezas;

  public CarnePiezaTroceada(String nombre, double peso, double precioKilo, String origen, String empresaDistribuidora, int numeroMedioPiezas) {
      super(nombre, peso, precioKilo, origen, empresaDistribuidora);
      this.numeroMedioPiezas = numeroMedioPiezas;
  }

  public int getNumeroMedioPiezas() {
      return numeroMedioPiezas;
  }
}
