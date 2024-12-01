package veicoli;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Veicoli[] veicoli = new Veicoli[4];
        Scanner scanner = new Scanner(System.in);

        // Inserimento dei veicoli
        for (int i = 0; i < 4; i++) {
            System.out.println("Inserisci il tipo di veicolo (1 = Auto, 2 = Moto):");
            int tipo = scanner.nextInt();
            scanner.nextLine(); // Consuma newline

            System.out.println("Inserisci la marca del veicolo:");
            String marca = scanner.nextLine();

            System.out.println("Inserisci la velocità del veicolo:");
            int velocita = scanner.nextInt();
            scanner.nextLine(); // Consuma newline

            System.out.println("Inserisci il carburante del veicolo (es. benzina, diesel, elettrico):");
            String carburante = scanner.nextLine();

            // Creazione dell'oggetto appropriato
            if (tipo == 1) {
                veicoli[i] = new Auto(marca, velocita, carburante);
            } else if (tipo == 2) {
                veicoli[i] = new Moto(marca, velocita, carburante);
            } else {
                System.out.println("Tipo non valido. Ripeti l'inserimento.");
                i--;
            }
        }

        // Uso dei metodi
        for (Veicoli veicolo : veicoli) {
            veicolo.muovi();
            if (veicolo instanceof Elettrico) {
                ((Elettrico) veicolo).elettrico();
            }
        }

        scanner.close();
    }
}