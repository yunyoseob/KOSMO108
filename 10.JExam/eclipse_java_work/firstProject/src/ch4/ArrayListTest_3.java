package a.b.c.ch4;

import java.util.ArrayList;
import java.util.Scanner;

import a.b.c.ch3.HelloVO;

public class ArrayListTest_3 {
	
	public ArrayList<HelloVO> arrayListTest_1(HelloVO hvo) {
		
		
		// ����Ͻ� ������ ���ļ� �����ͺ��̽��� �ٳ���� ������ ���� �����̴�.

		ArrayList<HelloVO> aList = null;
		aList = new ArrayList<HelloVO>();
		
		aList.add(hvo);
		
		return aList;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String mid = "";
		String mpw = "";
		String mname = "";
		
		System.out.println("�����͸� �Է��Ͻÿ� >>> : ");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���̵� >>> : ");
		mid = sc.next();
		System.out.println("�н����� >>> : ");
		mpw = sc.next();
		System.out.println("�̸� >>> : ");
		mname = sc.next();
		
		HelloVO hvo = new HelloVO();
		hvo.setMid(mid);
		hvo.setMpw(mpw);
		hvo.setMname(mname);
			
		ArrayListTest_3 al3 = new ArrayListTest_3();
		
		// public ArrayList<HelloVO> arrayListTest_1(HelloVO hvo)
		ArrayList<HelloVO> aList = al3.arrayListTest_1(hvo);

		if (aList !=null && aList.size() > 0) {
			
			for (int i=0; i < aList.size(); i++) {
				System.out.println("aList.get(" + 0 + ") >>> : " + aList.get(i));
				
				HelloVO _hvo = aList.get(i);
				System.out.print(_hvo.getMid() + " ");
				System.out.print(_hvo.getMpw() + " ");			
				System.out.println(_hvo.getMname());			
			}
		}
		else {
			System.out.println("�����Ͱ� �Է� �Ǵ� ��� �� ����������� �� �� �Ǿ��׿� >>> :");
		}
			
	}
}
