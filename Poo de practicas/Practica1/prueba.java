package Practica1;

public class prueba {
  public static void main(String[] args) {
   Producto [] productos= new Producto[3];

   
   productos[0]= new Producto("producto1", 10);
   productos[1]= new Perecedero("producto2",20,5);
   productos[2]= new Noperecedero("producto3", 5, "tipo1");

   double total=0;

   for(int i=0;i<productos.length;i++){
        total += productos[i].calcular(5);
      
   }
    System.out.println("el total es: "+total);
  }
}
