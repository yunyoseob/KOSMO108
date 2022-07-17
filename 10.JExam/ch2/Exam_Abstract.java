package a.b.c.ch2;

// �߻� Ű���� : abstract

// �߻� Ŭ���� 
// �߻� Ŭ���� = ���� + �߻��Լ� + �Ϲ��Լ� 
abstract class Class_Abstract_2 {

	abstract int add();
	abstract String eat();

	int add_1(){
		return 1;
	}
}


// �Ϲ� Ŭ�������� �߻� Ŭ������ ����ϸ�
// �߻� Ŭ�������ִ� �߻� �Լ��� �� �������̵� �ؼ�
// �������̵� �� �Լ��� {} �� �극�̽��� �ٿ���
// �� ���ο� �ϰ� ���� �۾��� �ϰ� �Ѵ�.
class Class_Abstract_1 extends Class_Abstract_2{
	
	int add() {
		return 1 + 2;
	}

	String eat(){
		return "Class_Abstract_1.eat() >>> : ";
	}
}

public class Exam_Abstract {

	public static void main(String args[]) {
		
		Exam_Abstract ea = new Exam_Abstract();
		System.out.println("ea �������� �ּҰ� >>> : " + ea);

		Class_Abstract_1 ca1 = new Class_Abstract_1();
		int add = ca1.add();
		System.out.println("add >>> : " + add);
		String eat = ca1.eat();
		System.out.println("eat >>> : " + eat);
	}
}