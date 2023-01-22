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
    private JokeManager jokeManage;
    private Scanner scanner;
    
    public UserInterface(JokeManager jokeManage, Scanner scanner){
        this.jokeManage = jokeManage;
        this.scanner=scanner;
    }
    
    public void start(){
        boolean shouldLoop = true;
        while (shouldLoop) {
            System.out.print("Commands:" + "\n"
                    + "1 - add a joke\n"
                    + "2 - draw a joke\n"
                    + "3 - list jokes\n"
                    + "X - stop\n");

            String input = scanner.nextLine();
            
            switch (input) {
                case "X":
                    shouldLoop = false;
                    break;
                case "1":

                    System.out.print("Write the joke to be added:");
                    String jokeToAdd = scanner.nextLine();
                    jokeManage.addJoke(jokeToAdd);

                    break;
                case "2":
                    System.out.println(jokeManage.drawJoke());

                    break;
                case "3":
                    jokeManage.printJokes();

                    break;
                default:
                    System.out.println("Unknown command");
            }
        }
    }
}
