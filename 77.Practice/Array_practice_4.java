package a.b.c.ch1;


public class Array_practice_4{

	public void byteArray(){
		
		// �迭�� �����ϰ� JVM�� ������ ������ Ÿ���� ����Ʈ ������ �ʱ�ȭ �Ѵ�.
		byte bArr[] = new byte[3];
		System.out.println("bArr �������� >>> : " + bArr+"\n");
		System.out.println("bArr.length �迭�� ���� ���ϱ� >>> : " + bArr.length+"\n");
		System.out.println("bArr[0] >>> : " + bArr[0]+"\n");
		System.out.println("bArr[1] >>> : " + bArr[1]+"\n");
		System.out.println("bArr[2] >>> : " + bArr[2]+"\n");
		// 0,0,0���� ����� �ȴ�. (default ��)
		
		// �迭�� ���� ���� �� ���ÿ� �ʱ�ȭ �ϱ� 
		byte bArr_1[] = new byte[]{1, 2, 3};
		System.out.println("bArr_1.length �迭�� ���� ���ϱ� >>> : " + bArr_1.length+"\n");
		System.out.println("bArr_1[0] >>> : " + bArr_1[0]+"\n");
		System.out.println("bArr_1[1] >>> : " + bArr_1[1]+"\n");
		System.out.println("bArr_1[2] >>> : " + bArr_1[2]+"\n");
		// 1,2,3 �� �־��ִϱ� 0,0,0�� �ƴ� 1,2,3���� ��µ�.
		
		// �迭�� ���� ���� �� ���ÿ� �ʱ�ȭ �ϸ鼭 new �����ڿ� ������Ÿ�� �����ϱ�  
		byte bArr_2[] = {11, 22, 33};
		System.out.println("bArr_2.length �迭�� ���� ���ϱ� >>> : " + bArr_2.length+"\n");
		System.out.println("bArr_2[0] >>> : " + bArr_2[0]+"\n");
		System.out.println("bArr_2[1] >>> : " + bArr_2[1]+"\n");
		System.out.println("bArr_2[2] >>> : " + bArr_2[2]+"\n");
		// ����������, // 11,22,33 �� �־��ִϱ� 11,22,33�� �ƴ� 1,2,3���� ��µ�.
	}

	public void charArray(){

		// �迭�� �����ϰ� JVM�� ������ ������ Ÿ���� ����Ʈ ������ �ʱ�ȭ �Ѵ�.
		char cArr[] = new char[3];
		System.out.println("cArr �������� >>> : " + cArr+"\n");
		System.out.println("cArr.length �迭�� ���� ���ϱ� >>> : " + cArr.length+"\n");
		System.out.println("cArr[0] >>> : " + cArr[0]+"\n");
		System.out.println("cArr[1] >>> : " + cArr[1]+"\n");
		System.out.println("cArr[2] >>> : " + cArr[2]+"\n");
		// �ƹ��͵� ��µ��� ���� default None
		// �ܼ�â�� null�� ��µǴ� ���� �ƴ϶�, �ƹ��͵� ��µ��� ����.

		// �迭�� ���� ���� �� ���ÿ� �ʱ�ȭ �ϱ� 
		char cArr_1[] = new char[]{'a', 'b', 'c'};
		System.out.println("cArr_1.length �迭�� ���� ���ϱ� >>> : " + cArr_1.length+"\n");
		System.out.println("cArr_1[0] >>> : " + cArr_1[0]+"\n");
		System.out.println("cArr_1[1] >>> : " + cArr_1[1]+"\n");
		System.out.println("cArr_1[2] >>> : " + cArr_1[2]+"\n");
		// a,b,c�� �Է��ϴϱ�, a,b,c�� ��µȴ�.
		
		// �迭�� ���� ���� �� ���ÿ� �ʱ�ȭ �ϸ鼭 new �����ڿ� ������Ÿ�� �����ϱ�  
		char cArr_2[] = {'d', 'e', 'f'};
		System.out.println("cArr_2.length �迭�� ���� ���ϱ� >>> : " + cArr_2.length+"\n");
		System.out.println("cArr_2[0] >>> : " + cArr_2[0]+"\n");
		System.out.println("cArr_2[1] >>> : " + cArr_2[1]+"\n");
		System.out.println("cArr_2[2] >>> : " + cArr_2[2]+"\n");
		// d,e,f�� �Է��ϴϱ� d,e,f�� ��µȴ�.
	}

