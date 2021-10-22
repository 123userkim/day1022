package com.sist.game;


//ī������� ���Ͽ� "ī��"�� ǥ���ϱ� ���� Ŭ���� 
public class Card {
	private String suit;  
	private String number;
	
	public Card(String suit, String number) {  
		//�����ÿ� ī����� ī����ڸ� �Ű������� �޾Ƽ� �ʱ�ȭ
		super();
		this.suit = suit;
		this.number = number;
	}
	
	@Override
	public String toString() {  //ī�带 ���ڿ��� ��ȯ�ϱ�
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
