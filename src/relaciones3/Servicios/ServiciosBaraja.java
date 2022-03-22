
package relaciones3.Servicios;

import java.util.Collections;
import java.util.Scanner;
import relaciones3.Atributos.Baraja;
import relaciones3.Enum.Palo;

public class ServiciosBaraja {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void crearBaraja(Baraja x){
        String carta;
        System.out.println("Creando Baraja...");
        for (Palo aux : Palo.values()) {
            for (int j = 1; j <= 12; j++) {
                if ((j != 8) & (j != 9)) {
                    carta = j+" "+aux.getNombrePalo();
                    x.getMazo().add(carta);
                }
            }
        }
    }
    
    public void barajar(Baraja x){
        Collections.shuffle(x.getMazo());
        System.out.println("Barajando...");
    }
    
    public String siguienteCarta(Baraja x){
        String carta = "No hay";
        if (!(x.getMazo().isEmpty())) {
            carta = "Carta: " +x.getMazo().get(0);
            x.getPozo().add(x.getMazo().get(0));
            x.getMazo().remove(0);
        }
        return carta;
    }
    
    public void cartasDisponibles(Baraja x){
        System.out.println("Quedan: "+x.getMazo().size()+" cartas");
    }
    
    public void darCartas(Baraja x){
        System.out.println("Ingrese la cantidad de cartas que quiere recibir: ");
        int cantidad = leer.nextInt();
        if (cantidad <= x.getMazo().size()) {
            System.out.println("Sus cartas son: ");
            for (int i = 0; i < cantidad; i++) {
                System.out.println(x.getMazo().get(0));
                x.getPozo().add(x.getMazo().get(0));
                x.getMazo().remove(0);
            }
        } else {
            System.out.println("No hay esa cantidad de cartas");
            System.out.println("Cartas disponibles: "+x.getMazo().size());
        }
    }
    
    public void cartasMonton(Baraja x){
        System.out.println("Cartas dadas: "+x.getPozo().size());
        for (String aux : x.getPozo()) {
            System.out.println(aux);
        }
    }
    
    public void mostrarBaraja(Baraja x){
        System.out.println("Cartas en el mazo: "+x.getMazo().size());
        for (String aux : x.getMazo()) {
            System.out.println(aux);
        }
    }
}
