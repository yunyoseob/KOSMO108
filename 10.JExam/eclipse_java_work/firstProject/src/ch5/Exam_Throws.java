package a.b.c.ch5;

public class Exam_Throws {

	int aM() throws ArithmeticException  {
		
		int z = bM();
		return z;
	}
	
	int bM() throws ArithmeticException {	
		
		int z = 0;		
		
		z = 1 / 0;			
		
		return z;
	}
	
	/*
	main() �Լ��� �����ϴ� ���α׷����� 
	�Լ��� ȣ�� ������ ���� ���� �Ǵٰ�
	������ �߻��� ��� 
	������ �߻��� ������ �ִ� �Լ� ���� 
		������ ������(throws)  ~~
		main() �Լ����� ���� ó���� �ϸ� �ȴ�. 
	*/

	// main() �Լ��� ������ �̴�. 
	// public static void main(String[] args) throws ArithmeticException  {
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		try{
			Exam_Throws et = new Exam_Throws();
			int z = et.aM();
			
			System.out.println("z >>> : " + z);			
		}catch (ArithmeticException a){
			System.out.println("������ a >>> : " + a);
		}
	}
}
