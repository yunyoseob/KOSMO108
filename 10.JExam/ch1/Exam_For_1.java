package a.b.c.ch1;


public class Exam_For_1 {

	void for_1() {
		System.out.println("Exam_For_1.for_1() �Լ� �� ���� ");
		for (int i=0; ; ){
			System.out.println("i >>> : " + i);
		}
	}

	void for_2() {
		System.out.println("Exam_For_1.for_2() �Լ� �� ���� ");		
		int i=0;
		for (; ; ){
			System.out.println("i >>> : " + i);
		}
	}

	void for_3() {
		System.out.println("Exam_For_1.for_3() �Լ� �� ���� ");		
		int i;
		for (i=0; ; ){
			System.out.println("i >>> : " + i);
		}
	}

	void for_4() {
		System.out.println("Exam_For_1.for_4() �Լ� �� ���� ");		
		int i;
		for (i=0; i < 3;){
			System.out.println("(" + i + " < 3) >>> : " + (i < 3));
			System.out.println("for {} �� ���� ::: i >>> : " + i);
		}
	}


	void for_5() {
		System.out.println("Exam_For_1.for_5() �Լ� �� ���� ");		
		int i;
		for (i=0; i < 3; i++){
			System.out.println("(" + i + " < 3) >>> : " + (i < 3));
			System.out.println("for {} �� ���� ::: i >>> : " + i + "\n");
		}
	}


	void for_6() {
		System.out.println("Exam_For_1.for_6() �Լ� �� ���� ");		
		int i;
		for (i=0; i < 3; i++){
			System.out.println("(" + i + " < 3) >>> : " + (i < 3));
			System.out.println("for {} �� ���� ::: i >>> : " + i + "\n");
		}
		System.out.println("for {} �� �ܺ� ::: i >>> : " + i);
	}

	void for_7() {
		System.out.println("Exam_For_1.for_7() �Լ� �� ���� ");
		for (int i=0; i < 3; i++){
			System.out.println("(" + i + " < 3) >>> : " + (i < 3));
			System.out.println("for {} �� ���� ::: i >>> : " + i);
		}
		System.out.println("for {} �� �ܺ� ::: i >>> : " + i);
	}

	public static void main(String args[]) {

		// ����� �μ� ���� üũ�ϱ� 
		if (args.length == 1){

			String sVal = args[0];

			if (sVal !=null && sVal.length() > 0){

				if ("1".equals(sVal)){
					
					System.out.println("�Լ� ���� ��ȣ 1 ���� >>> : ");
					System.out.println("Exam_For_1() Ŭ������ �ν��Ͻ� �ؼ�(�޸𸮿� �÷���)");
					System.out.println("for_1() �Լ� ȣ�� >>> : \n");					
					new Exam_For_1().for_1();
				}
				if ("2".equals(sVal)){
					
					System.out.println("�Լ� ���� ��ȣ 2 ���� >>> : ");
					System.out.println("Exam_For_1() Ŭ������ �ν��Ͻ� �ؼ�(�޸𸮿� �÷���)");
					System.out.println("for_2() �Լ� ȣ�� >>> : \n");
					new Exam_For_1().for_2();
				}
				if ("3".equals(sVal)){
					
					System.out.println("�Լ� ���� ��ȣ 3 ���� >>> : ");
					System.out.println("Exam_For_1() Ŭ������ �ν��Ͻ� �ؼ�(�޸𸮿� �÷���)");
					System.out.println("for_3() �Լ� ȣ�� >>> : \n");
					new Exam_For_1().for_3();
				}
				if ("4".equals(sVal)){
					
					System.out.println("�Լ� ���� ��ȣ 4 ���� >>> : ");
					System.out.println("Exam_For_1() Ŭ������ �ν��Ͻ� �ؼ�(�޸𸮿� �÷���)");
					System.out.println("for_4() �Լ� ȣ�� >>> : \n");
					new Exam_For_1().for_4();
				}
				if ("5".equals(sVal)){
					
					System.out.println("�Լ� ���� ��ȣ 5 ���� >>> : ");
					System.out.println("Exam_For_1() Ŭ������ �ν��Ͻ� �ؼ�(�޸𸮿� �÷���)");
					System.out.println("for_5() �Լ� ȣ�� >>> : \n");
					new Exam_For_1().for_5();
				}
				if ("6".equals(sVal)){
					
					System.out.println("�Լ� ���� ��ȣ 6 ���� >>> : ");
					System.out.println("Exam_For_1() Ŭ������ �ν��Ͻ� �ؼ�(�޸𸮿� �÷���)");
					System.out.println("for_6() �Լ� ȣ�� >>> : \n");
					new Exam_For_1().for_6();
				}
				if ("7".equals(sVal)){
					
					System.out.println("�Լ� ���� ��ȣ 7 ���� >>> : ");
					System.out.println("Exam_For_1() Ŭ������ �ν��Ͻ� �ؼ�");
					System.out.println("for_7() �Լ� ȣ�� >>> : ");
					new Exam_For_1().for_7();
				}
			}else{
				System.out.println("sVal �� �����Ͱ� �����ϴ�. >>> : ");	
			}
		}else{
			System.out.println("�Լ� ���� ��ȣ�� �Է� �Ͻÿ� >>> : ");
		}		
	}
}