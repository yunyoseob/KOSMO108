package a.b.c.ch1;

// ����� ����Ŭ���� Exam_Method_1 Ŭ�������� �ڿ��� ������ �ִ°��� ??
// class �� �ڿ� class = ���� + �Լ� 
// �Լ� 4�� : main() �Լ� +  ����� �����Լ� 3��
// �������ϰ� : 
// ���� �ϱ� : 

// �ڹٴ� ��������Ʈ ������� ����ȴ�. �Լ� �� �ȿ����� ��Ʈ����Ʈ ������� ���� �ȴ�. 
// �ڹ� �ܼ� ���ø����̼��� main() �Լ����� ������ �Ѵ�. 
// main() �Լ� ���� ���پ� �о� ���鼭 ���� �ȴ�.

// Exam_Method_1 �ڹ� �ҽ��� �������Ѵ�.
// Exam_Method_1 Ŭ���� ������ �����Ѵ�.
/*
	1. Exam_Method_1 Ŭ���� �ȿ� �ִ� main() �Լ��� ȣ���Ѵ�.
	2. main()�� ���� ù ��° ������ �о �����Ѵ�.
*/

/*
==========================================
�ڹ� �ܼ� ���ø����̼� ������ main() �Լ��̴�. 
main() �Լ� ������ �� �پ� �о�鼭 
�Լ��� ȣ���ϸ鼭 ���� �ȴ�. 

���� �Լ��� ��ġ�� ���� ������ ���� ����.
���� �ڹٿ����� main() �Լ��� �� �Ʒ��ʿ� ��ġ�ϰ� �Ѵ�.
==========================================
*/

// �ĺ��� : identifier ��� ��Ģ
// Ŭ���� �̸�, ���� �̸�, �޼ҵ�(�Լ�) �̸� 

public class Exam_Method_1 {
	
	/*
	// ���� �Լ��� �����Ѵ�.
	public static void main(String args[]){
		System.out.println("ù ��° ���ο��� Exam_Method_1 Ŭ���� ���� �ִ� main() �Լ� ���� >>> : ");
		System.out.println("�� ��° ���ο��� Exam_Method_1 Ŭ���� ���� �ִ� aM() �Լ��� ȣ���Ѵ�. >>> : ");
		System.out.println("aM() �Լ� ���� ù ��° ������ ����ȴ�. >>> : ");
		Exam_Method_1.aM();
		System.out.println("�� ��° ���ο��� Exam_Method_1 Ŭ���� ���� �ִ� cM() �Լ��� ȣ���Ѵ�. >>> : ");
		System.out.println("cM() �Լ� ���� ù ��° ������ ����ȴ�. >>> : ");
		Exam_Method_1.cM();
		System.out.println("�� ��° ���ο��� Exam_Method_1 Ŭ���� ���� �ִ� bM() �Լ��� ȣ���Ѵ�. >>> : ");
		System.out.println("bM() �Լ� ���� ù ��° ������ ����ȴ�. >>> : ");
		Exam_Method_1.bM();
	} // end of main() 
	*/


	public static void aM() {
		System.out.println("aM() method  �Լ�");
		System.out.println("aM() method  �Լ� �� �� ��° ���ο��� bM() �Լ� ȣ���� �Ѵ�.");
		Exam_Method_1.bM();
	}

	public static void bM() {
		System.out.println("bM() method  �Լ�");
	}

	public static void cM() {
		System.out.println("cM() method  �Լ�");
	}

	public static void ddddM() {
		System.out.println("ddddM() method  �Լ�");
	}

	// ���� �Լ��� �����Ѵ�.
	public static void main(String args[]){
		System.out.println("ù ��° ���ο��� Exam_Method_1 Ŭ���� ���� �ִ� main() �Լ� ���� >>> : ");
		
		System.out.println("�� ��° ���ο��� Exam_Method_1 Ŭ���� ���� �ִ� aM() �Լ��� ȣ���Ѵ�. >>> : ");
		System.out.println("aM() �Լ� ���� ù ��° ������ ����ȴ�. >>> : ");
		Exam_Method_1.aM();
		
		System.out.println("�� ��° ���ο��� Exam_Method_1 Ŭ���� ���� �ִ� cM() �Լ��� ȣ���Ѵ�. >>> : ");
		System.out.println("cM() �Լ� ���� ù ��° ������ ����ȴ�. >>> : ");
		Exam_Method_1.cM();
		
		System.out.println("�� ��° ���ο��� Exam_Method_1 Ŭ���� ���� �ִ� bM() �Լ��� ȣ���Ѵ�. >>> : ");
		System.out.println("bM() �Լ� ���� ù ��° ������ ����ȴ�. >>> : ");
		Exam_Method_1.bM();
	} // end of main() 	
} // end of Exam_Method class