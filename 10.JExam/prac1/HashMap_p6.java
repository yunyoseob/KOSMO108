package a.b.c.prac1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class HashMap_p6 {
	public ArrayList<HashMap<String, String>> hasMapGeneric(){
		HashMap<String, String> hm0 = new HashMap<String, String>();
		hm0.put("�̸�","ȫ�浿");
		hm0.put("��ȣ","010");
		hm0.put("�ּ�","���ѹα� ����");
		
		HashMap<String, String> hm1=new HashMap<String, String>();
		hm1.put("�̸�","ö��");
		hm1.put("��ȣ","011");
		hm1.put("�ּ�","���ѹα� �λ�");
		
		HashMap<String, String> hm2=new HashMap<String, String>();
		hm2.put("�̸�","����");
		hm2.put("��ȣ","016");
		hm2.put("�ּ�","���ѹα� ��õ");
		
		ArrayList<HashMap<String, String>> aList=new ArrayList<HashMap<String, String>>();
		aList.add(hm1);
		aList.add(hm2);
		aList.add(hm2);
		
		return aList;
		
	}

	public static void main(String[] args) {
		HashMap_p6 hMap= new HashMap_p6();
		System.out.println("1. HashMap_p6 hMap= new HashMap_p6();");
		
		ArrayList<HashMap<String, String>> aList1=hMap.hasMapGeneric();
		System.out.println("2. ArrayList<HashMap<String, String>> aList1=hMap.hasMapGeneric();");
		System.out.println("3 .aList1.size >>> : "+aList1.size());
		
		for (int i=0; i<aList1.size(); i++){
			HashMap<String, String> hm=aList1.get(i);
			System.out.println("aList1.get(i) >>> : "+hm);
			Iterator<String> keys=hm.keySet().iterator();
			// String���� ��ұ� ������, �ٿ�ĳ������ �� �ʿ䰡 ����
			// Set<K> �� ����.
			// �̸� Iterator<E> ���������� ����
			System.out.println("hm.keySet() >>> : "+hm.keySet());
			System.out.println("Iterator<String> keys >>> "+keys);
			
			while (keys.hasNext()){
				String key=keys.next();
				String value="";
				System.out.println("key >>> : "+key);
				if ("�̸�".equals(key)){
					value=hm.get(key);
					System.out.println("�̸�.equals(key) >>> : "+value+"\n");
				}
				if ("��ȣ".equals(key)){
					value=hm.get(key);
					System.out.println("��ȣ.equals(key) >>> : "+value+"\n");
				}
				if ("�ּ�".equals(key)){
					value=hm.get(key);
					System.out.println("�ּ�.equals(key) >>> : "+value+"\n");
				}
			}
		}

	}

}
