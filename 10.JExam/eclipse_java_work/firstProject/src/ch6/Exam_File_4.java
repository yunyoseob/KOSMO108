package a.b.c.ch6;

import java.util.Scanner;

public class Exam_File_4 {

	public static int factorial(int n) {
				
		if (n > 0) {	
			
			System.out.println(">>> : " + n);
			System.out.println(n + "*" + (n - 1) + "\n");
			
			return n * factorial(n - 1);
		}else {
			return 1;
		}
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է� �Ͻÿ� >>> : ");
		int i = sc.nextInt();
		System.out.println("�Է��� ������  >>> : " + i + "\n");
		
		System.out.println(i + "�� ���丮���� " + Exam_File_4.factorial(i) + "�Դϴ�.");	
	}

}
