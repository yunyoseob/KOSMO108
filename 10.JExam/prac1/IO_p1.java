package a.b.c.prac1;

import java.util.Scanner;

public class IO_p1 {

	public static void main(String[] args) {
		System.out.println("IO �׽�Ʈ ���� ");
		Scanner sc=new Scanner(System.in);
		int data=sc.nextInt();
		System.out.println("���� ���� ������ >>> : "+data);
		System.out.println("���� ������ binary ��ȯ >>> : "+Integer.toBinaryString(data));
		
		System.out.println("IO �׽�Ʈ ���� ");
		Scanner sc1=new Scanner(System.in);
		String dataS=sc1.nextLine();
		
		System.out.println("���� ���� ������ >>> : "+dataS);
		
		for (int i=0; i<dataS.length(); i++){
			char c=dataS.charAt(i);
			System.out.println("binary >>> : "
							   +" : "+c
							   +" : "+(byte)c
							   +" : "+Integer.toBinaryString((byte)c));
		}
		// ������ ������ ������ char�� 2byte, byte�� 1byte
		// ����ȯ �������� ������ ���� �� ����.
		
		/*============����====
		// byte -> char -> string
		System.out.println("IO ���� �׽�Ʈ ");
		Scanner sc2=new Scanner(System.in);
		Byte data2=sc.nextByte();
		String s1="";
		char c2=' ';
		int i2=0;
		System.out.println("data2 >>> : "+data2);
		
		try {
			s1=String.toString(data2);
			System.out.println("c2 >>> : "+c2);
			s1=Integer.toHexString(data2);
			System.out.println("Integer.toHexString(data2) >>> : "+s1);
			i2=Integer.parseInt(s1);
			System.out.println("Integer.parseInt(s1) >>> "+i2);
		}catch(Exception e){
			System.out.println("error >>> : "+e.getMessage());
		}
		*/
		
		
		sc.close();
		sc1.close();
		//sc2.close();
	}

}
