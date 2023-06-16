package Entidad;

import java.util.ArrayList;

public class Baraja {
    private ArrayList<Carta> mazo;
    private ArrayList<Carta> monton;

    public Baraja() {
        this.mazo = new ArrayList();
        this.monton = new ArrayList();
    }

    public Baraja(ArrayList<Carta> Mazo) {
        this.mazo = mazo;
        this.monton = new ArrayList();
    }

    public ArrayList<Carta> getMazo() {
        return mazo;
    }

    public void setMazo(ArrayList<Carta> Mazo) {
        this.mazo = Mazo;
    }

    public ArrayList<Carta> getMonton() {
        return monton;
    }

    public void setMonton(ArrayList<Carta> monton) {
        this.monton = monton;
    }

    @Override
    public String toString() {
        return "Baraja{" + "Mazo=" + mazo + ", monton=" + monton + '}';
    }
    
}
