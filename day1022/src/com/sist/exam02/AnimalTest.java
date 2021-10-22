package com.sist.exam02;

import java.util.ArrayList;

public class AnimalTest{
	public void move() {
	}
}

class Lion extends AnimalTest{
	public void move() {
		System.out.println("사자가 움직여요!");
	}
}

class Tiger extends AnimalTest{
	public void move() {
		System.out.println("호랑이가 움직여요!");
	}
}

public class AnimalTest {
	//ArrayList<Tiger>list = new ArrayList<Tiger>();
	//자료형에 tiger을 넣으면 tiger만 우리에 담을 수가 있음

	ArrayList<AnimalTest> list = new ArrayList<AnimalTest>();
	//이렇게 해두면 Animal의 후손인(is a 관계에 있는) lion/tiger도 담을 수가 있음
			
	public static void main(String[] args) {
		AnimalTest cage= new AnimalTest();
		cage.list.add(new Lion());
		cage.list.add(new Tiger());
		for(AnimalTest animal   :cage.list) {  //cage의 list를 다꺼내면 animal
			animal.move();
		}
		
		

	}

}
