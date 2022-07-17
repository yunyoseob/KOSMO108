package a.b.c.ch6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Exam_HashMap_3 {
	
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
		Exam_HashMap_3 ex3 = new Exam_HashMap_3();
		
		ArrayList<HashMap<String, String>> aList1 = ex3.hashMapGeneric();
		System.out.println("aList1.size() >>> : " + aList1.size());
		
		for (int i=0; i < aList1.size(); i++) {
			
			HashMap<String, String> hm = aList1.get(i);			
			
			Iterator<String> keys = hm.keySet().iterator();
			
			// Iterator �������� keys �� �̿� �ؼ� ���ͷ����Ϳ� ��� �ִ� �����͸� hasNext() �Լ��� Ȯ�� �Ѵ�. 
			while (keys.hasNext()) {
				String key = keys.next();
				String value = "";
				
				if ("�̸�".equals(key)) {
					value = hm.get(key);
				}
				if ("����".equals(key)) {
					value = hm.get(key);
				}
				if ("�ּ�".equals(key)) {
					value = hm.get(key);
				}
				
//				if ("�̸�".equals(key) || "����".equals(key) || "�ּ�".equals(key)) {
//					value = hm.get(key);
//				}
				System.out.println(key + " : " + value);
			}
		}	
				
	}
}
