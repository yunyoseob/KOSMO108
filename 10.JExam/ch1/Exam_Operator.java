package a.b.c.ch1;

public class Exam_Operator {

	public static void main(String args[]) {
	
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
}