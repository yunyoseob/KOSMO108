package a.b.c.ch2;


// ������ : Constructor 
// �������� ��� 
/*
	Ŭ�����̸� () {
		
	}
*/
// �����ڴ� Ŭ������ �޸𸮿� �ø��� �ڹ� ��ö�ӽ��� ����ϴ� �Լ��� 
// �ڹ� �ҽ��� �������� �ڵ� ���� ������ �� �����ڸ� ����ϰ�
// �ڹ� �ҽ��� �������� �ڵ� ���� ������ jvm �����ڸ� ���� ����Ѵ�.
public class Exam_Constructor {

	String s;
	int i;

	public static void main(String args[]) {
		
		System.out.println("Hello Java!!");
	}
}
/*
C:\00.KOSMO108\10.JExam\ch2>javap a.b.c.ch2.Exam_Constructor
Compiled from "Exam_Constructor.java"
public class a.b.c.ch2.Exam_Constructor {
=============================================================
  public a.b.c.ch2.Exam_Constructor(); : �⺻ ������, default Contructor 
  �̰��� jvm �� �����ؼ� ����ʵ带 �ʱ�ȭ �Ѵ�.
=============================================================  
  public static void main(java.lang.String[]);
}
*/