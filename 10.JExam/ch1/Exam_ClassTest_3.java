package a.b.c.ch1;

// System.out.println() �������� log �� ��´�.
public class Exam_ClassTest_3 {

	public int aMethod() {
		System.out.println("	Exam_ClassTest_3.aMethod() ���� >>> : \n");
		
		int x = 1;
		int y = 2;
		System.out.println("	Exam_ClassTest_3.aMethod() >>> : " + x + " : " + y);
		int addSum = x + y;
		System.out.println("	Exam_ClassTest_3.aMethod() >>> : " + x + " + " + y + " = " + addSum + "\n");
		System.out.println("	Exam_ClassTest_3.aMethod() �� >>> : \n");
		
		return addSum;
		// return Ű���� statement �� �����ϰ� ; ���� ���ڸ� �� �ڿ��� 
		// � ������ ������� �ʴ´�.
		/*
		System.out.println("Exam_ClassTest_3.aMethod() �� >>> : ");
		Exam_ClassTest_3.java:10: error: unreachable statement
                System.out.println("Exam_ClassTest_3.aMethod() �� >>> : ");
                ^
		Exam_ClassTest_3.java:11: error: missing return statement
			}
			^
		2 errors
		*/
	}
	
	public static void main(String args[]) {
		System.out.println("Exam_ClassTest_3.main() ���� >>> : \n");

		Exam_ClassTest_3 ec3 = new Exam_ClassTest_3();
		System.out.println("ec3 >>> : " + ec3 + "\n");
		System.out.println("ec3.aMethod() >>> : " + ec3.aMethod());
		
		System.out.println("Exam_ClassTest_3.main() �� >>> : ");	
	} // end of mai()
} // end of Exam_ClassTest 