public class Main {

    public static void main(String[] args) {
        double a = 100;
        double b  = 100;
        double sum = a + b;
        double difference = a - b;
        double product = a * b;
        double quotient = a / b;
        double average = (sum)/2;
        String larger = (a > b) ? "a" : "b";

        System.out.println("The value of a is " + a + ".");
        System.out.println("The value of b is " + b + ".");
        System.out.println("a + b equals " + sum + ".");
        System.out.println("a - b equals " + difference + ".");
        System.out.println("a * b equals " + product + ".");
        System.out.println("a / b equals " + quotient + ".");
        System.out.println("The average of a & b is " + average + ".");
        System.out.println(larger + " is larger!");
    }
}
