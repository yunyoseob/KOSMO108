package a.b.c.ch5;

import java.util.Scanner;

public class Exam_Math_2 {

	public static void main(String[] args) {
		System.out.println("1. main �Լ� ����  \n");

		// public static double random()
		int answer = (int)(Math.random() * 100) + 1;
		System.out.println("\n 2. answer >>> : " + answer);
		
		int input = 0;
		int count = 0;
		System.out.println("\n 3. int input initialize check >>> "+input);
		System.out.println("\n 4. int count initialize chek >>> "+count);

				
		Scanner sc = new Scanner(System.in);
		System.out.println("\n 5. Scanner sc >>> "+sc);
		
		for (int i=0; i < 10; i++) {
			
			System.out.println("1 �� 100 ������ ���� �Է��Ͻÿ� >>> : ");
			
			System.out.println("count++ : count�� �ϳ� �ø��ϴ�.");
			count++;
			System.out.println("count >>> : " + count);
			
			input = sc.nextInt();
			System.out.println("input >>> : " + input);
			
			if (answer == input) {
				System.out.println("answer >>> : " + answer);
				System.out.println("input >>> : " + input);
				System.out.println("���� !!! >>> : " + count + " ��");
				break;
			}else if (answer > input) {
				System.out.println("answer >>> : " + answer);
				System.out.println("input >>> : " + input);
				System.out.println("�� ū ���� �Է��Ͻÿ� !!! >>> : \n");
			}else if (answer < input) {
				System.out.println("answer >>> : " + answer);
				System.out.println("input >>> : " + input);
				System.out.println("�� ����1 ���� �Է��Ͻÿ� !!! >>> : \n");
			}
			
			if (count == 10) {
				System.out.println("count >>> : " + count);
				sc.close();
				break;
			}
		}
		sc.close();
		
	}
}
