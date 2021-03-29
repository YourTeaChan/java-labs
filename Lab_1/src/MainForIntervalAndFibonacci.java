import java.util.Scanner;

public class MainForIntervalAndFibonacci {

    public static void main(String[] args) {
        System.out.print("Enter interval (e.g. [1;12]): ");
        Scanner in = new Scanner(System.in).useDelimiter("\\D");
        Interval intervalObject = new Interval();
        intervalObject.setLeftNumber(in.nextInt());
        intervalObject.setRightNumber(in.nextInt());

        intervalObject.oddNumbers();
        intervalObject.evenNumbers();

        System.out.println("\nSum of odd numbers = " + intervalObject.getSumOfOddNumbers());
        System.out.println("Sum of even numbers = " + intervalObject.getSumOfEvenNumbers());

        System.out.println("--------------------------------------------------");

        Fibonacci fibonacciObject = new Fibonacci();
        System.out.print("Enter the length to create a Fibonacci sequence: ");
        Scanner len = new Scanner(System.in);
        int theBiggestNumber = intervalObject.getRightNumber();
        fibonacciObject.setLength(len.nextInt());
        fibonacciObject.fibonacciSequence(theBiggestNumber);

        in.close();
        len.close();
    }
}
