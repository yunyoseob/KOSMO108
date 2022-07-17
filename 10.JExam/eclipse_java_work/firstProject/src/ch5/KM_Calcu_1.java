package a.b.c.ch5;

import java.math.BigDecimal;
import java.util.Scanner;

// �䱸����
/*
1. ��Ģ���� : + - * /
2. BicDecimal ���
3. �� ������ �Լ� ����, �Լ� �̸��� ���� ����� ���� 
4. ���� ����� main �Լ����� �ֿܼ� ����ϱ� 
5. �Է��� Scanner Ŭ���� ���

13:00 ���� ����� 
*/
// ���� ���� 
public class KM_Calcu_1 {
	
	public BigDecimal kmAdd(BigDecimal b1, BigDecimal b2) {	
		return b1.add(b2);
	}
	public BigDecimal kmSubtract(BigDecimal b1, BigDecimal b2) { 		
		return b1.subtract(b2);
	}
	public BigDecimal kmMultiply(BigDecimal b1, BigDecimal b2) {
		return b1.multiply(b2);
	}
	public BigDecimal kmDivide(BigDecimal b1, BigDecimal b2) {
		return b1.divide(b2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = null;
		
		String x = "";
		String y = "";
		String oper = "";
		char cOper = '\u0000';
				
		try {
		
			sc = new Scanner(System.in);
			
			System.out.println("������ x ���� �Է��Ͻÿ� >>> : ");
			x = sc.next();
			System.out.println("x >>> : " + x);
			
			System.out.println("������ y ���� �Է��Ͻÿ� >>> : ");
			y = sc.next();
			System.out.println("y >>> : " + y);
			
			System.out.println("������  �����ڸ�  + - * /  �Է��Ͻÿ� >>> : ");
			oper = sc.next();
			cOper = oper.charAt(0);
			System.out.println("cOper >>> : " + cOper);
	
			// �Էº����� �򵥽ø��� �ʱ�ȭ�ؼ� ���
			BigDecimal b1 = new BigDecimal(x); 						
			BigDecimal b2 = new BigDecimal(y);
			
			if (0x2B == cOper) {
				// +
				System.out.println("������  �����ڴ�>>> : " + cOper);
				
				KM_Calcu_1 km_add = new KM_Calcu_1();
				BigDecimal badd = km_add.kmAdd(b1, b2);
				
				System.out.println(x + " + " + y + " = " + badd);			
			}
			if (0x2D == cOper) {
				// -				
				System.out.println("������  �����ڴ�>>> : " + cOper);
				
				KM_Calcu_1 km_sub = new KM_Calcu_1();
				BigDecimal bsubtract= km_sub.kmSubtract(b1, b2);
				
				System.out.println(x + " - " + y + " = " + bsubtract);
			}
			if (0x2A == cOper) {
				// *				
				System.out.println("������  �����ڴ�>>> : " + cOper);
				
				KM_Calcu_1 km_mul = new KM_Calcu_1();
				BigDecimal bmultiply = km_mul.kmMultiply(b1, b2);
				
				System.out.println(x + " * " + y + " = " + bmultiply);
			}
			if (0x2F == cOper) {				
				System.out.println("������  �����ڴ�>>> : " + cOper);
				
				KM_Calcu_1 km_div = new KM_Calcu_1();
				BigDecimal bdivide = km_div.kmDivide(b1, b2);
				
				System.out.println(x + " / " + y + " = " + bdivide);
			}
			
			sc.close();
		}catch(Exception e) {
			System.out.println("������ >>> : " + e.getMessage());
		}finally {
			if (sc !=null) {
				sc.close();
			}
		}
	}
}
