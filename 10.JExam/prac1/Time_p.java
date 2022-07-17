package a.b.c.prac1;

import java.text.SimpleDateFormat;

public class Time_p {
	public static void main(String[] args) {
	// ���� ���� �ð��� long Ÿ������ ��������
	/*
	 * System.currentTimeMillis()��
	 * ���� �ð��� 1970�� 1�� 1�� 00:00:00 �ÿ��� ���̸�
	 * long������ �����Ѵ�.
	 *
	 * static void : currentTimeMillis()
	 * Returns the current time in millisecond
	 * 
	 * the difference, measured in milliseconds, 
	 * between the current time and midnight, January 1, 1970 UTC.
	 * 
	 * */
	
	long start=System.currentTimeMillis();
	System.out.println("start >>> : "+start);
	System.out.println("start >>> : "+new SimpleDateFormat ("yyyy�� MM�� dd�� HH�� mm�� ss��").format(start));
	System.out.println("start >>> : "+new SimpleDateFormat ("ss��").format(start));
	
	try {
		Thread.sleep(5000);
	}catch(Exception e){
		e.printStackTrace();
	}
	
	long end=System.currentTimeMillis();
	System.out.println("end >>> : "+end);
	System.out.println("end >>> : "
			+ new SimpleDateFormat("yyyy�� MM�� dd�� HH�� mm�� ss��").format(end));
	
	long idle_second = (end-start)/1000;
	// �и��ʰ����  1�ʴ����� long Ÿ�Կ� �����϶�
	long idle_minute=(end-start)/(1000*60);
	// �и��ʰ���� 1 �д����� long Ÿ�Կ� �����϶�.
	long idle_hour=(end-start)/(1000*60*60);
	// �и��ʰ���� 1�ð� ������ long Ÿ�Կ� �����϶�.
	System.out.println("����ð� (1�ʴ���) >>> : "+idle_second+"��");
	System.out.println("����ð� (1�д���) >>> : "+idle_minute+"��");
	System.out.println("����ð� (1�ð�����) >>> :"+idle_hour+"��");

	} // main method

} // Time_p class
