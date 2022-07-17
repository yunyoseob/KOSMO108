package a.b.c.ch1;

public class Exam_For_9 {

	public static void main(String args[]) {

		for (int j=1; j <= 9; j++){
			System.out.println();

			for (int i=2; i <= 5; i++){
				/*		
				java.util.PrintStream
				public PrintStream format(String format,
										Object... args)

				java.lang.String
				public static String format(String format,
											Object... args)
				*/
				System.out.format("%d x %d = %2d  ", i, j, i * j);
			}
		}		
		System.out.println();

		
		for (int j=1; j <= 9; j++){
			System.out.println();

			for (int i=6; i <= 9; i++){
				/*
				public PrintStream printf(String format, Object... args)
				String format : "%d x %d = %2d  "
				Object... args : i, j, i * j
				*/
				System.out.printf("%d x %d = %2d  ", i, j, i * j);
			}
		}		
	}
}
/*
	���� ������ format specifier
		%d		������ ���
		%s		������ ���
		%f		�Ǽ��� ���
		%o		8���� ���
		%x, %X	16���� ���
		%e, %E	���� ���
		%c		���� ���
		%n		�� �ٲ�
		%b		boolean ���
*/