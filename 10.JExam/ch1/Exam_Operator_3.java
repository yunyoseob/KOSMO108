package a.b.c.ch1;

public class Exam_Operator_3 {

	// ���� ������
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

		++aX; // aX = aX + 1 --> 11 = 11 + 1;
		System.out.println(aX);


		int aXX = 100;
		System.out.println(aXX);

		int aa = aXX++; // int aa = aXX = aXX + 1 --> aa = 100 = 100 + 1	
		System.out.println(aa);		
		
		aa = ++aXX;
		System.out.println(aa);
	}

	// ���� ������
	public void ternary_Oper() {
	
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
	public static void main(String args[]) {
	
		Exam_Operator_3 eo = new Exam_Operator_3();
		System.out.println("eo >>> : " + eo);

		// Exam_Operator_3 Ŭ������ eo ���������� inc_dec_Oper() �Լ��� ȣ���Ѵ�(invoke).
		eo.inc_dec_Oper();

		// Exam_Operator_3 Ŭ������ eo ���������� ternary_Oper() �Լ��� ȣ���Ѵ�(invoke).
		eo.ternary_Oper();


		// Short Circuit ���� 
		// �ܶ� ȸ�� �� Short Circuit Evaluation : SCU
		// �� ��(&&) ����� �� ��(||) ������ �� �� �� ���� ��� �������� �ʴ���� 
		// ��� ���� �� �� �ִ� ��쿡, ������ ���� ������� �ʴ´�.
		/*
			&& ����			|| ����
			T AND T = T		T OR T = T
			T AND F = F		T OR F = T
			F AND T = F		F OR T = T
			F AND F = F		F OR F = F
		*/
		int num1 = 10;
		int i = 2;

		boolean b0 = (num1 = num1 + 10) < 10;
		boolean b1 = (i = i + 2) < 10;
		boolean b2 = b0 && b1;
		System.out.println("b0 >>> : " + b0);
		System.out.println("b1 >>> : " + b1);
		System.out.println("b2 >>> : " + b2);
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
		System.out.println("value >>> : " + value);
		System.out.println("num1 >>> : " + num1);
		System.out.println("i >>> : " + i);


		boolean b3 = (num1 = num1 + 10) > 10;
		boolean b4 = (i = i + 2) < 10;
		boolean b5 = b3 || b4;
		System.out.println("b3 >>> : " + b3);
		System.out.println("b4 >>> : " + b4);
		System.out.println("b5 >>> : " + b5);

		boolean value1 = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10);
		System.out.println("value1 >>> : " + value1);
		System.out.println("num1 >>> : " + num1);
		System.out.println("i >>> : " + i);
		
	}
}