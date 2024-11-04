//8.a.2.
package Practica13;
public class Empleado {
  private String nombre;
  private String dni;
  private int edad;
  private boolean casado;
  private double salario;
  private static final int EDAD_MINIMA = 18;
  private static final int EDAD_MAXIMA = 45;

  public Empleado() {
  }

  public Empleado(String nombre, String dni, int edad, boolean casado, double salario) {
      this.nombre = nombre;
      this.dni = dni;
      setEdad(edad);
      this.casado = casado;
      this.salario = salario;
  }

  public String getNombre() {
      return nombre;
  }

  public void setNombre(String nombre) {
      this.nombre = nombre;
  }

  public String getDni() {
      return dni;
  }

  public void setDni(String dni) {
      this.dni = dni;
  }

  public int getEdad() {
      return edad;
  }

  public void setEdad(int edad) {
      if (edad >= EDAD_MINIMA && edad <= EDAD_MAXIMA) {
          this.edad = edad;
      } else {
          throw new IllegalArgumentException("Edad debe estar entre " + EDAD_MINIMA + " y " + EDAD_MAXIMA);
      }
  }

  public boolean isCasado() {
      return casado;
  }

  public void setCasado(boolean casado) {
      this.casado = casado;
  }

  public double getSalario() {
      return salario;
  }

  public void setSalario(double salario) {
      this.salario = salario;
  }

  public void clasifica() {
      if (edad <= 21) {
          System.out.println("Principiante");
      } else if (edad >= 22 && edad <= 35) {
          System.out.println("Intermedio");
      } else {
          System.out.println("Senior");
      }
  }

  public void subirSalario(int porcentaje) {
      this.salario += this.salario * porcentaje / 100.0;
  }

  @Override
  public String toString() {
      return "Nombre: " + nombre + "\nDNI: " + dni + "\nEdad: " + edad + "\nCasado: " + casado + "\nSalario: " + salario;
  }
}
