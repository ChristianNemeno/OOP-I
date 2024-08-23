
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
    public Money plus(Money add){
        
        int thisEuros = this.euros();
        int thisCents = this.cents();
        int addEuros = add.euros();
        int addCents = add.cents();
        
        int addedEuros = addEuros + thisEuros;
        int addedCents = thisCents + addCents;
        if(addedCents > 99){
           int bro = addedCents - 100;
           addedEuros++;
           Money temp = new Money(addedEuros,bro);
           return temp;
        }else{
           Money temp = new Money(addedEuros,addedCents); 
           return temp;
        }
        
    }
    public boolean lessThan(Money compared){
        int thisEuros = this.euros();
        int thisCents = this.cents();
        int compEuros = compared.euros();
        int compCents = compared.cents();
         
       if(thisEuros < compEuros){
           return true;
       }else if(thisEuros == compEuros && thisCents < compCents){
           return true;
       }
       
       
        return false;
    }
    
    
    public Money minus(Money diff){
       
        if(this.lessThan(diff)){
            Money temp = new Money(0,0);
            return temp;
        }
        int thisEuros = this.euros();
        int thisCents = this.cents();
        int diffEuros = diff.euros();
        int diffCents = diff.cents();
        
        int diffedEuros = thisEuros - diffEuros ;
        int diffedCents = thisCents - diffCents;
        if(diffedCents < 0){
           thisCents += 100;
           int newDiff = thisCents - diffCents;
           diffedEuros--;
           Money temp = new Money(diffedEuros,newDiff);
           return temp;
        }else{
           Money temp = new Money(diffedEuros,diffedCents); 
           return temp;
          }
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money clone(){
        Money clone = new Money(this.euros,this.cents);
        return clone;
    }

}
