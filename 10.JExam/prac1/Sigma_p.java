package a.b.c.prac1;

import java.util.Scanner;

public class Sigma_p {
	static int cnt=0;
	
	public static int sigma(int n){
		cnt++;
		System.out.println("sigma �Լ� "+cnt+"���� ���� \n");
		if(n>0){
			System.out.println(" >>> : "+n);
			System.out.println(n+"+"+(n-1)+"\n");
			return n+sigma(n-1);
			// n�� 0�� �� �� ���� ��� ��� ȣ���ض�.
		}else{
			return 0;
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("������ �Է� �Ͻÿ� >>> : ");
			int i=sc.nextInt();
			System.out.println("�Է��� ������ >>>> : "+i+"\n");
			System.out.println(i+"��  �ñ׸��� "+Sigma_p.sigma(i)+"�Դϴ�.");
			sc.close();
		}catch(Exception e){
			System.out.println("error >>> : "+e.getMessage());
		}finally{
			if (sc!=null){
				try{sc.close(); sc=null;}catch(Exception e){}
			}
		}

	}

}

