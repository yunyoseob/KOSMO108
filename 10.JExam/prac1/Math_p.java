package a.b.c.prac1;

/* 
 * �����ؾ� ���� 
 * static long : round(double a)
 * static int : round(float a)
 * round �Լ� �μ��� � ������ Ÿ���� ���Ŀ� ����
 * ��ȯ�Ǵ� �����ڷ��� ������ �ٸ�.
*/ 


import java.text.DecimalFormat;

public class Math_p {
	void math_test(double args){
		System.out.println("math_test(double args) method ���� \n");
		System.out.println("1. args >>> "+args);
		System.out.println("2. Math.round(args) >>> "+Math.round(args));
		System.out.println("3. args*100 >>> "+Math.round(args*100));
		System.out.println("4. args*100/100.0 >>> "+Math.round(args*100)/100.0);
		System.out.println("5. args*1000 >>> "+Math.round(args*1000));
		System.out.println("6. args*1000/1000.0 >>> "+Math.round(args*1000)/1000.0);
		System.out.println("7. args*100000 >>> "+Math.round(args*100000));
		System.out.println("8. args*100000/100000.0 >>> "+Math.round(args*100000)/100000.0);
		System.out.println("\n String Ŭ������ format �޼���� �ݿø��ϱ�  ");
		System.out.println("9. args .2f >>> "+String.format("%.2f", args));
		System.out.println("10. args .3f >>> "+String.format("%.3f", args));
		System.out.println("11. args .5f >>> "+String.format("%.5f", args));
		System.out.println("\n DecimalFormat df = new DecimalFormat(\"#.###\"); ");
		DecimalFormat df = new DecimalFormat("#.###");
		System.out.println("12. df >>> "+df.format(args));
		System.out.println("\n 13. Math.floor(args) >>> "+Math.floor(args));
	}

	public static void main(String[] args) {
		double e=Math.E;
		double pi=Math.PI;
		
		new Math_p().math_test(e);
		
		new Math_p().math_test(pi);

		// ���� �ƴ� �����̶� ��¦ �޶� api����
		// round : �ݿø� : ���� ���� �Ǽ��� �Ҽ��� ù ��° �ڸ����� �ݿø��� ��� ��ȯ
		double round = Math.round(10.1);
		System.out.println("round >>> : " + round);
		// ceil : �ø� : ���� ���� �Ǽ����� ũ�ų� ���� ���� �� ���� ���� ���� ��ȯ
		double ceil = Math.ceil(10.1);
		System.out.println("ceil >>> : " + ceil);
		
		// floor : ����  : ���� ���� �Ǽ����� ���� ���� �� ���� ū ���� ��ȯ
		double floor = Math.floor(10.9);
		System.out.println("floor >>> : " + floor);
		
		// pow : �������� :
		double pow = Math.pow(5, 2);
		System.out.println("pow >>> : " + pow);	
		
		// abs: ���밪 :
		System.out.println("Math.abs(-10) >>> : " + Math.abs(-10));
		System.out.println("Math.abs(0) >>> : " + Math.abs(0));
		System.out.println("Math.abs(10) >>> : " + Math.abs(10));
	
		// max : ū �� :
		int max = Math.max(2, 5);
		System.out.println("max >>> : " + max);
		
		// min : ���� �� :
		int min = Math.min(3, 2);
		System.out.println("min >>> : " + min);
	
	}

}
