
package relaciones3.Enum;

public enum Palo {
    ESPADA("Espada"), BASTO("Basto"), ORO("Oro"), COPA("Copa");
    private String nombrePalo;
    
    private Palo(){
    }
    private Palo(String nombrePalo){
        this.nombrePalo = nombrePalo;
    }

    public String getNombrePalo() {
        return nombrePalo;
    }
    public void setNombrePalo(String nombrePalo) {
        this.nombrePalo = nombrePalo;
    }

    @Override
    public String toString() {
        return "Palo {" +nombrePalo+ '}';
    } 
}
