package a.b.c.ch1;

// char �ڷ��� �����ϱ� 
public class Exam_Var_4 {

	void charMethod() {
		System.out.println("Exam_Var_4.charMethod() ���� >>> : \n");

		char c1 = 'A';
		System.out.println("c1 >>> : " + c1);
		System.out.println("(int)c1 >>> : " + (int)c1);
		int c2 = (int)c1;
		System.out.println("c2 >>> : " + c2);

		// static String	toBinaryString(int i)
		// Returns a string representation of the integer argument as an unsigned integer in base 2.
		// String s_1 = java.lang.Integer.toBinaryString(int i); 
		String s_1 = Integer.toBinaryString(c2); 
		System.out.println("s_1 >>> : " + s_1);

		// static String	toHexString(int i)
		// Returns a string representation of the integer argument as an unsigned integer in base 16.
		String s_2 = Integer.toHexString(c2);
		System.out.println("s_2 >>> : " + s_2);

		// static String	toOctalString(int i)
		// Returns a string representation of the integer argument as an unsigned integer in base 8.
		String s_3 = Integer.toOctalString(c2);
		System.out.println("s_3 >>> : " + s_3);

		System.out.println("Exam_Var_4.charMethod() �� >>> : ");	
	}

	public static void main(String args[]) {
		System.out.println("Exam_Var_4.main() ���� >>> : \n");
		System.out.println("main() �Լ��� �ܼ� ���ø����̼��� ���� ��Ű��  >>> : \n");
		System.out.println("�Լ��� ȣ���ϴ� ��Ȱ�� �Ѵ�.  >>> : \n");
		
		Exam_Var_4 ev4 = new Exam_Var_4();
		System.out.println("ev4 �������� �ּҰ�  >>> : " + ev4);
		ev4.charMethod();

		System.out.println("Exam_Var_4.main() �� >>> : ");	
	} // end of mai()
} // end of Exam_Var_4 