package a.b.c.prac1;

import java.util.Scanner;

public class String_p2 {

	public static void main(String[] args) {
		String s="";
		String s1="";
		String s2="";
		String s3="";
		String s4="";
		int i=0;
		int z=0;
		int z1=0;
		System.out.println("������ �̸��� �Է��ϼ���.");
		Scanner sc=new Scanner(System.in);
		s=sc.next();
		
		System.out.println("�Է��� ���� >>> "+s);
		
		//====================charAt �ǽ�=========================
		System.out.println("charAt �ǽ�");
		System.out.println("�� ���ھ� ����ϱ� (��ȯ �Ǵ� �ڷ��� : char)");
		System.out.println("����� ���� �� ���ھ� ����ϸ鼭 ������ Ȯ���ϱ�");
		i=s.length();
		System.out.println("�Է��� ������ ���� >>> "+i);
		
		for (int j=0; j<i; j++){
			System.out.println("s.charAt( "+j+" ) index(key) "+s.charAt(j)+"  value");
		}
		//====================charAt ��===========================
		
		//===================substring �ǽ�=========================
		System.out.println("substring �ǽ�");
		System.out.println("��� ��ġ�� ���� ������ �ϳ��� ã�ƺ���");	
		s2=s.substring(1);
		System.out.println("index 1���Ŀ� �ִ� ���� >>> : "+s2);
		System.out.println("substring���� ã�� ���� ���� >>> : "+s2.length());
		
		System.out.println("��� ��ġ�� ���� ������ ������ ã�ƺ���");	
		s2=s.substring(2,5);
		// 3��° ������ 6��° ������ ����ض�
		System.out.println("���� ���� 3��° ������ 6��° ���� �� >>> : "+s2);
		System.out.println("3~6���� ���� ���� >>> : "+s2.length());
		//===================substring ��==========================
		
		//===================indexOf �ǽ�===========================
		System.out.println("indexOf �ǽ�");
		System.out.println("ã�����ϴ� ���� ��ġ �˱�");
		z=s.indexOf(".");
		// char String int �� �ȴ�.
		System.out.println("ã�����ϴ� ���� ��ġ(index) >>>> "+z);
		System.out.println("ã�����ϴ� ���� ��ġ(index)�� ��(value) >>>> "+s.substring(z));
		System.out.println("���� -1�� ������ �� ã�� ���̴�.");
		
		System.out.print("�ڿ��� ���� ã�� ���");
		z1=s.lastIndexOf(".");
		System.out.println("ã�����ϴ� ���� ��ġ(index) >>>> "+z1);
		System.out.println("ã�����ϴ� ���� ��ġ(index)�� ��(value) >>>> "+s.substring(z1));
		//===================indexOf ��===========================
		
		
		sc.close();

	}

}
