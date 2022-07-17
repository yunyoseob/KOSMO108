package a.b.c.ch1;

/*
	�Լ����� 
	�Ķ���� parameter �Ű����� �����ϱ�
	�Լ� ȣ���� �� �μ� argument�� ����ϴ� ���
*/

public class Exam_Method_3 {
	
	// ���ϱ� �Լ��� �����
	/*
		�Լ��� ������ ��(�Լ��� ���� ��) 
		�Լ� �̸� �ڿ� () �Ұ�ȣ�� �����ؼ� 
		�Ұ�ȣ�� ������ Ÿ���� �����ϰ� �������� �����ϴ� ����
		�츮�� �Ķ���� parameter �Ű�������� �θ���.
		�Ű����� : ������ �ִ� ����
	*/
	static int addMethod(int x, int y) {		
		System.out.println("Exam_Method_3 Ŭ������ �ִ� addMethod() �޼ҵ�(�Լ�) ");	

		int addSum = x + y;

		return addSum;
	}
	
	// ���� �Լ��� �����Ѵ�.
	public static void main(String args[]){
		System.out.println("Exam_Method_3 Ŭ������ �ִ� main() �޼ҵ�(�Լ�) \n");

		// ������ �����ؼ� �ʱ�ȭ �ߴ�.
		int x = 1;
		int y = 2;

		// �Լ��� ȣ���� �� 
		/*
			�Լ��� ȣ���� �� 
			�Լ� �̸� �� �Ұ�ȣ�� �����ϴ� �� �Ǵ� ������ 
			�츮�� �ƱԸ�Ʈ argument �μ� ��� �θ���. 
		*/
		int addSum = Exam_Method_3.addMethod(x, y);
		// static int addMethod(int x, int y) ==> static int addMethod(x = 1, y = 2) 
		/*
		==========================================================
			�ƱԸ�Ʈ�� ������ addMethod(x, y) �� 
			�Ķ������ ������ addMethod(int x, int y)�� �������� �ʾƵ� �ȴ�.
			���⼭ x, y �� int x, int y�� �������� ���� �ʾƵ� �ȴ�.
		==========================================================
		*/
		System.out.println("addSum >>> : " + addSum + "\n");

		System.out.println("Exam_Method_3.addMethod(x, y) >>> : " 
							+ Exam_Method_3.addMethod(x, y) + "\n");

		int addSum_1 = Exam_Method_3.addMethod(1, 2);
		System.out.println("addSum_1 >>> : " + addSum_1 + "\n");

		System.out.println("Exam_Method_3.addMethod(1, 2) >>> : " 
							+ Exam_Method_3.addMethod(1, 2) + "\n");

	} // end of main() 	
} // end of Exam_Method_2 class