package Practica4;

import javax.naming.spi.Resolver;

public class Jugador {
  
  private int id;
  private String nombre;
  private boolean vivo;

  public jugador(int id) {
    this.id = id;
    this.nombre = "Juagador "+id;
    this.vivo = true;
  }

  public void disparar(Resolver r){

    System.out.println("El" +nombre+"se apunta con la pistola");

    if (r.disparar()) {
      this.vivo=false;
      System.out.println("El"+nombre+" ha muerto...");
    }else{
      System.out.println("El"+nombre+"se ha liberadoo...");
    }
    
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public boolean isVivo() {
    return vivo;
  }

  public void setVivo(boolean vivo) {
    this.vivo = vivo;
  }



}
