/*
package a.b.c.prac1;
 *
 * �䱸����
 * 
 * 0. NameSpace �ܺο��� �ҷ��� ����� �� ���ϱ�(����� ���ҽ� ����)
 * 1. Ŭ���� ����� �Լ� �����
 * 2. �Լ��� �� ���� ���ؼ�
 * 3. main method �������� �ʱ�ȭ ���� ����
 * 4. try catch finally�� ���� ó���ϱ�
 * 5. Scanner�� ���� �� ��� ó������ ����غ���
 * (charAt)���
 * 
 * 

import java.util.Scanner;
import java.math.BigDecimal;


public class YS_Calcu2 {
	
	public BigDecimal operator(BigDecimal x, BigDecimal y, BigDecimal o){
		// �μ��� �� ���Դ��� Ȯ���ϱ�
		System.out.println("oprator method�ȿ� x >>> "+x);
		System.out.println("oprator method�ȿ� y >>> "+y);
		System.out.println("oprator method�ȿ� o >>> "+o);
		
		// if������ ���� ������ �� ���� Ȯ���ϱ�
		return ans;
	}

	public static void main(String[] args) {
		// main method �������� �ʱ�ȭ
		Scanner sc=null;
		String x="";
		String y="";
		String o="";
		String oo="";
		char co=' ';
		int i=0;
		// '\u0000';
		
		try {
			sc=new Scanner(System.in);
			System.out.println("���꿡 ����� ó�� ���� �Է����ּ���.");
			x=sc.next();
			System.out.println("���꿡 ����� �� ��° ���� �Է����ּ���.");
			y=sc.next();
			
			System.out.println("�Է��Ͻ� ù ��° ����  :"+x+", �ι�° ���� "+y+"�Դϴ�.");
			
			System.out.println("������ �����ڸ� + - * / �߿� �Է��ϼ���.");
			o=sc.next();
			co=o.charAt(0);
			// �Էµ� ù ��° ���ڸ� �̴´�.
			System.out.println("�Է��Ͻ� �����ڴ� >>> "+co);
			
			BigDecimal b1=new BigDecimal(x);
			System.out.println("�Է��Ͻ� ù ��° �� ��Ȯ�� >>> : "+b1);
			
			BigDecimal b2=new BigDecimal(y);
			System.out.println("�Է��Ͻ� �� ��° �� ��Ȯ�� >>> : "+b2);
			
			i=co;
			System.out.println("�Է��� �����ڸ� ������ ��ȯ�� �� >>> : "+i);
			oo=Integer.toBinaryString(i);
			System.out.println("������ 2����Ʈ �ڵ�� ��ȯ�� �� >>> : "+oo);
			
			sc.close();
		}catch(Exception e){
			
		}finally{
			if(sc!=null){
				sc.close();
			}
			System.out.println("���� ���α׷��� �����մϴ�.");
		}
	}
}
*/
