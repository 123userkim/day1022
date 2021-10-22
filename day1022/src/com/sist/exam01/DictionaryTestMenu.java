package com.sist.exam01;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

import java.util.HashMap;

public class DictionaryTestMenu {
	
	public static Scanner sc = new Scanner(System.in); 
	//모두 사용할 거기 때문에, public, static해서 사용

	static String eng,kor; //static 모두가 사용하는 속성
	
	//메뉴출력을 위한 메소드
	public static void printMenu() {
		System.out.println("1.단어등록   2.단어검색   3.모두출력   4.단어삭제   0.종료");
		System.out.print("메뉴를 선택하시오 : ");
		System.out.println();
	}
	
	//단어 등록을 위한 메소드
	public static void insertWord(HashMap<String, String>map){
		System.out.println("새로운 단어를 등록합니다.");
		System.out.print("추가할 영어단어를 입력하시오.");
		eng =sc.next();
		System.out.print("추가할 영어단어의 한국어 뜻을 입력하시오.");
		kor =sc.next();
		map.put(eng,kor);
		System.out.println("새로운 단어를 등록했습니다.\n");
		System.out.println();
	}
	
	//단어 검색을 
	public static void searchWord(HashMap<String, String>map){
		System.out.println("영어 단어를 검색합니다.");
		System.out.print("찾고자하는 단어를 입력하시오");
		eng = sc.next();
		kor = map.get(eng);
		if(kor !=null) {
			System.out.printf("찾고자하는 %s의 뜻은 %s입니다.\n",eng,kor);
		}else {
			System.out.printf("찾고자하는 단어 %s는 미등록 단어입니다.\n",eng);
		}
		System.out.println();
	}
	
	//모두 출력
	public static void printAll(HashMap<String, String>map){
		System.out.printf("영어\t한국어\n");
		System.out.printf("=============\n");
		
		java.util.Iterator<String> eng_list =map.keySet().iterator();
		while(eng_list.hasNext()) {
			eng= eng_list.next();
			kor=map.get(eng);
			System.out.println(eng+"\t"+kor);
		}
		System.out.println();
	}
	
	//단어삭제
	public static void deleteWord(HashMap<String, String>map){
		System.out.println("단어를 삭제합니다.\n");
		System.out.print("삭제할 영어단어를 입력하세요->");
		eng= sc.next();
		kor = map.remove(eng);//영어단어의 키를 삭제 : 영단어가 없으면 kor=null
		if(kor != null) {
			System.out.printf("단어 %s를 삭제했습니다.\n",eng);
			System.out.println();
		}else {
			System.out.printf("삭제하려는 영어단어 %s는 사전에 없습니다.",eng);
			System.out.println();
		}
		
	}

	public static void main(String[] args){
		// TODO Auto-generated method stub
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("tiger", "호랑이");
		map.put("lion", "사자");
		map.put("apple", "사과");
		
		
		int menu=-1; //메뉴의 값을 -1로 정해두고, 
		while(menu != 0) { 
			printMenu();
			menu = sc.nextInt();
			
			switch(menu) {
			case 1 : insertWord(map);break;
			case 2 : searchWord(map);break;
			case 3 : printAll(map);break;
			case 4 : deleteWord(map);break;
			}
			
		}//계속 물어보도록 
		System.out.println("프로그램을 종료");
		
		
	}

}
