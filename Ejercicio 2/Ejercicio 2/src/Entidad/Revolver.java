package Entidad;

import java.util.Random;
import java.util.Scanner;

public class Revolver {
    private int posicionActual;
    private int posicionAgua;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Revolver() {
    }

    public Revolver(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }
    
    public void llenarRevolver() {
        Random random = new Random();
        this.posicionActual = random.nextInt(6);
        this.posicionAgua = random.nextInt(6);
    }

    public boolean mojar() {
        return this.posicionActual == this.posicionAgua;
    }

    public void siguienteChorro() {
        if (this.posicionActual == 5) {
            this.posicionActual = 0;
        }
        this.posicionActual++;
    }

    public void muestraPosicion() {
        System.out.println("posicion actual del tambor: " + this.posicionActual);
        System.out.println("posicion del agua: " + this.posicionAgua);
    }
    
}
