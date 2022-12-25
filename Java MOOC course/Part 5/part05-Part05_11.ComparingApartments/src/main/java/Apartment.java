
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared){
        int appartment1=this.squares;
        int appartment2=compared.squares;
        if(appartment1>appartment2){
            return true;
        }else{
            return false;
        }
    }
    
    public int priceDifference(Apartment compared){
        int appartment1=this.princePerSquare * this.squares;
        int appartment2=compared.princePerSquare * compared.squares;
        
        int priceDifference=appartment2-appartment1;
        if(priceDifference<0){
            return -(priceDifference);
        }else{
            return priceDifference;
        }
    }
    
    public boolean moreExpensiveThan(Apartment compared){
        int appartment1=this.princePerSquare *this.rooms *this.squares;
        int appartment2=compared.princePerSquare *compared.rooms *compared.squares;
        if(appartment1>appartment2){
            return true;
        }else{
            return false;
        }

    }

}
