package a.b.c.prac1;

import java.util.Scanner;

public class Math_p3 {

	public static void main(String[] args) {
		int answer = (int)(Math.random() * 100) + 1;
		System.out.println("answer >>> : " + answer);
		
		Scanner sc=new Scanner(System.in);
		
		int input = 0;
		boolean iBool;
		
		try {
			do {
				System.out.println("1 �� 100 ������ �������� �Է��Ͻÿ� >>> : ");
				input = sc.nextInt();
				if (input<=100 && input>=1){
					iBool=answer==input;
					System.out.println("�����̸� true, �ƴϸ� false"+iBool);
					if (answer==input){
						System.out.println("�����Դϴ�!! ���ϵ帳�ϴ�!!");
						break;
					}else if(answer>input){
						System.out.println("��!! �ٽ� �Է��ϼ���!!");
						System.out.println("HINT : �� ���� ���ڸ� �Է��ϼ���.");
						sc.nextLine();
					}else if(answer<input){
						System.out.println("��!! �ٽ� �Է��ϼ���");
						System.out.println("HINT : �� ���� ���ڸ� �Է��ϼ���.");
					}
				}
				else{
					System.out.println("�߸� �Է��� �� >>> "+input);
					System.out.println("������ �ٽ� Ȯ���Ͻð�, �ٽ� �Է����ּ���.");
					sc.nextLine();
				}				
			}
		while (true);

		}catch(Exception e){
			System.out.println("������ �Է����� �ʾ� ������ �����մϴ�.");
		}finally{
			System.out.println("���� ���߱� ������ �����մϴ�.");
			sc.close();
			// Scanner�� �ݽ��ϴ�.
		}
	}
}
