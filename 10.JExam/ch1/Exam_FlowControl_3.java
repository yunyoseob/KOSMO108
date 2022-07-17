package a.b.c.ch1;

public class Exam_FlowControl_3 {

	public int add(int x, int y) {		
		return x + y;
	}

	public static void main(String args[]) {

		// ���� �Լ��� �Ķ������ String args[] �迭�� ����� �μ� ��� �θ���.
		// ����� �μ���, String �迭�� ������ 2�� �� ���� if ���� ����ȴ�.
		if (args.length == 2){

			// String ���ڿ� Ŭ������ �������� s0 �� ����� �μ� ù ��° ���� �Ҵ��Ѵ�.
			String s0 = args[0];
			// String ���ڿ� Ŭ������ �������� s1 �� ����� �μ� �� ��° ���� �Ҵ��Ѵ�.
			String s1 = args[1];
			
			// public static int parseInt(String s)
			// parseInt(String s) : ���� ���ڸ� ���ڷ� �ٲٴ� �Լ� 
			// ���� ���� : "1" "2",  
			// "��" : ����
			int x = Integer.parseInt(s0);
			int y = Integer.parseInt(s1);

			Exam_FlowControl_3 ef3 = new Exam_FlowControl_3();
			System.out.println("ef3 �������� �ּҰ� >>> : " + ef3);
			
			int addSum = ef3.add(x, y);
			System.out.println("addSum >>> : " + addSum);

		}else{
			System.out.println("������ ���� �� �Է��Ͻÿ� >>> : ");
		}
	}
}

/*
C:\00.KOSMO108\10.JExam\ch1>javac -d . Exam_FlowControl_3.java

C:\00.KOSMO108\10.JExam\ch1>java a.b.c.ch1.Exam_FlowControl_3 1 2
ef2 �������� �ּҰ� >>> : a.b.c.ch1.Exam_FlowControl_2@15db9742
addSum >>> : 3

C:\00.KOSMO108\10.JExam\ch1>java a.b.c.ch1.Exam_FlowControl_3 1
������ ���� �� �Է��Ͻÿ� >>> :

C:\00.KOSMO108\10.JExam\ch1>java a.b.c.ch1.Exam_FlowControl_3
������ ���� �� �Է��Ͻÿ� >>> :

C:\00.KOSMO108\10.JExam\ch1>java a.b.c.ch1.Exam_FlowControl_3 1 2 3
������ ���� �� �Է��Ͻÿ� >>> :

*/