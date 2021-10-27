package com.sist.homework;

import com.sist.game.CardDeck;
import com.sist.game.Player;

public class CardGame {


		
		public static void main(String[] args) {
			
			CardDeck deck = new CardDeck();
			
			 
			deck.shuffle();
		 
			Player p1 = new Player();
			Player p2 = new Player();
			
			 
			
			for(int i=1; i<=7; i++) {
				p1.getCard(deck.deal());
				p2.getCard(deck.deal());
			}
		 
			p1.showCards();
			
		 
			p2.showCards();
		 
			
		 
			
			
		}

	}
