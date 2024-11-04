package Practica12;

public class Main {
  public static void main(String[] args) {
      Cuadrado cuadrado1 = new Cuadrado("Cuadrado1", 0, 0, "Rojo", 3);
      Cuadrado cuadrado2 = new Cuadrado("Cuadrado2", 1, 1, "Azul", 4);
      Rectangulo rectangulo1 = new Rectangulo("Rectángulo1", 2, 2, "Verde", 5, 6);
      Rectangulo rectangulo2 = new Rectangulo("Rectángulo2", 3, 3, "Amarillo", 7, 8);

      Forma[] formas = {cuadrado1, cuadrado2, rectangulo1, rectangulo2};

      double sumaAreas = 0;
      double sumaAreasCuadrados = 0;
      double sumaPerimetros = 0;
      int countCuadrados = 0;

      for (Forma forma : formas) {
          sumaAreas += forma.calcularArea();
          sumaPerimetros += forma.calcularPerimetro();
          if (forma instanceof Cuadrado) {
              sumaAreasCuadrados += forma.calcularArea();
              countCuadrados++;
          }
      }

      double mediaAreasCuadrados = countCuadrados == 0 ? 0 : sumaAreasCuadrados / countCuadrados;

      System.out.println("Suma de las áreas de todas las formas: " + sumaAreas);
      System.out.println("Media de las áreas de los cuadrados: " + mediaAreasCuadrados);
      System.out.println("Suma de los perímetros de todas las formas: " + sumaPerimetros);
  }
}
