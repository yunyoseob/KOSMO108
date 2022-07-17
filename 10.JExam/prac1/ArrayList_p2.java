package a.b.c.prac1;

import java.util.ArrayList;

import a.b.c.ch3.HelloVO;

public class ArrayList_p2 {
	public void arrayList_p_21(ArrayList<HelloVO> aList){
		// �Ű������� ArrayList<Ŭ�����̸�> ���������� ����
		// aList => {{VELOG_0 VELOG00_0 ���α�_0},{VELOG_1 VELOG00_1 ���α�_1},{VELOG_2 VELOG00_2 ���α�_2}}
		System.out.println("\n aList.size() >>> : "+aList.size());
		// 3
		for (int i=0; i<aList.size(); i++) {
			// aList.size()
			System.out.println("aList.get("+i+") >>> : "+aList.get(i));
			// aList�� i��° ������ �ּҰ� ��� {VELOG_i VELOG00_i ���α�_i} �ּҰ� ��� 
			
			
			HelloVO _hvo=aList.get(i);
			// aList�� i��° ���Ҹ� HelloVO Ŭ������ ��������
			// String s="���α�";
			// HelloVO ��ü�� _hvo��� ������ ����
			// VELOG_i VELOG00_i ���α�_i
			System.out.print(_hvo.getMid()+" ");
			System.out.print(_hvo.getMpw()+" ");
			System.out.println(_hvo.getMname());
		}
	}
	
	public void arrayList_p_22(String mid, String mpw, String mname){
		// �Ű�����  mid, mpw, mname��
		// ���� �μ��� �ʱ�ȭ
		System.out.print(mid+" ");
		System.out.print(mpw+" ");
		System.out.println(mname);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// main �Լ����� mid, mpw, name ����
		String mid="VELOG_";
		String mpw="VELOG00_";
		String mname="���α�_";
		
		// ArrayList<HelloVO> �����ڸ� ����� new Ű�����
		// �ν��Ͻ� �Ŀ�, aList�� ���������� ����
		ArrayList<HelloVO> aList=new ArrayList<HelloVO>();
		
		for (int i=0; i<3; i++) {
			// HelloVO() �����ڸ� ����� new Ű�����
			// �ν��Ͻ� �Ŀ�, hvo�� ���������� ����
			HelloVO hvo = new HelloVO();
			
			hvo.setMid(mid+i);
			hvo.setMpw(mpw+i);
			hvo.setMname(mname+i);
			// ���� for�� ��� �ۿ���
			// mid, mpw, mname�� ��������
			// ������ ��������� i�� ���ؼ� ���͸޼��忡 
			// �Է�
			
			aList.add(hvo);
			// HelloVO() ������ ��������
			// hvo�� �ּӰ��� ArrayList<Hello>()
			// �������� �������� aList�� �߰�
			// ���� ���� �迭�� ���Ҹ� �߰��ϴ� ��		
		}
		
		ArrayList_p2 al2=new ArrayList_p2();
		System.out.println("\n al2.arrayList_p_21(aList); ����");
		al2.arrayList_p_21(aList);
		// aList => {{VELOG_0 VELOG00_0 ���α�_0},{VELOG_1 VELOG00_1 ���α�_1},{VELOG_2 VELOG00_2 ���α�_2}}
		
		ArrayList_p2 al3=new ArrayList_p2();
		System.out.println("\n al3.arrayList_p_22(mid, mpw, mname); ����");
		al3.arrayList_p_22(mid, mpw, mname);
	}
}