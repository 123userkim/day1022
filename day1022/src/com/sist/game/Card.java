package com.sist.game;


//카드게임을 위하여 "카드"를 표현하기 위한 클래스 
public class Card {
	private String suit;  
	private String number;
	
	public Card(String suit, String number) {  
		//생성시에 카드모양과 카드숫자를 매개변수로 받아서 초기화
		super();
		this.suit = suit;
		this.number = number;
	}
	
	@Override
	public String toString() {  //카드를 문자열로 반환하기
		return "[" + suit + ","+ number + "]";
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
