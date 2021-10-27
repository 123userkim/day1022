package com.sist.homework;

import java.util.*;

 

public class Exer07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//list가 ArrayList<Doble>의 객체를 참조하고 있음
		//list의 모든 원소를 출력하는 문장을 만들기
		//1)인덱스 변수를 사용하는 for 2)for-each 3)Interator
		
		ArrayList<Double> list = new ArrayList<Double>();
		list.add(10.9);
		list.add(9.9);
		list.add(8.9);
		list.add(7.9);
		list.add(6.9);
		
		 
		for (int i = 0; i <list.size(); i++) {
			   System.out.print(list.get(i)+"\t"); 
		}System.out.println();
		
		
		
		for( Double i: list) {
			System.out.print(i+"\t");
		}System.out.println();
		
		
 
		Iterator<Double> list1 = list.iterator();
		while(list1.hasNext()) {
			System.out.print(list1.next()+"\t");
		}	
	}
}
