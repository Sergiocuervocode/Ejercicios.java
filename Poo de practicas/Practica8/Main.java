package Practica8;

public class Main {
  public static void main(String[] args) {
      // Crear array de camiones
      Camion[] camiones = {
          new Camion(10000, "Marca1", 8.5, 4),
          new Camion(15000, "Marca2", 10.0, 6),
          new Camion(20000, "Marca3", 12.0, 8)
      };

      System.out.println("Precios de venta de los camiones:");
      for (Camion camion : camiones) {
          System.out.println("Camión " + camion.getMarca() + ": $" + camion.precioVenta());
      }

      // Crear array de furgonetas
      Furgoneta[] furgonetas = {
          new Furgoneta(5000, "MarcaA", 12.0),
          new Furgoneta(7000, "MarcaB", 9.5)
      };

      System.out.println("\nPrecios de venta de las furgonetas:");
      for (Furgoneta furgoneta : furgonetas) {
          System.out.println("Furgoneta " + furgoneta.getMarca() + ": $" + furgoneta.precioVenta());
      }

      // Unir los arrays utilizando polimorfismo
      Vehiculo[] vehiculos = new Vehiculo[camiones.length + furgonetas.length];
      System.arraycopy(camiones, 0, vehiculos, 0, camiones.length);
      System.arraycopy(furgonetas, 0, vehiculos, camiones.length, furgonetas.length);

      System.out.println("\nPrecios de venta de todos los vehículos:");
      for (Vehiculo vehiculo : vehiculos) {
          System.out.println(vehiculo.getMarca() + ": $" + vehiculo.precioVenta());
      }
  }
}
