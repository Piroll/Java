package veicoli;

public abstract class Veicoli {
String marca;
int velocita;
String carburante;
    public Veicoli(String marca, int velocita, String carburante) {
        this.marca = marca;
        this.velocita = velocita;
    }
public void muovi() {
    System.out.println("Il veicolo"+ marca + "si sta muovendo a "+ velocita + "km/h!");
}
}
