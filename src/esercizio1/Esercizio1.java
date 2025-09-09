package esercizio1;
import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {
        System.out.print("Esercizio 1 - 1/2");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci una parola: ");
        String parola = scanner.nextLine();
        System.out.println("Il numero di caratteri è pari? "+calcolarePariDispari(parola));

        System.out.print("Esercizio 1 - 2/2");
        System.out.print("Inserisci un anno: ");
        int anno = Integer.parseInt(scanner.nextLine());
        System.out.print("L'anno è bisestile: " + calcolareAnnoBisestile(anno));
    }
    //METODI
    public static boolean calcolarePariDispari(String parola) {
        //return parola.length() % 2 == 0;
        if (  parola.length() % 2 != 0) {
            return false;
        }
        return true;
    }

    public static boolean calcolareAnnoBisestile(int anno) {
        //return  (anno % 4 == 0 && anno % 100 != 0) || (anno % 400 == 0);
if (anno % 4 == 0 && anno % 100 !=0) {
    return true;
}  else if (anno % 400 == 0) {
    return true;
}
return false;
    };
}
