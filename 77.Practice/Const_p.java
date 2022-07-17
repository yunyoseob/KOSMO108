package a.b.c.ch2;

public class Const_p{
	String s;
	int i;
	
	public Const_p() {
		// this("Last Year", 2021);
		// error: constructor Const_p in class Const_p cannot be applied to given types;
		//  required: no arguments

		// this();
		// error: recursive constructor invocation
		System.out.println("\n 2. Const_p() ������ >>> : ");
		System.out.println("\n 3. Const_p() ������ >>> s ::: "+s);
		System.out.println("\n 4. Const_p() ������ >>> i ::: "+i);
	} // Const_p()

	
	public Const_p(String s, int i){
		// System.out.println("this�� ������ �� �ȿ��� �ּ��� �����ϰ� �� ù ��° �������� ����Ǿ�� ������ ���� �ʽ��ϴ�.");
		this();
		// this()�� ���� 2������ 4���� �ݺ��Ǿ� �� �� �� ��µ˴ϴ�.

		// this("This Year", 2022);
		//  error: recursive constructor invocation
		System.out.println("\n 6. Const_p(String s, int i) ������ >>> : ");
		System.out.println("\n 7. Const_p(String s, int i) ������ >>> s ::: "+s);
		System.out.println("\n 8. Const_p(String s, int i) ������ >>> i ::: "+i);
		System.out.println("\n 9. Const_p(String s, int i) ������ >>> this.s ::: "+this.s);
		System.out.println("\n 10. Const_p(String s, int i) ������ >>> this.i ::: "+this.i);
		this.s=s;
		this.i=i;
		System.out.println("\n 11. this.s=s ����, Const_p(String s, int i) ������ >>> this.s ::: "+this.s);
		System.out.println("\n 12. this.i=i ����, Const_p(String s, int i) ������ >>> this.i ::: "+this.i);
	}
	
	public static void main(String args[]){
		System.out.println("\n 1. main �Լ� ����");
		/*
		1. Const_p ����� ���� Ŭ���� Const_p�� ����ϱ� ���ؼ� ���� �ߴ�.
		2. rv : ������ Const_p Ŭ������ ����ϱ� ���� ��������(Reference Variable)�� �����ߴ�.
		3. = : ���� ������
		4. new : �� Ű����, �� �ν��Ͻ� ������, �� ������
				: new Ű���� �ڿ����� ������ = Ŭ�����̸� + () �޸𸮿� �÷��ּ���.
				: new�� �ø��°� �ƴ϶�, JVM�� new Ű���带 ���� �޸𸮿� �÷��ִ� ���̴�.
		5. Const_p : �������̴�.
					: �ν��Ͻ��ϴ� Ŭ������ ��������� �ʱ�ȭ �Ѵ�.
					: default value �Ǵ� �������� �μ��� �ִ� ���� ������ �ʱ�ȭ�Ѵ�.
		6. Const_p() �����ڴ� Const_p() {} �⺻ �����ڸ� ȣ���Ѵ�.
			��� �ʵ忡 ����� String s, int i�� default value�� �ʱ�ȭ �Ѵ�.
		*/
		Const_p rv=new Const_p();
		System.out.println("\n 5. Const_p() �������� �������� �ּҰ� >>> : "+rv);

		// �ҽ� �ڵ� �󿡼� �Ű������� 2�� �ִ� �����ڸ� ȣ���Ѵ�.
		// public Const_p(String s, int i) {} �����ڸ� ȣ���Ѵ�.
		Const_p rv_1=new Const_p("This Year", 2022);
		System.out.println(" \n 13. Const_p(This Year, 2022)�� �������� �������� �ּҰ� >>> : "+rv_1);
	} // main method
} // Const_p class