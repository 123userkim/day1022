package com.sist.game;

public class CardGame01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		//�����ڿ� ���ؼ� 52�� ī�尡 ������
		CardDeck deck = new CardDeck();
		
		//ī�带 ���� ���� ��
		deck.shuffle();
		
		//ī������� �� ����ڸ� �� �� ���� 
		Player p1= new Player();
		Player p2= new Player();
		
		//��������� �Ǻ��ϱ� ���� �޼ҵ�� ��� Ŭ������ �������ϴ���
		//isOnePair()
		
		//�� ���� ����ڰ� ī�带 7�徿 �̾ƿ����� �� ��
		
		for(int i=1; i<=7 ;i++) {
			p1.getCard(deck.deal()); 
			
		 
			p2.getCard(deck.deal());
		}
		
		//ù ��° ����� �ڽ��� ��� ī�带 ���
		p1.showCards();
		
		//�� ��° ����� �ڽ��� ��� ī�带 ���
		p2.showCards();
		
		
		if(p1.isOnePair() != 0) {
			System.out.println("Player1�� ������Դϴ�." +p1.isOnePair());			
		}else {
			System.out.println("Player1�� ���� �ƴմϴ�");
			
		}

		if(p2.isOnePair() != 0) {
			System.out.println("Player2�� ������Դϴ�." +p2.isOnePair());			
		}else {
			System.out.println("Player2�� ���� �ƴմϴ�");
			
		}
		
		
		
	}

}
