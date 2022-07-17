package a.b.c.ch1;

// length() : ���� �Լ� : String Ŭ������ ���ڿ� ���̸� ���ϴ� �Լ� 
// length : ���� �ʵ� : �迭�� ����

public class Exam_For_7_1 {

	// forTest �Լ��� ���ϰ����� �����Ѵ�.
	// �Ű������� int �� �迭�̴�. 
	// int  �� �迭�� ���������� iArr_forTest �̴�. 
	// forTest �Լ��� ȣ���� ���� �μ�(�ƱԸ�Ʈ)��  int �� �迭�� ���������� �Ѱܾ� �Ѵ�.
	// �� �������� �������� �ʾƵ� �ȴ�.
	/*
		Exam_For_7_1 ef7_1 = new Exam_For_7_1();
		ef7_1.forTest(iArr_main);
	
		int iArr_forTest[] = iArr_main;	
		public void forTest(int iArr_forTest[]){}
	*/
	public void forTest(int iArr_forTest[]) {
		System.out.println("Exam_For_7_1.forTest() �Լ� ���� >>> : ");
		System.out.println("Exam_For_7_1.forTest() �Լ� iArr_forTest >>> : " 
							+ iArr_forTest);

		// �������� : �迭�� ���̸� üũ�ϱ� ���ؼ� 
		int iArrLen = 0;

		// forTest �� �Ű����� �Ѿ�� iArr_forTest �迭 ���������� �����Ͱ� �ִ��� ������ üũ�ϴ� ��
		// �迭�� ��ü�̱� ������ null(iArr_forTest !=null) 
		// �� ����(iArr_forTest.length > 0)�� üũ�Ѵ�.
		if (iArr_forTest !=null && iArr_forTest.length > 0){

			// �迭�� ���� üũ 
			iArrLen = iArr_forTest.length;
			System.out.println("iArrLen �迭�� ���� >>> : " + iArrLen);

			// for ���� �̿��ؼ� �迭�� ���� ��ŭ �迭�� �����͸� �ֿܼ� ����ϱ� 
			for (int i=0; i < iArrLen; i++ ){
				System.out.println("iArr_forTest[" + i + "] >>> : " + iArr_forTest[i]);
			}

		}else{
			System.out.println("iArr_forTest ���������� null �̰ų� �����Ͱ� ����� >>> : " 
								+ iArr_forTest);
		}
	}


	public static void main(String args[]) {
	
		// int iArr[] = new iArr[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

		// ���� ���� 
		// int �����ڷ��� �ε� �迭�� �ν��Ͻ� �ؼ� ��ü�̸鼭 ���������� ����Ѵ�.
		// iArr_main : �������� 
		// int �� �迭�� iArr_main �������� 1���� �迭�� ���� �� ���� �ʱ�ȭ �ߴ�.
		int iArr_main[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println("iArr_main �迭�� �������� �ּҰ� >>> : " + iArr_main);
		
		// ����� ���� Exam_For_7_1 Ŭ������ ����ϱ� ���� �ν��Ͻ� �ߴ�(�޸𸮿� �÷ȴ�).
		// ���� ������ ef7_1 �̴�. 
		Exam_For_7_1 ef7_1 = new Exam_For_7_1();
		System.out.println("ef7_1 �������� �ּҰ� >>> : " + ef7_1);
		
		// ���� ���� ef7_1 �� �̿��ؼ� Exam_For_7_1 Ŭ������ �ڿ� �� 
		// forTest() �Լ��� ȣ���ϰ� �Լ��� �Ű������� �μ� iArr_main �迭 ���������� �Ѱ��ش�.
		// iArr_main : �μ�, �ƱԸ�Ʈ, argument
		// �޸𸮿� �ö� forTest �Լ��� ����Ʈ��Ʈ ������� ���� �ȴ� .
		ef7_1.forTest(iArr_main);
	}
}