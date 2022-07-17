package a.b.c.ch6;

import java.util.ArrayList;
import java.util.HashMap;

public class Exam_HashMap_1 {

	public ArrayList hashMap() {
		
		HashMap hm0 = new HashMap();
		hm0.put("�̸�", "�ڰǿ�");
		hm0.put("����", "30");
		hm0.put("�ּ�", "����� ���ı�");
	
		HashMap hm1 = new HashMap();
		hm1.put("�̸�", "������");
		hm1.put("����", "27");
		hm1.put("�ּ�", "����� ���α�");
		
		HashMap hm2 = new HashMap();
		hm2.put("�̸�", "�躰");
		hm2.put("����", "23");
		hm2.put("�ּ�", "����� ���۱�");
		
		ArrayList aList = new ArrayList();
		aList.add(hm0);
		aList.add(hm1);
		aList.add(hm2);	
		
		return aList;
	}
	
	public ArrayList<HashMap<String, String>> hashMapGeneric() {
		
		HashMap<String, String> hm0 = new HashMap<String, String>();
		hm0.put("�̸�", "�����");
		hm0.put("����", "27");
		hm0.put("�ּ�", "��õ�� ���ǵ�");
	
		HashMap<String, String> hm1 = new HashMap<String, String>();
		hm1.put("�̸�", "������");
		hm1.put("����", "26");
		hm1.put("�ּ�", "����� ��õ��");
		
		HashMap <String, String> hm2 = new HashMap<String, String>();
		hm2.put("�̸�", "�ΰ�ȣ");
		hm2.put("����", "27");
		hm2.put("�ּ�", "����� ��õ��");
		
		ArrayList<HashMap<String, String>> aList = 
				new ArrayList<HashMap<String, String>>();
		aList.add(hm0);
		aList.add(hm1);
		aList.add(hm2);	
		
		return aList;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Exam_HashMap_1 ex1 = new Exam_HashMap_1 ();
	
		ArrayList aList = ex1.hashMap();
		System.out.println("aList.size() >>> : " + aList.size());
		
		for (int i=0; i < aList.size(); i++) {
			HashMap hm = (HashMap)aList.get(i);			
			
			Object obj1 = hm.get("�̸�");
			String name1 = (String)obj1;
			//System.out.println("�̸� >>> : " + name1);
			
			Object obj2 = hm.get("����");
			String age1 = (String)obj2;
			//System.out.println("���� >>> : " + age1);
			
			Object obj3 = hm.get("�ּ�");
			String addr1 = (String)obj3;
			//System.out.println("�ּ� >>> : " + addr1);
			System.out.println(name1 + " : " + age1 + " : " + addr1);			
		}
				
		ArrayList<HashMap<String, String>> aList1 = ex1.hashMapGeneric();
		System.out.println("aList1.size() >>> : " + aList1.size());
		
		for (int i=0; i < aList1.size(); i++) {
			
			HashMap<String, String> hm = aList1.get(i);			
			
			String name1 = hm.get("�̸�");			
			String age1 = hm.get("����");			
			String addr1 = hm.get("�ּ�");			
			System.out.println(name1 + " : " + age1 + " : " + addr1);
		}			

	}

}
