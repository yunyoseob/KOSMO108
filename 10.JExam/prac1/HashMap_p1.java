package a.b.c.prac1;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMap_p1 {

	public static void main(String[] args) {
		/*
		 * 
		 * ���ʸ� ������ Ÿ�� : ���ʸ����� ������ Object�� ������ Ÿ���̶�� �Ѵ�.
		 * 
		 *	<T> : Type
		 *	<E> : Element
		 *	<K> : Key
		 *	<V> : Value
		 *	<N> : Number
		 *
		 *	public V put (K key, V value) // jdk 1.8 // �� ��° ���� �Ű������� �������̴�.
		 *  public V get(Object Key) // Value �������� �޴´�.
		 * 
		 * 	public Object put(Object Key, Object value)
		 *  public Object get(Object Key)
		 * 
		 * */
	

		// ArrayList�� ���
		int idx=0;
	
		ArrayList aList = new ArrayList();
		for (int val=100; val<110; val++){
			aList.add(val);
		}
		System.out.println("aList >>> : "+aList+"\n");
		
		for (idx=0; idx<10; idx++){
			System.out.println("aList��  index(key) ="+idx+": value="+aList.get(idx));
		}

		
		// HashMap�� ���
		HashMap hMap=new HashMap();
		
		hMap.put("���","apple");
		hMap.put("�ٳ���","banana");
		hMap.put("���","melon");
		hMap.put("������","peach");
		
		/*
		System.out.println("\n ����� ����� >>>> : "+hMap.get("���"));
		// apple
		
		System.out.println("\n �ٳ����� ����� >>>> : "+hMap.get("�ٳ���"));
		System.out.println("\n ����� ����� >>>> : "+hMap.get("���"));
		System.out.println("\n �����ƴ� ����� >>>> : "+hMap.get("������"));
		*/
		
		hMap.put("���","���ִ�.");
		
		// System.out.println("\n Value�� apple���� ���ִ� �Է� �� , ����� >>>> : "+hMap.get("���")+"\n");
		// ���ο� ���� �����ϱ� apple�� �ƴ϶� ���ִٰ� ��µ�.
		// ���ִ�.
		

		// HashMap�� index�� ����.
		
		idx=0;
		for(idx=0; idx<=3; idx++){
			System.out.println("hMap�� "+idx+"��° �� >>> "+hMap.get(idx));
			// ���� null�� ��µȴ�.
		}
		
		System.out.println("\n HashMap�� Key�� ã�ƾ��Ѵ�.\n");
		
		// ����ϰ� ������ Ű�� ���������� �����Ͽ� ����Ѵ�.
		String[] sList={"���","�ٳ���","���","������"};
		
		
		idx=0;
		String s="";
		for(idx=0; idx<=3; idx++){
			s=sList[idx];
			System.out.println("hMap�� Key : "+s+"\n hMap�� Value : "+hMap.get(s));
		}

		
		// ���ִ�. , banana, melon, peach 
	} // main method

} // HashMap_p1 class
