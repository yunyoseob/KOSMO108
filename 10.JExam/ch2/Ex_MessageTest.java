// package
package a.b.c.ch2;

// import

// class ����
public class  Ex_MessageTest{
	// ��� 
	// �������
	// ������

	// �Լ� 

	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub.

		Ex_MessageInterface eme = new Ex_MessageEngImpl();
		eme.sayHello("Park Gun Won");

		Ex_MessageInterface emk = new Ex_MessageKorImpl();
		emk.sayHello("�ڰǿ�");

	}
}



