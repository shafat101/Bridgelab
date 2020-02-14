package com.bridgelabz.serviceimplementation;

import java.util.Arrays;
import java.util.List;

import com.bridgelabz.model.AssignValues;
import com.bridgelabz.service.InterfaceCards;

public class InterfaceImplementation implements InterfaceCards{
   
	private List<AssignValues> list;
	
public InterfaceImplementation() {
		
	AssignValues[] deck = new AssignValues[52];
	 int count = 0;
	 
	 for (AssignValues.Rank rank : AssignValues.Rank.values()) {
		for (AssignValues.Suit suit : AssignValues.Suit.values()) {
			deck[count] = new AssignValues(rank, suit);
			count++;
		}
	}
	 
		this.list = Arrays.asList(deck);
	
	}
	
	@Override
	public void printCards() {
		// TODO Auto-generated method stub
		 for ( int i = 0; i < list.size(); i++ )
	         System.out.printf( "%-20s%s", list.get( i ),
	            ( ( i + 1 ) % 2 == 0 ) ? "\n" : "" );
	}

}
