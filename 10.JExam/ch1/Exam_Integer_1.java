package a.b.c.ch1;

/*
public static final int	BYTES		4
public static final int	MAX_VALUE	2147483647
public static final int	MIN_VALUE	-2147483648
public static final int	SIZE		32

������ �����ؼ� ������ ���� �ʱ�ȭ �ؼ� �ֿܼ� ����Ͻÿ� 
�������� ������ �˾Ƽ� ����� ���� 
*/

public class Exam_Integer_1{

	public static void main(String args[]) {
		int intBytes = Integer.BYTES;		
		/*
		Class Integer.BYTES 
		The number of bytes used to represent a int value in two's complement
		binary form

		1. int ��������(�ڷ���)�� ���� : MAX_VALUE ������ ��������(�ڷ���)�� int �̱� ������ 
		2. int �� �����͸� ���� ������ intMax �� ���� : �������� ���������� �����ϱ� ���� ����Ѵ�.
		3. = : ���� ������ ���� 
		4. Integer.MAX_VALUE : int �� �������� ����Ʈ ũ�⸦ ������ �ִ� Integer ���� Ŭ������ MAX_VALUE ��� �̴�. 
							  ���⿡  int �� 2147483647 ���� �ʱ�ȭ �Ǿ� �ִ�. 	
		*/
		int intMax = Integer.MAX_VALUE;
		
		/*
		Class Integer.MAX_VALUE
		A constant holding the maximum value an int can have 2^31-1.

		1. int ��������(�ڷ���)�� ���� : MAX_VALUE ������ ��������(�ڷ���)�� int �̱� ������ 
		2. int �� �����͸� ���� ������ intMax �� ���� : �������� ���������� �����ϱ� ���� ����Ѵ�.
		3. = : ���� ������ ���� 
		4. Integer.MAX_VALUE : int �� �������� ����Ʈ ũ�⸦ ������ �ִ� Integer ���� Ŭ������ MAX_VALUE ��� �̴�. 
							  ���⿡  int �� 2147483647 ���� �ʱ�ȭ �Ǿ� �ִ�. 

		*/
		int intMin = Integer.MIN_VALUE;
		
		/*
		Class Integer.MIN_VALUE
		A constant holding the minimum value an int can have -2^31

		1. int ��������(�ڷ���)�� ���� : MIN_VALUE ������ ��������(�ڷ���)�� int �̱� ������ 
		2. int �� �����͸� ���� ������ intMin �� ���� : �������� ���������� �����ϱ� ���� ����Ѵ�.
		3. = : ���� ������ ���� 
		4. Integer.MIN_VALUE : int �� �������� ����Ʈ ũ�⸦ ������ �ִ� Integer ���� Ŭ������ MIN_VALUE ��� �̴�. 
							  ���⿡  int �� -2147483648 ���� �ʱ�ȭ �Ǿ� �ִ�.	
		*/
		int intBits = Integer.SIZE;
		/*
		Class Integer.SIZE
		The number of bits used to represent an int value in two's complement
		binary form.

		1. int ��������(�ڷ���)�� ���� : SIZE ������ ��������(�ڷ���)�� int �̱� ������ 
		2. int �� �����͸� ���� ������ intBits �� ���� : �������� ���������� �����ϱ� ���� ����Ѵ�.
		3. = : ���� ������ ���� 
		4. Integer.SIZE : int �� �������� ����Ʈ ũ�⸦ ������ �ִ� Integer ���� Ŭ������ SIZE ��� �̴�. 
						  ���⿡  int �� ��Ʈ ũ�Ⱑ  32 ��Ʈ�� �ʱ�ȭ �Ǿ� �ִ�. 
		*/

		System.out.println("int intBytes >>> : " + intBytes);
		System.out.println("int intMax >>> : " + intMax);
		System.out.println("int intMin >>> : " + intMin);
		System.out.println("int intBits >>> : " + intBits);
	}
}


