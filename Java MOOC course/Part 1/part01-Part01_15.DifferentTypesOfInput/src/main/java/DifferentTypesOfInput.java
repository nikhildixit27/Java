
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a string:");
        String text= scanner.nextLine();
        System.out.println("Give an integer:");
        int number= Integer.valueOf(scanner.nextLine());
        System.out.println("Give a double:");
        double num = Double.valueOf(scanner.nextLine());
        System.out.println("Give a boolean:");
        boolean tandf = Boolean.valueOf(scanner.nextLine());
        
        System.out.println("You gave the string "+text);
        System.out.println("You gave the integer "+number);
        System.out.println("You gave the double "+num);
        System.out.println("You gave the boolean "+tandf);

        // Write your program here

    }
}
