package a.b.c.ch1;

// length() : ���� �Լ� : String Ŭ������ ���ڿ� ���̸� ���ϴ� �Լ� 
// length : ���� �ʵ� : �迭�� ����

public class Exam_For_7 {

	public static void main(String args[]) {
	
		// int iArr[] = new iArr[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
		int iArr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println("iArr �������� �ּҰ� >>> : " + iArr);
		
		iArr = null;

		/*
		int iArrLen = iArr.length;
		System.out.println("iArr.length �迭�� ���� >>> : " + iArr.length);

		if (iArrLen > 0){

			for (int i=0; i < iArrLen; i++ ){
				System.out.println("iArr[" + i + "] >>> : " + iArr[i]);
			}
		}
		*/
				
		int iArrLen = 0;

		if (iArr !=null && iArr.length > 0){

			iArrLen = iArr.length;
			System.out.println("iArr.length �迭�� ���� >>> : " + iArr.length);

			for (int i=0; i < iArrLen; i++ ){
				System.out.println("iArr[" + i + "] >>> : " + iArr[i]);
			}
		}else{
			System.out.println("iArr ���������� null �̰ų� �����Ͱ� ����� >>> : " + iArr);
		}
	}
}