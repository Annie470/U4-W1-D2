package esercizio4;

import java.util.Scanner;

public class Esercizio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero: ");
        int numero = Integer.parseInt(scanner.nextLine());
        System.out.println("Inizio del conto alla rovescia");
        for(int i = numero; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
