package a.b.c.ch2.aa;

public class Class_A extends java.lang.Object{
	public Class_A(){
		System.out.println("Class_A() ������ >>> : ");
		} // public Class_A �Ű����� ���� ������
	public Class_A(String s){
		System.out.println("Class_A(String s ������ >>> : "+s);
	} // public Class_A �Ű����� �ִ� ������
	public void class_a_1(){
		System.out.println("Class_A().class_a_1() �Լ� >>> : ");
		
	} // public class_a_1 method ���ϰ��� ���� �Լ�
	public String class_a_2(){
		System.out.println("Class_A().class_a_2() �Լ� >>> : ");
		return "class_a_2() �Լ� >>> : ";
	} // public class_a_2 method ���ϰ��� �ִ� �Լ�
} // Class_A class