package com.sist.game;

import java.util.ArrayList;
import java.util.HashMap;

public class Player {

 
		// TODO Auto-generated method stub
		//�����ϴ� ����ڰ� cradDuck���κ��� īƮ�� �ϳ��� ������ ���� ����Ʈ �����
		private ArrayList<Card> list = new ArrayList<Card>();
		
		//ī�带 �Ű������� �޾Ƽ� �� list���
		
	
			public void getCard(Card card) {
				list.add(card);
			}
		
		
		
		     //���� �Ǻ��Ͽ� ���� �̰���� ó���ϴ� �޼ҵ�
			//���� 2~10������ integer.parseInt()�ϸ� ������ ��
			//�ٵ� ī�� jack�̷� �� interger.parseInt()�� �ȵ�
			//"2"�� key->2 value�� �ϴ� map
			//jack�̶�� key�� 11�̶�� value���
			public int isOnePair() {
				
			//ī���� ���ڸ� map�� key	
			String []number = {"2","3","4","5","6","7",
					"8","9","10","J","Q","K","A"};
			
			//map�� �����
			HashMap<String, Integer> map= new HashMap<String, Integer>();
			
			//2�� ���� value�� ���� 2->1�� ������
			int value=2;
			for(int  i = 0; i<number.length ;i++) {
				//ī���� ���ڹ迭��ŭ �ݺ�����
				map.put(number[i],value++);
				//map�� key�� ī���� ����, value�� 2��ó ������ ��
				
			}
			
			
			int n = 0;//����Ʈ�� �ѹ��� 0
			for(int i=0;i<list.size();i++) { 
				//������ ���ڰ� �ִ��� �˻��ϱ�
				for(int j=i+1; j<list.size();j++) {
					//i��° ī���� ���ڿ� j��° ī���� ���ڰ� �������� �Ǻ�
					if(list.get(i).getNumber().equals(list.get(j))) {
						//������ ī���� ����(���ڿ�)�� �ش��ϴ� ������ map���κ��� �̾ƿ�
						n =map.get(list.get(i).getNumber());
						return n;
					}
				}	
			}
			return n; //������̸� ������� ���ڸ� ��ȯ
		}
		
		//�� ī�� ��� ���
		public void showCards() {
			System.out.println(list);
		}
	

}
