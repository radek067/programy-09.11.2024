import java.util.Scanner;

public class RatySprzetAGD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double cena = 0;
        int liczbaRat = 0;

        // Pobieranie poprawnej ceny
        while (true) {
            System.out.print("Podaj cenę towaru (100 zł - 10 000 zł): ");
            cena = scanner.nextDouble();

            if (cena >= 100 && cena <= 10000) {
                break;
            } else {
                System.out.println("Błąd! Cena musi mieścić się w przedziale od 100 zł do 10 000 zł.");
            }
        }

        // Pobieranie poprawnej liczby rat
        while (true) {
            System.out.print("Podaj liczbę rat (6 - 48): ");
            liczbaRat = scanner.nextInt();

            if (liczbaRat >= 6 && liczbaRat <= 48) {
                break;
            } else {
                System.out.println("Błąd! Liczba rat musi mieścić się w przedziale od 6 do 48.");
            }
        }

        // Określenie oprocentowania na podstawie liczby rat
        double oprocentowanie = 0;

        if (liczbaRat >= 6 && liczbaRat <= 12) {
            oprocentowanie = 0.025; // 2.5%
        } else if (liczbaRat >= 13 && liczbaRat <= 24) {
            oprocentowanie = 0.05;  // 5%
        } else if (liczbaRat >= 25 && liczbaRat <= 48) {
            oprocentowanie = 0.10;  // 10%
        }

        // Obliczenie całkowitej kwoty do spłaty
        double kwotaDoSplaty = cena * (1 + oprocentowanie);

        // Obliczenie miesięcznej raty
        double miesiecznaRata = kwotaDoSplaty / liczbaRat;

        // Wyświetlenie wyników
        System.out.printf("\nCena towaru: %.2f zł\n", cena);
        System.out.printf("Liczba rat: %d\n", liczbaRat);
        System.out.printf("Oprocentowanie: %.2f%%\n", oprocentowanie * 100);
        System.out.printf("Całkowita kwota do spłaty: %.2f zł\n", kwotaDoSplaty);
        System.out.printf("Miesięczna rata: %.2f zł\n", miesiecznaRata);

        scanner.close();
    }
}

