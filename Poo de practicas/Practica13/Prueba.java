package Practica13;
public class Prueba {
  public static void main(String[] args) {
      Empleado empleado1 = new Empleado("Juan Pérez", "12345678A", 30, true, 3000.0);
      Programador programador1 = new Programador("Ana Gómez", "87654321B", 25, false, 4000.0, 50, "Java");

      System.out.println(empleado1);
      empleado1.clasifica();
      empleado1.subirSalario(10);
      System.out.println("Salario después de subir: " + empleado1.getSalario());

      System.out.println("\n" + programador1);
      programador1.clasifica();
      programador1.subirSalario(15);
      System.out.println("Salario después de subir: " + programador1.getSalario());
      System.out.println("Salario calculado: " + programador1.calculaSalario());
  }
}
