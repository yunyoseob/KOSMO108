package a.b.c.ch2.aaaa;

/*
��� : �θ� �ڽ�
�θ� : Exam_Inter_1 �������̽� Ŭ���� 
�ڽ� : Exam_Inter_1_Class Ŭ���� 
*/

/*
��� ���迡�� �ν��Ͻ� �ϴ� ��� 4������ �ִ�.
2�� ����ϱ�
1. �ڽ�Ŭ���� �������� = new �ڽ�Ŭ����()
2. �θ�Ŭ���� �������� = new �ڽ�Ŭ����()

3, 4���� �ش���� ����
3. �θ�Ŭ���� �������� = new �θ�Ŭ����()
4. �ڽ�Ŭ���� �������� = new �θ�Ŭ����();
*/


public class Exam_Inter_1_Class implements Exam_Inter_1, Exam_Inter_3{

	@Override
	public /*abstract Ű���� ����*/ void aM(){
		System.out.println("Exam_Inter_1 �������̽����� �������̵� �ؼ� aM() {}  ���� ����� ������ �ϴ� �Լ��̴�.");				
	}

	
	@Override
	public /* abstract */ void bM(){
		System.out.println("Exam_Inter_1 �������̽����� �������̵� �ؼ� bM() {}  ���� ����� ������ �ϴ� �Լ��̴�.");		
	}

	// �������̽� Ŭ�������� ������ �Լ��� �������ؾ� �Ѵ�. 
	// ������ �϶�� ���� {} �� �극�̽��� ������ ���̴�.
	// {} �� ���ο� ���ϴ� ������ ��� �Ѵ�. 
	// ����ü�� �����. �����Ѵ�. Implemetation
	// �������̵� �� �Լ����� abstract Ű���带 �����ϰ� {} ���� �����.
	// public abstract void cM();
	@Override
	public /* abstract */ void cM() {
		System.out.println("Exam_Inter_1 �������̽����� �������̵� �ؼ� cM() {}  ���� ����� ������ �ϴ� �Լ��̴�.");
	}

	
	// ������ �ؾ� �Ѵ�.
	@Override
	public void dM(){
		System.out.println("Exam_Inter_2 �������̽��� �ִ� �߻��Լ��̴�.");
		System.out.println("Exam_Inter_1 �������̽��� extends Ű����� �������̽� ����� ���־���.");
		System.out.println("Exam_Inter_1 �������̽��� dM() �Լ��� �������̵� ���־���.");
		System.out.println("Exam_Inter_1_Class Ŭ�������� �������̵��ؼ� ������ �ߴ�.");
	}
	
	// ������ �ؾ� �Ѵ�.
	@Override
	public void eM(){
		System.out.println("Exam_Inter_3 �������̽��� �ִ� �߻��Լ��̴�.");
	}
}
