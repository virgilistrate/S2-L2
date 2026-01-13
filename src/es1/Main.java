package es1;



import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Inserisci il numero di parole:");
        int n = scanner.nextInt();
        scanner.nextLine();

        // funzione che conterrà solo le parole diverse
        Set<String> paroleDistinte = new HashSet<>();

        // funzione che conterrà le parole duplicate
        Set<String> paroleDuplicate = new HashSet<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Inserisci una parola:");
            String parola = scanner.nextLine();


            if (!paroleDistinte.add(parola)) {
                paroleDuplicate.add(parola);
            }
        }

        System.out.println("------------------------------------------------");

        // dunzione di stampa delle parole duplicate
        System.out.println("Parole duplicate:");
        if (paroleDuplicate.isEmpty()) {
            System.out.println("Nessuna parola duplicata");
        } else {
            for (String parola : paroleDuplicate) {
                System.out.println(parola);
            }
        }

        System.out.println("------------------------------------------------");

        // Numero di parole diverse
        System.out.println("Numero di parole distinte: " + paroleDistinte.size());

        System.out.println("------------------------------------------------");

        // Elenco delle parole diverse
        System.out.println("Elenco delle parole distinte:");
        for (String parola : paroleDistinte) {
            System.out.println(parola);
        }

        scanner.close();
    }
}
