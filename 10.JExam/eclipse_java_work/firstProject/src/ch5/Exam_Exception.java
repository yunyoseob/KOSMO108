package a.b.c.ch5;

public class Exam_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// x, y ���� ����� �μ��� �ޱ�  String[] args = {"", ""};
		
		// ����ó�� �� �ߴ�.
		try {
		
			String args0 = args[0];
			String args1 = args[1];

			int x = Integer.parseInt(args0);
			int y = Integer.parseInt(args1);
			
			int z = x + y;
			
			System.out.println("x + y = " + z);

		}catch(Exception e) {
			System.out.println("������ >>> : " + e.getMessage());
		}
		
				
		System.out.println("���ϱ� ���α׷��� �������. >>> : ");
	}

}
