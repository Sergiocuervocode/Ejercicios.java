
//Nos piden realizar una agenda telefónica de contactos.
//Un contacto está definido por un nombre y un teléfono (No es necesario de validar). Un contacto es igual a otro cuando sus nombres son iguales.
//Una agenda de contactos está formada por un conjunto de contactos (Piensa en que tipo puede ser)
//Se podrá crear de dos formas, indicándoles nosotros el tamaño o con un tamaño por defecto (10) 
//Los métodos de la agenda serán los siguientes:
//• aniadirContacto(Contacto c): Añade un contacto a la agenda, sino se pueden meter más a la agenda se indicara por pantalla. No se pueden meter contactos que existan, es decir, no podemos duplicar nombres, aunque tengan distinto teléfono.
//• existeContacto(Conctacto c): indica si el contacto pasado existe o no.
//• listarContactos(): Lista toda la agenda
//• buscaContacto(String nombre): busca un contacto por su nombre y muestra su teléfono.
//• eliminarContacto(Contacto c): elimina el contacto de la agenda, indica si se ha eliminado o no por pantalla
//• agendaLlena(): indica si la agenda está llena.
//• huecosLibres(): indica cuantos contactos más podemos meter.
//Crea un menú con opciones por consola para probar todas estas funcionalidades.
//package Practica5;
public class Agenda {
  
private Contacto[] contactos;

public Agenda(){
  this.contactos= new Contacto[10];
}

public Agenda(int tamaño){
  this.contactos= new Contacto[tamaño];
}

public void añadirContacto(Contacto c){

  if (existeContacto(c)) {
    System.out.println("El contacto con ese nombre ya existe");
  }else if (agendaLlena()) {
    System.out.println("La agenda esta llena, no se pueden meter mas contactos");
  }
  else{
    boolean encontrado=false;
    for(int i=0; i<contactos.length && !encontrado;i++){
      if (contactos[i]==null) {
        contactos[i]=c;
        encontrado=true;
      }
    }
  
    if (encontrado) {
      System.out.println("Se ha añadido");
    }else{
      System.out.println("No se ha podido añadir");
    }
  
  }
}

public boolean existeContacto(Contacto c){
 

  for(int i=0; i<contactos.length;i++){
    if (contactos[i]==null&& c.equals(contactos[i])) {
      return true;
    }
  }
  return false;
}

public void listaContactos(){

for(int i=0;i<contactos.length;i++){
    if(contactos[1]!=null){
      System.out.println(contactos[i]);
    }
  }
}

public void buscarPorNombre(String nombre){

boolean encontrado=false;

  for(int i=0;i<contactos.length && encontrado;i++){
    if(contactos[1]!=null && contactos[i].getNombre().equalsIgnoreCase(nombre)){
      System.out.println("Su telefono es"+contactos[i].getTelefono());
      encontrado=true;
    }
  }
 if (!encontrado) {
  System.out.println("No se ha encotrado el contacto");

 }
}

public boolean agendaLlena(){

  
  for(int i=0;i<contactos.length;i++){
    if(contactos[1]==null){
      return false;
    }
  }
  return true;
}

public void eliminarContacto(Contacto c){

boolean encontrado=false;

  for(int i=0;i<contactos.length;i++){
    if(contactos[1]!=null && contactos[i].equals(c)){
     contactos[i]=null;
     encontrado=true;
}

}

if (!encontrado) {
  System.out.println("No se ha eliminado el contacto");
}
}

public int huecosLibre(){

  int contadorLibres=0;

  for(int i=0;i<contactos.length;i++){
    if(contactos[1]==null){
     contadorLibres++;
}
}
return contadorLibres;
}
}