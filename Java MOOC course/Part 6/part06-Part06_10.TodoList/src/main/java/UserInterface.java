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
    private TodoList todolist;
    private Scanner scanner;
    
    public UserInterface(TodoList todolist,Scanner scanner){
        this.todolist = todolist;
        this.scanner = scanner;
    }
    
    public void start(){
        boolean shouldRun = true;
        
        while(shouldRun){
            System.out.println("Command: ");
            String word = scanner.nextLine();
            
            switch(word){
                case "add":
                    System.out.println("To add: ");
                    String toAdd = scanner.nextLine();
                    
                    todolist.add(toAdd);
                    break;
                    
                case "list":
                    todolist.print();
                    break;
                
                case "remove":
                    System.out.println("Which one is removed? ");
                    int num =scanner.nextInt();
                    
                    todolist.remove(num);
                    break;
                    
                case "stop":
                    shouldRun=false;
                    break;
                    
                default: 
                    System.out.println("Unknown command");
            }
        }
    }
}
