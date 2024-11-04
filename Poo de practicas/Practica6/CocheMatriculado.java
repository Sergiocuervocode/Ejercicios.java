package Practica6;
public class CocheMatriculado extends Coche {
    private final int anioMatriculacion;
    private final int mesMatriculacion;
    private double impuestoMatriculacion;

    public CocheMatriculado(String marca, String color, double precio, double factorContaminacion, int anio, int anioMatriculacion, int mesMatriculacion, String matricula, String dniTitular) {
        super(marca, color, precio, factorContaminacion, anio);
        this.anioMatriculacion = anioMatriculacion;
        this.mesMatriculacion = mesMatriculacion;
        this.setMatricula(matricula);
        this.setDniTitular(dniTitular);
        calculaImpuestoMatriculacion();
    }

    public int getAnioMatriculacion() {
        return anioMatriculacion;
    }

    public int getMesMatriculacion() {
        return mesMatriculacion;
    }

    public double getImpuestoMatriculacion() {
        return impuestoMatriculacion;
    }

    public void calculaImpuestoMatriculacion() {
        impuestoMatriculacion = getPrecio() / 20;
        if (getAnio() < anioMatriculacion - 10) {
            impuestoMatriculacion += 100;
        }
    }

    @Override
    public void setPrecio(double precio) {
        super.setPrecio(precio);
        calculaImpuestoMatriculacion();
    }
}
