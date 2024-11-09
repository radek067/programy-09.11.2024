import java.util.InputMismatchException;
import java.util.Scanner;

public class Program6 {
    public static void main(String[]args){
        System.out.println("Hello from main");
        int number =  input("Podaj liczbę rat: ");
        System.out.println(number);
        int secondNumber = input("Podaj kwotę zakupu: ");
        System.out.println(secondNumber);
    }

    static int input(String message) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println(message);
            int number = input.nextInt();
//            input.close();
            return number;
        } catch (InputMismatchException e) {
            System.out.println("Podano złą wartość");
            return input("Podaj liczbę: ");
        }
    }
}
