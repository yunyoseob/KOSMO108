package a.b.c.prac1;

import java.util.Calendar;
//import java.util.TimeZone;


//@SuppressWarnings("unused")
public class Time_Clock_p implements Runnable{
	
	private Thread thread;
	
	public Time_Clock_p(){
		if(thread==null){
			thread=new Thread(this);
			thread.start();
		}
	}
	
	@Override
	public void run(){
		while(true){
			Calendar cal=Calendar.getInstance();
			String now=cal.get(Calendar.YEAR)+"��"+(cal.get(Calendar.MONTH)+1)+"��"+cal.get(Calendar.DATE)+"��"+cal.get(Calendar.HOUR)+"��"+cal.get(Calendar.MINUTE)+"��"+cal.get(Calendar.SECOND)+"��";
			System.out.println(now);
			try{
				Thread.sleep(1000);
				// 1000�� 1�ʶ�� ��
			}catch(InterruptedException e){
			}
		}
	}
	

	public static void main(String args[]){
		new Time_Clock_p();
	}
}


