package a.b.c.ch2;

import java.util.Date;
import java.util.Calendar;

// this Ű���� : �ڱ� �ڽ� Ŭ������ ����Ų��. : Object �� ����ϴ� ��� ���, ��ũ��Ʈ�� �����ϰ� ����ȴ�.
public class Exam_This {
	
	String s;
	int i;

	// ������ 
	Exam_This() {
		System.out.println("�� Exam_This Ŭ������ �Ű����� ���� �⺻ �������̴�.");
		System.out.println("this >>> : " + this.getClass().getName());
		System.out.println("this.s >>> : " + this.s);
		System.out.println("this.i >>> : " + this.i);
	}

	Exam_This(String ss) {
		System.out.println("�� Exam_This Ŭ������ �Ű����� String ss  �� �ִ� �������̴�.");
		System.out.println("ss >>> : " + ss);
		System.out.println("this >>> : " + this.getClass().getName());
	}

	public static void main(String args[]) {
		
		
		Exam_This et = new Exam_This();
		System.out.println("et �������� �ּҰ� >>> : " + et);	

		Exam_This et_1 = new Exam_This("������ ��ť");
		System.out.println("et_1 �������� �ּҰ� >>> : " + et_1);	

		// public final Class<?> getClass()
		System.out.println("et.getClass() >>> : " + et.getClass());
		/*
		C:\00.KOSMO108\10.JExam\ch2>javap a.b.c.ch2.Exam_This
		Compiled from "Exam_This.java"
		public class a.b.c.ch2.Exam_This {
		  public a.b.c.ch2.Exam_This();
		  public static void main(java.lang.String[]);
		}
		*/
		// ��������.getCalss().getName()  �� ����ϸ� ���������� Ŭ�����̸�(Ǯ����, ���ӽ����̽�)�� �����Ѵ�.
		System.out.println("et.getClass().getName() >>> : " + et.getClass().getName());		
		
		
		String str = "abc";
		System.out.println("str >>> : " + str);
		System.out.println("str.getClass().getName() >>> : " + str.getClass().getName());		

	
		int iV[] = new int[]{1, 2};
		System.out.println("iV �������� �ּҰ� >>> : " + iV);
		System.out.println("iV.getClass().getName() >>> : " + iV.getClass().getName());

		int iV2[][] = new int[2][3];
		System.out.println("iV2 �������� �ּҰ� >>> : " + iV2);
		System.out.println("iV2.getClass().getName() >>> : " + iV2.getClass().getName());	

		
		Date d = new Date();
		System.out.println("d �������� �ּҰ� >>> : " + d);
		System.out.println("d.getClass().getName() >>> : " + d.getClass().getName());			
	}
}
