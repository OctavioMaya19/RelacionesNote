package Entidad;

import java.util.Scanner;

public class Jugador {
    private int id = 1;
    private String nombre;
    private boolean mojado;

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }
    
    public Jugador() {
        this.id = id++;
        System.out.println("ingrese el nombre");
        String nombre2 = leer.next();
        this.nombre = id+" "+nombre2;
        this.mojado = false;
    }

    public void disparo(Jugador jugador, Revolver revolver){
        jugador.setMojado(revolver.mojar());
        revolver.siguienteChorro();
    }
    
}
