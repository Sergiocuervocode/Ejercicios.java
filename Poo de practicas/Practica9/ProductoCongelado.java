package Practica9;

public abstract class ProductoCongelado extends Producto {
    private String fechaEnvasado;
    private String paisOrigen;
    private double temperaturaMantenimiento;

    public ProductoCongelado(String fechaCaducidad, int numeroLote, String fechaEnvasado, String paisOrigen, double temperaturaMantenimiento) {
        super(fechaCaducidad, numeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
        this.temperaturaMantenimiento = temperaturaMantenimiento;
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public double getTemperaturaMantenimiento() {
        return temperaturaMantenimiento;
    }
}
