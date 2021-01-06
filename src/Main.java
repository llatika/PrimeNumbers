import java.util.Scanner;

public class Main {

    private static int inputNumber;
    public static void main(String[] args) {
        while (true) {
            System.out.print("Enter a number: ");
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            inputNumber = myObj.nextInt();
            result();
        }
    }

    public static boolean isPrime(int number) {
        if (number < 1) {
            return false;
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }


    public static void result() {
        if (Main.isPrime(inputNumber) == false) {
            System.out.println("Number " + inputNumber + " is not prime number");
        } else
            System.out.println("Number " + inputNumber + " is prime number");
    }
}

