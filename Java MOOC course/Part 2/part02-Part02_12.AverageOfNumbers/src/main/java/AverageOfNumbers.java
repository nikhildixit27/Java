
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double sum=0;
        int count=0;
        while(true){
            System.out.println("Give a number: ");
            int a=scanner.nextInt();
            
            if(a==0){
                break;
            }
            if(a!=0){
                count=count+1;
                sum=sum+a;
            }
        }
        System.out.println("Average of the numbers: "+(sum/count));
    }
}