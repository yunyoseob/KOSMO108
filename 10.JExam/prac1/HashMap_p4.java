package a.b.c.prac1;

import java.util.ArrayList;
import java.util.HashMap;


public class HashMap_p4 {
	public ArrayList hashMap(){
		System.out.println("2. ArrayList hasMap method ����");
		
		HashMap hm0=new HashMap();
		System.out.println("3. 1st HashMap ���� >>> : "+hm0);
		hm0.put("����","�ѱ�");
		hm0.put("��ȣ",82);
		hm0.put("����","����");

		HashMap hm1=new HashMap();
		System.out.println("4. 2nd HashMap ���� >>> : "+hm1);
		hm1.put("����","�Ϻ�");
		hm1.put("��ȣ",81);
		hm1.put("����","����");
		
		HashMap hm2=new HashMap();
		System.out.println("5. 3rd HashMap ���� >>> : "+hm2);
		hm2.put("����","�߱�");
		hm2.put("��ȣ",86);
		hm2.put("����","����¡");
		
		ArrayList aList=new ArrayList();
		aList.add(hm0);
		aList.add(hm1);
		aList.add(hm2);
		
		return aList;
	}
	
	//public ArrayList<HashMap<String, String>> hashMapGeneric(){
		
		
		
		
	//}
	
	public static void main(String[] args) {
		HashMap_p4 hp=new HashMap_p4();
		System.out.println("1. hp >>> : "+hp);
		
		ArrayList aList=hp.hashMap();
		System.out.println("aList.size() >>> : "+aList.size());
		
		for (int i=0; i<aList.size(); i++){
			HashMap hm=(HashMap)aList.get(i);
			// aList�� ù ��° ���Ҹ� �����´�.
			// Ŭ���� ����ȯ�� �Ѵ�. 
			
			Object obj1=hm.get("����");
			// �迭�� ���ҿ� �ִ� HashMap�� ���� Ű�� ObjectŬ���� obj1 ����������
			// �����Ѵ�.
			String name1=(String)obj1;
			// Ŭ���� ����ȯ�� ���ش�.
			System.out.println("���� >>> : "+name1);
			
			Object obj2=hm.get("��ȣ");
			// �迭�� ���ҿ� �ִ�HashMap�� ��ȣ Ű�� ObjectŬ���� obj2 ����������
			// �����Ѵ�.
			Integer num1=(Integer)obj2;
			System.out.println("��ȣ >>> : "+num1);
			
			Object obj3=hm.get("����");
			String city1=(String)obj3;
			// �迭�� ���ҿ� �ִ�HashMap�� ���� Ű�� ObjectŬ���� obj2 ����������
			// �����Ѵ�.
			System.out.println("���� >>> : "+city1);
			System.out.println();
		}
		

	} // main method

} // HashMap_p4 class
