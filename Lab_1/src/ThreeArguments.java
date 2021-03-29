import java.util.Scanner;

public class ThreeArguments {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.print(args[i] + " ");
        }
        System.out.println("\n------------------------------------");

        Scanner arg = new Scanner(System.in);
        System.out.print("Enter: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(arg.nextInt() + " ");
        }
        arg.close();
    }
}