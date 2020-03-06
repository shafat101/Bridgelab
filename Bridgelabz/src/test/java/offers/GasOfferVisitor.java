package offers;

import creaditcards.BronzeCreditCard;
import creaditcards.GoldCreditCard;
import creaditcards.SilverCreditCard;

public class GasOfferVisitor implements OfferVisitor{

	@Override
	public void vistBronzeCreditCard(BronzeCreditCard bronze) {
		// TODO Auto-generated method stub
		System.out.println("we are computing the cashback for a bronze card buying gas");
	}

	@Override
	public void visitGoldCreditCard(GoldCreditCard gold) {
		// TODO Auto-generated method stub
		System.out.println("we are computing the cashback for a Gold card buying gas");
	}

	@Override
	public void visitSilverCreditCard(SilverCreditCard silver) {
		// TODO Auto-generated method stub
		System.out.println("we are computing the cashback for a silver card buying gas");
	}

}
