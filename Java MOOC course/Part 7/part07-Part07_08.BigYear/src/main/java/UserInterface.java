/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */

import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private BirdDatabase birdlist;

    public UserInterface(Scanner scanner, BirdDatabase birdlist) {
        this.scanner = scanner;
        this.birdlist = birdlist;
    }    
    
    public void start(){
        boolean Loop = true;
        try{
            while(Loop){
                System.out.println("?");
                String command=scanner.nextLine();
                
                switch(command.toLowerCase()){
                    case "quit":
                        Loop=false;
                        break;
                        
                    case "add":
                        System.out.println("Name ");
                            String name = scanner.nextLine();
                            
                            System.out.print("Name in Latin ");
                            String latinName = scanner.nextLine();

                            birdlist.addBird(new Bird(name, latinName));
                            break;
                            
                        case "observation":
                            name = scanner.nextLine();
                            birdlist.addObservationFromDb(name);
                            break;
                            
                        case "all":
                            birdlist.printBirdDatabase();
                            break;
                            
                        case "one":
                            name = scanner.nextLine();
                            birdlist.printBird(name);
                            break;
                            
                        default:
                            System.out.println("Unknown command");
                           
                }
            }
        } catch (Exception error) {
                System.out.println("There was an error msg is " + error.getMessage());
    }
}
}
