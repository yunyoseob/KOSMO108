package a.b.c.ch1;


public class Exam_For_2 {

	public static void main(String args[]) {

		/*
		�ڹٿ��� for �� �ʱ�ȭ �Ŀ��� �׻� �ʱ�ȭ ���� 0���� �ϴµ�
		�� ������ for ��κ� �迭 �����͸� ó���ϴµ� ����ϱ� ���� �̴�.
		�迭�� �ε����� 0 ���� �����ϱ� �����̴�. 
		*/
		for (int i=0; i < 3 ; i++ ){
			System.out.println("i >>> : " + i);
		}	

		for (int i=1; i < 3 ; i++ ){
			System.out.println("i >>> : " + i);
		}
		
		for (int i=1; i <= 3 ; i++ ){
			System.out.println("i >>> : " + i);
		}

		for (int i=1; (i-1) < 3 ; i++ ){
			System.out.println("i >>> : " + i);
		}
	}
}