package a.b.c.ch6;

import java.util.Calendar;

public class Exam_Time_Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar cd = Calendar.getInstance();
		System.out.println("cd >>> : \n" + cd);
		
		// ��
		int y = cd.get(Calendar.YEAR);
		System.out.println("y >>> : " + y);
		System.out.println("cd.get(1) >>> : " + cd.get(1));
		
		// �� 
		int m = cd.get(Calendar.MONTH) + 1;
		System.out.println("m >>> : " + m);
		System.out.println("(cd.get(2)+1) >>> : " + (cd.get(2)+1));		
		
		// �� 
		int d = cd.get(Calendar.DATE);
		System.out.println("d >>> : " + d);
		System.out.println("cd.get(5) >>> : " + cd.get(5));
		
		int d1 = cd.get(Calendar.DAY_OF_MONTH);
		System.out.println("d1 >>> : " + d1);
		
		// ��
		int t = cd.get(Calendar.HOUR_OF_DAY); // 24�ð� 
		System.out.println("t >>> : " + t);
		System.out.println("cd.get(11) >>> : " + cd.get(11));
		int t1 = cd.get(Calendar.HOUR); // 12�ð� 
		System.out.println("t1 >>> : " + t1);
		
		// ��
		int mm = cd.get(Calendar.MINUTE);
		System.out.println("mm >>> : " + mm);
		System.out.println("cd.get(12) >>> : " + cd.get(12));
		
		// ��
		int s = cd.get(Calendar.SECOND);
		System.out.println("s >>> : " + s);
		System.out.println("cd.get(13) >>> : " + cd.get(13));
		
		String time = 	"���� �ð��� : "
				 		+ y + "�� "
				 		+ m + "�� "
				 		+ d + "�� "
				 		+ t + "�� "
				 		+ mm + "�� "
				 		+ s + "�� �Դϴ�. !!!!";
		System.out.println("time >>> : \n" + time);
	}
}
