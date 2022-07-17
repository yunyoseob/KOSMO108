package a.b.c.ch5;

import java.math.BigDecimal;

public class Exam_Math_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// double x = 1.12345678922222;
		// double y = 1.2343456789111;
		String x = "1.12345678922222";
		String y = "1.2343456789111";

		// �򵥽ø� ����� �� ���ڼ��ڷ� �ʱ�ȭ �ؾ� �Ѵ�.
		// ���ڷ� �ʱ�ȭ �ϸ� ����ȯ�� ����� ��� ������ �� ���� ���ɼ��� �ִ�. 
//		BigDecimal b1 = new BigDecimal("1.12345678922222");
//		BigDecimal b2 = new BigDecimal("1.2343456789111");
		
		BigDecimal b1 = new BigDecimal(x);
		// BigDecimal b1 = new BigDecimal(String.valueOf(x));		
		System.out.println("b1 >>> : " + b1);
		
		BigDecimal b2 = new BigDecimal(y);
		// BigDecimal b2 = new BigDecimal(String.valueOf(y));
		System.out.println("b2 >>> : " + b2);
		
		// public BigDecimal add(BigDecimal augend)
		// ���ϱ� 
		BigDecimal badd = b1.add(b2);
		System.out.println("badd >>> : " + badd);
		/*
		double x = 1.12345678922222;
		double y = 1.2343456789111;
		b1 >>> : 1.12345678922222003137676438200287520885467529296875
		b2 >>> : 1.23434567891110003046151177841238677501678466796875
        badd >>> : 2.35780246813332006183827616041526198387145996093750
        
        String x = "1.12345678922222";
		String y = "1.2343456789111";
		b1 >>> : 1.12345678922222
		b2 >>> : 1.2343456789111
		badd >>> : 2.35780246813332
		*/
		badd = badd.setScale(3, BigDecimal.ROUND_DOWN);
		System.out.println("badd >>> : " + badd);
		
		// ����
		BigDecimal bsub = b1.subtract(b2);
		System.out.println("bsub >>> : " + bsub);		
		bsub = bsub.setScale(3, BigDecimal.ROUND_HALF_EVEN);
		System.out.println("bsub >>> : " + bsub);
		
		// ���ϱ� 
		BigDecimal bmul = b1.multiply(b2);
		System.out.println("bmul >>> : " + bmul);		
		bmul = bmul.setScale(3, BigDecimal.ROUND_DOWN);
		System.out.println("bmul >>> : " + bmul);
		
		// ������ 
		// BigDecimal bdiv = b1.divide(b2);
		BigDecimal bdiv = b1.divide(b2, 3, BigDecimal.ROUND_DOWN);
		System.out.println("bdiv >>> : " + bdiv);		
//		bdiv = bdiv.setScale(3, BigDecimal.ROUND_DOWN);
//		System.out.println("bdiv >>> : " + bdiv);
		
	}
}
