package com.sist.game;


//try : �������� �ݵ�� ������Ѿ� �� ��
public class Finally {

	public static void main(String[] args) {
	 
		try {
            int [] num = new int[3];
        
            System.out.println("num �迭�� �ִ� ���̴� 3�Դϴ�.");
        
            num[4] = 0;
            System.out.println("num[4] �� ���� �Է��߽��ϴ�.");
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("�迭 ���̰� ���� �ʽ��ϴ�.");
        } finally {
            System.out.println("�迭�� �ٽ� �����մϴ�.");
            int [] num = new int[5];
            
            num[4] = 0;
            
            System.out.println(num[4]);
        }
        
        System.out.println("���α׷��� �����մϴ�.");
    }
}