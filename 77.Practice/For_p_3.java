package a.b.c.ch1;

public class For_p_3{
	public static void main(String args[]){
		System.out.println("<<< main �Լ� ���� >>>\n");
	/*
	�ڹٿ��� for �� �ʱ�ȭ �Ŀ��� �׻� �ʱ�ȭ ����
	0���� �ϴµ�, �� ������ for���� ��κ� �迭
	�����͸� ó���ϴµ� ����ϱ� �����̴�.
	�迭�� �ε����� 0���� �����ϱ� �����̴�.
	*/
	
	// for���� ���� ����ϰ��� �ϴ� �� : 0,1,2,3,4

	// �ʱ�ȭ ���� int i=0���� ����

	// 1��° ���
	for (int i=0; i<5 ; i++){
		System.out.println("\n 1��° ��� : i ���� >>> : "+i);
	}
	System.out.println("\n-----------------");
	
	// 2��° ���
	for (int i=0; i<=4; i++){
		System.out.println("\n 2��° ��� : i ���� >>> : "+i);
	}
	System.out.println("\n-----------------");

	// �ʱ�ȭ ���� int i=1���� ����

	// 3��° ���
	for (int i=1; (i-1)<5; i++){
		System.out.println("\n 3��° ��� : i ���� >>> : "+(i-1));
	}
	System.out.println("\n-----------------");

	// 4��° ���
	for (int i=1; i<=5; i++){
		System.out.println("\n 4��° ��� : i ���� >>> : "+(i-1));
	}
	System.out.println("\n-----------------");
	} // end of main method
} // end of For_p_3 class