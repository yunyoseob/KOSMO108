package a.b.c.ch1;

public class While_p_2{
	public static void main(String args[]){
		// ��������
		int i=2;
		int sum=1;

		while (i<=100){
			sum += i;
			boolean iBool= sum>55;
			if (iBool){
				sum=sum-i;
				break;
			}
			else{
				System.out.println("1���� "+i+" ������ �� >>> : "+sum);
			}
			i++;
		}
		System.out.print("1���� 10���� �� �� >>> : "+sum);
				// break : sum�� 20���� ũ�� loop�� ���߶�� �ǹ�
				// continue : loop�� �����϶�� �ǹ��ε�, python�̶��� �ٸ���
				// java������ ����ϴ� ���� �����ϴ°� ����. (������ �ϴ� ������ ����)
		} // end of main method
} // end of While_p_2 class