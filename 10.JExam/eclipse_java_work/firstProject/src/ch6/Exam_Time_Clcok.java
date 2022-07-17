package a.b.c.ch6;

import java.util.Calendar;
import java.util.TimeZone;

public class Exam_Time_Clcok implements Runnable{

	private Thread thread;
	
	public Exam_Time_Clcok() {
		
		if(thread == null){
            
            //this�� �ǹ̴� Runnable�� ������ ��ü�� ����(DigitalClock)
            thread = new Thread(this);
            thread.start();
        }
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub

		while(true){
	           
        	Calendar cal = Calendar.getInstance();
            String now = 	cal.get(Calendar.YEAR)+"��"+
		                    (cal.get(Calendar.MONTH)+1)+"��"+
		                    cal.get(Calendar.DATE)+"��"+
		                    cal.get(Calendar.HOUR)+"��"+
		                    cal.get(Calendar.MINUTE)+"��"+
		                    cal.get(Calendar.SECOND)+"��";
            
            System.out.println(now);
           
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){               
            }
        }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Exam_Time_Clcok();
	}

	
}
