package Practica12;

public class Triangulo extends Forma {
  private double base;
  private double altura;

  public Triangulo(String nombre, double posicionX, double posicionY, String color, double base, double altura) {
      super(nombre, posicionX, posicionY, color);
      this.base = base;
      this.altura = altura;
  }

  public double getBase() {
      return base;
  }

  public void setBase(double base) {
      this.base = base;
  }

  public double getAltura() {
      return altura;
  }

  public void setAltura(double altura) {
      this.altura = altura;
  }

  @Override
  public double calcularArea() {
      return (base * altura) / 2;
  }

  @Override
  public double calcularPerimetro() {
      double lado = Math.sqrt((base / 2) * (base / 2) + altura * altura);
      return 2 * lado + base;
  }
}
