package com.sist.exam01;
import java.util.Scanner;


import java.util.HashMap;

public class DictionaryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("tiger", "ȣ����");
		map.put("lion", "����");
		map.put("apple", "���");
		
		Scanner sc = new Scanner(System.in);
		String eng,kor;
		
		while(true) {
				System.out.print("ã�����ϴ� �ܾ �Է��Ͻÿ�-->");
				eng = sc.next();
				kor= map.get(eng); //-->eng���ش��ϴ� �� �������� �ѱ���
				
				if(kor!= null) {
				System.out.println(kor);
				}else {
					System.out.println("��ϵ� �ܾ �ƴմϴ�.");
				}
		}//��� ������� 
		
		
	}

}
