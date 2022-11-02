
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String file=scanner.nextLine();
        findfile(file);

    }

public static void findfile(String file){
        try(Scanner scanner=new Scanner(Paths.get(file))){
            while(scanner.hasNextLine()){
                String line=scanner.nextLine();
                System.out.println(line);
            }
        }catch(Exception e){
            System.out.println("Error: "+ e.getMessage());
        }    
    }    
}


