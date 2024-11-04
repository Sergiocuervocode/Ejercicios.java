//8.a.6.

package Practica9;
public abstract class Producto {
    private String fechaCaducidad;
    private int numeroLote;

    public Producto(String fechaCaducidad, int numeroLote) {
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public int getNumeroLote() {
        return numeroLote;
    }

    public abstract void mostrarInformacion();
}
