package a.b.c.ch2;

/*
�ڹٿ��� Ŭ������ ����� (��Ʈ�� Ŭ����, ����� ���� Ŭ����)
������ java.lang.Object  Ŭ������ ����ϰ� �Ǿ� �ִ�.
�׷��� ������ Ŭ������ ������ ���� ����ϴ� ������ �����Ѵ�. 

java.lang.Object Ŭ������ �ڹٿ��� ���� Ŭ����, �ְ� ���� Ŭ���� ��� �Ѵ�. 
������ 1��
�Լ� 11��
��Ʈ�� Ŭ����, ��������� Ŭ������ ���� �ڿ��� ����� �� �ִ�.

extendst Ű����� Ŭ������ ����ϸ� 
������� Ŭ������ �޸𸮿� ���� �ö󰣴�.
*/
// public class Exam_Object extends java.lang.Object {
public class Exam_Object {
	// java.lang.Object
	// public String toString()
	public String toString() {
		
		System.out.println("���� Object Ŭ������ �ִ� toString() �Լ��̴�.");
		
		return "���ڸ� �����Ѵ�.";
	}

	public static void main(String args[]) {
		
		System.out.println("Java Hello ~~~ !!");
		
		Exam_Object eo = new Exam_Object();
		System.out.println("eo �������� �ּҰ� >>> : " + eo);
		// System.out.println("eo.toString() �������� �ּҰ� >>> : " + eo.toString());

	}
}