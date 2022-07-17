package a.b.c.ch1;

/*
1. import ��Ģ : 
	java.lang.* ��Ű���� �ִ� Ŭ������ 
	������ ��� ��Ű�������� �� import Ű���带 ����ؾ� �Ѵ�.
2. import �� ���� ��Ű����.Ŭ�����̸� ���� ����ؾ� �Ѵ�. <-- ���� : �ҽ� �ڵ� ������ ������ 
3. ��Ʈ�� Ŭ������ ������������ �ּҰ��� �����ִ� ��� �ְ� �ƴ� ��쵵 �ִ�.
4. Ŭ������ �޸𸮿� �ø��� ������ new Ű���� ���� �ٸ� �͵��� ���������� �ִ�(������ �����ؾ� �Ѵ�). 
*/
import java.util.Scanner;
import java.util.Date;
import java.util.Calendar;

public class Exam_FlowControl_5 {

	public int add(int x, int y) {		
		return x + y;
	}

	public static void main(String args[]) {

		Date d = new Date();
		// public static int identityHashCode(Object x)
		System.out.println("System.identityHashCode(d) >>> : " 
								+ System.identityHashCode(d));
		System.out.println("d >>> : " + d + "\n");

		Calendar c = Calendar.getInstance();
		System.out.println("System.identityHashCode(c) >>> : " 
								+ System.identityHashCode(c));
		System.out.println("c >>> : " + c + "\n");

		System.out.println("������ ���� �� �Է��Ͻÿ� >>> : ");
		// public static final InputStream in
		Scanner sc = new Scanner(System.in);
		System.out.println("sc >>> : " + sc);
		// public int nextInt()
		int x = sc.nextInt();
		// public static final PrintStream out
		System.out.println("x >>> : " + x);
		int y = sc.nextInt();
		System.out.println("y >>> : " + y);

		Exam_FlowControl_5 ef5 = new Exam_FlowControl_5();
		
		int addSum = ef5.add(x, y);
		
		System.out.println("addSum >>> : " + addSum);
	}
}
/*
C:\00.KOSMO108\10.JExam\ch1>java a.b.c.ch1.Exam_FlowControl_5
������ ���� �� �Է��Ͻÿ� >>> :
1
x >>> : 1
2
y >>> : 2
addSum >>> : 3
*/
