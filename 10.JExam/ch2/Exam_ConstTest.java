package a.b.c.ch2;

// �����ڸ� ����ϴ� ����, �����ڰ� �ϴ� �� 
// ��� �ʵ� �ʱ�ȭ �ϱ� 
// Ŭ������ �ν����� ��(�޸𸮿� �ø� ��, ����� ��) ��������� �ʱ�ȭ �ϱ� ���ؼ� 

class Exam_Const {

	String s;
	int i;
}

// *.java ȭ�� �ҽ��� Ŭ������ �ΰ� �̻��� ���� 
// main�Լ��� �ִ� Ŭ������ Ŭ���� Ű���� �տ� public Ű���带 ���̰�
// �����̸��� main�Լ��� �ִ� Ŭ�����̸����� �����Ѵ�.
public class Exam_ConstTest {
	
	public static void main(String args[]) {
		
		Exam_Const ec = new Exam_Const();
		System.out.println("ec �������� �ּҰ� >>> :" + ec);
		System.out.println("ec.s >>> :" + ec.s);
		System.out.println("ec.i >>> :" + ec.i);
	}
}

/*
C:\00.KOSMO108\10.JExam\ch2>javac -d . Exam_ConstTest.java

C:\00.KOSMO108\10.JExam\ch2>java a.b.c.ch2.Exam_ConstTest
ec �������� �ּҰ� >>> :a.b.c.ch2.Exam_Const@15db9742
ec.s >>> :null
ec.i >>> :0

C:\00.KOSMO108\10.JExam\ch2>javap a.b.c.ch2.Exam_ConstTest
Compiled from "Exam_ConstTest.java"
public class a.b.c.ch2.Exam_ConstTest {
======================================
  public a.b.c.ch2.Exam_ConstTest();
======================================
  public static void main(java.lang.String[]);
}

C:\00.KOSMO108\10.JExam\ch2>javap a.b.c.ch2.Exam_Const
Compiled from "Exam_ConstTest.java"
class a.b.c.ch2.Exam_Const {
  java.lang.String s;
  int i;
======================================
  a.b.c.ch2.Exam_Const();
======================================
}
*/