package a.b.c.prac1;

public class Invoke_p {
	public Invoke_p() {
		System.out.println("���� Invoke_p() �⺻ �������Դϴ�.");
		aM();
		// aM() invoke
	}
	
	void aM(){
		System.out.println("���� aM() �Լ��Դϴ�.");
		bM();
		// bM() invoke
	}
	// aM�� �ƴ� aaM�̶�� �̸��� ������,
		/*
		 Exception in thread "main" java.lang.Error: 
		 Unresolved compilation problem: 
		 The method aM() is undefined for the type Invoke_p
		 */
		// aM() ���� first error 
		// new Invoke_p();���� second error
		// new �ν��Ͻ� �����ڷ� ��ü ���� ��, ������ ȣ���Ŀ�
		// aM method�� ȣ���ߴµ�, error�� �ݴ�� ��µȴ�.
	
	void bM(){
		System.out.println("���� bM() �Լ��Դϴ�.");
		cM();
		// cM() invoke
	}
	// bM�� �ƴ� bbM�̶�� �̸��� ������,
	// bM();���� first error
	// aM();���� second error
	// new Invoke_p();���� third error
	
	void cM(){
		System.out.println("���� cM() �Լ��Դϴ�.");
	}
	// cM�� �ƴ� ccM�̶�� �̸��� ������
	// cM(); fist error
	// bM(); second error
	// aM(); third error
	// new Invoke_p(); firth error

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Invoke_p();
		// �����ڸ� new Ű����� �ν��Ͻ��Ѵ�.
		// Invoke_p invoke

	}

}
