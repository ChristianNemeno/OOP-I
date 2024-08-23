
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public int getPrincePerSquare() {
        return princePerSquare;
    }

    public int getSquares() {
        return squares;
    }

    public int getRooms() {
        return rooms;
    }

    
    
    public boolean largerThan(Apartment comp){
        if(this.squares > comp.squares){
            return true;
        }
        return false;
    }
    
    public boolean moreExpensiveThan(Apartment comp){
        if(this.princePerSquare * this.squares > comp.princePerSquare * comp.squares){
            return true;
        }
        return false;
    }
    
    public int priceDifference(Apartment compared){
        if(this.moreExpensiveThan(compared)){
            return this.princePerSquare *this.squares - compared.princePerSquare * compared.squares;
            
        }
        return compared.squares * compared.princePerSquare- this.squares* this.princePerSquare;
    }
    

}
