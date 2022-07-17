package a.b.c.prac1;

public class Throws_p {

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
		
		/* Throws_p Ŭ������ �����ڿ� �������� ����
		  �ش� ���������� ���ҽ��� aM()�� ����Ϸ��� �ϴ�
		  aM �ڿ��� bM �ڿ��� �޾ƿ;� �ϰ�
		  bM�ڿ������� java runtime error�� ��µȴ�.
		  �� ��, throw Ű���带 ����Ͽ� ArithmeticException���ٰ�
		  ������, �� ���ܸ� try~catch~finally(��������) ���� �̿��Ͽ�,
		  catch���� ���ܸ� ��½�Ų��.
		*/
		try{
			Throws_p et = new Throws_p();
			int z = et.aM();
			
			System.out.println("z >>> : " + z);			
		}catch (ArithmeticException a){
			System.out.println("������ a >>> : " + a);
			// ������ a >>> : java.lang.ArithmeticException: / by zero
		}
		System.out.println("main �Լ� ��");
	}
}