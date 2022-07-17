package a.b.c.ch1;

/*
�ϱ�	main() �Լ��� �ʱ�ȭ �� �������� 5���� 16������ �ֿܼ� ����Ͻÿ� 
��:	�Լ��� ���� main() �Լ����� �� �Լ��� ȣ���ؼ� ���� ��Ű�ÿ�
	�ֿܼ� 16������ ����� ���� 0x �� �ٿ��� ����Ͻÿ�
�Լ� �̸� toHex_S0(), toHex_S1(), toHex_S2(), toHex_S3(), toHex_S4()

16:45 ���� �ϱ� 
*/
public class Exam_For_p {


	public void toHex_S0(String str) {
		
		System.out.println("Exam_For_6.toHex_S0() �Լ� ���� >>> : ");


		if (str !=null && str.length() > 0){

			char c = ' ';


			for (int i=0; i < str.length(); i++ ){

 
				c = str.charAt(i);

				System.out.print(c + " ");


				System.out.print("0x" + Integer.toHexString(c) + " ");
				System.out.println();
			}
		}
	}

	public void toHex_S1(String str) {
		System.out.println("Exam_For_6.toHex_S1() �Լ� ���� >>> : ");

		if (str !=null && str.length() > 0){
			char c = ' ';
			for (int i=0; i < str.length(); i++ ){
				c = str.charAt(i);
				System.out.print(c + " ");
				System.out.print("0x" + Integer.toHexString(c) + " ");
				System.out.println();
			}
		}
	}

	public void toHex_S2(String str) {
		System.out.println("Exam_For_6.toHex_S2() �Լ� ���� >>> : ");

		if (str !=null && str.length() > 0){
			char c = ' ';
			for (int i=0; i < str.length(); i++ ){
				c = str.charAt(i);
				System.out.print(c + " ");
				System.out.print("0x" + Integer.toHexString(c) + " ");
				System.out.println();
			}
		}
	}

	public void toHex_S3(String str) {
		System.out.println("Exam_For_6.toHex_S3() �Լ� ���� >>> : ");

		if (str !=null && str.length() > 0){
			char c = ' ';
			for (int i=0; i < str.length(); i++ ){
				c = str.charAt(i);
				System.out.print(c + " ");
				System.out.print("0x" + Integer.toHexString(c) + " ");
				System.out.println();
			}
		}
	}

	public void toHex_S4(String str) {
		System.out.println("Exam_For_6.toHex_S4() �Լ� ���� >>> : ");

		if (str !=null && str.length() > 0){
			char c = ' ';
			for (int i=0; i < str.length(); i++ ){
				c = str.charAt(i);
				System.out.print(c + " ");
				System.out.print("0x" + Integer.toHexString(c) + " ");
				System.out.println();
			}
		}
	}

	public static void main(String args[]) {
		// String Ŭ������ ���������� ���� �ʱ�ȭ �ߴ�.

		// C:\00.KOSMO108\10.JExam\ch1>java a.b.c.ch1.Exam_FlowControl_4 1 2
		// String args[] = new String[]{"��� ����"};
		// String args[] = {"��� ����"};
		
		// s0,s1,s2,s3,s4�� main �Լ��� ��� ������
		// ���������Ƿ�, s0,s1,s2,s3,s4�� ���������̴�.

		String s0 = "abcdefghijklmnopqrstuvwxyz";


		// �ҹ��ڸ� ���� �빮�ڷ� �ٲ��ش�.
		String s1 = s0.toUpperCase();

		// ���⼭ s1�� ���������̴�.
		String s2 = "0123456789";

		String s3 = "*+-/";

		String s4 = "!@#%%^&*";

		// ����� ���� Exam_For_p() Ŭ������
		// �ν��Ͻ��Ѵ�.
		// �� ���� toHex_S0 �Լ��� ȣ���Ѵ�.
		// Exam_For_p() : ������
		// toHex_S0 �Լ��� ȣ���� ����
		// �μ�(�ƱԸ�Ʈ��) s0 ���������� �Ѱ��ش�.
		// s0 ������������ ������ �ҹ��� �ʱ�ȭ �Ǿ� �ִ�.
		new Exam_For_p().toHex_S0(s0);
		// �μ��� ������ -> �Լ��� �Ķ���Ͱ�
		// �ʱ�ȭ


		new Exam_For_p().toHex_S1(s1);


		new Exam_For_p().toHex_S2(s2);


		new Exam_For_p().toHex_S3(s3);


		new Exam_For_p().toHex_S4(s4);