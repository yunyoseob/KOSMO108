package a.b.c.ch5;

// �Լ��� �θ��� ������ ���α׷������� 
// �Լ��� ȣ���Ѵ� �ϰ� �δ´�. invoke �Ѵ�.
// ȣ���Ѵٶ�� �ǹ̴� invoke�� ���� ����.

public class Exam_Invoke {

	// �⺻ ������ 
	Exam_Invoke() {
		System.out.println("Exam_Invoke() ������ >>> : ");
		
		// aM() �Լ��� ȣ�� �Ѵ�.
		aM();
	}
	// �⺻ �����ڴ� �ش� Ŭ������ �Լ��� ȣ���� �� �ִ�.
	
	void aM() {
		System.out.println("aM() �Լ� >>> : ");
		
		// bM() �Լ��� ȣ���Ѵ�.
		bM();
	}

	void bM() {
		System.out.println("bM() �Լ� >>> : ");
		
		// cM() �Լ��� ȣ���Ѵ�.
		cM();
	}
	
	void cM() {
		System.out.println("cM() �Լ� >>> : ");		
	}
	
	// main() �Լ��� �� ���α׷��� �������̴�. 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Exam_Invoke() �����ڸ� ȣ���Ѵ�. invoke �Ѵ�.
		// "invoke".equals("ȣ���Ѵ�.");
		// "ȣ���Ѵ�.".equals("invoke");
		new Exam_Invoke();
	}
}
