package Practica9;

public class Main {
  public static void main(String[] args) {
      Producto[] productos = new Producto[10];

      productos[0] = new ProductoFresco("2025-12-31", 1, "2024-01-15", "Colombia");
      productos[1] = new ProductoFresco("2025-12-31", 2, "2024-01-16", "Perú");

      productos[2] = new ProductoRefrigerado("2025-12-31", 3, "COD123", "2024-01-17", -5, "Chile");
      productos[3] = new ProductoRefrigerado("2025-12-31", 4, "COD456", "2024-01-18", -4, "Brasil");
      productos[4] = new ProductoRefrigerado("2025-12-31", 5, "COD789", "2024-01-19", -6, "Argentina");

      productos[5] = new CongeladoPorAgua("2025-12-31", 6, "2024-01-20", "España", -18, 5);
      productos[6] = new CongeladoPorAgua("2025-12-31", 7, "2024-01-21", "Portugal", -19, 6);

      productos[7] = new CongeladoPorAire("2025-12-31", 8, "2024-01-22", "Francia", -20, 78, 21, 1.2, 0.8);
      productos[8] = new CongeladoPorAire("2025-12-31", 9, "2024-01-23", "Alemania", -21, 79, 20, 1.1, 0.9);

      productos[9] = new CongeladoPorNitrogeno("2025-12-31", 10, "2024-01-24", "Italia", -22, "Flash Freeze", 300);

      System.out.println("Información de los productos:");
      for (Producto producto : productos) {
          producto.mostrarInformacion();
          System.out.println();
      }
  }
}
