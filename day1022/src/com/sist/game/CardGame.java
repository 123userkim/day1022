package com.sist.game;

public class CardGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		//�����ڿ� ���ؼ� 52�� ī�尡 ������
		CardDeck deck = new CardDeck();
		
		//ī�带 ���� ���� ��
		deck.shuffle();
		
		//ī������� �� ����ڸ� �� �� ���� 
		Player p1= new Player();
		Player p2= new Player();
		
		//ù ��° ����� ī�带 �ϳ� �̾ƺ�
		p1.getCard(deck.deal()); 
		
		//�� ��° ����� ī�带 �ϳ� �̾ƺ�
		p2.getCard(deck.deal());
		
		//ù ��° ����� �ڽ��� ��� ī�带 ���
		p1.showCards();
		
		//�� ��° ����� �ڽ��� ��� ī�带 ���
		p2.showCards();
		
	}

}
