package a.b.c.prac1;

import java.util.Scanner;

/*
 * �̼� : ���� ���� �ּ� ���� ������ �Ÿ� ����ϱ�
 * x1 ����� ����, x2 ������ ����
 * y1 ����� �浵, y2 ������ �浵
*/

public class FromhereTohome {
	static double degree2radius(double degree){
		// System.out.println("degree2radius �Լ� ���� ");
		// System.out.print("\n degree : "+degree+"\n");
		double d=degree*(Math.PI/180);
		d=Math.abs(d);
		// System.out.println("d >>> "+d);
		return d; 
	}
	
	static double haversine(double x1, double y1, double x2, double y2){
		/*
		System.out.println("harversine �Լ� ���� \n");
		System.out.print("����� ���� >>> "+x1);
		System.out.println();
		System.out.print("����� �浵 >>> "+y1);
		System.out.println();
		System.out.print("������ ���� >>> "+x2);
		System.out.println();
		System.out.print("������ �浵 >>> "+y2);
		System.out.println();
		*/
		double r=0;
		double x_d=0;
		double y_d=0;
		double x_d_1=0;
		double y_d_1=0;
		double a=0;
		double b=0;
		double c=0;
		double c1=0;
		double c2=0;
		double h=0;
		String s;
		double dis=0;
		double y11=0;
		double y22=0;
		
		r=6371;
		// ������ �ݰ�(���� : km)
		
		x_d=x2-x1;
		y_d=y2-y1;
		
		x_d_1=degree2radius(x_d);
		// dLon
		y_d_1=degree2radius(y_d);
		// dLat
		
		y11=degree2radius(y1);
		y22=degree2radius(y2);
		
		a=Math.sin(y_d_1/2.0)*Math.sin(y_d_1/2.0);
		b=Math.cos(y11)*Math.cos(y22)*Math.sin(x_d_1/2.0)*Math.sin(x_d_1/2.0);
		c=a+b;
		
		
		c1=Math.sqrt(c);
		c2=Math.sqrt(1.0-c);
		
		h=2*Math.atan2(c1, c2);
		h=r*h;
		//s=String.format("%.5f", h);
		//dis=Double.parseDouble(s);
		
		return h;
	}
	
	public static void main(String[] args) {
		double x1=0;
		double y1=0;
		double x2=0;
		double y2=0;
		double distance=0;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("������� ������ �Է��Ͽ� �ּ���.");
		try {
			x1=sc.nextDouble();
			System.out.println("������� �浵�� �Է��Ͽ� �ּ���.");
			sc.nextLine();
			y1=sc.nextDouble();
			System.out.println("�������� ������ �Է��Ͽ� �ּ���.");
			x2=sc.nextDouble();
			System.out.println("�������� �浵�� �Է��Ͽ� �ּ���.");
			y2=sc.nextDouble();
			
			distance=haversine(x1, y1, x2, y2);
			System.out.println("����� ���� ������������ �Ÿ��� "+distance+" km �Դϴ�.");
			
		}catch(Exception e){
			System.out.println(e);
			System.out.println(e.getMessage());
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			
		}finally{
			System.out.println("�Ÿ� ���ϱ� ���α׷��� �����մϴ�.");
			sc.close();
		
		}
	}
}
