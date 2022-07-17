package a.b.c.ch2.aa;

import a.b.c.ch2.aa.Class_A;

// Class_A��� �θ𿡰Լ� ��ӹ���
// Inherit_p_2��� �ڽ� Ŭ�����̴�.
public class Inherit_p_2 extends Class_A{
	public Inherit_p_2(){
		super();
		System.out.println("\n 1. Inherit_p_2() ������ >>> : "+super.class_a_2());
		// Class_A��� �θ� Ŭ�������� class_a_2�� �����ϰ� ���� ��
	} // Inherit_p_2 ������ 1
	public Inherit_p_2(String s){
		super(s);
		System.out.println("\n 2. Inherit_p_2(String s) ������ >>> : "+s);
	} // Inherit_p_2 ������ 2

	@Override
	public String toString(){
		return "Hello";
	}

	@Override
	public void class_a_1(){
		System.out.println("Hi");
	}

	public static void main(String args[]){
		Inherit_p_2 rv= new Inherit_p_2();
		// Class_A() ������ >>> :
		// Class_A().class_a_2() �Լ� >>> :
		// 1. class_a_2() �Լ� >>> :
		System.out.println("\n 3. Inherit_p_2 rv= new Inherit_p_2(); ���� �������� �ּҰ� >>> : "+rv);
		// 3. Hello
		System.out.println("\n 4. rv.toString() >>> : "+rv.toString());
		//  4. Hello
		System.out.println("\n 5. rv.getClass().getName() >>> : "+rv.getClass().getName());
		// 5. a.b.c.ch2.aa.Inherit_p_2
		rv.class_a_1();
		// Hi

		Inherit_p_2 rv_1=new Inherit_p_2("NiceToMeetYou");
		// Class_A(String s ������ >>> : NiceToMeetYou
		// 2. Inherit_p_2(String s) ������ >>> : NiceToMeetYou
		System.out.println("\n 6. Inherit_p_2 rv_1 = new Inherit_p_2(NiceToMeetYou); ���� �������� �ּҰ� >>> : "+rv_1);
		//  Hello
	}
} // Inherit_p_2 class