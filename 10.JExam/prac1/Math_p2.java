package a.b.c.prac1;

public class Math_p2 {

	public static void main(String[] args) {
		double d;
		int it;
		for (int i=0; i<1; i++){
			d=Math.random();
			// ��ǻ�Ͱ� ������ �߻��ϴ°� �ƴ϶�, ����ǥ�� ���� ���
			// Math.random() ��ɾ ����� ������ random ���� ���´�.
			System.out.println(i+"��° random �� >>> "+d);
			System.out.println(i+"��° random ��*10 >>> "+d*10);
			System.out.println(i+"��° random ��*100 >>> "+d*100);
			
			// int ����ȯ �غ���
			it = (int)(Math.random()*10);
			System.out.println("it >>> (int)(Math.random()*10) >>> "+it);
			it = (int)(Math.random()*100);
			System.out.println("it >>> (int)(Math.random()*100) >>> "+it);
			// 70
			it = (int)(Math.random()*100);
			System.out.println("it >>> (int)(Math.random()*100) >>> "+it);
			// ����  ��ɾ�� �ٸ� ��� Math.random()���� : 12
		}
	}
}
