package offers;

import creaditcards.BronzeCreditCard;
import creaditcards.GoldCreditCard;
import creaditcards.SilverCreditCard;

public interface OfferVisitor {
   void vistBronzeCreditCard(BronzeCreditCard bronze);
   void visitGoldCreditCard(GoldCreditCard gold);
   void visitSilverCreditCard(SilverCreditCard silver);
   
}
