package a.b.c.ch6;

import java.util.HashMap;

public class Exam_HashMap_0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// HashMap�� Key �� �ش� ���α׷����� �׻� ����ũ�ؾ� �Ѵ�.
		
		HashMap hp = new HashMap();
		System.out.println("hp �������� �ּҰ� >>> : " + hp);
		System.out.println("hp.size >>> : " + hp.size());
		
		hp.put("1", 1);
		System.out.println("hp �������� �ּҰ� >>> : " + hp);
		System.out.println("hp.size >>> : " + hp.size());	
		
		hp.put("2", 2);
		System.out.println("hp �������� �ּҰ� >>> : " + hp);
		System.out.println("hp.size >>> : " + hp.size());
		/*
		  	hp �������� �ּҰ� >>> : {1=1, 2=2}
		  	, : CSV			
		*/
		hp.put("3", 3);
		System.out.println("hp �������� �ּҰ� >>> : " + hp);
		System.out.println("hp.size >>> : " + hp.size());	
		
		hp.put("2", 222);
		System.out.println("hp �������� �ּҰ� >>> : " + hp);
		System.out.println("hp.size >>> : " + hp.size());
		
		hp.put("2", 222333);
		System.out.println("hp �������� �ּҰ� >>> : " + hp);
		System.out.println("hp.size >>> : " + hp.size());
	}
}
