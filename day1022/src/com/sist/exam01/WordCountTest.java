package com.sist.exam01;
import java.util.*;

public class WordCountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String data;
		System.out.println("������ �Է��Ͻÿ� : ");
		data= sc.nextLine(); //���鹮�ڵ� �Է¹ޱ� ����
		System.out.println(data);
		
		StringTokenizer st = new StringTokenizer(data);
		//���� �������� �и�
		
		
		//�����ִ� �����͸� ��ĭ���� �и�: �⺻���� ��ĭ���� �и��ϴ� ��
		//�и��� ������ �ϳ��ϳ��� ��ū�̶�� ��
		//nextToken
		//hasMoreToken-> ��������, nextToken(��ū�� �ϳ��� �������� ����)
		
		
		
		//key��value�� �ѽ����� �̷����� �ڷ� ����
		//(�ܾ�)��ū�� key�� ��. (�󵵼�)������ value+1
		//TreeMap=>�����ϴ� 
		TreeMap<String, Integer> map=  new TreeMap<String, Integer>();	
		
	
		while(st.hasMoreTokens()) {		//�Է¹������κ��� �и��Ѹ�ŭ �ݺ�
			String word = st.nextToken(); // �и��� ��ū�� �ϳ��� ���� ����
			Integer cnt = map.get(word); //������ null, ���ڷ� üũ : map���κ��� �� �ܾ��� �󵵼��� �����
				if(cnt ==null) {//�� �ܾ map�� ������
				map.put(word, 1);//�󵵼��� 1�� �����Ͽ� map�� �߰�
			}else {
				map.put(word, cnt+1);
			}
		}
		
	
			System.out.println(map);
			//��ȯ�ϴ� Ÿ�� : set
		
			Set<String> keyList	=	map.keySet();//map�� �ִ� ��� key��� �;����: keySet
			//map�� �ִ� �ڷḸŭ �ݺ������ϱ� ���� map�� ��� Ű ����� �о��
			
			//set�� �ڷḦ �ϳ��� ������ ����� ���ؼ� ieterator�� �����
			//set��ü�� �ݺ������ϱ� ���� ���x =>�������� ���ؼ� Interator����ϱ�
		     Iterator<String> iter =keyList.iterator();
			//iterator(�ݺ���)
	
			while(iter.hasNext()) {  //iter�� �� ������ �ִ�?
			//�ܾ �󵵼��� ����ִ�map�� key�����  ����ִ� ���ͷ������� �����Ͱ� �ִ� ��ŭ �ݺ�����
				String word =iter.next();
				//���ͷ����ͷκ��� �����͸� �������� �ܾ�(key)
				int cnt = map.get(word);//�ܾ��� �󵵼��� �����ɴϴ�.
				System.out.printf("%20s ---> %d\n",word, cnt);
				
			}
		
	}

}
