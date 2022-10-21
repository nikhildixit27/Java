
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        
        Account transfer1=new Account("Matthews account",1000);
        Account transfer2=new Account("My account", 0.0);
        
        transfer1.withdrawal(100.0);
        transfer2.deposit(100.0);
        
        System.out.println(transfer1);
        System.out.println(transfer2);
    }
}
