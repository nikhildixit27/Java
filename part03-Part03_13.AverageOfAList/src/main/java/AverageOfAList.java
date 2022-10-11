
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        
        while(true){
            int input=scanner.nextInt();
            if(input==-1){
                break;
            }
            list.add(input);
        }
        double sum=0;
        for(int i : list ){
            sum=sum+i;
        }
        int size=(list.size());
        double res=(sum/size);
        System.out.println("Average: " + res);
        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        
    }
}
