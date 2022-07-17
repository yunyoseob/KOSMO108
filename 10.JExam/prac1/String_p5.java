package a.b.c.prac1;

public class String_p5 {

	public static void main(String[] args) {
		// STT (Speech-to=Text)
		// TTS (Text-to-Speech)
		String sVal="Hello Java Testing";
		boolean bool=sVal.contains("Hello");
		boolean bool_1=sVal.equals("Hello");
		System.out.println("bool >>> : "+bool);
		// bool >>> : true
		
		String sVall="�б����� ������ � ������";
		bool=sVall.contains("�б���");
		/*
		 * boolean
		 * 
		 * contains(CharSequence s)
		 * 
		 * Returns true if and only 
		 * if this string contains the specified 
		 * sequence of char values.
		 * 
		 * eqauls�� ���ڿ��� ���ϴµ�
		 * 
		 * contains�� ������ Ư�� �������� ����.
		 * 
		 * */
		System.out.println("bool >>> : "+bool);
		// bool >>> : true
		bool=sVall.contains("������");
		System.out.println("bool >>> : "+bool);
		// bool >>> : true
		
		// compareTo()
		// ���� �� : 0, ����, ����� int
		// 0 : �� ���� ���ڿ��� ����
		// ���: compareTo()�� ȣ���ϴ� ��ü�� ���ں��� ���������� ������ �ռ� ��
		// ����: ���ڰ� ��ü���� ���������� ������ �ռ� ��
		String s1="Hello";
		String s2="Hello";
		String s3="World";
		System.out.println("s1.compareTo(s1) >>> : "+s1.compareTo(s2));
		// Hello�� Hello ��
		// s1.compareTo(s1) >>> : 0
		System.out.println("s1.compareTo(s3) >>> : "+s1.compareTo(s3));
		// Hello�� World ��
		// s1.compareTo(s3) >>> : -15
		System.out.println("s3.compareTo(s1) >>> : "+s3.compareTo(s1));
		// World�� Hello ��
		// s3.compareTo(s1) >>> : 15
		
	}

}
