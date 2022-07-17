package a.b.c.ch4;

import java.util.ArrayList;
import java.util.Date;
/*
 * ArrayList Ŭ������ �迭 Ŭ����(��ü �迭 Object Array)�̴�.
 * �ε��� index�� ������ �ִ�.
 * ������ Ÿ���� ������� ���� �� �ִ�. (�ڹ� �迭�� ������ Ÿ���� �����ؾ� �Ѵ�).
 * ����� ������ ����. (�ڹ� �迭�� �������� ���̸� ���ؼ� ����Ѵ� int ip[] = new int[3]).
 * */
public class ArrayListTest {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void arrayListTest() {
		System.out.println("ArrayListTest.arrayListTest() �Լ� ���� >>> : ");
		
		ArrayList aList = new ArrayList();
		System.out.println("aList �������� �ּҰ� >>> : " + aList);
		System.out.println("aList.size() >>> : " + aList.size());
		aList.add("�ΰ�ȣ");
		System.out.println("aList >>> : " + aList);
		System.out.println("aList.size() >>> : " + aList.size());
		aList.add(27);
		System.out.println("aList >>> : " + aList);
		System.out.println("aList.size() >>> : " + aList.size());
		aList.add(new ArrayListTest());
		System.out.println("aList >>> : " + aList);
		System.out.println("aList.size() >>> : " + aList.size());
		aList.add('��');
		System.out.println("aList >>> : " + aList);
		System.out.println("aList.size() >>> : " + aList.size());	
		aList.add("����");
		System.out.println("aList >>> : " + aList);
		System.out.println("aList.size() >>> : " + aList.size());	
		aList.add(new Integer(27));
		System.out.println("aList >>> : " + aList);
		System.out.println("aList.size() >>> : " + aList.size());
		aList.add(false);
		System.out.println("aList >>> : " + aList);
		System.out.println("aList.size() >>> : " + aList.size());		
		aList.add(12.34566);
		System.out.println("aList >>> : " + aList);
		System.out.println("aList.size() >>> : " + aList.size());
		aList.add(new Date());
		System.out.println("aList >>> : " + aList);
		System.out.println("aList.size() >>> : " + aList.size());
		aList.add(aList);
		System.out.println("aList >>> : " + aList);
		System.out.println("aList.size() >>> : " + aList.size());
		
		for(int i=0; i < aList.size(); i++) {
			System.out.println("aList.get(" + i + ") >>> ::: " + aList.get(i));
		}
		
		// <> ���ʸ� 
		// ArrayList Ŭ������ ������ ������ ���� ���ϴ� ���̴�.
		ArrayList<String> aList_1 = new ArrayList<String>();
		System.out.println("aList_1 >>> : " + aList_1);
		aList_1.add("Ȳ�ž�");
		aList_1.add("23");
		System.out.println("aList_1 >>> : " + aList_1);
		System.out.println("aList_1.size() >>> : " + aList_1.size());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ArrayListTest().arrayListTest();
	}

}
