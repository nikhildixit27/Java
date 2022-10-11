
import java.util.ArrayList;
import java.util.Scanner;

public class PrintInRange {

    public static void main(String[] args) {
        
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        numbers.add(5);
        numbers.add(1);
        
        int lowerLimit=0;
        int upperLimit=5;
        
        System.out.println("The numbers in the range [0, 5]");
        printNumbersInRange(numbers,lowerLimit,upperLimit);
        
        lowerLimit=3;
        upperLimit=10;
        
        System.out.println("\nThe numbers in the range [0, 5] ");
        printNumbersInRange(numbers,lowerLimit,upperLimit);
        
        // Try your method here
    }
    
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit){
        for(int num : numbers){
            if(num>=lowerLimit && num<=upperLimit){
                System.out.println(num);
            }
        }
    }
    
}
