package Service;

import Entidad.Baraja;
import Entidad.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BarajaService {
    
    public Baraja crearBaraja(){
        Baraja baraja = new Baraja();
        String[] palos = {"espada", "basto", "oro", "copa"};
        ArrayList<Carta> mazo = new ArrayList();
        
        for (int i = 0; i < palos.length; i++) {
            for (int j = 1; j < 13; j++) {
                if (j == 8 || j == 9) {
                    continue;
                }else{
                    mazo.add(new Carta (j, palos[i]));
                }
            }
        }
        baraja.setMazo(mazo);
        
        return baraja;
    }
    
    //barajar(): cambia de posición todas las cartas aleatoriamente.
    public void barajar(Baraja baraja){
        Collections.shuffle(baraja.getMazo());
    }
    
    //siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
    //se haya llegado al final, se indica al usuario que no hay más cartas.
    public void siguienteCarta(Baraja baraja){
        if (baraja.getMazo().size() > 1) {
            System.out.println("siguiente carta de la baraja: " + baraja.getMazo().get(0));
            baraja.getMonton().add(baraja.getMazo().remove(0));
        }else if (baraja.getMazo().size() == 1){
            System.out.println("¡ultima carta!");
            baraja.getMonton().add(baraja.getMazo().remove(0));
        }else if (baraja.getMazo().isEmpty()){
            System.out.println("no quedan cartas");
        }
    }
    
    //cartasDisponibles(): indica el número de cartas que aún se puede repartir.
    public void cartasDisponibles(Baraja baraja){
        System.out.println("quedan " + baraja.getMazo().size() + " cartas para repartir");
    }
    
    //darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
    //cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
    //debemos indicárselo al usuario.
    public void darCartas(Baraja baraja){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese la cantidad de cartas que desea retirar");
        int retiraCartas = leer.nextInt();
        if (retiraCartas > baraja.getMazo().size()) {
            System.out.println("superaste el limite de cartas");
            System.out.println("cantidad de cartas en la baraja: " + baraja.getMazo().size());
        }else{
            for (int i = 0; i < retiraCartas; i++) {
                siguienteCarta(baraja);
            }
        }
        
    }
    
    //cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
    //indicárselo al usuario
    public void cartasMonton(Baraja baraja){
        if (baraja.getMonton().isEmpty()) {
            System.out.println("no se encuentran cartas en el monton (cartas descartadas)");
        }else{
            System.out.println("se encuentran " + baraja.getMonton().size() + " en el montón");
        }
    }
    
    //mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
    //luego se llama al método, este no mostrara esa primera carta.
    public void mostrarBaraja(Baraja baraja){
        System.out.println("cartas del mazo:\n"
                + " ");
        for (Carta mazoDeCartas : baraja.getMazo()) {
            System.out.println(mazoDeCartas);
        }
    }
}
