package a.b.c.ch5;

public class Exam_TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int x = 1;
			int y = 0;
			
			int z = x / y;
			
			System.out.println("x / y = " + z);
		}catch(ArithmeticException e) {
			System.out.println("���� �α� ��� >>> : " + e);
		}finally {
			System.out.println("finally �� >>> : ");
			System.out.println("���� �Ǵ� ���� ��� �����Ѵ�. >>> : ");			
		}
		
		
		
		System.out.println("���� �� ����Ǵ� ��ƾ�̴�. >>> : ");
	}

}
