package a.b.c.ch2;

import java.util.Date;
import java.util.Calendar;

// this Ű���� : �ڱ� �ڽ� Ŭ������ ����Ų��. : Object �� ����ϴ� ��� ���, ��ũ��Ʈ�� �����ϰ� ����ȴ�.
public class Get_Class_p{
	String s;
	int i;

	Get_Class_p(){
		System.out.println("1. Get_Class_p�� �⺻ ������ \n");
		System.out.println("\n 2. this >>> : "+this.getClass().getName());
		System.out.println("\n 3. this.s >>> : "+this.s);
		System.out.println("\n 4. this.i >>> : "+this.i);
	}

	Get_Class_p(String ss){
		System.out.println("\n 6. Get_Class_p�� �Ű����� String ss�� �ִ� ������");
		System.out.println("\n 7. this >>> : "+this.getClass().getName());
	}

	public static void main(String args[]){
		Get_Class_p rv=new Get_Class_p();
		System.out.println("\n 5. rv �������� �ּҰ� >>> : "+rv);

		Get_Class_p rv_1=new Get_Class_p("���� �ֱ�");
		System.out.println("\n 8. rv_1 �������� �ּҰ� >>> : "+rv_1);

		System.out.println("\n 9. rv.getClass() >>> : "+rv.getClass());
		System.out.println("\n 10. rv.getClass().getName() >>> : "+rv.getClass().getName());

		int iArr[]=new int[]{1,2};
		System.out.println("\n 11. iArr �������� �ּҰ� >>> : "+iArr);

		int iArr_2[][]=new int[2][3];
		System.out.println("\n 12. iArr_2.getClass().getName() >>> : "+iArr_2.getClass().getName());

		Date d=new Date();
		System.out.println("\n 13. d �������� �ּҰ� >>> : "+d);
		System.out.println("\n 14. d.getClass().getName() >>> : "+d.getClass().getName());
	} // main method
} // Get_Class_p class