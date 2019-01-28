import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double a = 0;
        double b  = 0;
        double sum = 0;
        double difference = 0;
        double product = 0;
        double quotient = 0;
        double average = 0;
        String larger = "";

        Scanner myScanner = new Scanner(System.in);

        System.out.println("What is the value of variable a?");
        a = myScanner.nextDouble();

        System.out.println("What is the value of variable b?");
        b = myScanner.nextDouble();

        sum = a + b;
        difference = a - b;
        product = a * b;
        quotient = a / b;
        average = (sum)/2;
        larger = (a > b) ? "a" : "b";

        System.out.println("\nThe value you entered for a is " + a + ".");
        System.out.println("The value you entered for b is " + b + ".");
        System.out.println("a + b equals " + sum + ".");
        System.out.println("a - b equals " + difference + ".");
        System.out.println("a * b equals " + product + ".");
        System.out.println("a / b equals " + quotient + ".");
        System.out.println("The average of a & b is " + average + ".");
        System.out.println(larger + " is larger!");
    }
}
