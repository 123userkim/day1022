package com.sist.exam01;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

import java.util.HashMap;

public class DictionaryTestMenu {
	
	public static Scanner sc = new Scanner(System.in); 
	//��� ����� �ű� ������, public, static�ؼ� ���

	static String eng,kor; //static ��ΰ� ����ϴ� �Ӽ�
	
	//�޴������ ���� �޼ҵ�
	public static void printMenu() {
		System.out.println("1.�ܾ���   2.�ܾ�˻�   3.������   4.�ܾ����   0.����");
		System.out.print("�޴��� �����Ͻÿ� : ");
		System.out.println();
	}
	
	//�ܾ� ����� ���� �޼ҵ�
	public static void insertWord(HashMap<String, String>map){
		System.out.println("���ο� �ܾ ����մϴ�.");
		System.out.print("�߰��� ����ܾ �Է��Ͻÿ�.");
		eng =sc.next();
		System.out.print("�߰��� ����ܾ��� �ѱ��� ���� �Է��Ͻÿ�.");
		kor =sc.next();
		map.put(eng,kor);
		System.out.println("���ο� �ܾ ����߽��ϴ�.\n");
		System.out.println();
	}
	
	//�ܾ� �˻��� 
	public static void searchWord(HashMap<String, String>map){
		System.out.println("���� �ܾ �˻��մϴ�.");
		System.out.print("ã�����ϴ� �ܾ �Է��Ͻÿ�");
		eng = sc.next();
		kor = map.get(eng);
		if(kor !=null) {
			System.out.printf("ã�����ϴ� %s�� ���� %s�Դϴ�.\n",eng,kor);
		}else {
			System.out.printf("ã�����ϴ� �ܾ� %s�� �̵�� �ܾ��Դϴ�.\n",eng);
		}
		System.out.println();
	}
	
	//��� ���
	public static void printAll(HashMap<String, String>map){
		System.out.printf("����\t�ѱ���\n");
		System.out.printf("=============\n");
		
		java.util.Iterator<String> eng_list =map.keySet().iterator();
		while(eng_list.hasNext()) {
			eng= eng_list.next();
			kor=map.get(eng);
			System.out.println(eng+"\t"+kor);
		}
		System.out.println();
	}
	
	//�ܾ����
	public static void deleteWord(HashMap<String, String>map){
		System.out.println("�ܾ �����մϴ�.\n");
		System.out.print("������ ����ܾ �Է��ϼ���->");
		eng= sc.next();
		kor = map.remove(eng);//����ܾ��� Ű�� ���� : ���ܾ ������ kor=null
		if(kor != null) {
			System.out.printf("�ܾ� %s�� �����߽��ϴ�.\n",eng);
			System.out.println();
		}else {
			System.out.printf("�����Ϸ��� ����ܾ� %s�� ������ �����ϴ�.",eng);
			System.out.println();
		}
		
	}

	public static void main(String[] args){
		// TODO Auto-generated method stub
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("tiger", "ȣ����");
		map.put("lion", "����");
		map.put("apple", "���");
		
		
		int menu=-1; //�޴��� ���� -1�� ���صΰ�, 
		while(menu != 0) { 
			printMenu();
			menu = sc.nextInt();
			
			switch(menu) {
			case 1 : insertWord(map);break;
			case 2 : searchWord(map);break;
			case 3 : printAll(map);break;
			case 4 : deleteWord(map);break;
			}
			
		}//��� ������� 
		System.out.println("���α׷��� ����");
		
		
	}

}
