package a.b.c.ch1;

/*
public static final int BYTES 4
public static final int MAX_VALUE 2147483647
public static final int MIN_VALUE -2147483648
public static final int SIZE 32

������ �����ؼ� ������ ���� �ʱ�ȭ �ؼ� �ֿܼ� ����Ͻÿ�.
�������� ������ �˾Ƽ� ����� ����
*/

public class Integer_Practice{
	public static void main(String args[]){
		int bbytes=Integer.BYTES;
		int bmax=Integer.MAX_VALUE;
		int bmin=Integer.MIN_VALUE;
		int is=Integer.SIZE;
		
		System.out.println("public static fianl int BYTES"+bbytes);
		System.out.println("public static final int MAX_VALUE"+bmax);
		System.out.println("public static final int MIN_VALUE"+bmin);
		System.out.println("public static final int SIZE"+is);
	}
}