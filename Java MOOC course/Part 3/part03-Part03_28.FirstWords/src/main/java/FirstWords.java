
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            String a =scanner.nextLine();
            if(a.equals("")){
                break;
            }
        String[] pieces=a.split(" ");
        
        System.out.println(pieces[0]);
        }
    }
}
