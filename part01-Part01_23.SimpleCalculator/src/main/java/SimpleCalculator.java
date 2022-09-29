
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int a=Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int b=Integer.valueOf(scanner.nextLine());
        
        int sum=a+b;
        int diff=a-b;
        int mult=a*b;
        double div=(double)a/b;
        
        System.out.println(a + " + "+ b+" = "+ sum);
        System.out.println(a + " - "+ b+" = "+ diff);
        System.out.println(a + " * "+ b+" = "+ mult);
        System.out.println(a + " / "+ b+" = "+ div);        

    }
}
