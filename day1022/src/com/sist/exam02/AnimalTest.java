package com.sist.exam02;

import java.util.ArrayList;

public class AnimalTest{
	public void move() {
	}
}

class Lion extends AnimalTest{
	public void move() {
		System.out.println("���ڰ� ��������!");
	}
}

class Tiger extends AnimalTest{
	public void move() {
		System.out.println("ȣ���̰� ��������!");
	}
}

public class AnimalTest {
	//ArrayList<Tiger>list = new ArrayList<Tiger>();
	//�ڷ����� tiger�� ������ tiger�� �츮�� ���� ���� ����

	ArrayList<AnimalTest> list = new ArrayList<AnimalTest>();
	//�̷��� �صθ� Animal�� �ļ���(is a ���迡 �ִ�) lion/tiger�� ���� ���� ����
			
	public static void main(String[] args) {
		AnimalTest cage= new AnimalTest();
		cage.list.add(new Lion());
		cage.list.add(new Tiger());
		for(AnimalTest animal   :cage.list) {  //cage�� list�� �ٲ����� animal
			animal.move();
		}
		
		

	}

}
