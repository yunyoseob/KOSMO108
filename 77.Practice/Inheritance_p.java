package a.b.c.ch2;

class Dead_Great_Grand_Parents{
	Dead_Great_Grand_Parents(){
		System.out.println("\n 10. Dead_Great_Grand_Parents ������"); 
	} // Dead_Great_Grand_Parents ������
	void p_0(){
		System.out.println("\n 11. p_0 �Լ�");
	} // p_0 method
} // Dead Great_Grand_Parents class

class Great_Grand_Parents{
	Great_Grand_Parents(){
		System.out.println("\n 2. Great_Grand_Parents ������");
	} // Great_Grand_Parents ������
	void p_1(){
		System.out.println("\n 8. p_1 �Լ�");
	} // p_1 method
} // Great_Grand_Parents class

class Grand_Parents extends Great_Grand_Parents{
	Grand_Parents(){
		System.out.println("\n 3. Grand Parents ������");
	} // Grand_Parents ������
	void p_2(){
		System.out.println("\n 7. p_2 �Լ�");
	} // p_2 method
} // Grand_Parents class

class Parents extends Grand_Parents{
	Parents(){
		System.out.println("\n 4. Parents ������");
	} // Parents ������
	void p_3(){
		System.out.println("\n 6. p_3 �Լ�");
	} // p_3 method
} // Parents class

public class Inheritance_p{
	public static void main(String args[]){
		System.out.println("\n 1. Inheritance_p main �Լ� ����");
		Parents papa = new Parents();
		/*
		�޸𸮿� �ø��� �� ���� ���
		1. static
		2. new
		3. ���
		3-1. extends Ű���� Ŭ���� ���� ���
		3-2. implements Ű���� �������̽� ���� ���
		*/
		System.out.println("\n 5. rv �������� �ּҰ� >>> : "+papa);
		papa.p_3();
		papa.p_2();
		papa.p_1();
		// papa.p_0();
		// Dead�߱� ������ father�� ��� �� �޾���. ����, ������ ��µ�.
		//  error: cannot find symbol
		//  location: variable papa of type Parents

		System.out.println("\n 9. Dead_Great_Grand_Parents ��ȯ�ϱ�");
		Dead_Great_Grand_Parents dead = new Dead_Great_Grand_Parents();
		dead.p_0();

		
	} // main method
} // Inheritance_p class