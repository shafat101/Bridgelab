package com.bridgelabz.serviceimplementation;

import java.util.Arrays;
import java.util.List;

import com.bridgelabz.model.AssignValuescards;
import com.bridgelabz.service.InterfaceCards;

public class InterfaceImplementationCards implements InterfaceCards{
   
private List<AssignValuescards> list;
	
public InterfaceImplementationCards() {
		
	AssignValuescards[] deck = new AssignValuescards[52];
	 int count = 0;
	 
	 for (AssignValuescards.Rank rank : AssignValuescards.Rank.values()) {
		for (AssignValuescards.Suit suit : AssignValuescards.Suit.values()) {
			deck[count] = new AssignValuescards(rank, suit);
			count++;
		}
	}
	 
		this.list = Arrays.asList(deck);
	
	}
	
	@Override
	public void printCards() {
		// TODO Auto-generated method stub
		 for ( int i = 0; i < list.size(); i++ )
		 {}
//	         System.out.printf( "%-20s%s", list.get( i ),
//	            ( ( i + 1 ) % 2 == 0 ) ? "\n" : "" );
		 
	}

}
