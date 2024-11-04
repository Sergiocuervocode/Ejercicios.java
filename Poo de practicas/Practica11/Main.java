package Practica11;
public class Main {
  public static void main(String[] args) {
      // Crear alfombras redondas y cuadradas
      AlfombraRedonda alfombraRedonda1 = new AlfombraRedonda("Rojo", 10, 5);
      AlfombraRedonda alfombraRedonda2 = new AlfombraRedonda("Azul", 12, 3);
      AlfombraCuadrada alfombraCuadrada1 = new AlfombraCuadrada("Verde", 15, 4);
      AlfombraCuadrada alfombraCuadrada2 = new AlfombraCuadrada("Amarillo", 18, 2);

      // Probar métodos de alfombras
      System.out.println("Superficie alfombra redonda 1: " + alfombraRedonda1.calcularSuperficie());
      System.out.println("Precio alfombra redonda 1: " + alfombraRedonda1.calcularPrecio());
      System.out.println("Superficie alfombra cuadrada 1: " + alfombraCuadrada1.calcularSuperficie());
      System.out.println("Precio alfombra cuadrada 1: " + alfombraCuadrada1.calcularPrecio());

      // Crear una habitación y agregar alfombras
      Habitacion habitacion = new Habitacion("Sala");
      habitacion.agregarAlfombra(alfombraRedonda1);
      habitacion.agregarAlfombra(alfombraRedonda2);
      habitacion.agregarAlfombra(alfombraCuadrada1);
      habitacion.agregarAlfombra(alfombraCuadrada2);

      // Probar métodos de habitación
      System.out.println("Precio total de las alfombras en la habitación: " + habitacion.calcularPrecioTotal());
      System.out.println("Precio total de las alfombras cuadradas en la habitación: " + habitacion.calcularPrecioAlfombrasCuadradas());

      // Crear una mansión y agregar habitaciones
      Mansion mansion = new Mansion();
      mansion.agregarHabitacion(habitacion);

      // Crear otra habitación y agregar más alfombras
      Habitacion habitacion2 = new Habitacion("Comedor");
      habitacion2.agregarAlfombra(new AlfombraCuadrada("Blanco", 20, 3));
      habitacion2.agregarAlfombra(new AlfombraRedonda("Negro", 22, 4));
      mansion.agregarHabitacion(habitacion2);

      // Probar métodos de mansión
      System.out.println("Precio total de las alfombras en la mansión: " + mansion.calcularPrecioTotalAlfombras());
      System.out.println("Precio total de las alfombras cuadradas en la mansión: " + mansion.calcularPrecioTotalAlfombrasCuadradas());
  }
}
