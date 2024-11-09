import java.util.InputMismatchException;
import java.util.Scanner;
public class App {
    // public static void main(String[] args) {
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new
                Scanner(System.in);
        System.out.println("Podaj temperaturę w stopniach Celsjusza ");
        double celsius = scanner.nextDouble();
        double fahrenheit = celsiusToFahrenheit(celsius);
        System.out.printf("%.2f stopni Celsjusza to %.2f stopni Fahrenheita.%n", celsius, fahrenheit);
        scanner.close();
    }
}

//        boolean done = false;
//        while (!done) {
//            try {
//                Scanner input = new Scanner(System.in);
//                System.out.println("Podaj liczbę: ");
//                int number = input.nextInt();
//                input.close();
//
//                for (int i = 0; i < number; i++) {
//                    for (int j = 1; j <= number; j++) {
//                        if (j < number) {
//                            System.out.print(j + " , ");
//                        } else {
//                            System.out.print(j);
//                        }
//                    }
//                    System.out.println();
//                } done = true;
//            } catch (InputMismatchException exception) {
//                System.out.println("Proszę podać liczbę całkowitą ");
//            }
//        }

