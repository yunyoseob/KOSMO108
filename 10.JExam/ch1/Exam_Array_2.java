package a.b.c.ch1;


public class Exam_Array_2 {

	public void byteArray(){
		byte bArr[] = new byte[10];
		System.out.println("bArr �������� >>> : " + bArr);
		System.out.println("bArr.length �迭�� ���� ���ϱ� >>> : " + bArr.length + "\n"
							+ "byte Ÿ���� ���ڰ� 10�� �ִ�. \n"
							+ "index �� 0 ~ 9 �����̴�. \n"
							+ "index = �迭���ڰ��� - 1 �̴� \n"
							+ "index �� 0 ���� �����ϱ� �����̴�. \n");
	}

	public void charArray(){
		char cArr[] = new char[10];
		System.out.println("cArr �������� >>> : " + cArr);
	}

	public void intArray(){
		int iArr[] = new int[10];
		System.out.println("iArr �������� >>> : " + iArr);
	}

	public void doubleArray(){
		double dArr[] = new double[10];
		System.out.println("dArr �������� >>> : " + dArr);
	}

	public void stringArray(){
		String sArr[] = new String[10];
		System.out.println("sArr �������� >>> : " + sArr);
	}

	// �ܼ� ���ø����̼��� �������̴�.
	public static void main(String args[]) {
	
		Exam_Array_2 ea2 = new Exam_Array_2();
		ea2.byteArray();
		ea2.charArray();
		ea2.intArray();
		ea2.doubleArray();
		ea2.stringArray();

	} // end of main() 
} // end of Exam_Array_2 class