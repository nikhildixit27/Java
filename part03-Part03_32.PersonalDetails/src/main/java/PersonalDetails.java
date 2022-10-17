
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name="";
        double sum=0;
        double count=0;
        int temp=0;
        int namelength=0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String parts[]=input.split(",");
            sum=sum+ Integer.valueOf(parts[1]);
            count=count+1;
            namelength=parts[0].length();
            
            if(temp<namelength){
                temp=namelength;
                name=parts[0];
            }
        }
        System.out.println("Longest name: "+name);
        System.out.println("Average of the birth years: "+sum/count);
        }
    }

