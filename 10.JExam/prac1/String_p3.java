package a.b.c.prac1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class String_p3 {
	public static String yearMonthDate(){
		System.out.println("yearMonthDate �Լ� ����>>>");
		return new SimpleDateFormat("yyyyMMdd").format(new Date());
	}

	public static void main(String[] args) {
			Scanner sc=null;
		try{
			sc=new Scanner(System.in);
			String s="";
			String s1="";
			String s2="";
			String s3="";
			String s4=".pdf";
			String s5="";
			int a=0;
			int b=0;

			System.out.println("���� �̸��� �Է��ϼ���.");
			s=sc.next();
		
			System.out.println("�Է��� ������ �̸� >>> : "+s);
			
			a=s.length();
			System.out.println("�Է��� ������ ���� >>> : "+a);
			System.out.println("�Է��� ������ �̸� �� ���ھ� ����");
			for (int i=0; i<s.length(); i++){
				System.out.println("s.charAt("+i+") ==> "+s.charAt(i));
			}
			
		
			b=s.indexOf('.');
			System.out.println(" ���� Ȯ���� dot��  �ִ� index ��ġ >>> : "+b);
		
			s1=s.substring(0,b);
			System.out.println("dot �ڿ� �ִ� ���� >>> : "+s1);
		
			s2=String_p3.yearMonthDate();
			System.out.println("���� �� �� �� >>> : "+s2);
		
			s3=s2.concat(s1);
			System.out.println("�������� + �����̸� >>> "+s3);
			
			s5=s3.concat(s4);
			System.out.println("��������+�����̸�+Ȯ���� >>> "+s5);
			
			sc.close();
			}catch(Exception e){
				System.out.println("���� ���� >>> : "+e.getMessage());
			}finally{
				System.out.println("���� ��¥+�����̸�+pdf ������ �����մϴ�.");
				if(sc!=null){
					sc.close();
				}				
			}
	}
}
