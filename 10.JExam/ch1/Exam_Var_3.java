package a.b.c.ch1;

// �ڹ� ���� : ���, Ŭ��������, ��������, �������, ��������

// ������ ��ȿ ���� 
public class Exam_Var_3 {
	// �ڹ��� ���� ��� : �ڹ� Ŭ������ ���ο� �����ϴ� ������ Filed �ʵ��� �θ���.
	
	// ������� : Ŭ���� �� ���� �� �Լ� �� �ܺο� �����ϴ� �����̴�. 
	// ��������� �������� 4������ �ִ�.
	/*
		���
		Ŭ��������
		�������� 
		�������
	*/
	// static �پ Ŭ���� ����, ����ƽ ���� 
	static int i;
	// ���
	public static final int CONSTRUCTOR_VARIABLE = 10;
	// Ŭ���� ����, ����ƽ ����
	static int i_var_staticVariable;
	// ���� ����
	public int i_var_GlobalVarialbe;
	// ��� ����
	int i_var_MemberVarialbe;


	// ���� �Լ� �ܼ� ���ø����̼��� �������̴�. 
	public static void main(String args[]) {
	
		// main() �Լ� �� �ȿ� �ִ�.
		// �Լ� �� �ȿ��� �����ϴ� ������ ���� ���� local variable ��� �θ���.
		int ii = 1;
		System.out.println("Exam_Var_3.i >>> : " + Exam_Var_3.i);
		// System.out.println("Exam_Var_3.ii >>> : " + Exam_Var_3.ii);
		System.out.println("ii >>> : " + ii);
	} // end of main()
} // end of Exam_Var_2 class