	public void intArray(){
		int iArr[] = new int[3];
		System.out.println("iArr �������� >>> : " + iArr+"\n");
		System.out.println("iArr.length �迭�� ���� ���ϱ� >>> : " + iArr.length+"\n");
		System.out.println("iArr[0] >>> : "+iArr[0]+"\n");
		System.out.println("iArr[1] >>> : "+iArr[1]+"\n");
		System.out.println("iArr[2] >>> : "+iArr[2]+"\n");
		// 0���� ��µ�. default 0

		// �迭�� ���� ����� ���ÿ� �ʱ�ȭ �ϱ�
		int iArr_1[]= new int[]{1,2,3};
		System.out.print("iArr_1.length �迭�� ���� ���ϱ� >>> : "+iArr_1.length+"\n");
		System.out.print("iArr_1[0] >>> : "+iArr_1[0]+"\n");
		System.out.print("iArr_1[1] >>> : "+iArr_1[1]+"\n");
		System.out.print("iArr_1[2] >>> : "+iArr_1[2]+"\n");
		// 1,2,3�� �Է��ϴ�, 1,2,3���� ��µ�.

		// �迭�� ���� ���� �� ���ÿ� �ʱ�ȭ �ϸ鼭 new �ν��Ͻ� �����ڿ� ������ Ÿ�� �����ϱ�
		int iArr_2[]={1,2,3};
		System.out.print("iArr_2.length �迭�� ���� ���ϱ� >>> : "+iArr_2.length+"\n");
		System.out.print("iArr_2[0] >>> : "+iArr_2[0]+"\n");
		System.out.print("iArr_2[1] >>> : "+iArr_2[1]+"\n");
		System.out.print("iArr_2[2] >>> : "+iArr_2[2]+"\n");
		// ���������� 1,2,3���� ��µ�.
		}

	public void doubleArray(){
		double dArr[] = new double[3];
		System.out.println("dArr �������� >>> : " + dArr);
		System.out.println("dArr.length �迭�� ���� ���ϱ� >>> : " + dArr.length+"\n");
		System.out.println("dArr[0] >>> : "+dArr[0]+"\n");
		System.out.println("dArr[1] >>> : "+dArr[1]+"\n");
		System.out.println("dArr[2] >>> : "+dArr[2]+"\n");
		// 0���� ��µ�. default 0

		// �迭�� ���� ����� ���ÿ� �ʱ�ȭ �ϱ�
		double dArr_1[]=new double[]{4,5,6};
		System.out.println("dArr_1.length �迭�� ���� ���ϱ� >>> : " + dArr_1.length+"\n");
		System.out.println("dArr_1[0] >>> : "+dArr_1[0]+"\n");
		System.out.println("dArr_1[1] >>> : "+dArr_1[1]+"\n");
		System.out.println("dArr_1[2] >>> : "+dArr_1[2]+"\n");
		// 4,5,6�� �Է��ϴϱ� 4.0,5.0,6.0���� �����.
		// int�� �ٸ��� 4,5,6�� �ƴ� 4.0,5.0,6.0���� ��µȴٴ� �鿡�� ���̰� ����

		// �迭�� ���� ����� ���ÿ� �ʱ�ȭ �ϸ鼭 new �ν��Ͻ� �����ڿ� ������ Ÿ�� �����ϱ�
		double dArr_2[]={7,8,9};
		System.out.println("dArr_2.length �迭�� ���� ���ϱ� >>> : "+dArr_2.length+"\n");
		System.out.println("dArr_2[0] >>> : "+dArr_2[0]+"\n");
		System.out.println("dArr_2[1] >>> : "+dArr_2[1]+"\n");
		System.out.println("dArr_2[2] >>> : "+dArr_2[2]+"\n");
		// 7,8,9�� �Է��ϴϱ�, 7.0,8.0,9.0���� ��µ�.
		// �ڷ����� double�̱� ������, ���������� 7,8,9�� �ƴ�
		// 7.0,8.0,9.0���� ��µȴ�.
	}

