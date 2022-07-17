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
		for (int i=0; i < 30; i++) {
			// ����, 30000�̿���.
			
			// HelloVO Ŭ���� �ν��Ͻ� �Ѵ�.
			HelloVO hvo = new HelloVO();
			// HelloVO Ŭ���� �������� hvo ��� 
			System.out.println("\nhvo �������� �ּҰ� >>> : " + i  + " ::: " +  hvo + "\n");
			
			// hvo setter() �Լ��� �� �ʱ�ȭ , �� ���ε�, �� ���� 
			hvo.setMid("CHEB_" + i);
			hvo.setMpw("CHEB00_" + i);
			hvo.setMname("������_" + i);
			
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
		
		for (int i=0; i < aList.size(); i++) {
			System.out.println("aList.get(" + 0 + ") >>> : " + aList.get(i));
			
			HelloVO _hvo = aList.get(i);
			System.out.print(_hvo.getMid() + " ");
			System.out.print(_hvo.getMpw() + " ");			
			System.out.println(_hvo.getMname());			
		}

	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		new ArrayListTest_1().arrayListTest_1();
	}
}
