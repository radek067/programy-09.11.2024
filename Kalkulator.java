import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę:");
        double pierwszaLiczba = scanner.nextDouble();
        System.out.println("Podaj drugą liczbę:");
        double drugaLiczba = scanner.nextDouble();
        System.out.println("Wybierz operację: +, -, *, /, %");
        char operacja = scanner.next().charAt(0);

        double wynik;
        switch (operacja) {
            case '+':
                wynik = pierwszaLiczba + drugaLiczba;
                break;
            case '-':
                wynik = pierwszaLiczba - drugaLiczba;
                break;
            case '*':
                wynik = pierwszaLiczba * drugaLiczba;
                break;
            case '/':
                if (drugaLiczba != 0) {
                    wynik = pierwszaLiczba / drugaLiczba;
                } else {
                    System.out.println("Nie można dzielić przez zero!");
                    return;
                }
                break;
            case '%':
                if (drugaLiczba != 0) {
                    wynik = pierwszaLiczba % drugaLiczba;
                } else {
                    System.out.println("Nie można dzielić przez zero!");
                    return;
                }
                break;
            default:
                System.out.println("Nieprawidłowa operacja!");
                return;
        }
        System.out.println("Wynik: " + wynik);
    }
}

