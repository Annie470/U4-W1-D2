package esercizio2;
import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero da 1 a 3: ");
        int numero = Integer.parseInt(scanner.nextLine());
        System.out.println(stampareNumero(numero));
    }
    public static String stampareNumero(int n) {
         return switch (n) {
            case 1 -> "Il valore è uno, compreso tra 1 e 3";
            case 2 -> "Il valore è due, compreso tra 1 e 3";
            case 3 -> "Il valore è tre, compreso tra 1 e 3";
             default -> "Il valore non è compreso tra 1 e 3!";
        };
    }
}
