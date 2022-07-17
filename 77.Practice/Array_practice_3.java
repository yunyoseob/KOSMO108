package a.b.c.ch1;

public class Array_practice_3{
	public void byteArray(){
		byte bArr[]=new byte[10];
		// byte Ŭ������ �迭�� �Ҵ��� �ǵ�
		// new��� �ν��Ͻ� �����ڸ� �����ϰ�
		// ũ��� 10���� �Ҵ��Ͽ� �ش�.
		System.out.println("bArr ���� ���� >>> : "+bArr+"\n");

		byte b1=bArr[0];
		byte b10=bArr[9];
		// �ε����� 0���� ������
		// 0�� �Է��ؾ� ù ��° ���� ����.

		System.out.print("bArr 1��° �� >>> : "+b1+"\n");
		System.out.print("bArr 10��° �� >>> : "+b10+"\n");
	}// end of byteArray method

	public void charArray(){
		char cArr[]=new char[10];
		// char Ŭ������ �迭�� �Ҵ��� �ǵ�
		// new��� �ν��Ͻ� �����ڸ� �����ϰ�
		// ũ��� 10���� �Ҵ��Ͽ� �ش�.

		System.out.println("cArr ���� ���� >>> : "+cArr+"\n");
		
		char c1=cArr[0];
		char c10=cArr[9];

		System.out.print("cArr 1��° �� >>> : "+c1+"\n");
		System.out.print("cArr 10��° �� >>> : "+c10+"\n");
	} // end of charArray method

	public void doubleArray(){
		double dArr[]=new double[10];
		// double Ŭ������ new��� �ν��Ͻ� �����ڸ� �����Ͽ�
		// 10�� ũ���� �迭�� �����Ͽ� �ش�.

		System.out.println("dArr ���� ���� >>> : "+dArr+"\n");
		
		double d1=dArr[0];
		double d10=dArr[9];

		System.out.print("dArr 1��° �� >>> : "+d1+"\n");
		System.out.print("dArr 10��° �� >>> : "+d10+"\n");
	} // end of doubleArray method

	public void stringArray(){
		String sArr[] = new String[10];
		System.out.println("sArr �������� >>> : " + sArr+"\n");

		System.out.print("sArr 1��° �� >>> : "+sArr[0]+"\n");
		System.out.print("sArr 10��° �� >>> : "+sArr[9]+"\n");
	
	} // end of stringArray method


	public void stringArray_1(){
		char sArr_1[]=new char[10];
		// String Ŭ������ new��� �ν��Ͻ� �����ڸ�
		// �����Ͽ� 10�� ũ���� �迭�� �����Ͽ� �ش�.
		System.out.println("sArr_1 ���� ���� >>> : "+sArr_1+"\n");
				
		String str=new String(sArr_1);
		System.out.println("str=new String(sArr_1)"+"\n");

		char s1=str.charAt(0);
		char s10=str.charAt(9);

		System.out.print("sArr_1 1��° �� >>> : "+s1+"\n");
		System.out.print("sArr_1 10��° �� >>> : "+s10+"\n");

	} // end of stringArray_1 method

	public static void main(String args[]){
		new Array_practice_3().byteArray();
		new Array_practice_3().charArray();
		new Array_practice_3().doubleArray();
		new Array_practice_3().stringArray();
		new Array_practice_3().stringArray_1();
	} // end of main method

} // end of Array_practice_3 class