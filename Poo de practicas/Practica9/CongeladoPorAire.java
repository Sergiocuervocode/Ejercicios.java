package Practica9;

public class CongeladoPorAire extends ProductoCongelado {
  private double porcentajeNitrogeno;
  private double porcentajeOxigeno;
  private double porcentajeDioxidoCarbono;
  private double porcentajeVaporAgua;

  public CongeladoPorAire(String fechaCaducidad, int numeroLote, String fechaEnvasado, String paisOrigen, double temperaturaMantenimiento, double porcentajeNitrogeno, double porcentajeOxigeno, double porcentajeDioxidoCarbono, double porcentajeVaporAgua) {
      super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaMantenimiento);
      this.porcentajeNitrogeno = porcentajeNitrogeno;
      this.porcentajeOxigeno = porcentajeOxigeno;
      this.porcentajeDioxidoCarbono = porcentajeDioxidoCarbono;
      this.porcentajeVaporAgua = porcentajeVaporAgua;
  }

  @Override
  public void mostrarInformacion() {
      System.out.println("Producto Congelado por Aire:");
      System.out.println("Fecha de Caducidad: " + getFechaCaducidad());
      System.out.println("Número de Lote: " + getNumeroLote());
      System.out.println("Fecha de Envasado: " + getFechaEnvasado());
      System.out.println("País de Origen: " + getPaisOrigen());
      System.out.println("Temperatura de Mantenimiento: " + getTemperaturaMantenimiento());
      System.out.println("Composición del Aire: ");
      System.out.println("  - % de Nitrógeno: " + porcentajeNitrogeno);
      System.out.println("  - % de Oxígeno: " + porcentajeOxigeno);
      System.out.println("  - % de Dióxido de Carbono: " + porcentajeDioxidoCarbono);
      System.out.println("  - % de Vapor de Agua: " + porcentajeVaporAgua);
  }
}
