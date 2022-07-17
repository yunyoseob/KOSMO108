package a.b.c.ch1;

public class Exam_Operator_2 {

	public void inc_dec_Oper() {
		/*
			���� ������ increment and decrement operators
			++x		x �� ���� 1 ���� ��Ų �� �� ���� ���	
			--x		x �� ���� 1 ���� ��Ų �� �� ���� ���	
			x++		x ���� ���� ����� �� 1 ���� 
			x--		x ���� ���� ����� �� 1 ���� 
		*/

		int aX = 10;
		System.out.println(aX);
		
		aX++; // aX = aX + 1 --> 10 = 10 + 1;
		System.out.println(aX);

		++aX;
		System.out.println(aX);


		int aXX = 100;
		System.out.println(aXX);

		int aa = aXX++; // int aa = aXX = aXX + 1		
		System.out.println(aa);		
		
		aa = ++aXX;
		System.out.println(aa);
	}

	public static void main(String args[]) {
	
		Exam_Operator eo = new Exam_Operator_2();
		System.out.println("eo >>> : " + eo);

		// Exam_Operator Ŭ������ eo ���������� inc_dec_Oper() �Լ��� ȣ���Ѵ�(invoke).
		eo.inc_dec_Oper();

		// ���� ������ ternary operator
		// ���ǽ� ? ���1 : ���2;
		// ���ǽ��� ����� TRUE �̸� ���1, FALSE �̸� ���2
		int fatherAge = 45;
		int motherAge = 47;

		// char ch = ' '; char �ڷ��� �� ���ڷ� �ʱ�ȭ �ϱ�
		char ch = '\u0000'; // char �ڷ��� �����ڵ�� �ʱ�ȭ �ϱ� 
		
		boolean bool = fatherAge > motherAge;
		System.out.println("bool >>> : " + bool);

		ch = (fatherAge > motherAge) ? 'T' : 'F';
		System.out.println("ch >>> : " + ch);

		if (fatherAge > motherAge){
			System.out.println("true >>> : ");
		}else{
			System.out.println("false >>> : ");
		}

		// �ϱ� ������ ����� �����Ѵ�.
		if (fatherAge > motherAge)
			System.out.println("true >>> : ");			
			// System.out.println("true >>> : <<<<<<<<<>>>>>>>>>");
		else
			System.out.println("false >>> : 1");		
			System.out.println("false >>> : <<<<<<<<<>>>>>>>>> 2");

			System.out.println("false >>> : <<<<<<<<<>>>>>>>>> 3");
	}
}