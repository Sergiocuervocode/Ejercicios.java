package Practica9;

public class ProductoRefrigerado extends Producto {
    private String codigoOrganismo;
    private String fechaEnvasado;
    private double temperaturaMantenimiento;
    private String paisOrigen;

    public ProductoRefrigerado(String fechaCaducidad, int numeroLote, String codigoOrganismo, String fechaEnvasado, double temperaturaMantenimiento, String paisOrigen) {
        super(fechaCaducidad, numeroLote);
        this.codigoOrganismo = codigoOrganismo;
        this.fechaEnvasado = fechaEnvasado;
        this.temperaturaMantenimiento = temperaturaMantenimiento;
        this.paisOrigen = paisOrigen;
    }

    public String getCodigoOrganismo() {
        return codigoOrganismo;
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public double getTemperaturaMantenimiento() {
        return temperaturaMantenimiento;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Producto Refrigerado:");
        System.out.println("Fecha de Caducidad: " + getFechaCaducidad());
        System.out.println("Número de Lote: " + getNumeroLote());
        System.out.println("Código del Organismo: " + codigoOrganismo);
        System.out.println("Fecha de Envasado: " + fechaEnvasado);
        System.out.println("Temperatura de Mantenimiento: " + temperaturaMantenimiento);
        System.out.println("País de Origen: " + paisOrigen);
    }
}
