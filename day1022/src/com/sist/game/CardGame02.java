package com.sist.game;

public class CardGame02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		//생성자에 의해서 52의 카드가 생성됨
		CardDeck deck = new CardDeck();
		
		//카드를 골고루 섞어 줌
		deck.suffle();
		
		//카드게임을 할 경기자를 두 명 생성 
		Player p1= new Player();
		Player p2= new Player();
		
		//원페어인지 판별하기 위한 메소드는 어느 클래스에 만들어야하는지
		//isOnePair()
		
		//두 명의 경기자가 카드를 7장씩 뽑아오도록 해 봄
		
		for(int i=1; i<=7 ;i++) {
			p1.getCard(deck.deal()); 
			
		 
			p2.getCard(deck.deal());
		}
		
		//첫 번째 사람이 자신의 모든 카드를 출력
		p1.showCards();
		
		//두 번째 사람도 자신의 모든 카드를 출력
		p2.showCards();
		
		
		if(p1.isOnePair() != 0) {
			System.out.println("Player1은 원페어입니다." +p1.isOnePair());			
		}else {
			System.out.println("Player1은 원페어가 아닙니다");
			
		}

		if(p2.isOnePair() != 0) {
			System.out.println("Player2은 원페어입니다." +p2.isOnePair());			
		}else {
			System.out.println("Player2은 원페어가 아닙니다");
			
		}
		
		
		
	}

}
