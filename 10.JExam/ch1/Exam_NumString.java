package a.b.c.ch1;

public class Exam_NumString {

	public static void main(String args[]) {
	
		// ���� ���� : ���ڸ� ���ڿ��� ǥ���� �� : ���ڸ� ���� �����̼����� ���� �� 
		String sX = "1";
		String sY = "2";

		System.out.println(sX + sY);

		int iX = Integer.parseInt(sX);
		int iY = Integer.parseInt(sY);
		System.out.println(iX + iY);
		System.out.println("���ڿ� ���ϱ� �ϸ� ���ڵ� ���ڿ��� �ȴ�. >>> : ");
		System.out.println("" + (iX + iY));
		System.out.println("" + iX + iY);

	}
}