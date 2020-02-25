package com.bridgelabz.behavioraldesignpatterns.visitorpattern;

public interface ShoppingCartVisitor {
	 int visit(Book book); 
	    int visit(Fruit fruit); 
}
