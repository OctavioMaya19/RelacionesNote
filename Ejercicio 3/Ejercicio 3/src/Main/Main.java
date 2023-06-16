package Main;

import Entidad.Baraja;
import Service.BarajaService;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        BarajaService baraja = new BarajaService();
        Baraja bj = baraja.crearBaraja();
        
        boolean salir = true;
        
        do {
            System.out.println("1_ Barajar las cartas");
            System.out.println("2_ cantidad de cartas disponibles para retirar");
            System.out.println("3_ retira la cantidad de cartas que desea");
            System.out.println("4_ mostrar las cartas que se han descartado");
            System.out.println("5_ mostrar baraja de cartas");
            System.out.println("6_ salir");
            
            int opcion = leer.nextInt();
            switch(opcion){
                case 1:
                    baraja.barajar(bj);
                    break;
                case 2:
                    baraja.cartasDisponibles(bj);
                    break;
                case 3:
                    baraja.darCartas(bj);
                    break;
                case 4:
                    baraja.cartasMonton(bj);
                    break;
                case 5:
                    baraja.mostrarBaraja(bj);
                    break;
                case 6:
                    System.out.println("seguro desea salir? (si/no)");
                    if (leer.next().equalsIgnoreCase("si")) {
                        salir = false;
                    }
                default:
                    System.out.println("ingrese una opcion valida");
            }
        } while (salir);
        
    }
    
}
