package a.b.c.ch1;

public class Array_practice_2{
	public void dim_Array(){
		// �迭�� ����غ���.
		// int �� 1���� �迭�� �����Ѵ�. []
		// int�� �����ڷ����ε� �̰��� �迭�� �����ϸ�
		// ��ü�� ���Ѵ�.
		int iReferenceVariable[]= new int[3];
		// Array ���� ����̴�.
		/* �迭 ���� ���
		1���� �迭	 []
		-----------------------
		�ڷ��� �迭��������[] = new �ڷ���[�迭�� ����];
		�ڷ���[] �迭�������� = new �ڷ���[�迭�� ����];

		int��� �ڷ����� �迭���������� iReferenceVariable[]
		���� �������ְ� ���� �����ڸ� ���� new int[]�� �迭�� ��ü��
		�Ҵ��Ͽ� �ش�. �迭 ũ��� 3���� �Ѵ�.
		*/
		System.out.println("�������� �ּ� �� >>> : "+iReferenceVariable);
		// �������� �ּ� �� : [I@15db9742
		// [�� 1���� I�� int @�ڿ��� �ּ�

		// iReferenceVariable[0]; �̷������� ����ϸ� �� ��.
		// iReferenceVariable�� method�� �ƴ϶� ����������.
		int iVal0=iReferenceVariable[0];
		int iVal1=iReferenceVariable[1];
		int iVal2=iReferenceVariable[2];
		System.out.println("iVal0 >>> : "+iVal0+"\n");
		System.out.println("iVal0 >>> : "+iVal1+"\n");
		System.out.println("iVal0 >>> : "+iVal2+"\n");


		// double �� 2���� �迭�� �����Ѵ�. [][]
		/*
		2���� �迭 [][]
		-----------------------
		�ڷ��� �迭��������[][] = new �ڷ���[�迭�� ����][�迭�� ����];
		�ڷ���[][] �迭�������� = new �ڷ���[�迭�� ����]�迭�� ����;
		�ڷ���[] �迭��������[] = new �ڷ���[�迭�� ����]�迭�� ����;
		*/

		double iReferenceVariable_1[][]= new double[1][3];
		System.out.println(" iReferenceVariable_1 �������� �ּ� �� >>> : "+iReferenceVariable_1);
		double iVal0_0=iReferenceVariable_1[0][0];
		double iVal0_1=iReferenceVariable_1[0][1];
		double iVal0_2=iReferenceVariable_1[0][2];
		System.out.println("iVal0_0 >>> : "+iVal0_0+"\n");
		System.out.println("iVal0_1 >>> : "+iVal0_1+"\n");
		System.out.println("iVal0_2 >>> : "+iVal0_2+"\n");


		double dReferenceVariable[][]=new double[3][2];
		// double�̶�� �ڷ����� �迭 ���������� dReferenceVariable[]
		// ���� �������ְ� ���Կ����ڸ� ���� new double[][]�� �迭��
		// ��ü�� �Ҵ��Ͽ� �ش�. �迭 ũ��� 3*2 ��ķ� �Ѵ�.
		System.out.println("�������� �ּ� �� >>> : "+dReferenceVariable);
		// �������� �ּ� ��: [[D@6d06d69c
		// [[�� 2���� �迭 D�� double @ �ڿ��� �ּ�

		// 2���� �迭�� ���������� dReferenceVariable[0][0]; �̷��� ����ϸ� �� �ȴ�.
		double dVal0_0=dReferenceVariable[0][0];
		double dVal0_1=dReferenceVariable[0][1];
	
		double dVal1_0=dReferenceVariable[1][0];
		double dVal1_1=dReferenceVariable[1][1];

		double dVal2_0=dReferenceVariable[2][0];
		double dVal2_1=dReferenceVariable[2][1];

		System.out.println("dVal0_0 >>> : "+dVal0_0+"\n");
		System.out.println("dVal0_1 >>> : "+dVal0_1+"\n");

		System.out.println("dVal1_0 >>> : "+dVal1_0+"\n");
		System.out.println("dVal1_1 >>> : "+dVal1_1+"\n");

		System.out.println("dVal2_0 >>> : "+dVal2_0+"\n");
		System.out.println("dVal2_1 >>> : "+dVal2_1+"\n");
	} // end of one_dim_Array method

	public static void main(String arg[]){
		new Array_practice_2().dim_Array();
	} // end of main method
} // end of Array_practice_2 class