package a.b.c.ch1;

public class While_p{
	public static void main(String args[]){
		/* ���� 1
		while(false){
			System.out.println(">>>>");
		}
		// ������ ����: error: unreachable statement
		// ������ ���� ���� ����.
		*/

		/* ���� 2
		boolean bool=false;
		while(bool){
			System.out.println(">>>>");
		}
		// ���ุ �ǰ� �ƹ� ��µ� ���� ����.
		*/
		
		/* ��������
		int num=1;
		int sum=0;
		int count=0;
		System.out.println("num >>> : "+num);
		System.out.println("sum >>> : "+sum);
		System.out.println("count >>> : "+count);

		while (num<=10){
			count++;
			// �� �� �������� count�� 1�� �÷���
			sum+=num;
			// ���ڸ� ���ض�
			num++;		
			System.out.println("\n 1 ����  "+(count)+"���� �� >>> "+sum);
		} // end of while
		System.out.println("\n 1���� 10���� �� >>> : "+sum);
		*/
	} // end of main method
} // end of While_p class

