package Practica11;
public class Mansion {
  private Habitacion[] arrayHabitaciones;

  public Mansion() {
      this.arrayHabitaciones = new Habitacion[10]; // Ejemplo de capacidad fija, puede ajustarse según necesidad
  }

  public boolean agregarHabitacion(Habitacion hab) {
      for (int i = 0; i < arrayHabitaciones.length; i++) {
          if (arrayHabitaciones[i] == null) {
              arrayHabitaciones[i] = hab;
              return true;
          }
      }
      return false; // Si el array está lleno
  }

  public double calcularPrecioTotalAlfombras() {
      double total = 0;
      for (Habitacion habitacion : arrayHabitaciones) {
          if (habitacion != null) {
              total += habitacion.calcularPrecioTotal();
          }
      }
      return total;
  }

  public double calcularPrecioTotalAlfombrasCuadradas() {
      double total = 0;
      for (Habitacion habitacion : arrayHabitaciones) {
          if (habitacion != null) {
              total += habitacion.calcularPrecioAlfombrasCuadradas();
          }
      }
      return total;
  }
}
