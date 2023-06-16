package Entidades;

public class Perro {
    private String nombre;
    private int edad;
    private String raza;
    private String tamanio;

    public Perro() {
    }

    public Perro(String nombre, int edad, String raza, String tamanio) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.tamanio = tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", edad=" + edad + ", raza=" + raza + ", tamaño=" + tamanio + '}';
    }
    
}