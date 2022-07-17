package a.b.c.ch1;

public class Exam_Byte {

	public static void main(String args[]) {

		System.out.println("byte�� ũ��� 1 ����Ʈ >>> : " + Byte.BYTES);
		// BYTES : The number of bytes used to represent a byte value in
		// two's complement binary form
		System.out.println("byte�� ������ 8 ��Ʈ >>> : " + Byte.SIZE);
		// SIZE : The number of bits used to represent a byte value in two's
		// complement binary form.

		byte bMax = Byte.MAX_VALUE;
		System.out.println("byte�� �ִ밪 :: Byte.MAX_VALUE >>> : " + bMax);
		// MAX_VALUE : A constant holding the maximum value a byte can have 2^7-1.
		
		byte bMin = Byte.MIN_VALUE;
		System.out.println("byte�� �ּҰ� :: Byte.MIN_VALUE >>> : " + bMin);
		// MIN_VALUE : A constant holding the minimum value a byte can have -2^7

		//byte b_1 = 128;
		//System.out.println("b_1 >>> : " + b_1);

		//byte b_2 = -129;
		//System.out.println("b_2 >>> : " + b_2);


	
	}
}