package a.b.c.prac1;

public class Math_6 {

	public static void main(String[] args) {
		int lo[]=new int[6];
		System.out.println("1. lo[] >>> "+lo);
		// 1. lo[] >>> [I@15db9742
		System.out.println("2. lo.length >>> "+lo.length);
		// 2. lo.length >>> 6
		
		/*
		for (int i=0; i<lo.length; i++){
			System.out.println(i+" >>> "+lo[i]);
			// ���������� 6�� �迭 �ʱ�ȭ �Ǿ� ���� �Ǿ���.
		}
		*/
		
		
		/* 
		 * (int)(Math.random()*45)+1 �� �ϸ�
		 * �뷫 1���� 46�̸��� ���� ��µȴ�.
		double d=0.9999999999999999999d;
		d=d*45;
		System.out.println(d);
		// 45.0 
		d=d+1;
		System.out.println(d);
		// 46.0
		int i=(int)d;
		System.out.println(i);
		// 46
		*/
		
		/*
		double d=0.0000000000000000001d;
		// 5E-181.0
		d=d*45;
		System.out.print(d);
		d=d+1;
		System.out.println(d);
		int i=(int)d;
		System.out.println(i);
		// 1
		 */
		
		// 2. lo.length >>> 6
		System.out.println("3. for (int i=0; i<io.length; i++) ���� >>> \n");
		for (int i=0; i<lo.length; i++){
			// 0,1,2,3,4,5 => �� 6�� loop �� ����.
			int ii=(int)(Math.random()*45)+1;
			System.out.format("%2d . random ����  %2d \n", i, ii);
			// 6���� ������ ����
			lo[i]=ii;
			// lo�迭�� i��° �濡 ������ ���� ii �Է�
			// System.out.println("lo �迭�� "+i+"��° �濡 "+ii+"������ �Է��� �Ǿ����ϴ�.");
			// second for�� ����
			for (int j=0; j<i; j++){
				System.out.println("\n for ���ȿ� for�� ���� \n");
				System.out.print("\n lo �迭�� "+i+"��° �ε����� �� >>>  "+lo[i]+"\n");
				System.out.print("\n lo �迭�� "+j+"��° �ε����� �� >>>  "+lo[j]+"\n");
				if (lo[j]==lo[i]){
					System.out.println("\n lo �迭�� "+i+" ��° ���� "+j+"��° ���� �����ϴ�.");
					System.out.println("\n i���� ��ȭ�� �Ͼ�� ���� i >>> "+i+"\n");
					i--;
					System.out.println("\n i�� �ϳ� ���ҽ�Ű����. == ���� �� �����ϼ���");
					System.out.println("\n i-- �� �����Ų ������ i >>> "+i+"\n");
					System.out.println("\n i-- �� �����Ų ������ lo[i] >>> "+lo[i]+"\n");
				}
				/*
				 * lo �迭�� 3��° �ε����� �� >>>  16

 				   lo �迭�� 2��° �ε����� �� >>>  16

 				   lo �迭�� 3 ��° ���� 2��° ���� �����ϴ�.

 				   i���� ��ȭ�� �Ͼ�� ���� i >>> 3

 				   i�� �ϳ� ���ҽ�Ű����. == ���� �� �����ϼ���

 				   i-- �� �����Ų ������ i >>> 2
 				   
 				   lo[3] == 16  -> lo[2]==16
				 * */
				
			}
		}
		
		System.out.println("==========================");
		System.out.println(" index 					  ");
		System.out.println(" | 0 | 1 | 2 | 3 | 4 | 5 |");
		System.out.println("==========================");
		System.out.println(" value					  ");
		System.out.format(" | %2d| %2d| %2d| %2d| %2d| %2d| ", lo[0],lo[1],lo[2],lo[3],lo[4],lo[5]);
		System.out.println("\n==========================");

		/*
		 * ==========================
 		   index 					  
 		   | 0 | 1 | 2 | 3 | 4 | 5 |
		   ==========================
 		   value					  
 		   |  2| 19| 16| 39| 45|  4| 
		   ==========================
		 * */
		
		for (int i=0; i<lo.length; i++){
			System.out.print(lo[i]+" ");
		}
		
		
		
	} // main method

} // Math_6 class
