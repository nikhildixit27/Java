
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> num=new ArrayList<>();
        
        while(true){
            int input=scanner.nextInt();
            if(input == 9999){
                break;
            }
            num.add(input);
        }

        System.out.print("Smallest number: ");
        int smallest=num.get(0);
        for(int i=0;i<num.size();i++){
        int x=num.get(i);            
            if(smallest>x)
                smallest=x;
        }
        System.out.println(smallest);
        
        for(int i=0;i<num.size();i++){
        int x=num.get(i);
            if(x==smallest){
                System.out.println("Found at index: :"+i);                
            }
        }

       

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        
    }
}
