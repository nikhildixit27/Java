
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int famount = 0;
        int samount = 0;
        while (true) {
            System.out.print("First: "+famount+"/100\n");
            System.out.print("Second: "+samount+"/100\n");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
             switch (command) {
                case "add":
                    if (amount <= 0) {
                        continue;
                    }

                    if (famount + amount <= 100) {

                        famount += amount;
                    } else if (famount + amount > 100) {
                        famount = 100;
                    }
                    break;
                
                case "move" :
                    if(amount <= 0 || famount==0){
                        continue;
                    }
                    
                    if(famount-amount <0){
                        amount = famount;
                    }
                    
                    if(amount >= 100){
                        famount=0;
                        samount=100;
                    }else if(samount + amount <= 100){
                        samount += amount;
                        famount -=amount;
                    }else if(amount + samount>100 && amount +famount>100){
                        samount = 100;
                        famount=0;
                    }
                    break;
                    
                case "remove" :
                    if(samount <= 0){
                        continue;
                    }else if(samount - amount <0){
                        samount=0;
                    }else{
                        samount=samount-amount;
                    }
                    
                    break;
                
                default:
                    System.out.println("Command not found");
        }
    }
}
}