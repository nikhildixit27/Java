
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }
    
    public Money plus(Money addition){
        Money newMoney = new Money(this.euros + addition.euros,this.cents + addition.cents);
           
        return newMoney;
    }
    
    public boolean lessThan(Money compared){
        if(this.euros() < compared.euros()){
            return true;
        }
        
        if(this.euros() == compared.euros()){
            if(this.cents() < compared.cents()){
                return true;
            }
        }
        return false;
    }
    
    public Money minus(Money decreaser){
        int subEuros=this.euros - decreaser.euros;
        int subCents=this.cents - decreaser.cents;
        
        if (subEuros >= 0){
            if (subCents < 0){
                subEuros = subEuros - 1;
                subCents = subCents + 100;
            }
        }else{
            subEuros = 0;
            subCents = 0;
        }
        Money newMoney = new Money(subEuros, subCents);
        return newMoney;
    }
    
    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }
        return this.euros + "." + zero + this.cents + "e";
    }
}
