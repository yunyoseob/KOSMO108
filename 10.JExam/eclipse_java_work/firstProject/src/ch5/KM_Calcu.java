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
public class KM_Calcu {
	
	public BigDecimal kmAdd(String x, String y) {

		BigDecimal b1 = new BigDecimal(x); 						
		BigDecimal b2 = new BigDecimal(y);
 		BigDecimal badd = b1.add(b2);
 		
		return badd;
	}
	public BigDecimal kmSubtract(String x, String y) {
		
		BigDecimal b1 = new BigDecimal(x); 						
		BigDecimal b2 = new BigDecimal(y);
 		BigDecimal bsubtract = b1.subtract(b2);
 		
		return bsubtract;
	}
	public BigDecimal kmMultiply(String x, String y) {
		
		BigDecimal b1 = new BigDecimal(x); 						
		BigDecimal b2 = new BigDecimal(y);
 		BigDecimal bmultiply = b1.multiply(b2);
 		
		return bmultiply;
	}
	public BigDecimal kmDivide(String x, String y) {
		
		BigDecimal b1 = new BigDecimal(x); 						
		BigDecimal b2 = new BigDecimal(y);
 		BigDecimal bdivide = b1.divide(b2);
 		
		return bdivide;
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
	
			
			if (0x2B == cOper) {
				// +
				System.out.println("������  �����ڴ�>>> : " + cOper);
				
				KM_Calcu km_add = new KM_Calcu();
				BigDecimal badd = km_add.kmAdd(x, y);
				
				System.out.println(x + " + " + y + " = " + badd);			
			}
			if (0x2D == cOper) {
				// -				
				System.out.println("������  �����ڴ�>>> : " + cOper);
				
				KM_Calcu km_sub = new KM_Calcu();
				BigDecimal bsubtract= km_sub.kmSubtract(x, y);
				
				System.out.println(x + " - " + y + " = " + bsubtract);
			}
			if (0x2A == cOper) {
				// *				
				System.out.println("������  �����ڴ�>>> : " + cOper);
				
				KM_Calcu km_mul = new KM_Calcu();
				BigDecimal bmultiply = km_mul.kmMultiply(x, y);
				
				System.out.println(x + " * " + y + " = " + bmultiply);
			}
			if (0x2F == cOper) {
				// /				
				System.out.println("������  �����ڴ�>>> : " + cOper);
				
				KM_Calcu km_div = new KM_Calcu();
				BigDecimal bdivide = km_div.kmDivide(x, y);
				
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
