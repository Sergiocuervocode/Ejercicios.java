//8.a.13.
package Practica7;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Almacen almacen = new Almacen();

        while (true) {
            System.out.println("1.- Añadir producto");
            System.out.println("2.- Listar productos");
            System.out.println("3.- Productos en peligro");
            System.out.println("4.- Calculo precio medio");
            System.out.println("5.- Eliminar bandejas");
            System.out.println("6.- Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Tipo de producto (1. Carne Fresca, 2. Carne Congelada Entera, 3. Carne Congelada Troceada, 4. Pescado): ");
                    int tipo = scanner.nextInt();
                    scanner.nextLine(); // Limpiar buffer
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Peso: ");
                    double peso = scanner.nextDouble();
                    System.out.print("Precio por kilo: ");
                    double precioKilo = scanner.nextDouble();
                    scanner.nextLine(); // Limpiar buffer

                    if (tipo == 1) {
                        System.out.print("Origen (vacuno/avícola): ");
                        String origen = scanner.nextLine();
                        System.out.print("Días de caducidad: ");
                        int diasCaducidad = scanner.nextInt();
                        scanner.nextLine(); // Limpiar buffer
                        almacen.añadirProducto(new CarneFresca(nombre, peso, precioKilo, origen,diasCaducidad));
                    }
            }
        }
    }
}