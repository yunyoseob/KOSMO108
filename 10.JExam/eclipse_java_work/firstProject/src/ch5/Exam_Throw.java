package a.b.c.ch5;

public class Exam_Throw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			throw new Exception("���� �޽���");
			// Exception e = new Exception("���� �޽���");
			// throw e;
		}catch(Exception e) {
			System.out.println("e >>> : " + e);	
			// ������ �� ���� �޽����� getMessage() �Լ��� ����Ѵ�.
			System.out.println("e.getMessage() >>> : " + e.getMessage());
			// e.printStackTrace();
		}
		
		System.out.println("try-catch �� ���� >>> : ");
	}

}
