package a.b.c.ch1;

public class NumString{
	public static void main(String args[]){
		// ���� ��� : ���ڸ� ���ڿ��� ǥ���� �� : ���ڸ� ���� �����̼����� ���� ��
		String sX="1";
		String sY="2";

		System.out.println(sX+sY);
		// 12�� ��µ�.
		
		// public static int parseInt(String s)
		// static �����ϱ� ��ü �����ʿ� X
		int iX=Integer.parseInt(sX);
		int iY=Integer.parseInt(sY);
		System.out.print(iX+iY);
		// 3�� ��µ�

		System.out.println("\n ���ڿ� ���ϱ� �ϸ� ���ڵ� ���ڿ��� �ȴ�. >>> : ");
		System.out.println(""+iX+iY);
		// �̷��� �ϸ� ���� 3�� ��µ��� �ʰ�, 12�� ��µ�.
		// �տ� ""�� �ٿ���� ����

		System.out.println(""+(iX+iY));
		// �׷��� () �Ұ�ȣ�� iX+iY�� �����ָ�, 3�� ��µ�.

		// ���� ����� ���ڷ� ��ȯ�ϴ� �ٸ� ���
		String sI="1";
		String sL="11";
		String sF="1.123";
		String sD="1.1";
		// String�̱� ������ "" ū ����ǥ ���
		
		// public static int parseInt(String s)
		// ���׿� int�� �����ڷ���
		// ���׿� Integer�� ��ü �ȿ� �����ڷ���
		int iVal=Integer.parseInt(sI);
		
		// public static long parseLong(String s)
		// ���׿� long�� ������ long�� ������.
		// ���׿� long�� �����ڷ���
		// ���׿� Long�� ��ü �ȿ� �����ڷ���
		// Ŭ������ ù ���ڴ� ���� �����Ѵ�? �빮��
		long lVal=Long.parseLong(sL);
		
		// public static float parseFloat(String s)
		// ���׿� float�� �����ڷ���
		// ���׿� Float�� ��ü �ȿ� �����ڷ���
		float fVal=Float.parseFloat(sF);

		// public static double parseDouble(String s)
		// ���ʿ� double�� �����ڷ���
		// �����ʿ� Double�� ��ü �ȿ� �����ڷ���
		double dVal=Double.parseDouble(sD);
		

		System.out.println("iVal >>> : "+iVal);
		// 1
		System.out.println("lVal >>> : "+lVal);
		// 11
		System.out.println("fVal >>> : "+fVal);
		// 1.123
		System.out.println("dVal >>> : "+dVal);
		// 1.1

		// ���ڸ� ���ڷ� ��ȯ
		int nInt =100;
		long nLong=101L;
		float nFloat=1.01F;
		double nDouble=1.001D;
		// int�� �����ϰ�� ���� �ڷ����� ���� �������� L,F,D�� �ٿ���
		
		// public String toString()
		String sInt=Integer.toString(nInt);
		String sLong=Long.toString(nLong);
		String sFloat=Float.toString(nFloat);
		String sDouble=Double.toString(nDouble);

		System.out.println("sInt >>> : "+sInt);
		// 100
		System.out.println("sLong >>> : "+sLong);
		// 101
		System.out.println("sFloat >>> : "+sFloat);
		// 101
		System.out.println("nDouble >>> : "+nDouble);
		// 1.01
		
		// public static String valueOf(int i)
		String s0=String.valueOf(nInt);
		// public static String valueOf(long l)
		String s1=String.valueOf(nLong);
		// public static String valueOf(float f)
		String s2=String.valueOf(nFloat);
		// public static String valueOf(double d)
		String s3=String.valueOf(nDouble);

		System.out.println("s0 >>> : "+s0);
		// 100
		System.out.println("s1 >>> : "+s1);
		// 101
		System.out.println("s2 >>> : "+s2);
		// 1.01
		System.out.println("s3 >>> : "+s3);
		// 1.001

		String ss = nInt + ""; //����� ��������
		System.out.println("ss >>> : "+ss);
		// 100
	} // end of main method
} // end of NumString class