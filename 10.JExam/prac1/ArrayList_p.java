package a.b.c.prac1;

import java.util.ArrayList;

import a.b.c.ch3.HelloVO;

public class ArrayList_p{
	public void arrayListTest_1(){
		ArrayList<HelloVO> aList = new ArrayList<HelloVO>();
		// ArrayList<HelloVO> �����ڸ� new Ű����� �ν��Ͻ��Ѵ�.
		// �� �� �迭�� �ʱ�ȭ �Ǿ� �迭�� size�� 0, �迭�� [] : empty ArrayList�� �ȴ�.
		// aList�� ������������ ���������̴�.
		// < > �� ���ʷ��̼��̴�.
		// ArrayList<HelloVO>�� �����ʹ� HelloVO�� ����϶��
		// ���ʷ��̼��� ������ ���̴�.
		System.out.println("\n 1st for keyword \n");
		
		for (int i=0; i<3; i++) {
			HelloVO hvo = new HelloVO();
			// HelloVo �����ڸ� newŰ����� �ν��Ͻ��Ͽ���.
			System.out.println("\n i >>> : "+i+", hvo �������� �ּҰ� >>>"+hvo);
			
			hvo.setMid("VELOG_ID"+i);
			hvo.setMpw("VELOG_PW"+i);
			hvo.setMname("JAVA_SERIES"+i);
			
			System.out.println("aList.size() >>> : "+aList.size());
			// aList.size() �� size i+1��
			// i+1�� ���� �迭�� �ε����� 0���� ���۵Ǳ� ����
			System.out.println("aList >>> : "+aList);
			// ���������� �ּҰ��� ��µȴ�.
			aList.add(hvo);
			// ��������(HelloVO()) �ּҰ��� aList(ArrayList<HelloVO>())�� �߰��Ѵ�.
			// �迭�� �ϳ��� �����Ͱ� �� ������ ���̴�.
			System.out.println("\n After input hvo in ArrayList \n");
			System.out.println("aList.size() >>> : "+aList.size());
			System.out.println("aList >>> : "+aList);
			// hvo �������� �ּҰ��� ArrayList<HelloVO> �� ���ҷ� ��
		}
		
		System.out.println("\n 2nd for keyword \n");
		
		for (int i=0; i<aList.size(); i++) {
			System.out.println("\n aList.get("+0+") >>> : "+aList.get(i));
			
			HelloVO _hvo =aList.get(i);
			System.out.print(_hvo.getMid()+" ");
			System.out.print(_hvo.getMpw()+" ");
			System.out.println(_hvo.getMname());
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		new ArrayList_p().arrayListTest_1();		
	}

}
