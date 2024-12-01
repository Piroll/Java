package veicoli;

public class Auto extends Veicoli implements Elettrico {
    public Auto(String marca,int velocita, String carburante) {
        super(marca,velocita,carburante);
        
    }
    public void muovi() {
        System.out.println("L'auto " + marca + " si muove a " + velocita + " km/h!");
    }
    public void elettrico() {
        if (carburante.equalsIgnoreCase("elettrico")) {
            System.out.println("L'auto " + marca + " è in ricarica.");
        } else {
            System.out.println("L'auto " + marca + " non è elettrica e non può essere ricaricata.");
        }
    }
}