package com.sist.game;

import java.util.*;

//ī������� ���Ͽ� 52���� ī�带 �׾Ƶΰ�, 
//����ڰ� ī�带 �ϳ��� ���� �� �ִ� �޼ҵ� �����
public class CardDeck {
	//
	private ArrayList<Card> deck = new ArrayList<Card>();
	
	//�������� list Deck�� �ʱ�ȭ�ϱ� ���ؼ� : �����ڸ� �����
	public CardDeck() { //�����ڿ� return�� ���x 
		//CardDeck�� ��������� deck�� 52���� ī�带 ���� �㵵��
		
		//ī�� ��� 4����, ����13������ �迭�� ���
		String []suit = {"clubs","diamods","hearts","spades"};
		String []number = {"2","3","4","5","6","7",
				"8","9","10","J","Q","K","A"};
		
		//��ø�ݺ����� ����ؼ� 52���� ī�带 �����Ͽ� deck�� ���
		for(int i = 0 ; i<suit.length;i++) {  //ī���縸ŭ
			for(int j =0 ; j<number.length;j++) {//ī����ڸ�ŭ
				deck.add(new Card(suit[i], number[j]));				
			}
		}
	}
	//52���� ī�尡 �������->�������޼ҵ� �����
	public void suffle() {
		Collections.shuffle(deck);
	}
	
	//52���� ī�尡 �ִ� deck�κ��� ī�带 �ϳ��� �̾ƿ��� �޼ҵ� �����
	//deck�� ������
	//�׻� deck �� ù��° ��Ҹ� �̵�����. deck�� 0��° ��Ҹ� �̾Ƽ�  ����� ��ȯ
	public Card deal() {
	return deck.remove(0); //52���� ī���߿� 0��°�� ��ȯ��
	
	//remove�޼ҵ�� arrayList
	//�ε����� ��ġ�� �����͸� �����ϰ�, ������ �����͸� ��ȯ�ϴ� �޼ҵ�
		 
	}
	
}
