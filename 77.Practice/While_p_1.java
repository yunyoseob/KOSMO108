package a.b.c.ch1;

public class While_p_1{
	/*
	while() ������ do while() ������ �ٸ���.

	do while ���� ��� ��

	do{

	}
	while ();

	�����ڰ� �� ���̴�.
	*/

	public static void main(String args[]) {
		
		// �������� 
		int num = 1;
		int sum = 0;

		//System.out.println("before do while : int num >>> : "+num);
		//System.out.println("before do while : sum >>> : "+sum);

		do{
			sum += num;
			num++;
		}
		while (num <= 10);
		// do ��ɾ�� �ݵ�� �� ���� ���� �Ǿ� �Ѵ�.
		// true�� ���� ����ȴ�.

		//System.out.println("after do while : int num >>> : "+num);
		//System.out.println("after do while : sum >>> : "+sum);

		System.out.println("1���� 10 ������ ���� " + sum + " �Դϴ�.");
	} // main method
} // While_p_1 class