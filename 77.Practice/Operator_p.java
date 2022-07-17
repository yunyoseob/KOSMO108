package a.b.c.ch1;


public class Operator_p{
	public void inc_dec_Oper(){
				/*
			���� ������ increment and decrement operators
			++x : x�� ���� 1 ���� ��Ų �� �� ���� ���
			--x: x�� ���� 1 ���� ��Ų �� �� ���� ���
			x++ : x�� ���� ����� �� 1����
			x-- : x���� ���� ����� �� 1 ����
		*/
		int aX=10;
		System.out.println("ax =10 >>> : "+aX+"\n");
		// 10
		
		// 10�� aX�� 1 ��ŭ ������Ű�� ��� 
		aX++; // aX = aX+z --> 10=10+1;
		System.out.println("aX++; >>> : "+aX+"\n");
		// 11

		++aX;
		System.out.println("++aX; >>> : "+aX+"\n");
		// 12


		// ���Կ����� �Ἥ �غ���
		int aXX=100;
		System.out.println("int aXX=100 >>> : "+aXX+"\n");
		// 100

		int aa=aXX++;
		System.out.println("int aa=aXX++; >>> : "+aa+"\n");
		// 100
		// aXX�� ���� ���� ����.

		aa=++aXX;
		System.out.println("bb=++bXX; >>> : "+aa+"\n");
		// 102
		// 2��ŭ ������.

		
		int bXX=100;
		int bb=++bXX;
		System.out.println("bb=++bXX; >>> : "+bb+"\n");
		// 101
		// 1��ŭ ������.
	} // end of inc_dec_Oper

	public static void main(String args[]){
		Operator_p rv=new Operator_p();
		System.out.println("rv >>> : "+rv);

		// Operator_p Ŭ������ rv ���������� inc_dec_Oper �Լ��� ȣ���Ѵ�. (invoke)
		rv.inc_dec_Oper();

		// ���� ������ ternary operator
		// ���ǽ� ? ���1 : ���2
		// ���ǽ��� ����� TRUE �̸� ��� 1, FALSE �̸� ��� 2
		int fatherAge=57;
		int motherAge=54;

		// char ch = ' '; char �ڷ��� �� ���ڷ� �ʱ�ȭ �ϱ�
		char ch ='\u0000'; // char �ڷ��� �����ڵ�� �ʱ�ȭ �ϱ�
		// char MIN_VALUE '\u0000' -> ASCII CODE
		// char MAX_VALUE '\uFFFF' -> ASCII CODE

		boolean bool=fatherAge>motherAge;
		// ���ǹ� ���� ���� boolean �����ڷ� �α� ��� ���� ����
		System.out.println("bool >>> : "+bool);
		ch= (fatherAge > motherAge) ? 'T':'F';
		System.out.println("ch >>> : "+ch);

		if (fatherAge > motherAge){
			System.out.println("true >>> : ");
		} // end of if
		else{
			System.out.println("false >>> : ");
		} // end of end

		/* �ϱ� ������ ����� �����Ѵ�.
		if (fatherAge > motherAge)
			System.out.println("true >>> : ");
		else
			System.out.println("false >>> : ");



	} // end of main method
} // end of Operator_p class