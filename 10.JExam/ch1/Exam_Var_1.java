package a.b.c.ch1;

public class Exam_Var_1 {

	public static void main(String args[]) {

		/*
			1. int �� ������ Ÿ�� ���� �Ѵ�. 
			2. level : int �� ������ Ÿ���� ����Ϸ��� level �������� �����Ѵ�. 
			3. = : ���� ������ 
			4. 10 : ������ 10 ����(���ͷ�)�� �����Ѵ�.
			5. ; : ������ �����ϴ� ; �����ݷ�(��ȣ, ������)�� �����Ѵ�. 
		*/
		// 6. int �� ���� level�� �����ϰ� �� 10�� �ʱ�ȭ �ߴ�. 
		int level = 10;

		// level �������� ȣ���ؼ�(�ҷ��ͼ�) level ������ �ʱ�ȭ�� �����͸� �ֿܼ� ����Ѵ�.
		System.out.println(level);

		int i; 
		/*
		System.out.println(i);
		Exam_Var_1.java:11: error: variable i might not have been initialized
                System.out.println(i);
                                   ^
		1 error
		*/
		i = 100;
		System.out.println(i);
	}
}