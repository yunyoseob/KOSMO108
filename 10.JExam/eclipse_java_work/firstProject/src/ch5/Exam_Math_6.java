package a.b.c.ch5;

public class Exam_Math_6 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// �ζ� ��ȣ�� �����ؼ� �������� �迭�� �����.
		// ��ȣ�� 6�� �̴� �� 6���� �����. ������
		int lo[] = new int[6];
		System.out.println("lo >>> : " + lo);
		for (int i=0; i < lo.length; i++) {
			System.out.println("lo[" + i + "] >>> : " + lo[i]);
		}
		
		// 6�� �濡 �ζ� ��ȣ�� �ֱ� 
		for (int i=0; i < lo.length; i++) {
		
			// Math.random() �Լ� �̿��ؼ� �ζ� ��ȣ ����
			// 1 ~ 45������ 
			// 6�� �濡 �ֱ� 
			int ii = (int)(Math.random()*45) + 1; 
			System.out.println("\n================================================");
			System.out.println("(int)(Math.random()*45) + 1 :: ii >>> : " + ii);
			System.out.println("================================================");
			lo[i] = ii;
			System.out.println("lo[" + i + "] >>> : " + lo[i]);
			
			// �ε��� 	  0    1 	2 	3 	4 	5 
			// ��            	35    18   17   10  30  27
			// ���� ������ �ζ� ��ȣ lo[i]
			// ���ε��� ��ȣ ������ ���� ������� ��ȣ ���� 
			for (int j=0;j < i; j++) {
				System.out.println("\nfor >>> : jjjjj :: " + lo[j]);
				System.out.println("for >>> : iiiii :: " + lo[i]);
				if (lo[j] == lo[i]) {
					System.out.println("if >>> : " + lo[j] + " : " + lo[i]);
					i--;
					break;					
				}
			} 
		}	
		
		System.out.println("\n================================================");
		for (int i=0; i < lo.length; i++) {
			System.out.print(lo[i] + " ");
		}					
	}
}
