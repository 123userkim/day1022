package com.sist.game;

import java.util.ArrayList;
import java.util.HashMap;

public class Player {

 
		// TODO Auto-generated method stub
		//게임하는 경기자가 cradDuck으로부터 카트를 하나씩 가져와 담을 리스트 만들기
		private ArrayList<Card> list = new ArrayList<Card>();
		
		//카드를 매개변수로 받아서 내 list담기
		
	
			public void getCard(Card card) {
				list.add(card);
			}
		
		
		
		     //원페어를 판별하여 누가 이겼는지 처리하는 메소드
			//숫자 2~10까지는 integer.parseInt()하면 정수가 됨
			//근데 카드 jack이런 건 interger.parseInt()가 안됨
			//"2"를 key->2 value로 하는 map
			//jack이라는 key에 11이라는 value담기
			public int isOnePair() {
				
			//카드의 숫자를 map의 key	
			String []number = {"2","3","4","5","6","7",
					"8","9","10","J","Q","K","A"};
			
			//map을 만들고
			HashMap<String, Integer> map= new HashMap<String, Integer>();
			
			//2에 대한 value를 숫자 2->1씩 ㄱㄱㄱ
			int value=2;
			for(int  i = 0; i<number.length ;i++) {
				//카드의 숫자배열만큼 반복실행
				map.put(number[i],value++);
				//map에 key는 카드의 숫자, value는 2부처 증가한 값
				
			}
			
			
			int n = 0;//디폴트로 넘버는 0
			for(int i=0;i<list.size();i++) { 
				//동일한 숫자가 있는지 검사하기
				for(int j=i+1; j<list.size();j++) {
					//i번째 카드의 숫자와 j번째 카드의 숫자가 동일한지 판별
					if(list.get(i).getNumber().equals(list.get(j))) {
						//동일한 카드의 숫자(문자열)에 해당하는 정수를 map으로부터 뽑아옴
						n =map.get(list.get(i).getNumber());
						return n;
					}
				}	
			}
			return n; //원페어이면 원페어의 숫자를 반환
		}
		
		//내 카드 모두 출력
		public void showCards() {
			System.out.println(list);
		}
	

}
