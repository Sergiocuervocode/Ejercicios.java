package Practica14;

public class ProfesorEmerito extends Profesor {
  private int añosEmerito;

  public ProfesorEmerito(String nombre, int edad, int añosConsolidados, int añosEmerito) {
    super(nombre, edad, añosConsolidados);
    setAñosEmerito(añosEmerito);
  }

  public double obtenerSalarioBase() {
    double salarioBase = 925;
    salarioBase += getAñosConsolidados() * 12.25;
    salarioBase += 23.40 * getAñosEmerito();
    return salarioBase;
  }

  public int getAñosEmerito() {
    return añosEmerito;
  }

  public void setAñosEmerito(int añosEmerito) {
    this.añosEmerito = añosEmerito;
  }
}
