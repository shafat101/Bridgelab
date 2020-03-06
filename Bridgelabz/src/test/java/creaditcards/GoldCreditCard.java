package creaditcards;

import offers.OfferVisitor;

public class GoldCreditCard implements CreditCard{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Gold";
	}

	@Override
	public void accept(OfferVisitor v) {
		// TODO Auto-generated method stub
		v.visitGoldCreditCard(this);
	}

}