	public void stringArray(){

		// �迭�� �����ϰ� JVM�� ������ ������ Ÿ���� ����Ʈ ������ �ʱ�ȭ �Ѵ�.
		String sArr[] = new String[3];
		System.out.println("sArr �������� >>> : " + sArr+"\n");
		System.out.println("sArr.length �迭�� ���� ���ϱ� >>> : " + sArr.length+"\n");
		System.out.println("sArr[0] >>> : " + sArr[0]+"\n");
		System.out.println("sArr[1] >>> : " + sArr[1]+"\n");
		System.out.println("sArr[2] >>> : " + sArr[2]+"\n");
		// ���� null�� ��µ�.
		// char���� �ٸ��� �ƹ��͵� ����� �� �Ǵ� ���� �ƴ϶�
		// null���� ��µȴٴ� �鿡�� char�� �ٸ���..
		// default None

		// �迭�� ���� ���� �� ���ÿ� �ʱ�ȭ �ϱ� 
		String sArr_1[] = new String[]{"abc", "def", "ghi"};
		System.out.println("sArr_1.length �迭�� ���� ���ϱ� >>> : " + sArr_1.length+"\n");
		System.out.println("sArr_1[0] >>> : " + sArr_1[0]+"\n");
		System.out.println("sArr_1[1] >>> : " + sArr_1[1]+"\n");
		System.out.println("sArr_1[2] >>> : " + sArr_1[2]+"\n");
		// abc, def, ghi �� �Է��Ͽ� �ִ�
		// abc, def, ghi �� ��µȴ�.

		// �迭�� ���� ���� �� ���ÿ� �ʱ�ȭ �ϸ鼭 new �����ڿ� ������Ÿ�� �����ϱ�  
		String[] sArr_2 = {"abc", "def", "ghi"};
		System.out.println("sArr_2.length �迭�� ���� ���ϱ� >>> : " + sArr_2.length+"\n");
		System.out.println("sArr_2[0] >>> : " + sArr_2[0]+"\n");
		System.out.println("sArr_2[1] >>> : " + sArr_2[1]+"\n");
		System.out.println("sArr_2[2] >>> : " + sArr_2[2]+"\n");
		// ����������, abc, def, ghi�� �Է��ϴ�
		// abc, def, ghi�� ��µȴ�.

		// String�� �ִ� ���ҵ� �� �ɰ����� : Convert String to Char
		String str_1=sArr_2[0];

		System.out.println("sArr_2[0] ù ��° ���� >>> : "+str_1.charAt(0)+"\n");
		System.out.println("sArr_2[0] �� ��° ���� >>> : "+str_1.charAt(1)+"\n");
		System.out.println("sArr_2[0] �� ��° ���� >>> : "+str_1.charAt(2)+"\n");
		// sArr_2�� �ִ� ù ��° ������ abc�� charAt�� �ɰ���
		// ����ϴ�, a,b,c,�� ����.

		String str_2=sArr_2[1];

		System.out.println("sArr_2[1] ù ��° ���� >>> : "+str_2.charAt(0)+"\n");
		System.out.println("sArr_2[1] �� ��° ���� >>> : "+str_2.charAt(1)+"\n");
		System.out.println("sArr_2[1] �� ��° ���� >>> : "+str_2.charAt(2)+"\n");
		// sArr_2�� �ִ� �� ��° ������ def�� charAt�� �ɰ���
		// ����ϴ�, d,e,f�� ����.

		String str_3=sArr_2[2];

		System.out.println("sArr_2[2] ù ��° ���� >>> : "+str_3.charAt(0)+"\n");
		System.out.println("sArr_2[2] �� ��° ���� >>> : "+str_3.charAt(1)+"\n");
		System.out.println("sArr_2[2] �� ��° ���� >>> : "+str_3.charAt(2)+"\n");
		// sArr_2�� �ִ� �� ��° ������ ghi�� charAt�� �ɰ���
		// ����ϴ�, g,h,i�� ����.
	}


	// �ܼ� ���ø����̼��� �������̴�.
	public static void main(String args[]) {
	
		Array_practice_4 ea3 = new Array_practice_4();
		ea3.byteArray();
		ea3.charArray();
		ea3.intArray();
		ea3.doubleArray();
		ea3.stringArray();
		// new Ŭ�����̸�().�޼ҵ��̸�(); ���� ��ü�� ������ �� �ƴ϶�
		// Ŭ�����̸� �������� = new Ŭ�����̸�();
		// ���� ��ü�� ������ ��, �ʿ��� ������ �� ���� ����ϴ� ���

	} // end of main() 
} // end of Array_practice_4 class