package Practica7;
public abstract class Carne extends ProductoBase {
  private String origen;

  public Carne(String nombre, double peso, double precioKilo, String origen) {
      super(nombre, peso, precioKilo);
      if (!origen.equals("vacuno") && !origen.equals("avícola")) {
          throw new IllegalArgumentException("Origen debe ser 'vacuno' o 'avícola'");
      }
      this.origen = origen;
  }

  public String getOrigen() {
      return origen;
  }
}
