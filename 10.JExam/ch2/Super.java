package a.b.c;

// Sub �θ�Ŭ���� 
class Sub{

	public Sub(){
		System.out.println("Sub()  �θ�Ŭ���� ������ ");
	}

	public void subM(){
		System.out.println("subM()  �Լ� ");
	}
}

// Sub �θ�Ŭ����
// Super �ڽ�Ŭ���� 
public class Super extends Sub{


	public void superM(){
		System.out.println("superM()  �Լ� ");
	}

	public Super(){
		System.out.println("Super()  �ڽ�Ŭ���� ������ ");
	}

	public static void main(String args[]) {

		// �θ�Ŭ���� �������� = new �θ�Ŭ����();
		// Sub s = new Sub();
		
		// �θ�Ŭ���� �������� = new �ڽ�Ŭ����();
		Sub ss = new Super();


	
	
		
	}
}