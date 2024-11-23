import java.util.Scanner;

public class Zadanie7 {

    public static void main(String[] args) {
        // Tworzymy obiekt Scanner do pobierania danych od użytkownika
        Scanner scanner = new Scanner(System.in);

        // Pobieramy dochód od użytkownika
        System.out.print("Podaj dochód: ");
        double dochod = scanner.nextDouble();

        // Zmienna do przechowywania należnego podatku
        double podatek = 0;

        // Obliczamy podatek według podanych reguł
        if (dochod <= 85528.00) {
            // Dla dochodu do 85.528 PLN podatek wynosi 10% podstawy minus 556,02 PLN
            podatek = dochod * 0.10 - 556.02;
        } else {
            // Dla dochodu powyżej 85.528 PLN podatek wynosi 14.839,02 PLN + 32% nadwyżki ponad 85.528 PLN
            podatek = 14839.02 + (dochod - 85528.00) * 0.32;
        }

        // Wypisujemy wynik na ekranie
        System.out.printf("Należny podatek dochodowy wynosi: %.2f PLN\n", podatek);

        // Zamykamy scanner
        scanner.close();
    }
}
