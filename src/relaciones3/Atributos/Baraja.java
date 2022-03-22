 
package relaciones3.Atributos;

import java.util.ArrayList;

public class Baraja {
    private ArrayList <String> mazo = new ArrayList<>();
    private ArrayList <String> pozo = new ArrayList<>();
    
    public Baraja() {
    } 
    public Baraja(ArrayList<String>mazo,ArrayList<String>pozo){
        this.mazo = mazo;
        this.pozo = pozo;
    }

    public ArrayList<String> getMazo() {
        return mazo;
    }

    public void setMazo(ArrayList<String> mazo) {
        this.mazo = mazo;
    }

    public ArrayList<String> getPozo() {
        return pozo;
    }

    public void setPozo(ArrayList<String> pozo) {
        this.pozo = pozo;
    }

    @Override
    public String toString() {
        return "Baraja{" + "mazo=" + mazo + ", pozo=" + pozo + '}';
    }
}
