package a.b.c.ch1;

public class While_p_3{
	public static void main(String args[]){
		/*
		// 1
		for (int i=0; i<3; i++){
			for (int j=0; j<3; j++){
				System.out.print(" ("+i+","+j+") ");
			} // for j
			System.out.println();
		} // for i
		*/
		
		/*
		// 2
		//int iA[]=new iA[]{1,2,3}
		int iA[]={1,2,3};
		for (int i=0; i<iA.length; i++){
			System.out.println(""+iA[i]);
			// length: �迭�� ���̸� ����
			// length(): ���ڿ��� ���̸� ����.
		} // for iA
		*/
		
		/*
		// 3
		// int iA2[][]=new iA2[][]{{1,2,3},{1,2,3},{1,2,3}}
		int iA2[][]={{1,2,3},{1,2,3},{1,2,3}};
		for (int i=0; i<iA2.length; i++){
			System.out.println(""+iA2[i]);
		} // for iA2
		*/
		
		/*
		// 4
		for (int i=0; i<3; i++){
			for (int j=0; j<3; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		*/

		/* 5
		for (int i=0; i<3; i++){
			for (int j=0; j<i; j++){
				System.out.print("*");
			} // for j
			System.out.println();
		} // for i
		System.out.println();
		*/
		// i�� 3�� ����� �����ϰ� ������ش�.
		// j�� i���� ���� ������ŭ *�� ����Ѵ�.
		// i�� loop�� �� ���� �������� �ϳ��� �����ϹǷ�
		// ���� �ϳ��� �پ���.

		/* 6
		for (int i=0; i<3; i++){
			for (int j=3; j>i; j--){
				System.out.print("*");
			}
			System.out.println();
		}
		// i�� 3�� ����� �����ϰ� ������ش�.
		// j�� i���� ū ������ŭ *�� ����Ѵ�.
		// i�� loop�� �� ���� ���� ���� �ϳ��� �����ϹǷ�
		// ���� �ϳ��� �پ���.
		*/
		

		// 7 ����
		for (int i=0; i<=10; i++){
			for (int j=1; j<=i; j++){
				System.out.print("*");
				} // for j
				System.out.println();
			} // for i
		
		for (int i=10; i>0; i--){
			for (int j=1; j<=i; j++){
				System.out.print("*");
				} // for j
				System.out.println();
			} // for i

	} // main method 
} // While_p_3 class