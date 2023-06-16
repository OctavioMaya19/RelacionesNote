package Entidad;

import java.util.ArrayList;
import java.util.Scanner;

public class Juego {
    private ArrayList<Jugador> jugadores;
    private Revolver revolver;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void llenarJuego() {
        ArrayList<Jugador> jugadores = new ArrayList();
        
        int cantidad;
        do {
            System.out.println("cuantos jugadores desean participar? maximo 6");
            cantidad = leer.nextInt();
        } while (cantidad > 6 || cantidad < 1);
        
        for (int i = 0; i < cantidad; i++) {
            Jugador jugador = new Jugador();
            jugadores.add(jugador);
        }
        
        this.jugadores = jugadores;
        this.revolver = new Revolver();
        revolver.llenarRevolver();
    }
    
    public void ronda(){
        
        boolean juego = true;
        do {
            for (Jugador jugador : jugadores) {
                jugador.disparo(jugador, revolver);
                System.out.println("continuar");
                leer.next();
                if (jugador.isMojado()) {
                    System.out.println("el juego ha finalizado, el jugador "+ jugador.getNombre() +" se mojó");
                    juego = false;
                    break;
                }else{
                    System.out.println("te salvaste... por ahora");
                }
            }
        } while (juego);
    }
    
}