package a.b.c.ch5;

public class Exam_TryCatch_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			String args0 = args[0];
			String args1 = args[1];
			
			int x = Integer.parseInt(args0);
			int y = Integer.parseInt(args1);
			
			int z = x / y;
			
			System.out.println("x / y = " + z);
		/*	
		}catch(NumberFormatException n) {
			System.out.println("NumberFormatException :: ���� �α� ��� >>> : " + n);
			
		}catch(ArithmeticException a) {
			System.out.println("ArithmeticException :: ���� �α� ��� >>> : " + a);
		*/	
		}catch(Exception e) {
			System.out.println("Exception :: ���� �α� ��� >>> : " + e);
			
		}finally {
			System.out.println("finally �� >>> : ");
			System.out.println("���� �Ǵ� ���� ��� �����Ѵ�. >>> : ");			
		}
		
		System.out.println("���� �� ����Ǵ� ��ƾ�̴�. >>> : ");
	}
}
