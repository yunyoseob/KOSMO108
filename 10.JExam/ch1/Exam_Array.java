package a.b.c.ch1;


public class Exam_Array {

	// �ܼ� ���ø����̼��� �������̴�.
	public static void main(String args[]) {
	
		// �迭�� ����� ����. 
		// int �� 1���� �迭�� �����Ѵ�.
		// int �� �����ڷ����ε� �̰��� �迭�� �����ϸ� ��ü�� ���Ѵ�.
		int iReferenceVariable[] = new int[3];
		System.out.println("���������� �ּҰ� >>> : " + iReferenceVariable);
		/*
		C:\00.KOSMO108\10.JExam\ch1>java a.b.c.ch1.Exam_Array
		[I@15db9742
		[	1���� �迭 ������ ǥ�� 
		I	int ��
		@	������
		15db9742	����
		*/

		// double �� 2���� �迭�� �����Ѵ�.
		// double �� �����ڷ����ε� �̰��� �迭�� �����ϸ� ��ü�� ���Ѵ�.
		double dReferenceVariable[][] = new double[3][2];
		System.out.println("���������� �ּҰ� >>> : " + dReferenceVariable);
		/*
		[[D@6d06d69c
		[[	2���� �迭 ������ ǥ�� 
		D	double ��
		@	������
		6d06d69c	����
		*/
	} // end of main() 
} // end of Exam_Array class