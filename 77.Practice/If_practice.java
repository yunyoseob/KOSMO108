package a.b.c.ch1;

public class If_practice{
	public static void main(String args[]){
		int x=1;
		int y=2;

		boolean xyBool=x>y;
		System.out.println("xybool >>> : "+xyBool);
		
		if (xyBool){
			System.out.println("false");
		} // end of xyBool keyword

		if (x > y) {
			System.out.println("false");
		}
		
		/*
		if (1 < 2) {
			System.out.println("1 < 2 >>> : true");
		}
		*/
		
		/*
		boolean xyfalse=x>2;
		System.out.println("xyfalse >>> : "+xyfalse);

		if (xyfalse)
		{
			System.out.println("xyfalse >>> false");
		}
		// false ��� ��
		*/


		/*
		�� if (x<y) Ȥ�� if (1<2)�� �ص�
		�ƹ� ���� ���� ������ �Ǵµ�, 
		boolean xyBool=x<y;
		System.out.println("xybool >>> : "+xyBool);
		��ɾ� �� ���� ġ��
		�Ұ�ȣ ()�� xyBool�� ĥ ��???

		���⼭�� �ڵ尡 �� ���� �ۿ� ���� ������,
		���� �ڵ尡 �� �� ���̰� �����Ͱ� �ǽð����� ��� ������ ��
		ó���ؾ� �Ѵٰ� �����غ���.

		if �� �Ұ�ȣ () �ȿ��� true�� �ƴϿ���
		�����ϵ� �ǰ� �ڹ� ���൵ �ȴ�.

		�ٸ�, if ���� ���� ����� ������ ���� ��!!

		�̷� ���, ���߿� ���α׷��ֿ� ������ ������ ��,
		��� ��� �߸��ƴ��� Ȯ���ϱⰡ ������ ��ƴ�.
		if���� 100�� ���� �ִٰ� ���� ��, ������

		100���� �Ұ�ȣ ���� ������ �´��� �ƴ��� Ȯ���ؾ��ϱ� ����

		�׷��� ������ if���� �������� �׻� 
		boolean �����ڸ� ���� true���� Ȯ���ϴ� ������ ������ �Ѵ�.

		�׷��� ������� �� �Ǵ����� �� �긱 �� �ִ�.

		�׻� boolean���� Ȯ���ϰ�, ����ؼ� true���� Ȯ���ϴ�
		������ ���� ��!!!!! ��ǥ �鸸��!
		*/
	} // end of main method
} // end of if_practice class