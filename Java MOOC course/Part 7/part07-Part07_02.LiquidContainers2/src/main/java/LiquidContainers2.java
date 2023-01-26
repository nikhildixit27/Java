
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container Fcontainer = new Container();
        Container Scontainer = new Container();
        
        while (true) {
            System.out.print("First :"+ Fcontainer + "\n");
            System.out.print("Second :"+ Scontainer + "\n");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts= input.split(" ");
            
            String command  = parts[0];
            int amount  = Integer.valueOf(parts[1]);
            
            switch(command){
                case "add" : 
                    Fcontainer.add(amount);
                    break;
                    
                case "move":
                    if (amount <= 0 || Fcontainer.contains() == 0) {
                        return;
                    }
                    if (Fcontainer.contains() - amount < 0) {
                        amount = Fcontainer.contains();
                    }
                    
                    Fcontainer.remove(amount);
                    Scontainer.add(amount);
                    break;
                    
                case "remove":
                    Scontainer.remove(amount);
                    break;
                    
                default:
                    System.out.println("Command not found");
            }
        }
    }

}
