package Practica9;

public class CongeladoPorAgua extends ProductoCongelado {
    private double salinidadAgua;

    public CongeladoPorAgua(String fechaCaducidad, int numeroLote, String fechaEnvasado, String paisOrigen, double temperaturaMantenimiento, double salinidadAgua) {
        super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaMantenimiento);
        this.salinidadAgua = salinidadAgua;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Producto Congelado por Agua:");
        System.out.println("Fecha de Caducidad: " + getFechaCaducidad());
        System.out.println("Número de Lote: " + getNumeroLote());
        System.out.println("Fecha de Envasado: " + getFechaEnvasado());
        System.out.println("País de Origen: " + getPaisOrigen());
        System.out.println("Temperatura de Mantenimiento: " + getTemperaturaMantenimiento());
        System.out.println("Salinidad del Agua: " + salinidadAgua + " g/L");
    }
}
