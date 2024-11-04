package Practica5;
import java.util.InputMismatchException;
import java.util.Scanner;
public class test {


  public static void main(String[] args) {
    
    Scanner sn= new Scanner(System.in);
    sn.useDelimiter("/n");
    boolean salir= false;
    int opcion;

    Agenda agendaTelefonica = new Agenda(3);
    String nombre;
    int telefono;

      Contacto c;

    while (!salir) {
      
      System.out.println( "1. Añadir contacto");
      System.out.println( "2. Añadir contactos");
      System.out.println( "3. Añadir contacto");
      System.out.println( "4. Añadir contacto");
      System.out.println( "5. Eliminar contacto");
      System.out.println( "6. Contactos disponibles");
      System.out.println( "7. Agenda Llena");
      System.out.println( "8. Salir");
      try{
      System.out.println("Escribe una de las opciones");
        opcion=sn.nextInt();

      switch (opcion) {
        case 1:
          
        System.out.println("Escribe un nombre");
        nombre= sn.next();

         System.out.println("Escribe un nombre");
            telefono= sn.nextInt();

            c= new Contacto(nombre, telefono);

            agendaTelefonica.añadirContacto(c);

          break;
        case 2:

          agendaTelefonica.listaContactos();

          break;
        case 3:

        System.out.println("Escribe un nombre");
        nombre= sn.next();

          agendaTelefonica.buscarPorNombre(nombre);

          break;
        case 4:

          
        System.out.println("Escribe un nombre");
        nombre= sn.next();

        c= new Contacto(nombre,0);

           if (agendaTelefonica.existeContacto(c)) {
            System.out.println("Existe contacto");
           } else{
            System.out.println("No existe contacto");
           }

          break;
        case 5:

        System.out.println("Escribe un nombre");
        nombre= sn.next();

        c= new Contacto(nombre,0);

          agendaTelefonica.eliminarContacto(c);
        case 6:

           System.out.println("Hay"+agendaTelefonica.huecosLibre()+"contactos libre");

          break;
        case 7:
          
           if (agendaTelefonica.agendaLlena()) {
            System.out.println("La agenda esta llena");
           }else{
            System.out.println("Aun puede meter contactos");
           }
        
          break;

        case 8:
          salir= true;
          break;
        default:
        System.out.println("Solo número entre 1 y 7");
          }

        }catch(InputMismatchException e){
      System.out.println("Debes insertar un número");
      sn.next();
    }
      


    }



  }
}

