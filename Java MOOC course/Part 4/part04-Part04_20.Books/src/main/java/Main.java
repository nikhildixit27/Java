import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        
        ArrayList<Book> details=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        
        while(true){
            System.out.println("Title: ");
            String title=sc.nextLine();
            if(title.equals("")){
                break;
            }
            System.out.println("Pages: ");
            int pg=Integer.valueOf(sc.nextLine());
            System.out.println("Publication year: ");
            int py=Integer.valueOf(sc.nextLine());
            
            details.add(new Book(title,pg,py));       
        }
        System.out.println("What information will be printed? ");
        String option=sc.nextLine();
        
        for(Book all:details){
            if(option.equals("everything")||option.equals("Everything")){
                System.out.println(all.getTitle()+", "+all.getPg()+" pages"+", "+all.getPy());
            }else if(option.equals("name")||option.equals("Name")){
                System.out.println(all.getTitle());    
            }   
        }
    }
}
