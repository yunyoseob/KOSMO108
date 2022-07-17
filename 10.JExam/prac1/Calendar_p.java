package a.b.c.prac1;

import java.util.Calendar;

public class Calendar_p {

	public static void main(String[] args) {
		Calendar cd=Calendar.getInstance();
		System.out.println("cd >>> : "+cd);
		// �� getInstance???
		// �߻�Ŭ������ new �����ڷ� �ν��Ͻ� ���� �� ��
		// �߻�Ŭ������ ����� ���� �Ϲ�Ŭ������ new �ν��Ͻ��� �����ڸ���°͸� ����
		/*
		 * public abstract class Calendar
		 *	extends Object
		 *	implements Serializable, 
		 *	Cloneable, 
		 *	 Comparable<Calendar>
		 * */
		// Calender�� �����̳� ������ ����Ͽ�, �۾��ϱ� �����Ƿ�, �ѱ�������
		// Date�� ���� ����.
		
		//��
		int y=cd.get(Calendar.YEAR);
		// 1st ���
		System.out.println("y >>> : "+y);
		// 2nd ���
		System.out.println("cd.get(1) >>> : "+cd.get(1));
		// cd.get(num)�� num�� java.util.Calendar�� ConstantField �� ���� �ѹ��̴�.
		
		//��
		int m=cd.get(Calendar.MONTH)+1;
		// 1st ���
		System.out.println("m >>> : "+m);
		// 2nd ���
		System.out.println("(cd.get(2)+1 >>> "+(cd.get(2)+1));
		// 0~11�� ����Ǿ� �־ 1�� ������� �Ѵ�.
		
		//��
		int d = cd.get(Calendar.DATE);
		System.out.println("d >>>> : "+d);
		System.out.println("cd.get(5) >>> "+cd.get(5));
		// ���� cd.get(1)
		// ���� cd.get(2)
		// ���� cd.get(5)
		
		// �� �ٸ� �� ���ϴ� ���		
		int d1=cd.get(Calendar.DAY_OF_MONTH);
		System.out.println("d1 >>> : "+d1);
		
		// ������� ���� ������. ��ħ��, Calendar.DAY_OF_MONTH�� ��������.
		
		// ��
		int t =cd.get(Calendar.HOUR_OF_DAY);
		System.out.println("t >>> : "+t);
		System.out.println("cd.get(11) >>> : "+cd.get(11));
		// ���⼭�� 11�̴�.
		
		// ��
		int mm=cd.get(Calendar.MINUTE);
		System.out.println("mm >>> : "+mm);
		System.out.println("cd.get(12) >>> "+cd.get(12));
		// ���⼭�� 12�̴�.
		
		// ��
		int s=cd.get(Calendar.SECOND);
		System.out.println("s >>> : "+s);
		System.out.println("cd.get(13) >>> : "+cd.get(13));
		
		String time="���� �ð��� : "+y+"��"+m+"��"+d+"��"+t+"��"+mm+"��"+s+"�� �Դϴ�. !!!!";
		System.out.println("time >>> : \n "+time);


	} // main method

} // Calendar_p method
