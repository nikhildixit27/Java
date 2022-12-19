
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Cube a = new Cube(4);
        System.out.println(a.volume());
        System.out.println(a);
        
        System.out.println();
        
        Cube b =new Cube(2);
        System.out.println(b.volume());
        System.out.println(b);
        // Experiment with your program here
    }
}
