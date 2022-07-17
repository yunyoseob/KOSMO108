package a.b.c.prac1;

import java.math.BigDecimal;

public class Math_10 {

	public static void main(String[] args) {
		// �����û ����, �浵 : 37.56632697499861, 126.97792762801669
		String x="37.56632697499861";
		String y="126.97792762801669";
		// double x = 1.1234567892222;
		// double y = 1.2343456789111";
		
		// BigDecimal ����� �� ���ڼ��ڷ� �ʱ�ȭ �ؾ� �Ѵ�.
		// ���ڷ� �ʱ�ȭ �ϸ� ����ȯ�� ����� ��� ������ �� ���� ���ɼ��� �ִ�.
		BigDecimal b1=new BigDecimal(x);
		// BigDecimal b2=new BigDecimal(String.valueOf(y));
		System.out.println("b1 >>> : "+b1);
		// b1 >>> : 37.56632697499861
		BigDecimal b2=new BigDecimal(y);
		System.out.println("b2 >>> : "+b2);
		// b2 >>> : 126.97792762801669
		
		// BigDecimal�� double �ڷ����� ������ �� �Ǵ� ����
		double dx=37.56632697499861;
		double dy=126.97792762801669;
		
		BigDecimal b11=new BigDecimal(dx);
		BigDecimal b22=new BigDecimal(dy);
		
		System.out.println("dx >>> : "+dx);
		// dx >>> : 37.56632697499861
		System.out.println("dy >>> : "+dy);
		// dy >>> : 126.97792762801669
		
		// add : BigDecimal vs Double
		BigDecimal badd=b1.add(b2);
		System.out.println("badd >>> : "+badd);
		// badd >>> : 164.54425460301530
		BigDecimal badd_D=b11.add(b22);
		System.out.println("badd_D >>> : "+badd_D);
		// badd_D >>> : 164.54425460301529682283216970972716808319091796875
		
		/*
		 * ���� ������ �־ �������� �ּҰ��� double�� ���������� ����ų�,
		 * String ���������� ����ų� �ּ� ���� �Ȱ���. �׷���,
		 * �� �� ���ϱ⸦ �õ����� ��, ������� �ٸ���.
		 * */
		
		System.out.println("=======================================");
		System.out.println("== BigDecimal �������� ������ ���ڼ��� ���� �� ==");
		System.out.println("== ����� double�� ���� �ڷ��� ���� �� ��            ==");
		System.out.println("========================================");
		
		badd=badd.setScale(3, BigDecimal.ROUND_DOWN);
		System.out.println("badd.setScale(3, BigDecimal.ROUND_DOWN) >>> "+badd);
		// BigDecimal : setScale (�������� ����)
		// �� �� �ϳ���, BigDecimal : setScale(int newScale, int roundingMode)
		// The new setScale(int, RoundingMode) method should be 
		// used in preference to this legacy method.
		// �������� �ǹ̷δ� legacy�� �����ε�, ���� �������� �����޾ƿ��� �̷� �����ε�?
		// ���������� �̷��� ���� ���� ��ȣ�Ѵ� ī����?
		
		// before setScale 3 badd >>> : 164.54425460301530
		// after setScale 3 badd >>> : 164.544
		// �Ҽ��� �� ��° �ڸ����� �ڸ��� ���� Ȯ�� �� �� ����.
		
		// ������ ���� ���ؾ� �ϴ� ���? => �ð� �����ϴ� ���߿� üũ
		
		// ����
		BigDecimal bsub=b1.subtract(b2);
		// b1 - b2���� , b2 - b1 ����
		// �� ���� ��ȣ�� �ٸ� ���� ��� ó���Ǵ���?
		System.out.println("bsub >>> : "+bsub);
		BigDecimal bsub_D=b11.subtract(b22);
		System.out.println("bsub_D >>> : "+bsub_D);
		
		
		BigDecimal bmul=b1.multiply(b2);
		System.out.println("bmul >>> : "+bmul);
		BigDecimal bmul_D=b11.multiply(b22);
		System.out.println("bmul_D >>> : "+bmul_D);
		
		BigDecimal bdiv=b2.divide(b1);
		System.out.println("bdiv >>> : "+bdiv);
		BigDecimal bdiv_D=b22.divide(b11);
		System.out.println("bdiv_D >>> : "+bdiv_D);	
	}

}
