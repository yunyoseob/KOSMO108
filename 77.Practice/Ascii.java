package ascii.code;

public class Ascii{
	public static void main(String args[]){
		String s="A";
		
		// public char charAt(int index)
		char ch_L=s.charAt(0);

		for (int i=ch_L; i<(ch_L+26);i++){
		// ������ ��ȯ 
		// char�� 16��Ʈ(���� ����)�� 2����Ʈ�̴�.
		// int�� 32��Ʈ�� 4����Ʈ�̴�. ���� ����Ʈ��
		// ū ����Ʈ�� �ٲٴ� ���̶� ĳ���� �����ڸ� ���� �ʾ���
		
		System.out.print((char)i + " ");
		// ����� ����ȯ int�� 32��Ʈ�� 4����Ʈ�ε�
		// char�� 16��Ʈ ���� ������ 2����Ʈ�̴�.
		// ū ����Ʈ���� ���� ����Ʈ�� �ٲٴ� ���̶�
		// ĳ���� �����ڸ� ǥ���Ͽ� �ش�.

		System.out.print(i+" ");
		// �������� ���� ���� ���� �� ĭ�� �߰����־���.

		//public static String toBinaryString(int i)
		System.out.print("0b"+Integer.toBinaryString(i)+" ");

		// public static String toOctalString(int i)
		System.out.print("0"+Integer.toOctalString(i)+" ");

		// public static String toHexString(int i)
		System.out.print("0x"+Integer.toHexString(i)+" ");
		System.out.print("0X"+Integer.toHexString(i)+" ");
		System.out.println();	
		} // end of for keyword
		System.out.println();

		// public String toLowerCase()
		String s3=s.toLowerCase();
		// static�� ����

		char ch_S=s3.charAt(0);

		for (int i=ch_S; i<(ch_S+26); i++){
			System.out.print((char)i+" ");
			System.out.print(i+" ");
			System.out.print("0b"+Integer.toBinaryString(i)+" ");
			System.out.print("0"+Integer.toOctalString(i)+" ");
			System.out.print("0X"+Integer.toHexString(i)+" ");
			System.out.println();
		}// end of for

	} // end of main method
} // end of Ascii class