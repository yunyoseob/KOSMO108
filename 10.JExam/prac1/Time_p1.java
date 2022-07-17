package a.b.c.prac1;

import java.util.Calendar;
import java.util.TimeZone;

public class Time_p1 {
	public static void timeZone(){
		String cityID[]=TimeZone.getAvailableIDs();
		// getAvailableIDs �������� ���� �̸��� �������ÿ�.
		System.out.println("������ ���� ��  >>> : "+cityID.length);
		
		for (int i=0; i<cityID.length; i++){
			//System.out.println("cityID ["+i+"] >>> : "+cityID[i]);
		}
	}
	
	public static String cityTime(Calendar cd){
		String time= "����ð� : "+cd.get(Calendar.YEAR)+"��"+(cd.get(Calendar.MONTH)+1)+"��"+cd.get(Calendar.DATE)+"��"+cd.get(Calendar.HOUR_OF_DAY)+"��"+cd.get(Calendar.MINUTE)+"��"+cd.get(Calendar.SECOND)+"��";
		return time;
	}
		

	public static void main(String[] args) {
		Time_p1.timeZone();
		
		String strID[]= {"Asia/Seoul","America/New_York","Europe/Paris","Europe/London","Australia/Sydney"};
		String strName[]= {"����", "����","�ĸ�","����","�õ��"};
		
		// ���ýð� ��������
		for (int i=0; i<strID.length; i++){
			TimeZone tz=TimeZone.getTimeZone(strID[i]);
			Calendar cd = Calendar.getInstance(tz);
			// Calendar�� abstract class �̹Ƿ�, getInstance��
			// �����ڸ� �����Ѵ�.
			
			String t=Time_p1.cityTime(cd);
			System.out.println(strName[i]+" "+t);
		}

	}

}
