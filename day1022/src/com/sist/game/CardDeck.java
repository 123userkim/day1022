package com.sist.game;

import java.util.*;

//카드게임을 위하여 52장의 카드를 쌓아두고, 
//경기자가 카드를 하나씩 뽑을 수 있는 메소드 만들기
public class CardDeck {
	//
	private ArrayList<Card> deck = new ArrayList<Card>();
	
	//생성자의 list Deck를 초기화하기 위해서 : 생성자를 사용함
	public CardDeck() { //생성자엔 return을 사용x 
		//CardDeck의 멤버변수인 deck의 52장의 카드를 만들어서 담도록
		
		//카드 모양 4가지, 숫자13가지를 배열에 담기
		String []suit = {"clubs","diamods","hearts","spades"};
		String []number = {"2","3","4","5","6","7",
				"8","9","10","J","Q","K","A"};
		
		//중첩반복문을 사용해서 52개의 카드를 생성하여 deck에 담기
		for(int i = 0 ; i<suit.length;i++) {  //카드모양만큼
			for(int j =0 ; j<number.length;j++) {//카드숫자만큼
				deck.add(new Card(suit[i], number[j]));				
			}
		}
	}
	//52개의 카드가 순서대로->무작위메소드 만들기
	public void shuffle() {
		Collections.shuffle(deck);
	}
	
	//52장의 카드가 있는 deck로부터 카드를 하나씩 뽑아오는 메소드 만들기
	//deck엔 지워줌
	//항상 deck 맨 첫번째 요소를 뽑도록함. deck의 0번째 요소를 뽑아서  지우고 반환
	public Card deal() {
	return deck.remove(0); //52장의 카드중에 0번째를 반환함
	
	//remove메소드는 arrayList
	//인덱스에 위치한 데이터를 제거하고, 제거한 데이터를 반환하는 메소드
		 
	}
	
}
