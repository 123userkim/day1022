package com.sist.homework;

import java.util.ArrayList;
import java.util.HashMap;

public class Player {
	

	private ArrayList<Card> list = new ArrayList<Card>();
	
	
	public void twoPair() {
		
	}

	public void getCard(Card card) {
		list.add(card);
	}
	 
	public void showCards() {
		System.out.println(list);
	}
	
	
	
		
	}

