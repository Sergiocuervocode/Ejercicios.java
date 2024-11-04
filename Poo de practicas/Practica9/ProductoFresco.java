package Practica9;
public class ProductoFresco extends Producto {
    private String fechaEnvasado;
    private String paisOrigen;

    public ProductoFresco(String fechaCaducidad, int numeroLote, String fechaEnvasado, String paisOrigen) {
        super(fechaCaducidad, numeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Producto Fresco:");
        System.out.println("Fecha de Caducidad: " + getFechaCaducidad());
        System.out.println("Número de Lote: " + getNumeroLote());
        System.out.println("Fecha de Envasado: " + fechaEnvasado);
        System.out.println("País de Origen: " + paisOrigen);
    }
}