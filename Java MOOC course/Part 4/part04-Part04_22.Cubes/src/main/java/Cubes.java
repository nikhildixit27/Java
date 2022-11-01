
import java.util.Scanner;
import java.lang.Math;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            String a=scanner.nextLine();
            if(a.equalsIgnoreCase("end")){
                break;
            }
            int n=Integer.valueOf(a);
            int cube=(int)(Math.pow(n, 3));
            System.out.println(cube);
        }

    }
}
