package a.b.c.ch1;

/*
���� �帧 : Flow Control
	if, swhich

	for, while, do while 
*/
public class Exam_FlowControl {

	public static void main(String args[]) {

		// if ���� ���� �б⹮ �̶��ϰ� 
		// if ������ ���� ��찡 ���� �ǰ� 
		// else ������ if ���� ���� �ݴ��� ������ �� ����ȴ�. 
		// if ���� () �Ұ�ȣ�� ����ϴ� ǥ������ ����� ��(true) �ΰ�츸 ����ȴ�.
		
		if (true) {
			System.out.println("true");
		}

		if (false) {
			System.out.println("false");
		}

		boolean bool = false;
		System.out.println("bool >>> : " + bool);
		if (bool) {
			System.out.println("true bool");
		}

		bool = true;
		System.out.println("bool >>> : " + bool);
		System.out.println("!bool >>> : " + !bool);
		
		if (!bool) {
			System.out.println("true bool");
		}

	}
}