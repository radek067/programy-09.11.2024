import java.util.Scanner;
public class Program2 {
public static void main(String[]args)
    {
    Scanner scanner = new
            Scanner(System.in);
    System.out.print("Podaj pierwszą liczbę: ");
    int num1=scanner.nextInt();
    System.out.print("Podaj drugą liczbę: ");
    int num2=scanner.nextInt();
    System.out.print("Podaj trzecią liczbę: ");
    int num3=scanner.nextInt();

    int max = Math.max(num1,Math.max(num2,num3));

    int min = Math.min(num1,Math.min(num2,num3));

    System.out.println("Największa liczba to: "+max);
    System.out.println("Najmniejsza liczba to: "+min);
    scanner.close();
    }
}
