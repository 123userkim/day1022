package com.sist.homework;

public class Card {
	
		private String suit;	 
		private String number;	 
		
		public Card(String suit, String number) {   
			super();
			this.suit = suit;
			this.number = number;
		}
		public Card() {
			super();
		}
		@Override
		public String toString() {						 
			return "[" + suit + "," + number + "]";
		}
		public String getSuit() {
			return suit;
		}
		public void setSuit(String suit) {
			this.suit = suit;
		}
		public String getNumber() {
			return number;
		}
		public void setNumber(String number) {
			this.number = number;
		}
		
	}