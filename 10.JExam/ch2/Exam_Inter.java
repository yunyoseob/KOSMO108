package a.b.c.ch2.aaaa;

/*
�������̽� interface 
	1.	�����ڸ� ������ ����.
	2.	new �����ڷ� �ν��Ͻ� �� �� ����.
	3.	�Լ��� ��� �߻��Լ��̴�. abstract Ű���尡 ���� �� �����̴�.
		�Լ��� ���� abstarct Ű���带 ������� �ʴ´�.
	4.	������ ��� ����̴�.
		������ ���� static final Ű���带 ������� �ʴ´�.

	5.  static �Լ� ���� 
	6.	default �Լ� ���� 
*/
public interface Exam_Inter {

	//public String str;
	/*
	C:\00.KOSMO108\10.JExam\ch2>javac -d . Exam_Inter.java
	Exam_Inter.java:13: error: = expected
			public String str;
							 ^
	1 error
	*/
	public /* static final ������ ���̴�. */String str = "�� ����̴�";
	public static final String STR = "�� ����̴�";
	/*
	Ŭ�������� �⺻ �޼ҵ带 ã�� �� �����ϴ�. ���� �������� �⺻ �޼ҵ带 �����Ͻʽÿ�.
    public static void main(String[] args)
    */

	// ������
	/*
	public  Exam_Inter() {
		
	}
	*/

	// �������̽� Ŭ���� new �����ڷ� �ν��Ͻ� �ϱ� 
	// Exam_Inter ei = new Exam_Inter();
	public /*abstract Ű���� ����*/ void aM();
	public abstract void bM();
}

/*
package a.b.c.ch2.aaaa;
public interface Exam_Inter {

}

C:\00.KOSMO108\10.JExam\ch2>javap a.b.c.ch2.aaaa.Exam_Inter
Compiled from "Exam_Inter.java"
public interface a.b.c.ch2.aaaa.Exam_Inter {
}
*/

/*
package a.b.c.ch2.aaaa;
public interface Exam_Inter {

	// ������ 
	public Exam_Inter() {
		
	}
}

C:\00.KOSMO108\10.JExam\ch2>javac -d . Exam_Inter.java
Exam_Inter.java:7: error: <identifier> expected
        public Exam_Inter() {
                         ^
1 error
*/

/*
public interface Exam_Inter {
	// �������̽� Ŭ���� new �����ڷ� �ν��Ͻ� �ϱ� 
	Exam_Inter ei = new Exam_Inter();
}

C:\00.KOSMO108\10.JExam\ch2>javac -d . Exam_Inter.java
Exam_Inter.java:18: error: Exam_Inter is abstract; cannot be instantiated
        Exam_Inter ei = new Exam_Inter();
                        ^
1 error
*/