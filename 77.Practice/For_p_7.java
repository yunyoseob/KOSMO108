package a.b.c.ch1;

public class For_p_7{
	public void forTest(int iArr_forTest[]){
		System.out.println("\n <<< forTest method ���� >>> ");
		System.out.println("�μ��� �Ű������� �� �Էµƴ��� Ȯ�� iArr_forTest >>> "+iArr_forTest);
		
		// �������� : �迭�� ���̸� üũ�ϱ� ���ؼ�
		int iArrLen=0;

		// forTest�� �Ű����� �Ѿ�� iArr_forTest �迭 ���������� �����Ͱ� �ִ���
		// ������ üũ�ϴ� ��
		// �迭�� ��ü�̱� ������ null(iArr_forTest != null);
		// �� ����(iArr_forTest.length > 0)�� üũ�Ѵ�.
		if (iArr_forTest != null && iArr_forTest.length > 0){
			// �迭�� ���� üũ
			iArrLen=iArr_forTest.length;
			// length�� �迭�� ���� üũ
			// length()�� ���ڿ��� ���� üũ

			// for���� �̿��ؼ� �迭�� ���̸�ŭ �迭�� �����͸� �ֿܼ� ���
			for (int i=0; i<iArrLen; i++){
				System.out.println("iArr_forTest["+i+"] >>> : "+iArr_forTest[i]);
			}
		}
	} // end of forTest method

	public static void main(String args[]){
		int iArr_main[]={1,2,3,4,5,6,7,8,9};
		System.out.println("iArr_main �������� �ּҰ� >>> : "+iArr_main);

		For_p_7 rv=new For_p_7();
		System.out.println("rv �������� �ּҰ� >>> : "+rv);

		rv.forTest(iArr_main);
	} // end of main method
} // end of For_p_7