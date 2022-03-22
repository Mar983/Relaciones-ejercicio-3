
package relaciones3;

import java.util.Scanner;
import relaciones3.Atributos.Baraja;
import relaciones3.Servicios.ServiciosBaraja;

public class Relaciones3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServiciosBaraja x = new ServiciosBaraja();
        Baraja z = new Baraja();
        x.crearBaraja(z);
        int respuesta = 0;
        do {            
            System.out.println("MENU:");
            System.out.println("1: Barajar cartas");
            System.out.println("2: Entregar carta");
            System.out.println("3: Cantidad de cartas disponibles");
            System.out.println("4: Pedir cartas");
            System.out.println("5: Mostrar cartas entregadas");
            System.out.println("6: Mostrar cartas disponibles");
            System.out.println("7: SALIR DEL MENU");
            respuesta = leer.nextInt();
            switch (respuesta){
                case 1:
                    x.barajar(z);
                    break;
                case 2:
                    x.siguienteCarta(z);
                    break;
                case 3:
                    x.cartasDisponibles(z);
                    break;
                case 4:
                    x.darCartas(z);
                    break;
                case 5:
                    x.cartasMonton(z);
                    break;
                case 6:
                    x.mostrarBaraja(z);
                    break;
                case 7:
                    System.out.println("Gracias por jugar!");
                    break;
                default:
                    System.out.println("No es una opcion");
                    break;
                }
        } while (!(respuesta == 7));
    }
}
