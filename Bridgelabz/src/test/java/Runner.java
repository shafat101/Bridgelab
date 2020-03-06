import creaditcards.BronzeCreditCard;
import creaditcards.CreditCard;
import creaditcards.GoldCreditCard;
import creaditcards.SilverCreditCard;
import offers.GasOfferVisitor;
import offers.HotelOfferVisitor;
import offers.OfferVisitor;

public class Runner {
    public static void main(String[] args) {
    	OfferVisitor visitor = new HotelOfferVisitor();
    	OfferVisitor visitor2 = new GasOfferVisitor();
    	
    	CreditCard bronze = new BronzeCreditCard();
    	CreditCard gold = new GoldCreditCard();
    	CreditCard silver = new SilverCreditCard();
    	
    	 bronze.accept(visitor);
    	 gold.accept(visitor);
    	 silver.accept(visitor);
    	 
    	 bronze.accept(visitor2);
    	 gold.accept(visitor2);
    	 silver.accept(visitor2);
    }
}
