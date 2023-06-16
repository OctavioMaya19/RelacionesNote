package Mian;

import Entidades.Perro;
import Entidades.Persona;

public class Main {
    public static void main(String[] args) {
        Persona[] personas = new Persona[2];
        personas[0] = new Persona("Octavio", "Maya", 19, 44986150, null);
        personas[1] = new Persona("Manuel", "Maya", 58, 17180000, null);
        
        Perro[] perros = new Perro[2];
        perros[0] = new Perro("Peque", 3, "Dogo", "Grande");
        perros[1] = new Perro("Frida", 6, "Mestiza", "Mediano");
        
        for (int i = 0; i < personas.length; i++) {
            personas[i].setPerro(perros[i]);
        }
        for (Persona persona : personas) {
            System.out.println(persona);
        }
            
        
    }
}

