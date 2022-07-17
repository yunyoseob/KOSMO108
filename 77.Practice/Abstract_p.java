package a.b.c.ch2;

/*
�߻� Ű���� :abstract

�߻� Ŭ����

�߻� Ŭ���� = ���� + �߻��Լ� + �Ϲ��Լ�

�߻� Ŭ������ �Ϲ� Ŭ������ �ٸ��� ����� ���� �Լ����� ������.
*/

abstract class Abstract_1{
	abstract int add();
	abstract String eat();
	int add_1(){
		return 1;
	} // add_1() method
} // Abstract_1 class


class Abstract_2 extends Abstract_1{
	int add(){
		return 1+2;
	} // add() method

	String eat(){
		return "class Abstract_2�� String eat() method";
	} // eat() method
} // Abstract_2 class

public class Abstract_p{
	public static void main(String args[]){
		System.out.println("\n 1. Abstract_p main �Լ� ����");
		Abstract_p rv= new Abstract_p();
		// �����ڸ� ����� �ν��Ͻ��Ѵ�.
		// JVM�� new �ڿ� �ִ� Ŭ�����̸�()�� ����
		// �����ڸ� �����Ѵ�.
		System.out.println("\n 2. Abstract_p rv >>> : "+rv);

		Abstract_2 rv_1 = new Abstract_2();
		System.out.println("\n 3. Abstract_2 rv_1 >>> : "+rv_1);
		int add=rv_1.add();
		System.out.println("\n 4. Abstract_2 add() method >>> : "+add);
		String eat=rv_1.eat();
		System.out.println("\n 5. Abstract_2 eat() method >>> : "+eat);
		int add_1=rv_1.add_1();
		System.out.println("\n 6. Abstract_1 add_1() method >>> : "+add_1);
	} // main method
} // Abstract_p class


