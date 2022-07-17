package a.b.c.ch1;


public class Exam_Array_1 {

	// �ܼ� ���ø����̼��� �������̴�.
	public static void main(String args[]) {
	
		// �迭�� ����� ����. 
		// int �� 1���� �迭�� �����Ѵ�.
		// int �� �����ڷ����ε� �̰��� �迭�� �����ϸ� ��ü�� ���Ѵ�.
		/*
		1.	int ������ Ÿ�� �ڷ����� �����Ѵ�.
		2.	iReferenceVariable ���������� �����Ѵ�.
		3.	[] ���ȣ braket �迭������ �Ѱ��� �����Ѵ� --> 1���� �迭�� �����Ѵ�.
		4.	= ���� �����ڸ� �����Ѵ�.
		5.	new �ν��Ͻ� �����ڸ� �����Ѵ�. 
		6.	int ������ Ÿ���� �����ϰ� [] �����ڿ� ���ڸ� �ο��Ѵ�. ���⼭�� 3�� �ִ´�.
		7.	�ڹ� ��ö�ӽ��� int[3] ������ ���� 
			int �� ������ ���ڸ� 3���� ����� �ű⿡ default ������ �ʱ�ȭ �Ѵ�.
			�� ���ڿ� int ���� �������� 0 �� �ʱ�ȭ �ȴ�.
		*/
		int iReferenceVariable[] = new int[3];
		System.out.println("���������� �ּҰ� >>> : " + iReferenceVariable);
		
		/*
		�� int �� ���ڿ� �ʱ�ȭ �� ���� 
		0, 1, 2 index ������ ȣ���ؼ� ����� �� �ִ�. 
		*/
		// iReferenceVariable[0];
		int iVal0 =  iReferenceVariable[0];
		int iVal1 =  iReferenceVariable[1];
		int iVal2 =  iReferenceVariable[2];
		System.out.println("iVal0 >>> : " + iVal0);
		System.out.println("iVal1 >>> : " + iVal1);
		System.out.println("iVal2 >>> : " + iVal2);


		// double �� 2���� �迭�� �����Ѵ�.
		// double �� �����ڷ����ε� �̰��� �迭�� �����ϸ� ��ü�� ���Ѵ�.
		// new double[3][2] ��⼭ 3 �� ���� ��, 2 ���� �� <-- 219��
		double dReferenceVariable[][] = new double[3][2];
		System.out.println("���������� �ּҰ� >>> : " + dReferenceVariable);

		double dVal00 = dReferenceVariable[0][0];
		double dVal01 = dReferenceVariable[0][1];
		System.out.println("dVal00 >>> : " + dVal00);
		System.out.println("dVal01 >>> : " + dVal01);
		double dVal10 = dReferenceVariable[1][0];
		double dVal11 = dReferenceVariable[1][1];
		System.out.println("dVal10 >>> : " + dVal10);
		System.out.println("dVal11 >>> : " + dVal11);
		double dVal20 = dReferenceVariable[2][0];
		double dVal21 = dReferenceVariable[2][1];
		System.out.println("dVal20 >>> : " + dVal20);
		System.out.println("dVal21 >>> : " + dVal21);

	} // end of main() 
} // end of Exam_Array_1 class