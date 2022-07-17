package a.b.c.ch4;

import java.util.ArrayList;

import a.b.c.ch3.HelloVO;

// a.b.c.ch3.HelloVO.java

public class ArrayListTest_1 {

	
	public void arrayListTest_1() {
		
		// ArrayList aList = new ArrayList();
		
		// ArrayList Ŭ������ ���� 
		// �����ʹ� HelloVO �� ����϶�� ���ʷ��̼��� �����ߴ�.
		ArrayList<HelloVO> aList = new ArrayList<HelloVO>();
		
		// for ���� 0 ���� 3�� ����.
		for (int i=0; i < 3; i++) {
			
			// HelloVO Ŭ���� �ν��Ͻ� �Ѵ�.
			HelloVO hvo = new HelloVO();
			// HelloVO Ŭ���� �������� hvo ��� 
			System.out.println("\nhvo �������� �ּҰ� >>> : " + hvo + "\n");
			
			// hvo setter() �Լ��� �� �ʱ�ȭ , �� ���ε�, �� ���� 
			hvo.setMid("CHEB");
			hvo.setMpw("CHEB00");
			hvo.setMname("������");
			
			// ArrayList ���� ���
			System.out.println("aList.size() >>> : " + aList.size());
			// ArrayList �������� ��� 
			System.out.println("aList >>> : " + aList);
			
			// ArrayList �� aList ����������  �̿��ؼ� add() �Լ��� HelloVO ��ü�� hvo ���������� �ִ´�.
			// aList ���������� ����Ű�� ArrayList ��ü��  hvo �ּҰ��� ���̵��ȴ�.
			aList.add(hvo);
			// ���ڿ� ��� 
			System.out.println("ArrayList �� ������ ���� �� >>> : ");
			// ArrayList hvo �� ���� �� ������ ��� 
			System.out.println("aList.size() >>> : " + aList.size());
			// ArrayList hvo �� ���� ��  �������� ��� 
			System.out.println("aList >>> : " + aList);
			
		}
		System.out.println("aList.get(0) >>> : " + aList.get(0));
		System.out.println("aList.get(1) >>> : " + aList.get(1));
		System.out.println("aList.get(2) >>> : " + aList.get(2));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		new ArrayListTest_1().arrayListTest_1();
	}
}
