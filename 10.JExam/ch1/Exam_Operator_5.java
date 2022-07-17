package a.b.c.ch1;

public class Exam_Operator {

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

	// �� ���� 
	public void shortCircuit_Oper() {

		// �� ���� Logical Operators
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

	// ���� ����
	public void relational_Oper() {

		// ���� ���� Relational Operators
		boolean bool0 = 1 > 2;
		boolean bool1 = 'a' > 'b'; // 97 > 98 , �ڹٴ� ���ڸ� int �� �ȴ�. ������ �ϸ� int������ ����ȯ �Ѵ�.
		boolean bool2 = 'A' > 'b';
		// boolean bool3 = "A" > "B";
		/*
		Exam_Operator.java:130: error: bad operand types for binary operator '>'
                boolean bool3 = "A" > "B";
                                    ^
		first type:  String
		second type: String
		1 error
		*/
		// boolean bool4 = "A" > 'b';
		// boolean bool5 = "��" > "��";
		boolean bool6 = '��' > '��';
		System.out.println("bool0 >>> : " + bool0);
		System.out.println("bool1 >>> : " + bool1);
		System.out.println("bool2 >>> : " + bool2);
		// System.out.println("bool3 >>> : " + bool3);
		// System.out.println("bool4 >>> : " + bool4);
		// System.out.println("bool5 >>> : " + bool5);
		System.out.println("bool6 >>> : " + bool6);


		// == ��� ������, � ������ �� ���� ���� �� �Ѵ�.
		int iX = 10;
		int iY = 10;
		boolean bVal0 = iX == iY;
		System.out.println("bVal0 >>> : " + bVal0);
	
		// equals() �Լ��� ���ڿ� ���� �� �Ѵ�.
		// java.lang.String
		// public boolean equals(Object anObject)
		// public boolean equalsIgnoreCase(String anotherString)
		String s0 = "abc";
		String s1 = "abc";
		String s2 = "Abc";
		String s3 = "Abc  ";
		boolean bVal4 = s0.equals(s1);
		System.out.println("bVal4 >>> : " + bVal4);
		boolean bVal5 = s0.equals(s2);
		System.out.println("bVal5 >>> : " + bVal5);
		boolean bVal6 = s0.equalsIgnoreCase(s2);
		System.out.println("bVal6 >>> : " + bVal6);
		boolean bVal7 = s0.equalsIgnoreCase(s3);
		System.out.println("bVal7 >>> : " + bVal7);		
	}

	public static void main(String args[]) {
	
		Exam_Operator eo = new Exam_Operator();
		System.out.println("eo >>> : " + eo);

		// Exam_Operator Ŭ������ eo ���������� inc_dec_Oper() �Լ��� ȣ���Ѵ�(invoke).
		eo.inc_dec_Oper();

		// Exam_Operator Ŭ������ eo ���������� ternary_Oper() �Լ��� ȣ���Ѵ�(invoke).
		eo.ternary_Oper();

		// Exam_Operator Ŭ������ eo ���������� shortCircuit_Oper() �Լ��� ȣ���Ѵ�(invoke).
		eo.shortCircuit_Oper();

		// Exam_Operator Ŭ������ eo ���������� relational_Oper() �Լ��� ȣ���Ѵ�(invoke).
		eo.relational_Oper();
	}
}