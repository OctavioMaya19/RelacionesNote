package Entidad;

import java.util.ArrayList;
import java.util.Scanner;

public class Juego {

    private ArrayList<Jugador> jugadores;
    private Revolver r;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");


    public void llenarJuego() {
        ArrayList<Jugador> jugadores = new ArrayList();
        
        int cantidad;
        do {
            System.out.println("ingrese la cantidad de jugadores");
            cantidad = leer.nextInt();
        } while (cantidad > 6 || cantidad < 1);

        
        for (int i = 0; i < cantidad; i++) {
            Jugador jugador = new Jugador();
            jugadores.add(jugador);
        }
        this.jugadores = jugadores;
        this.r = new Revolver();
        r.llenarRevolver();

    }

    public void ronda() {
        boolean juego = true;

        do {
            for (Jugador jugadore : jugadores) {
                jugadore.disparo(r, jugadore);
                System.out.println("enter para continuar");
                leer.next();
                if (jugadore.isMojado()) {
                    System.out.println("has perdido, el jugador " + jugadore.getNombre() + " fue mojado");
                    juego = false;
                    break;
                }else{
                    System.out.println(jugadore.getNombre() + " se ha salvado... por ahora");
                }
            }
        } while (juego);
    }

}