
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give points [0-100]:");
        int a=Integer.valueOf(scan.nextLine());
        
        if(a<0){
            System.out.println("Grade: impossible!");
        }else if(a>=0 && a<50){
            System.out.println("Grade: failed");
        }else if(a>=50&&a<60){
            System.out.println("Grade: 1");
        }else if(a>=60&&a<70){
            System.out.println("Grade: 2");
        }else if(a>=70&&a<80){
            System.out.println("Grade: 3");
        }else if(a>=80&&a<90){
            System.out.println("Grade: 4");
        }else if(a>=90&&a<=100){
            System.out.println("Grade: 5");
        }else if(a>100){
            System.out.println("Grade: incredible!");
        }  
    }
}
