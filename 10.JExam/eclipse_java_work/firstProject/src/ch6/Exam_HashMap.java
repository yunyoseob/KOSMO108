package a.b.c.ch6;

import java.util.ArrayList;
import java.util.HashMap;

public class Exam_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
			���ʸ� ������ Ÿ�� : ���ʸ����� ������ Object�� ��Ȱ�� Ÿ���̶�� �Ѵ�. 
			
			<T> : Type
			<E> : Element
			<K> : Key
			<V> : Value
			<N> : Number
			
			public V put(K key, V value) // jdk 1.8 // �ι�°���� �Ű������� �������̴�. 
			public V get(Object key) // Value �������� �޴´�. 
			
			public Object put(Object key, Object value) // jdk 1.4 
			public Object get(Object key)
		*/
		
		ArrayList aList = new ArrayList(); // [] : �迭 
		System.out.println("aList >>> : " + aList);
		System.out.println("aList >>> : " + System.identityHashCode(aList));
		
		// HashMap �� �����ϴ� �����ʹ� ��� Object �̴�. 
		// HashMap �����͸� ������ ����� ���� �������� ���� ���´�� ����ȯ�� �ؾ� �Ѵ�.
		HashMap hp = new HashMap(); // {} : �迭�� �ƴϴ� 
		System.out.println("hp >>> : " + hp);
		System.out.println("hp >>> : " + System.identityHashCode(hp));	
		
		hp.put("�̸�", "�ڰǿ�");
		System.out.println("hp >>> : " + hp);
		
		hp.put("����", 30);
		System.out.println("hp >>> : " + hp);
		
		hp.put('a', "������");
		System.out.println("hp >>> : " + hp);
		
		hp.put('��', 27);
		System.out.println("hp >>> : " + hp);
		System.out.println("hp.size() >>> : " + hp.size());
		
		// key �� ������ �����͸� ���߰��� ���´�. 
		hp.put("����", 23);
		System.out.println("hp >>> : " + hp);
		System.out.println("hp.size() >>> : " + hp.size());
		hp.put('��', 21);
		System.out.println("hp >>> : " + hp);
		System.out.println("hp.size() >>> : " + hp.size());
		
//		String s0 = hp.get("�̸�");
		Object obj0 = hp.get("�̸�");
		String s0 = (String)obj0; // hp.put("�̸�", "�ڰǿ�");		
		String s0_1 = hp.get("�̸�").toString();
		String s0_2 = String.valueOf(hp.get("�̸�"));	
		String s0_3 = hp.get("�̸�") + "";	
		
		System.out.println("obj0 >>> : " + obj0);
		System.out.println("s0 >>> : " + s0);
		System.out.println("s0_1 >>> : " + s0_1);
		System.out.println("s0_2 >>> : " + s0_2);
		System.out.println("s0_3 >>> : " + s0_3);		

//		Integer s1 = hp.put("����");
		Object obj1 = hp.get("����");
		Integer s1 = (Integer)obj1; // hp.put("����", 30);
		String s1_1 = hp.get("����").toString();
		String s1_2 = String.valueOf(hp.get("����"));	
		String s1_3 = hp.get("����") + "";
		
		System.out.println("obj1 >>> : " + obj1);
		System.out.println("s1 >>> : " + s1);
		System.out.println("s1_1 >>> : " + s1_1);
		System.out.println("s1_2 >>> : " + s1_2);
		System.out.println("s1_3 >>> : " + s1_3);	
		
		// hp.put('a', "������");
//		String s2 = hp.put('a');
		Object obj2 = hp.get('a');
		String s2 = (String)obj2; // hp.put('a', "������");
		String s2_1 = hp.get('a').toString();
		String s2_2 = String.valueOf(hp.get('a'));	
		String s2_3 = hp.get('a') + "";
		
		System.out.println("obj2 >>> : " + obj2);
		System.out.println("s2 >>> : " + s2);
		System.out.println("s2_1 >>> : " + s2_1);
		System.out.println("s2_2 >>> : " + s2_2);
		System.out.println("s2_3 >>> : " + s2_3);	
		
		// hp.put('��', 25);
//		Integer s3 = hp.put('��');
		Object obj3 = hp.get('��');
		Integer s3 = (Integer)obj3; // hp.put('��', 25);
		String s3_1 = hp.get('��').toString();
		String s3_2 = String.valueOf(hp.get('��'));	
		String s3_3 = hp.get('��') + "";
		
		System.out.println("obj3 >>> : " + obj3);
		System.out.println("s3 >>> : " + s3);
		System.out.println("s3_1 >>> : " + s3_1);
		System.out.println("s3_2 >>> : " + s3_2);
		System.out.println("s3_3 >>> : " + s3_3);				

	}

}
