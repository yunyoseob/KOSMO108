package a.b.c.ch1;

public class Exam_FlowControl_1 {

	public static void main(String args[]) {

		int x = 1;
		int y = 2;

		boolean xyBool = x < y;
		System.out.println("xyBool >>> : "+ xyBool);

		// if ���� true  �� ���� ����ȴ�.
		// ______________________________________________________
		// if ���� �Ұ�ȣ ���� ǥ����(���)�� ����� true �� ���� ����ȴ�.
		// ______________________________________________________
		// x < y, 1 < 2 �� ������ �� �ʵ� ����� ���� �ִ�. 
		if (xyBool) {
			System.out.println("true");
		}

		if (x < y) {
			System.out.println("x < y >>> : true");
		}

		if (1 < 2) {
			System.out.println("1 < 2 >>> : true");
		}
	}
}