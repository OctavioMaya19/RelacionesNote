package Entidad;

import java.util.Random;

public class Revolver {
    private int posicionActual;
    private int posicionAgua;

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
        return "Revolver{" + "posicion actual=" + posicionActual + ", posicion del agua=" + posicionAgua + '}';
    }
    
    public void llenarRevolver(){
        Random random = new Random();
        this.posicionActual = random.nextInt(6);
        this.posicionAgua = random.nextInt(6);
    }
    
    public boolean mojar(){
        return this.posicionActual == this.posicionAgua;
    }
    
    public void siguienteChorro(){
        if (this.posicionActual == 5) {
            this.posicionActual = 0;
        }
        this.posicionActual++;
    }
    
}
