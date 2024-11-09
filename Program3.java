import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Podaj cenę towaru: ");
        int price = input.nextInt();
        System.out.println("Podaj liczbę rat: ");
        int rate = input.nextInt();
        input.close();
        System.out.println("------------------------");

        if (price < 100 || price > 10_000 || rate < 6 || rate > 48){
            System.out.println("Podano błędne dane !!!");
            System.out.println("Cena powinna być w przedziale od 100 zł do 10 000 zł");
            System.out.println("Liczba rat powinna być w przedziale od 6 do 48");
        }
        else {
            double multiplier;
            if (rate <= 12) {
                multiplier = 0.025;
            } else if (rate <= 24) {
                multiplier = 0.05;
            } else {
                multiplier = 0.1;
            }

            double interest = price * multiplier;
            double total = price + interest;
            double rateValue = total / rate;

            System.out.println("Odsetki: " + interest + " zł ");
            System.out.println("Łączny koszt: " + total + " zł ");
            System.out.println("Wysokość raty: " + rateValue + " zł ");
        }
    }
}