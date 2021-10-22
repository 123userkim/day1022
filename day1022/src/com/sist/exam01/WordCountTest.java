package com.sist.exam01;
import java.util.*;

public class WordCountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String data;
		System.out.println("문장을 입력하시오 : ");
		data= sc.nextLine(); //공백문자도 입력받기 위새
		System.out.println(data);
		
		StringTokenizer st = new StringTokenizer(data);
		//문자 공백으로 분리
		
		
		//원래있던 데이터를 빈칸으로 분리: 기본값이 빈칸으로 분리하는 것
		//분리된 데이터 하나하나를 토큰이라고 함
		//nextToken
		//hasMoreToken-> 또있으면, nextToken(토큰을 하나씩 꺼내오는 형태)
		
		
		
		//key와value가 한쌍으로 이뤄지는 자료 구조
		//(단어)토큰이 key가 됨. (빈도수)있으면 value+1
		//TreeMap=>정렬하는 
		TreeMap<String, Integer> map=  new TreeMap<String, Integer>();	
		
	
		while(st.hasMoreTokens()) {		//입력문당으로부터 분리한만큼 반복
			String word = st.nextToken(); // 분리된 토큰을 하나씩 갖고 오기
			Integer cnt = map.get(word); //없으면 null, 숫자로 체크 : map으로부터 그 단어의 빈도수를 갖고옴
				if(cnt ==null) {//그 단어가 map에 없으면
				map.put(word, 1);//빈도수를 1로 설정하여 map에 추가
			}else {
				map.put(word, cnt+1);
			}
		}
		
	
			System.out.println(map);
			//반환하는 타입 : set
		
			Set<String> keyList	=	map.keySet();//map에 있는 모든 key목록 익어오기: keySet
			//map에 있는 자료만큼 반복수행하기 위해 map의 모든 키 목록을 읽어옴
			
			//set의 자료를 하나씩 끄집어 내어내기 위해서 ieterator로 만들기
			//set자체에 반복수행하기 위한 기능x =>꺼내오기 위해서 Interator사용하기
		     Iterator<String> iter =keyList.iterator();
			//iterator(반복자)
	
			while(iter.hasNext()) {  //iter에 또 다음이 있니?
			//단어별 빈도수가 담겨있는map의 key목록을  담고있는 이터레이터의 데이터가 있는 만큼 반복실행
				String word =iter.next();
				//이터레이터로부터 데이터를 꺼내오면 단어(key)
				int cnt = map.get(word);//단어의 빈도수를 꺼내옵니다.
				System.out.printf("%20s ---> %d\n",word, cnt);
				
			}
		
	}

}
