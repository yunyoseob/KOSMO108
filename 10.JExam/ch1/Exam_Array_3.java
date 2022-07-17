package a.b.c.ch1;

//VO : Value Object

public class Exam_Array_3 {

	public void byteArray(){
		
		// �迭�� �����ϰ� JVM�� ������ ������ Ÿ���� ����Ʈ ������ �ʱ�ȭ �Ѵ�.
		byte bArr[] = new byte[3];
		System.out.println("bArr �������� >>> : " + bArr);
		System.out.println("bArr.length �迭�� ���� ���ϱ� >>> : " + bArr.length);
		System.out.println("bArr[0] >>> : " + bArr[0]);
		System.out.println("bArr[1] >>> : " + bArr[1]);
		System.out.println("bArr[2] >>> : " + bArr[2]);
		
		// �迭�� ���� ���� �� ���ÿ� �ʱ�ȭ �ϱ� 
		byte bArr_1[] = new byte[]{1, 2, 3};
		System.out.println("bArr_1.length �迭�� ���� ���ϱ� >>> : " + bArr_1.length);
		System.out.println("bArr_1[0] >>> : " + bArr_1[0]);
		System.out.println("bArr_1[1] >>> : " + bArr_1[1]);
		System.out.println("bArr_1[2] >>> : " + bArr_1[2]);
		
		// �迭�� ���� ���� �� ���ÿ� �ʱ�ȭ �ϸ鼭 new �����ڿ� ������Ÿ�� �����ϱ�  
		byte bArr_2[] = {11, 22, 33};
		System.out.println("bArr_2.length �迭�� ���� ���ϱ� >>> : " + bArr_2.length);
		System.out.println("bArr_2[0] >>> : " + bArr_2[0]);
		System.out.println("bArr_2[1] >>> : " + bArr_2[1]);
		System.out.println("bArr_2[2] >>> : " + bArr_2[2]);

		byte bArr_3[];
		bArr_3 = new byte[]{11, 22, 33};
	}

	public void charArray(){

		// �迭�� �����ϰ� JVM�� ������ ������ Ÿ���� ����Ʈ ������ �ʱ�ȭ �Ѵ�.
		char cArr[] = new char[3];
		System.out.println("cArr �������� >>> : " + cArr);
		System.out.println("cArr.length �迭�� ���� ���ϱ� >>> : " + cArr.length);
		System.out.println("cArr[0] >>> : " + cArr[0]);
		System.out.println("cArr[1] >>> : " + cArr[1]);
		System.out.println("cArr[2] >>> : " + cArr[2]);

		// �迭�� ���� ���� �� ���ÿ� �ʱ�ȭ �ϱ� 
		char cArr_1[] = new char[]{'a', 'b', 'c'};
		System.out.println("cArr_1.length �迭�� ���� ���ϱ� >>> : " + cArr_1.length);
		System.out.println("cArr_1[0] >>> : " + cArr_1[0]);
		System.out.println("cArr_1[1] >>> : " + cArr_1[1]);
		System.out.println("cArr_1[2] >>> : " + cArr_1[2]);
		
		// �迭�� ���� ���� �� ���ÿ� �ʱ�ȭ �ϸ鼭 new �����ڿ� ������Ÿ�� �����ϱ�  
		char cArr_2[] = {'d', 'e', 'f'};
		System.out.println("cArr_2.length �迭�� ���� ���ϱ� >>> : " + cArr_2.length);
		System.out.println("cArr_2[0] >>> : " + cArr_2[0]);
		System.out.println("cArr_2[1] >>> : " + cArr_2[1]);
		System.out.println("cArr_2[2] >>> : " + cArr_2[2]);
	}

	public void intArray(){
		int iArr[] = new int[3];
		System.out.println("iArr �������� >>> : " + iArr);
		System.out.println("iArr.length �迭�� ���� ���ϱ� >>> : " + iArr.length);
	}

	public void doubleArray(){
		double dArr[] = new double[3];
		System.out.println("dArr �������� >>> : " + dArr);
		System.out.println("dArr.length �迭�� ���� ���ϱ� >>> : " + dArr.length);
	}

	public void stringArray(){

		// �迭�� �����ϰ� JVM�� ������ ������ Ÿ���� ����Ʈ ������ �ʱ�ȭ �Ѵ�.
		String sArr[] = new String[3];
		System.out.println("sArr �������� >>> : " + sArr);
		System.out.println("sArr.length �迭�� ���� ���ϱ� >>> : " + sArr.length);
		System.out.println("sArr[0] >>> : " + sArr[0]);
		System.out.println("sArr[1] >>> : " + sArr[1]);
		System.out.println("sArr[2] >>> : " + sArr[2]);

		// �迭�� ���� ���� �� ���ÿ� �ʱ�ȭ �ϱ� 
		String sArr_1[] = new String[]{"abc", "def", "ghi"};
		System.out.println("sArr_1.length �迭�� ���� ���ϱ� >>> : " + sArr_1.length);
		System.out.println("sArr_1[0] >>> : " + sArr_1[0]);
		System.out.println("sArr_1[1] >>> : " + sArr_1[1]);
		System.out.println("sArr_1[2] >>> : " + sArr_1[2]);
		
		// �迭�� ���� ���� �� ���ÿ� �ʱ�ȭ �ϸ鼭 new �����ڿ� ������Ÿ�� �����ϱ�  
		String[] sArr_2 = {"abc", "def", "ghi"};
		System.out.println("sArr_2.length �迭�� ���� ���ϱ� >>> : " + sArr_2.length);
		System.out.println("sArr_2[0] >>> : " + sArr_2[0]);
		System.out.println("sArr_2[1] >>> : " + sArr_2[1]);
		System.out.println("sArr_2[2] >>> : " + sArr_2[2]);
	}


	// �ܼ� ���ø����̼��� �������̴�.
	public static void main(String args[]) {
	
		Exam_Array_3 ea3 = new Exam_Array_3();
		ea3.byteArray();
		ea3.charArray();
		ea3.intArray();
		ea3.doubleArray();
		ea3.stringArray();

	} // end of main() 
} // end of Exam_Array_3 class