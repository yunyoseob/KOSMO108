package a.b.c.ch6;

import java.util.Scanner;

public class Exam_IOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("IO �׽�Ʈ ���� : ");				
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		System.out.println("data >>> : " + data);
		System.out.println("binary >>> : " + Integer.toBinaryString(data));
		
		
		System.out.println("IO �׽�Ʈ ���� : ");						
		Scanner sc1 = new Scanner(System.in);		
		String dataS = sc1.nextLine();
		
		System.out.println("���� >>> : " + dataS);
		
		for (int i=0; i < dataS.length(); i++ ){
			char c = dataS.charAt(i);
			System.out.println("binary >>> : " 
				                + " : " + c
				                + " : " + (byte)c
				                + " : " + Integer.toBinaryString((byte)c));

		}
		
		sc.close();
		sc1.close();	
	}

}
