package a.b.c.prac1;

// �䱸����
// 1. ��Ģ���� + - * /
// 2. BicDecimal ���
// 3. �� ������ �Լ��� ���� (�Լ� �̸��� ������ ����� ����)
// 4. ���� ����� main �Լ����� �ֿܼ� ����ϱ�
// 5. �Է��� Scanner Ŭ���� ���

import java.math.BigDecimal;
import java.util.Scanner;
// java.util.Scanner : since 1.5
// java.lang ��Ű���� �ƴϹǷ�, import �ؿ´�.



public class YS_Calcu {
	BigDecimal bicd_oper_add(String input1, String input2, String c){		
		//======================
		System.out.println();
		System.out.print(input1+",");
		System.out.print(input1+",");
		System.out.print(c);
		System.out.println();
		// �� ���Գ� Ȯ���غ��� =====
		
		System.out.println("BigDecimal b1 = new BigDecimal(input1) ����");
		BigDecimal b1 =new BigDecimal(input1);
		System.out.println("add �Լ� �ȿ� b1 >>> : "+b1);
		
		System.out.println("BigDecimal b2 = new BigDecimal(input2) ����");
		BigDecimal b2 =new BigDecimal(input2);
		
		
		
		System.out.println("add �Լ� �ȿ� b2 >>> : "+b2);
		
	
		System.out.println("BigDecimal ans=b1.add(b2); ����");
		BigDecimal ans=b1.add(b2);
		System.out.println("�Լ������� ���� �� >>> : "+ans);
		
		
		return ans;
	}
	
	BigDecimal bicd_oper_subtract(String input1, String input2, String c){
		
		//======================
		System.out.println();
		System.out.print(input1+",");
		System.out.print(input1+",");
		System.out.print(c);
		System.out.println();
		// �� ���Գ� Ȯ���غ��� =====
			
		System.out.println("BigDecimal b1 = new BigDecimal(input1) ����");
		BigDecimal b1 =new BigDecimal(input1);
		System.out.println("subtract �Լ� �ȿ� b1 >>> : "+b1);
		
		System.out.println("BigDecimal b2 = new BigDecimal(input2) ����");
		BigDecimal b2 =new BigDecimal(input2);
		System.out.println("subtract �Լ� �ȿ� b1 >>> : "+b2);
		
		System.out.println("BigDecimal ans=b1.subtract(b2); ����");
		BigDecimal ans=b1.subtract(b2);
		System.out.println("�Լ������� ���� �� >>> : "+ans);
		
		return ans;
	}
	
	BigDecimal bicd_oper_multiply(String input1, String input2, String c){
		
		//======================
		System.out.println();
		System.out.print(input1+",");
		System.out.print(input1+",");
		System.out.print(c);
		System.out.println();
		// �� ���Գ� Ȯ���غ��� =====
		
		System.out.println("BigDecimal b1 = new BigDecimal(input1) ����");
		BigDecimal b1 =new BigDecimal(input1);
		System.out.println("multiply �Լ� �ȿ� b1 >>> : "+b1);
		
		System.out.println("BigDecimal b2 = new BigDecimal(input2) ����");
		BigDecimal b2 =new BigDecimal(input2);
		System.out.println("multiply �Լ� �ȿ� b2 >>> : "+b2);
		
		System.out.println("BigDecimal ans=b1.multiply(b2); ����");
		BigDecimal ans=b1.multiply(b2);
		System.out.println("�Լ������� ���� �� >>> : "+ans);
					
		return ans;
	}
	
	BigDecimal bicd_oper_divide(String input1, String input2, String c){	
		//======================
		System.out.println();
		System.out.print(input1+",");
		System.out.print(input1+",");
		System.out.print(c);
		System.out.println();
		// �� ���Գ� Ȯ���غ��� =====
		
		System.out.println("BigDecimal b1 = new BigDecimal(input1) ����");
		BigDecimal b1 =new BigDecimal(input1);
		System.out.println("divide �Լ� �ȿ� b1 >>> : "+b1);
		
		System.out.println("BigDecimal b2 = new BigDecimal(input2) ����");
		BigDecimal b2 =new BigDecimal(input2);
		System.out.println("divide �Լ� �ȿ� b1 >>> : "+b2);
		
		System.out.println("BigDecimal ans=b1.divide(b2); ����");
		BigDecimal ans=b1.divide(b2);
		System.out.println("�Լ������� ���� �� >>> : "+ans);
		
		return ans;
	}

	public static void main(String[] args) {
		System.out.println("0. main �Լ� ����");
		YS_Calcu ys= new YS_Calcu();
		Scanner sc = new Scanner(System.in);
		System.out.println("1. sc >>> : "+sc);
		
		// �ʱ�ȭ
		String input1="";
		String input2="";
		String c1="";
		int c=0;
		//
		
		// float max, (2-2^-23) 2^127, min, 2^-126
		// double max, (2-2^-52) 2^1023, min,  2^-1074

		try{
			System.out.println("ù ��° ���ڸ� �Ǽ����� ������ �Է��ϼ���.");
			input1=sc.next();
			System.out.println("�� ��° ���ڸ� �Ǽ����� ������ �Է��ϼ���.");
			sc.nextLine();
			input2=sc.next();
			
			// ���� �����ߴ� ���
			System.out.println("���ϱ�� : 1�� �Է��ϼ���.");
			System.out.println("����� : 2�� �Է��ϼ���.");
			System.out.println("���ϱ�� : 3�� �Է��ϼ���.");
			System.out.println("������� : 4�� �Է��ϼ���.");
			c=sc.nextInt();

			System.out.println("c >>> "+c);
			if (c<5) {
				if (c>0){
				if(c==1){
					c1=String.valueOf(c);
					BigDecimal ans1=ys.bicd_oper_add(input1, input2, c1);
					System.out.println("�� : >>> "+ans1);
				}
				if(c==2){
					c1=String.valueOf(c);
					BigDecimal ans1=ys.bicd_oper_subtract(input1, input2, c1);
					System.out.println("�� : >>> "+ans1);
				}
				if(c==3){
					c1=String.valueOf(c);
					BigDecimal ans1=ys.bicd_oper_multiply(input1, input2, c1);
					System.out.println("�� : >>> "+ans1);
				}
				if(c==4){
					c1=String.valueOf(c);
					BigDecimal ans1=ys.bicd_oper_divide(input1, input2, c1);
					System.out.println("�� : >>> "+ans1);
				}
			}
				else {
					System.out.print("���ϱ�, ����, ���ϱ�, ������ ���ڸ� �ٽ� Ȯ���ϼ���.");
				}
		}
			// ������� charAt�� �ڵ带 �ٲ㼭 ����ϼ̴�.
			// �����غ���
			
			
			sc.close();
		}catch(Exception e){
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}finally{
			System.out.println("���� ���α׷��� �����մϴ�.");
			if (sc!=null){
			  sc.close();
			 }
		} // finally
	} // main method

} // YS_Calcu class
