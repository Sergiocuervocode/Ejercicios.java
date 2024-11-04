package Practica9;

public class CongeladoPorNitrogeno extends ProductoCongelado {
  private String metodoCongelacion;
  private int tiempoExposicion;

  public CongeladoPorNitrogeno(String fechaCaducidad, int numeroLote, String fechaEnvasado, String paisOrigen, double temperaturaMantenimiento, String metodoCongelacion, int tiempoExposicion) {
      super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaMantenimiento);
      this.metodoCongelacion = metodoCongelacion;
      this.tiempoExposicion = tiempoExposicion;
  }

  @Override
  public void mostrarInformacion() {
      System.out.println("Producto Congelado por Nitrógeno:");
      System.out.println("Fecha de Caducidad: " + getFechaCaducidad());
      System.out.println("Número de Lote: " + getNumeroLote());
      System.out.println("Fecha de Envasado: " + getFechaEnvasado());
      System.out.println("País de Origen: " + getPaisOrigen());
      System.out.println("Temperatura de Mantenimiento: " + getTemperaturaMantenimiento());
      System.out.println("Método de Congelación: " + metodoCongelacion);
      System.out.println("Tiempo de Exposición al Nitrógeno: " + tiempoExposicion + " segundos");
  }
}
