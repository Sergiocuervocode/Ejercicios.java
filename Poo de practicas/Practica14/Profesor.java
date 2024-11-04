//Profesores eméritos. Crear la clase Profesor y la subclase ProfesorEmerito. Crear el código para estas
//clases que cumpla los requisitos siguientes:
//- Como atributos de la superclase tendremos
//String nombre
//int edad
//int añosConsolidados
//declarados como protected.
//- En la subclase se trabajará con el campo adicional int añosEmerito declarado como private.
//- Un método de la subclase será double obtenerSalarioBase() que obtendrá el salario base
//como (925 + añosConsolidados * 12.25 + 23.40 * añosEmerito).
//Intentar acceder directamente al campo añosConsolidados desde la subclase (como si fuera un campo
//más de la subclase) para implementar este método. ¿Es posible sin utilizar una invocación a super ni un
//método get? ¿Qué ocurre si el atributo en la superclase se declara private?

package Practica14;
public class Profesor {
  private String nombre;
  private int edad;
  private int añosConsolidados;

  public Profesor(String nombre, int edad, int añosConsolidados) {
    this.nombre = nombre;
    this.edad = edad;
    this.añosConsolidados = añosConsolidados;
  }  

  public String getNombre() {
    return nombre;
  }

  public int getEdad() {
    return edad;
  }

  public int getAñosConsolidados() {
    return añosConsolidados;
  }
}



