package a.b.c.ch2;

class Parents extends java.lang.Object{
	Parents(){
		System.out.println("\n 4 or 9. Make Parents Constructor");
	} // Parents Constructor

	void Parents_method(){
		System.out.println("\n 7 or 12. Parents Method");
	} // Parents_method method
} // Parents

class Child extends Parents{
	Child(){
		System.out.println("\n 5 or 10. Make Child Constructor");
	} // Child Constructor

	void Child_method(){
		System.out.println("\n 8 or 13. Child Method");
	} // Child_method method
} // Child


public class Inherit_p_3{
	void Inherit_p_3_method(){
		System.out.println("\n 3. Inherit_p_3_method");
	} // Inherit_p_3_method

	public static void main(String args[]){
		System.out.println(" \n 1. Start main method ");

		Inherit_p_3 rv=new Inherit_p_3();
		System.out.println(" \n 2. Inherit_p_3 rv >>> : "+rv);
		rv.Inherit_p_3_method();

		// First Experiment
		// Child Class reference variable = new Child Class();
		Child rv_c=new Child();
		System.out.println(" \n 6. Child rv_c >>> : "+rv_c);
		rv_c.Parents_method();
		rv_c.Child_method();

		// Second Experiment
		// Parents Class reference variable = new Parents Class();
		Parents rv_p=new Child();
		System.out.println(" \n 11. Parents rv_p >>> "+rv_p);
		rv_p.Parents_method();
		// rv_p.Child_method();
		/* Compile Issue
		error: cannot find symbol
		symbol:   method Child_method()
		location: variable rv_p of type Parents
		1 error
		*/

	
		/* Issue �ѱ� �ؼ�
		�����ڴ� �ڽĲ��� �����ؼ�
		�θ� �����ڿ� �ڽ� �����ڸ� �� ������ �ϴµ�
		���������� �θ� Ŭ�������� ��������
		�θ� Ŭ������ �Լ��� �� �� �ִµ�
		�ڽ� Ŭ������ �Լ��� ������� ����.
		*/

		// Second Experiment issue
		// How to use rv_p.Parnets_Method() ??

		/* �ѱ� ����
		�θ�Ŭ������ ���������δ� �ڱ��ڽ� Ŭ������ �ڿ��� ����� �����ϴ�.
		�̷� ��� �θ�Ŭ������ ���������� �ڽ� Ŭ������ ����ȯ(ĳ����)�� �ؾ��Ѵ�.
		Ŭ������ ����ȯ Ŭ���� ĳ�����ϴ� ����� 3���� ����� �ִ�.
		*/
		
		/*
		// Class Casting method 1
		Child rv_ca=(Child)rv_p;
		rv_ca.Child_method();
		System.out.println("\n 14. Child rv_ca >>> : "+rv_ca);
		// Ư�̻��� : rv_p�� rv_ca�� �ּҴ� ����. 
		*/
		
		/*
		// Class Casting method 2
		Object obj=rv_p;
		Object obj_1=obj;
		Child rv_ca2 = (Child)obj_1;
		rv_ca2.Child_method();
		System.out.println("\n 14. Child rv_ca2 >>> : "+rv_ca2);
		// Ư�̻��� : rv_p�� rv_ca2�� �ּҴ� ����.
		*/

		// Class Casting method 3
		Object obj_2=(Object)rv_p;
		// == Object obj_2=rv_p;
		Child rv_ca3=(Child)obj_2;
		rv_ca3.Child_method();
		// System.out.println("\n 14. Child rv_ca3 >>> : "+rv_ca3);
		// Ư�̻��� : rv_p�� rv_ca3�� �ּҴ� ����.

		/* 
		����� ����

		���� ���� 3��ձ����� ȣ���ߴµ� 
		���� ���� �� ������ ū�ϳ�.

		java.lang Ŭ������ ������ Object�� �ļ���
		� Ŭ������ ��ȯ�ߴµ� �ش� Ŭ������ �ļյ����
		���� ��ȯ�Ǹ� ������ Ŀ��.

		����, �ش� Ŭ������ �ļ��� ����Ϸ���, 
		Ŭ���� �ٿ� ĳ������ �ؾ���.

		Ŭ���� �ٿ� ĳ������ ����� ���� ��������
		�ļտ��� ã�ƿ� �� ����.
		 */
	} // main method
} // Inherit_p_3 class

	