package com.sist.exam01;
import java.util.Scanner;


import java.util.HashMap;

public class DictionaryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("tiger", "호랑이");
		map.put("lion", "사자");
		map.put("apple", "사과");
		
		Scanner sc = new Scanner(System.in);
		String eng,kor;
		
		while(true) {
				System.out.print("찾고자하는 단어를 입력하시오-->");
				eng = sc.next();
				kor= map.get(eng); //-->eng에해당하는 걸 꺼내오면 한국어
				
				if(kor!= null) {
				System.out.println(kor);
				}else {
					System.out.println("등록된 단어가 아닙니다.");
				}
		}//계속 물어보도록 
		
		
	}

}
