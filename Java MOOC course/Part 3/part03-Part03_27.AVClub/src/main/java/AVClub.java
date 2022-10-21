
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            String a =scanner.nextLine();
            if(a.equals("")){
                break;
            }
        String[] pieces=a.split(" ");

        
        for(int i=0;i<pieces.length;i++){
            if(pieces[i].contains("av")){
                System.out.println(pieces[i]);
                }
            }
        }
        

    }
}
