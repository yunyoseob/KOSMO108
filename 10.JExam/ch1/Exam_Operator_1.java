package a.b.c.ch1;

public class Exam_Operator_1 {

	public boolean idCheck(String id, String pw){

		// ���������� �� �ڷ����� default  ������ �ʱ�ȭ �ؼ� ����Ѵ�.
		boolean bool = false;

		if ( id !=null && id.length() > 0 
			&&	pw !=null && pw.length() > 0) {

			System.out.println("3333 Exam_Operator_1.idCheck ::: id >>> : " + id);
			System.out.println("4444 Exam_Operator_1.idCheck ::: pw >>> : " + pw);
			
			if ("PGW".equals(id) && "PGW00".equals(pw)){

				// 5555
				bool = true;
				System.out.println("5555 Exam_Operator_1.idCheck ::: if bool  >>> : " + bool);
			}
		}

		System.out.println("6666 Exam_Operator_1.idCheck ::: bool >>> : " + bool);
		
		return bool;
	}

	public static void main(String args[]) {
	
		// String s0 = "";
		// String s1 = null;

		// String id, password ���� �ʱ�ȭ 
		String id = "PGW";
		String password = "PGW00";

		// ���ڿ� null üũ�� �ϱ�� ���� �Ѵ�.
		// id !=null : id �� ���� null �ƴϾ�� �Ѵ�. �� ���� �־�� �ؿ�
		// id.length() > 0 : id �� ���� �� ���ڿ��� �ƴϾ���Ѵ�. ���� �� �־�� �Ѵ�.
		// id = ""; id.lenghth() = 0;
		// id !=null && 

		// if ������ id, password ���� �ִ��� üũ
		// if ���� ���� ���� ���� ���� �ȴ�. 
		if (	id !=null && id.length() > 0 
			&&	password !=null && password.length() > 0) {

			System.out.println("1111 Exam_Operator_1.main ::: id >>> : " + id);
			System.out.println("2222 Exam_Operator_1.main ::: password >>> : " + password);

			Exam_Operator_1 eo1 = new Exam_Operator_1();

			// public boolean idCheck(String id, String pw)

			// idCheck(id, password); �Լ� ȣ�� 
			boolean bool = eo1.idCheck(id, password);
			System.out.println("7777 Exam_Operator_1.main ::: bool >>> : " + bool);

			if (bool){
				System.out.println("8888 �α��� ���� >>> : ");
			}else{
				System.out.println("�α��� ���� ���� >>>  :");
			}
		}else{
			System.out.println("���̵� �н����带 �� �Է� �Ͻÿ� >>> : ");
		}
	}
}