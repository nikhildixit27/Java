
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        System.out.println("First number?");
        int a=scanner.nextInt();
        System.out.println("Last number");
        int b=scanner.nextInt();
        
        if(a<=b){
            for(int i=a;i<=b;i++){
                sum+=i;
            }
        }else{
            System.out.println("");
        }
        System.out.println("The sum is "+sum);

    }
}
