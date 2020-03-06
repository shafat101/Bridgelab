package creaditcards;

import offers.OfferVisitor;

public class SilverCreditCard implements CreditCard{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Silver";
	}

	@Override
	public void accept(OfferVisitor v) {
		// TODO Auto-generated method stub
		v.visitSilverCreditCard(this);
	}

}
