//Vamos a hacer el juego de la ruleta rusa en Java.
//Como muchos sabéis, se trata de un número de jugadores que con un revolver con un sola bala en el tambor se dispara en la cabeza.
//Las clases a hacer son:
//• Revolver:
//o Atributos:
// posición actual (posición del tambor donde se dispara, puede que esté la bala o no)
// posición bala (la posición del tambor donde se encuentra la bala)
//  Estas dos posiciones, se generaran aleatoriamente.
//o Funciones:
// disparar(): devuelve true si la bala coincide con la posición actual
// siguienteBala(): cambia a la siguiente posición del tambor
// toString(): muestra información del revolver (posición actual y donde está la bala)
//• Jugador:
//o Atributos
// id (representa el número del jugador, empieza en 1)
// nombre (Empezara con Jugador más su ID, "Jugador 1" por ejemplo)
// vivo (indica si está vivo o no el jugador)
//o Funciones:
// disparar(Revolver r): el jugador se apunta y se dispara, si la bala se dispara, el jugador muere. 
//• Juego:
//o Atributos:
// Jugadores (conjunto de Jugadores)
// Revolver
//o Funciones:
// finJuego(): cuando un jugador muere, devuelve true
// ronda(): cada jugador se apunta y se dispara, se informara del estado de la partida (El jugador se dispara, no ha muerto en esa ronda, etc.)
//El número de jugadores será decidido por el usuario, pero debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
//En cada turno uno de los jugadores, dispara el revólver, si este tiene la bala  el jugador muere y el juego termina.
//Aunque no lo haya comentado, recuerda usar una clase ejecutable para probarlo.
package Practica4;

public class Juego {
  
private Jugador[] jugadores;
private Revolver revolver;

public Juego(int numJugadores){

  jugadores= new Jugador[comprobarJugadores(numJugadores)];

  crearJugadores();

    jugadores=new Jugador[numJugadores];
    revolver=new Revolver();
}
private comprobarJugadores(int numJugadores){
  if ( !(numJugadores>=1 && numJugadores<=6)) {
    numJugadores = 6;
  }
  return numJugadores;
}

private void crearJugadores(){
  for(int i=0;i<jugadores.length;i++){
    jugadores[i]= new Jugador(i+1);
  }
}
public boolean finJuego(){

  for(int i=0; i<jugadores.length;i++){
      if (jugadores[1].isVivo()) {
        return true;
      }
  }
  return false;
}

public void ronda(){
  for(int i=0; i<jugadores.length;i++){
    jugadores[i].disparar(revolver);
    System.out.println(revolver);
  }

}
}


