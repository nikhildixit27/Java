
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        
        Counter counter=new Counter();
        System.out.println(counter);
        
        counter.increase();
        System.out.println(counter.value());
        counter.decrease(10);
        System.out.println(counter.value());
        counter.increase(100);
        counter.increase();
        System.out.println(counter);
    }
}
