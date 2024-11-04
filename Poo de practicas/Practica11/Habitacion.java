package Practica11;

public class Habitacion {
  private String nombre;
  private Alfombra[] alfombras;

  public Habitacion(String nombre) {
      this.nombre = nombre;
      this.alfombras = new Alfombra[10]; // Ejemplo de capacidad fija, puede ajustarse según necesidad
  }

  public String getNombre() {
      return nombre;
  }

  public Alfombra[] getAlfombras() {
      return alfombras;
  }

  public boolean agregarAlfombra(Alfombra alf) {
      for (int i = 0; i < alfombras.length; i++) {
          if (alfombras[i] == null) {
              alfombras[i] = alf;
              return true;
          }
      }
      return false; // Si el array está lleno
  }

  public double calcularPrecioTotal() {
      double total = 0;
      for (Alfombra alfombra : alfombras) {
          if (alfombra != null) {
              total += alfombra.calcularPrecio();
          }
      }
      return total;
  }

  public double calcularPrecioAlfombrasCuadradas() {
      double total = 0;
      for (Alfombra alfombra : alfombras) {
          if (alfombra instanceof AlfombraCuadrada) {
              total += alfombra.calcularPrecio();
          }
      }
      return total;
  }
}
