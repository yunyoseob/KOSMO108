package a.b.c.ch3;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("�ȳ� ��Ŭ���� ������!!!");
		
		HelloInterface hif = new HelloInterfaceImpl();
		hif.interfaceFunc();
		
		HelloVO hvo = new HelloVO();
		hvo.setMid("PGW");
		hvo.setMpw("PGW00");
		hvo.setMname("�ڰǿ�");
		
		System.out.print(hvo.getMid() + " ");
		System.out.print(hvo.getMpw() + " ");
		System.out.println(hvo.getMname() + " ");
	}

}
