//Nuevos métodos tipo Math. Construir una clase Math2 que implemente una interfaz llamada
//IExtremos con el siguiente código fuente:
//public interface IExtremos {
//int min(int [] a);
//int max(int [] a);
//double min(double [] a);
//double max(double [] a);
//}
//Desde una clase Inicio crear objetos de Math2 y probando sus métodos
package Practica15;
public class Inicio {
  public static void main(String[] args) {
      Math2 math2 = new Math2();
      
      int[] intArray = {3, 5, 1, 8, 2};
      double[] doubleArray = {3.5, 5.1, 1.7, 8.3, 2.4};
      
      System.out.println("Mínimo de intArray: " + math2.min(intArray));
      System.out.println("Máximo de intArray: " + math2.max(intArray));
      
      System.out.println("Mínimo de doubleArray: " + math2.min(doubleArray));
      System.out.println("Máximo de doubleArray: " + math2.max(doubleArray));
  }
}
