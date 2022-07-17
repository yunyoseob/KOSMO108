package a.b.c.ch1;

public class Exam_Method_2 {
	
	// int �� ������ Ÿ��, �ڷ���, �����̸�Ƽ�� Ÿ�� : ������ 
	// ������ : �Լ����� ����ϴ�(������ ��������) ������ Ÿ���� ���Ѵ�. 
	// return Ű���� �ڿ� ���� ������ Ÿ��(��)�� �� �Լ������� int �� �̾�� �Ѵ�.
	// static int :  int �ڷ��� �ϰ� return a + b �� ��� ���� �ڷ����� int ������ ���� �ؾ� �Ѵ�.
	// �Լ��� �������� return Ű���� �ڿ� ����Ǵ� ���������� �׽� �����ؾ� �Ѵ�. �ƴϸ� ������ �߻��Ѵ�. 
	static int addMethod() {
		// addMethod() �Լ� ���� ������, ���� ����� �ƴϴ�. 
		// �ֿܼ� ����϶�� ��ɹ��̴�. 
		System.out.println("Exam_Method_2 Ŭ������ �ִ� addMethod() �޼ҵ�(�Լ�) ");
		
		int a = 1;
		int b = 2;

		// addMethod() �Լ��� ���ϰ��� a + b �� ��� ���̴�. 
		// ���ϰ� a + b �� ������ �� �� addMethod() ����ο� �ִ� int �������� ������ Ÿ���� �׽� �����ؾ� �Ѵ�. 
		return a + b;
	}
	
	// default Ű���� ���� ������ access modifier
	// a.b.c.ch1 ��Ű��(����) ��������  ȣ���� �� �ִ�. 
	static void aM() {
		System.out.println("Exam_Method_2 Ŭ������ �ִ� aM() �޼ҵ�(�Լ�) ");
	}

	// public Ű���� ���� ������ access modifier
	// a.b.c.ch1 ��Ű��(����) �� �ƴ� ���������� ȣ���� �� �ִ�. 
	public static void bM() {
		System.out.println("bM() method  �Լ�");
	}

	// ���� �Լ��� �����Ѵ�.
	public static void main(String args[]){
		System.out.println("Exam_Method_2 Ŭ������ �ִ� main() �޼ҵ�(�Լ�) \n");
		
		System.out.println("�������� �ִ� �Լ��� ���� ���� �޴� ������ �����ؼ� ����Ѵ�. ");
		System.out.println("Exam_Method_2.addMethod() �Լ� ȣ�� ��� >>> : " 
								+ Exam_Method_2.addMethod());
		int sum = Exam_Method_2.addMethod();
		// int sum = 3 (return [a + b = 3]);
		System.out.println("int sum = " + sum + "\n");
		
		System.out.println("�������� void�� �Լ���(���� ���� ���� �Լ�, return Ű���尡 ���� �Լ�)��");
		System.out.println("���ϰ��� �޴� ������ ������� �ʴ´�. �׳� �Լ��� ȣ���ؼ� ����Ѵ�.");
		Exam_Method_2.aM();
		
	} // end of main() 	
} // end of Exam_Method_2 class