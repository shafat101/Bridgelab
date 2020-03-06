package creaditcards;

import offers.OfferVisitor;

public interface CreditCard {
  String getName();
  void accept(OfferVisitor v);
}
