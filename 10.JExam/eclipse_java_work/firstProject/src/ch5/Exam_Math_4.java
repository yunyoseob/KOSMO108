package a.b.c.ch5;

import java.util.Scanner;

public class Exam_Math_4 {

	public static void main(String[] args) {

		// public static double random()
		int answer = (int)(Math.random() * 100) + 1;
		System.out.println("answer >>> : " + answer);
		
		int input = 0;
		int count = 0;
		
		
		Scanner sc = new Scanner(System.in);
		
		do{
			count++;
			System.out.println("1 �� 100���� ���� �Է��ϼ��� !!");
			
			input = sc.nextInt();
			
			if (answer > input){
				System.out.println("�� ū ���� �Է��ϼ��� !! \n");
			}else if (answer < input){
				System.out.println("�� ���� ���� �Է��ϼ��� !!\n");
			}else{
				System.out.println("GOOD !!");	
				System.out.println("�õ�Ƚ���� " + count + " �� �Դϴ�.");	
				break;
			}
			
			if (count == 10) {
				sc.close();
				break;
			}
		}
		while (true);
		
		sc.close();
		
	}
}
