package a.b.c.prac1;

public class Math_6_1 {

	public static void main(String[] args) {
		System.out.println("\n 0.for������ �����մϴ�.");
		for (int n=0; n<5; n++){
			int lo[]=new int[6];
			// �迭�� ���� 6���� �����
			// index 0~5
			System.out.format("lo.length : %d ", lo.length);
			System.out.println();
			for (int i=0; i<lo.length; i++){
				lo[i]=(int)(Math.random()*45)+1;
				System.out.format("lo[%d] : %2d ", i, lo[i]);
				System.out.println();
				for (int j=0; j<i; j++){
					System.out.println("for j�� ���� :: ���� i�� >>> "+i);
					System.out.format("for j�� ���� j == %d ", j);
					System.out.println();
					if (lo[j]==lo[i]){
						System.out.println("\n lo[j] == lo[i] �� ���� \n");
						System.out.println("\n j�� "+j+" i�� "+i+"\n");
						System.out.println(j+".  lo[j] >>> "+lo[j]+" ::: "+i+".  lo[i] >>> "+lo[i]);
						System.out.println("\n i-- �ϱ� ���� >>> "+i);
						i--;
						System.out.println("\n i-- �� ���� >>> "+i);
						break;
					} // if (lo[j]==lo[i])	
				} // for j			
			} // for i
			for (int k=0; k<lo.length; k++){
				System.out.println("for k�� ����");
				System.out.print(lo[k]+" ");

			} // for k
			System.out.println();
			System.out.println("==========================");
			System.out.println(" value					  ");
			System.out.format(" | %2d| %2d| %2d| %2d| %2d| %2d| ", lo[0],lo[1],lo[2],lo[3],lo[4],lo[5]);
			System.out.println("\n==========================");
		} // for n

	} // main method

} // Math_6_1 method
