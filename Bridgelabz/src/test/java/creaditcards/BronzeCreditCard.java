package creaditcards;

import offers.OfferVisitor;

public class BronzeCreditCard implements CreditCard{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Bronze";
	}

	@Override
	public void accept(OfferVisitor v) {
		// TODO Auto-generated method stub
		v.vistBronzeCreditCard(this);
	}

}
