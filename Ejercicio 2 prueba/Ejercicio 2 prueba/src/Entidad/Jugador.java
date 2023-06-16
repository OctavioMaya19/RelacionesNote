package Entidad;

import java.util.Scanner;

public class Jugador {
    private String nombre;
    private int id = 1;
    private boolean mojado;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Jugador() {
        System.out.println("ingrese el nombre del jugador");
        String nombre2 = leer.next();
        this.id = id++;
        this.nombre = nombre2+" "+id;
        this.mojado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public void disparo(Revolver revolver, Jugador jugador){
        jugador.setMojado(revolver.mojar());
        revolver.siguienteChorro();
    }
    
}
