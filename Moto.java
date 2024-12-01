package veicoli;

public class Moto extends Veicoli implements Elettrico{

    public Moto(String marca, int velocita, String carburante) {
        super(marca, velocita, carburante);
    }

    @Override
    public void muovi() {
        System.out.println("La moto " + marca + " si muove a " + velocita + " km/h!");
    }

    @Override
    public void elettrico() {
        if (carburante.equalsIgnoreCase("elettrico")) {
            System.out.println("La moto " + marca + " è in ricarica.");
        } else {
            System.out.println("La moto " + marca + " non è elettrica e non può essere ricaricata.");
        }
    }
}