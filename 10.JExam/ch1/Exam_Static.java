package a.b.c.ch1;

public class Exam_Static {

	static byte b;

	static void aM(){
		System.out.println("aM() �Լ� ");
	}

	// �ڹ� ���α׷����� main() �Լ��� 
	// �� �Ʒ��ʿ� ����� ���´�. 
	public static void main(String args[]) {
	
		Exam_Static.aM();
		// static Ű���尡 ���� ������ ȣ�� ����� ���� 
		// Ŭ�����̸�.�����̸����� ȣ���ؼ� ����Ѵ�. 
		System.out.println("b >>> : " + Exam_Static.b);
		System.out.println("b >>> : �̰͵� �Ǵµ� ���ɴ� ������� ���� >>> : " + b);

		// static Ű���尡 ���� �Լ��� ȣ���� ���� 
		// Ŭ�����̸�.�Լ��̸����� ȣ���ؼ� ����Ѵ�.
		Exam_Static.aM();

		// �� static Ű���尡 �پ��ִ� �Լ�������
		// static Ű���带 ����� ���� ����. 
		// ��) main() �Լ� �������� static Ű���带 ����� �� ����. 
		//     static void main() : main() �Լ� �տ� static Ű���尡 �ִ�. 
	}
}