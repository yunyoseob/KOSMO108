package a.b.c.ch1;

// ���� 112 ��
// � ���� ���� � ���� ���� �ݺ� ���� 
// from        to          loop
public class Exam_For {

	public static void main(String args[]) {

		// �ڹٿ��� for 
		// for Ű����
		// (�ʱ�ȭ��; ���ǽ�; ������) �Ұ�ȣ 
		//		�ʱ�ȭ�� : ������Ÿ�� ���� ���� ���� = �� �ʱ�ȭ; int i = 0;
		//		���ǽ� : boolean = 1 < 5;
		//		������ : �ʱ�ȭ �Ŀ� ������ ������ �̿��ؼ� �������� ����. i++
		//		������ �����ڴ� : ����, ����, ++, --, ��� �����̵� ��밡���ϴ�.
		// { �ݺ������� ǥ����;} �߰�ȣ 

		// �ڹٿ����� for Ű���带 �ڹ� ��ö�ӽ��� ���� 
		// for Ű���� �ڿ� () �� ������ ������ �ݺ� �����Ѵ�. 

		/*
		for (�ʱ�ȭ��; ���ǽ� ; ������) {
			�ʱ�ȭ �Ŀ��� ������ ������ ����Ѵ�. 
			System.out.println(">>>>");
		}
		*/

		/*
		for (int i=0; ; ){
			System.out.println("i >>> : " + i);
		}
		*/
		/*
		int i=0;
		for (; ; ){
			System.out.println("i >>> : " + i);
		}
		*/
		/*
		int i;
		for (i=0; ; ){
			System.out.println("i >>> : " + i);
		}
		*/
		/*
		int i;
		for (i=0; i < 3;){
			System.out.println("(" + i + " < 3) >>> : " + (i < 3));
			System.out.println("for {} �� ���� ::: i >>> : " + i);
		}
		*/
		/*
		int i;
		for (i=0; i < 3; i++){
			System.out.println("(" + i + " < 3) >>> : " + (i < 3));
			System.out.println("for {} �� ���� ::: i >>> : " + i);
		}
		*/
		/*
		int i;
		for (i=0; i < 3; i++){
			System.out.println("(" + i + " < 3) >>> : " + (i < 3));
			System.out.println("for {} �� ���� ::: i >>> : " + i);
		}
		System.out.println("for {} �� �ܺ� ::: i >>> : " + i);
		*/
		for (int i=0; i < 3; i++){
			System.out.println("(" + i + " < 3) >>> : " + (i < 3));
			System.out.println("for {} �� ���� ::: i >>> : " + i);
		}
		System.out.println("for {} �� �ܺ� ::: i >>> : " + i);

	}
}