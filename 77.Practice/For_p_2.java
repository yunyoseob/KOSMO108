package a.b.c.ch1;

public class For_p_2{

	public static void main(String args[]){
		// String args[]�� ����
		// ���� �迭�� ���´�.
		System.out.println("<<< main �Լ� ���� >>> \n");
		System.out.println("\n main �Լ��� ���� �Է� �� >>>> : "+args);

		boolean aBool=args.lenth==1;
		// args �迭�� �迭�� ���̸� �� �� �ִ�
		// length ��ɾ �����ϰ�
		// ������ 1, �׷��ϱ� �� ����
		// ���ڿ��� ���� aBool�� true, �ƴϸ� false
		System.out.println("\n ���� �迭�� ���̰� 1���� true �ƴϸ� false�� ����ϼ���. >>> : "+aBool);
		if (aBool){
			String sVal=args[0];
			// sVal ������ String ���� �ڷ��� ������ ���� ��,
			// �Էµ� ���� �迭�� ù ��° ���Ҹ� �����մϴ�.
			System.out.println("\n ���� �迭�� ù ��° ���� >>> : "+sVal);
			
			boolean bBool= sVal != null && sVal.length()=0;
			// sVal�� �Է� ���� ����, sVal�� ���ڿ��� ���̰� 0�� �ƴ�
			// �� ���� ������ �¾ƾ߸� if�� ���ư��� �ϱ� �����̴�.
			System.out.println("\n ���� ���� null�� �ƴϸ鼭, ���̰� 0�� �ƴϸ� true �ƴϸ� false�� ����ϼ���. >>> : "+bBool);
			if (bBool){
				

			}
			else{
				System.out.println("\n ���� ���� null�̰ų�, ���̰� 0�̴� �ٽ� �Է��ϼ���.");
				
			}


		}
		else{
			System.out.println("\n �迭�� ���Ұ� �� ���� �ƴմϴ�. �ٽ� �Է��ϼ���.");
		}

	} // end of main method
} // end of For_p_2