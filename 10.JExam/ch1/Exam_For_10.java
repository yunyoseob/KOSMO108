package a.b.c.ch1;

/*
String sArr = {"abc", "def", "ghi"};
�ֿܼ� a b c ... ���� ����Ͻÿ�
*/


public class Exam_For_10 {

	public void stringFor(String sArr[]){
		System.out.println("Exam_For_10.stringFor �Լ� ���� >>> : ");
		System.out.println("stringFor ::: sArr �������� �ּҰ� >>> : " + sArr);

		if (sArr !=null && sArr.length > 0){

			for (int i=0; i < sArr.length; i++){
				System.out.println(">>> : " + sArr[i]);
				for (int j=0; j < sArr[i].length(); j++ ){
					System.out.println("<<<>>> : " + sArr[i].charAt(j));
				}
			}
		}
		
	}

	public static void main(String args[]) {

		// String sArr[] = new String[]{"abc", "def", "ghi"};
		String sArr[] = {"abc", "def", "ghi"};
		System.out.println("sArr.length >>> : " + sArr.length);
		System.out.println("sArr[0] >>> : " + sArr[0]);
		System.out.println("sArr[0] <<<>>> : " + sArr[0].charAt(0));
		System.out.println("sArr[0] <<<>>> : " + sArr[0].charAt(1));
		System.out.println("sArr[0] <<<>>> : " + sArr[0].charAt(2));
		System.out.println("sArr[0] >>> : " + sArr[1]);
		System.out.println("sArr[1] <<<>>> : " + sArr[1].charAt(0));
		System.out.println("sArr[1] <<<>>> : " + sArr[1].charAt(1));
		System.out.println("sArr[1] <<<>>> : " + sArr[1].charAt(2));
		System.out.println("sArr[0] >>> : " + sArr[2]);
		System.out.println("sArr[2] <<<>>> : " + sArr[2].charAt(0));
		System.out.println("sArr[2] <<<>>> : " + sArr[2].charAt(1));
		System.out.println("sArr[2] <<<>>> : " + sArr[2].charAt(2));

		System.out.println("main ::: sArr �������� �ּҰ� >>> : " + sArr);
		new Exam_For_10().stringFor(sArr);
	}
}
