package a.b.c.ch5;

public class Exam_String_5 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		STT (Speech-to-Text)
//		TTS (Text-to-Speech)
		String sVal = "Hello Java Testing !! ";				
		boolean bool = sVal.contains("Hello");
		boolean bool_1 = sVal.equals("Hello");		
		System.out.println("bool >>> : " + bool);
		
		String sVal1 = "�б����� ������ � ������";
		bool = sVal1.contains("�б���");
		System.out.println("bool >>> : " + bool);
		bool = sVal1.contains("������");
		System.out.println("bool >>> : " + bool);
		
		
		// compareTo()
		// ���� �� : 0, ����, ����� int 
		// 0 : �ΰ��� ���ڿ��� ���� 
		// ��� : compareTo()�� ȣ���ϴ� ��ü�� ���ں��� ���������� ������ �ռ� �� 
		// ���� : ���ڰ� ��ü���� ���������� ������ �ռ� �� 
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = "World";
		System.out.println("s1.compareTo(s1) >>>  : " + s1.compareTo(s2));
		System.out.println("s1.compareTo(s3) >>>  : " + s1.compareTo(s3));
		System.out.println("s3.compareTo(s1) >>>  : " + s3.compareTo(s1));
	}
}
