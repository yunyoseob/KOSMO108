package a.b.c.ch2.aa;

import a.b.c.ch2.aa.Class_A;

// Class_A��� �θ𿡰Լ� ��ӹ���
// Inherit_p_1��� �ڽ� Ŭ�����̴�.
public class Inherit_p_1 extends Class_A{
	

	/* ���� 1
	public String toString(){
		return "Class_A().toString() �Լ� >>> : ";
	}
	*/

	/*
	// ���� 2
	@Override
	// @ �ڿ� ������ �ֳ����̼��̶�� �Ѵ�.
	// �ڹٿ��� �����ϴ� �ֳ����̼��� �����Ϸ����� Ư���� ������ ������ �ִ� ������ �մϴ�.
	// �ñ״�ó�� �ٸ���, ������ ������ �߻��Ͽ� ���α׷����� �Ǽ��� �����ݴϴ�.
	// @Override�� �����ǵ� �޼����� ������ �������ִ� �ֳ����̼��Դϴ�.

	public String toString(){
		return "Inherit_p_1���� Override�� �����ǵƽ��ϴ�.";

	} // java.lang.Object ���� �ִ� Ŭ������ �Լ���
		// �ļ��� Inherit_p_1 Ŭ������ ������ 
		*/
	

	// ���� 3
	@Override
	public void class_a_1(){
		System.out.println("Hi");
	} // class_a_1 method



	public static void main(String args[]){
		Inherit_p_1 rv=new Inherit_p_1();
		System.out.println("\n 1. Inherit_p_1 rv=new Inherit_p_1();���� �������� rv�� �ּҰ� >>> : "+rv);
		//  ���� 1: Class_A().toString() �Լ� >>> :
		//  ���� 2: Class_A���� �Ű����� ���� ������ ���: Class_A() ������ >>>
		//			�������� ��½� Inherit_p_1���� Override�� �����ǵƽ��ϴ�. �� ���
		//  ���� 3: Class_A���� �Ű����� ���� ������ ���: Class_A() ������ >>> :
		//			�������� ��½� a.b.c.ch2.aa.Inherit_p_1@15db9742 �� ���
		System.out.println("\n 2. rv.toString() >>> : "+rv.toString());
		//  ���� 1: Class_A().toString() �Լ� >>> :
		//  ���� 2: Inherit_p_1���� Override�� �����ǵƽ��ϴ�. ���
		//  ���� 3: a.b.c.ch2.aa.Inherit_p_1@15db9742 ���
		System.out.println("\n 3. rv.getClass().getName() >>> : "+rv.getClass().getName());
		// ���� 1: a.b.c.ch2.aa.Inherit_p_1
		// ���� 2: a.b.c.ch2.aa.Inherit_p_1
		// ���� 3: a.b.c.ch2.aa.Inherit_p_1
		rv.class_a_1();
		// ���� 1: Class_A().class_a_1() �Լ� >>> : 
		// ���� 2: Class_A().class_a_1() �Լ� >>> : 
		// ���� 3: Class_A().class_a_1() �Լ� >>> : Hi ���
	} // main method


} // Inherit_p_1 class