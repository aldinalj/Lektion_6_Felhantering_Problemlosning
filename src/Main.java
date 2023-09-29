import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

       /* int number = 5;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type something to crash the program");
        scanner.nextLine();
        System.out.println(number/0); */

        int[] numbers = {0, 100, 1000, 2000};
        System.out.println("Before crash");

        try {
            // Try to execute code
            System.out.println("Inside - TRY");
            System.out.println(2/0);
        } catch (Exception error) {
            // Catch error if it FAILS
            System.out.println("Inside - CATCH");
            /* Fångar upp problemet och loggar ut hela error problemet men inte slay för att publicera pga tex hacking
            error.printStackTrace(); */
        }

        System.out.println("After crash");

        }
    }
