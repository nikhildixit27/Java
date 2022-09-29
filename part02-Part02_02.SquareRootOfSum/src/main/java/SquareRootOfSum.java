
import java.util.Scanner;
import java.lang.Math;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double a=Integer.valueOf(scanner.nextLine());
        double b=Integer.valueOf(scanner.nextLine());
        
        double result = Math.sqrt(a+b);
        
        System.out.println(result);
    }
}
