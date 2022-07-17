package a.b.c.ch6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exam_Time_Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Deprecated. : ���粨 ���� �� ���� ������ ������ �̰��� ������� ���ÿ�, ���� �������� ����
		// ���Ϳ��� �ð��� : �ʷ� ����Ѵ�. : 1 day = 24 * 60 * 60 = 86,400
		// ���Ϳ��� �ð��� : �ʷ� ����Ѵ�. : 1 year = 365 * 24 * 60 * 60 = 31,536,000 �ڽ��� 108�� �ڰǿ�
		// The leap second : ���� : 
		// Greenwich mean time (GMT) 
		// global positioning system (GPS)
		
		// A year y is represented by the integer y - 1900.
		// A month is represented by an integer from 0 to 11; 
		// 0 is January, 1 is February, and so forth; thus 11 is December.
		// A date (day of month) is represented by an integer from 1 to 31 in the usual manner.
		// Date Ŭ������ ������ ��� ���� 		
		// ��ǻ�� �ð� : Ŭ���̾�Ʈ �ð�, ���� �ð�
		
		/*
			Date Ŭ������ epoch �ð�(����ũ �ð�)�� �����Ѵ�.
			1970�� 1�� 1�� 00:00:00 �ð��� �������� ������ �ð��� millisecond �� ��ȯ�Ѵ�.			  	
		*/
	
		Date d = new Date();
		
		// �� 
		// public int getYear()
		int year = d.getYear();
		System.out.println("year >>> : " + year);
		year = year + 1900;
		System.out.println("year + 1900 >>> : " + year);
		
		// ��
		// public int getMonth()
		int month = d.getMonth();
		System.out.println("month >>> : " + month);	
		month = month + 1;
		System.out.println("month + 1 >>> : " + month);		
		
		// �� 
		// public int getDate()
		int date = d.getDate();
		System.out.println("date >>> : " + date);			
		
		String time = year + "." + month + "." + date;
		System.out.println("time >>> : " + time);
		time = time.replace('.', '-');
		System.out.println("time >>> : " + time);	
		time = time.replace('-', '/');
		System.out.println("time >>> : " + time);
		
		
		String ymd[] = {"yyyy.MM.dd", "yyyy-MM-dd", "yyyy/MM/dd"};
		
		for (int i=0; i < ymd.length; i++) {
			SimpleDateFormat sdf = new SimpleDateFormat(ymd[i]);
			System.out.println("sdf >>> : " + sdf);
			System.out.println("sdf.format(d) >>> : " + sdf.format(d));
		}
	}
}
