
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count=0;
        while(true){
            System.out.println("Give a number:");
            int a=scanner.nextInt();
            
            if(a==0){
                break;
            }
            if(a<0){
                count++;
                continue;
            }else{
                continue;
            }
        }
        System.out.println("Number of negative numbers: "+count);

    }
}
