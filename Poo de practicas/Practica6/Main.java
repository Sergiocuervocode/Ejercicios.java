package Practica6;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Coche[] coches = new Coche[4];

        for (int i = 0; i < coches.length; i++) {
            System.out.println("Introduce los datos del coche " + (i + 1) + ":");

            System.out.print("Marca: ");
            String marca = scanner.nextLine();

            System.out.print("Color: ");
            String color = scanner.nextLine();

            System.out.print("Precio: ");
            double precio = scanner.nextDouble();

            System.out.print("Factor de contaminación: ");
            double factorContaminacion = scanner.nextDouble();

            System.out.print("Año: ");
            int anio = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            coches[i] = new Coche(marca, color, precio, factorContaminacion, anio);
        }

        System.out.println("\nDatos de los coches:");
        for (Coche coche : coches) {
            System.out.println("Marca: " + coche.getMarca() + ", Color: " + coche.getColor() +
                               ", KM: " + coche.getKm() + ", Precio: " + coche.getPrecio() +
                               ", Factor de Contaminación: " + coche.getFactorContaminacion() +
                               ", Año: " + coche.getAnio());
        }

        System.out.println("\nNúmero de coches instanciados: " + coches.length);
        scanner.close();
    }
}
