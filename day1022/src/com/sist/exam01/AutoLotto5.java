package com.sist.exam01;
import java.util.*;
public class AutoLotto5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r= new Random();
		TreeSet<Integer> []arr = new TreeSet [5]; //배열을 만들 땐 자료형 안써도 댐
		for(int i=0 ; i<arr.length ;i++) { 
			arr[i]=new TreeSet<Integer>(); 
			
			
			while(arr[i].size()<6){  
				arr[i].add(r.nextInt(45)+1);
			}
		}
		
		for(int i=0 ;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
