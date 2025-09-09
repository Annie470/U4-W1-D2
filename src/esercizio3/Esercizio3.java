package esercizio3;
import java.util.Arrays;
import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Inserisci una parola o :q per terminare: ");
            String parola = scanner.nextLine();
            if (!parola.equals(":q")) {
                System.out.println(Arrays.toString(parola.toCharArray()));
            } else {
                break;
            }
        }
    }
}
