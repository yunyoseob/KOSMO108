package a.b.c.ch5;

import java.text.DecimalFormat;

public class Exam_Math {
	
	double de = Math.E;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// java.lang.Math
		// public static final double E
		double e = Math.E;
		System.out.println("e >>> : " + e);
		System.out.println("e >>> : " + Math.round(e));
		
		System.out.println("e >>> : " + Math.round(e*100));
		System.out.println("e >>> : " + Math.round(e*100)/100.0);
		System.out.println("e >>> : " + Math.round(e*1000));
		System.out.println("e >>> : " + Math.round(e*1000)/1000.0);
		System.out.println("e >>> : " + Math.round(e*100000));
		System.out.println("e >>> : " + Math.round(e*100000)/100000.0);		
		
		System.out.println("e >>> : " + String.format("%.2f", e));
		System.out.println("e >>> : " + String.format("%.3f", e));
		System.out.println("e >>> : " + String.format("%.5f", e));	
		
		DecimalFormat df = new DecimalFormat("#.###");
		System.out.println("df >>> : " + df.format(1.234567));
		System.out.println("df >>> : " + df.format(e));
		
		System.out.println("Math.floor(e) >>> : " + Math.floor(e));
		
				
		System.out.println("Math.E >>> : " + Math.E);
		System.out.println("Math.E >>> : " + Math.round(Math.E));
		System.out.println("Math.E >>> : " + Math.floor(Math.E));
		
		// java.lang.Math
		// public static final double PI
		double pi = Math.PI;
		System.out.println("p1 >>> : " + pi);
		
		
		// round : �ݿø� : ���� ���� �Ǽ��� �Ҽ��� ù ��° �ڸ����� �ݿø��� ��� ��ȯ
		double round = Math.round(10.1);
		System.out.println("round >>> : " + round);
				
		// ceil : �ø� : ���� ���� �Ǽ����� ���� ���� �� ���� ���� ���� ��ȯ
		double ceil = Math.ceil(10.1);
		System.out.println("ceil >>> : " + ceil);
		
		// floor : ���� : ���� ���� �Ǽ����� ���� ���� �� ���� ū ���� ��ȯ
		double floor = Math.floor(10.9);
		System.out.println("floor >>> : " + floor);
		
		// pow : �������� : (5, 2) -> 25
		double pow = Math.pow(5, 2);
		System.out.println("pow >>> : " + pow);		
		
		
		// abs : ���밪 ��ȯ : absolute number
		System.out.println("Math.abs(-10) >>> : " + Math.abs(-10));
		System.out.println("Math.abs(0) >>> : " + Math.abs(0));
		System.out.println("Math.abs(10) >>> : " + Math.abs(10));
		
		// max : ū��
		int max = Math.max(2, 2);
		System.out.println("max >>> : " + max);
		
		// min : ���� ��
		int min = Math.min(2, 2);
		System.out.println("min >>> : " + min);
	
	}
}
