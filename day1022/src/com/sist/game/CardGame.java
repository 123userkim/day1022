package com.sist.game;

public class CardGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		//생성자에 의해서 52의 카드가 생성됨
		CardDeck deck = new CardDeck();
		
		//카드를 골고루 섞어 줌
		deck.suffle();
		
		//카드게임을 할 경기자를 두 명 생성 
		Player p1= new Player();
		Player p2= new Player();
		
		//첫 번째 사람이 카드를 하나 뽑아봄
		p1.getCard(deck.deal()); 
		
		//두 번째 사람도 카드를 하나 뽑아봄
		p2.getCard(deck.deal());
		
		//첫 번째 사람이 자신의 모든 카드를 출력
		p1.showCards();
		
		//두 번째 사람도 자신의 모든 카드를 출력
		p2.showCards();
		
	}

}
