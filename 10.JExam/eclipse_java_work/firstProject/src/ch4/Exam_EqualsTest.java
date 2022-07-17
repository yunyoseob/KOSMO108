package a.b.c.ch4;

public class Exam_EqualsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		java.lang.Object.equals(Object obj) : �ν��Ͻ��� �ּҰ��� ���ϴ� �Լ� 
		java.lang.String.equals(Object obj) : ���ڿ��� ���ϴ� �Լ� 


		boolean b = ��������.equals(��������);
		���� ���������� ���� ��ö�ӽ��� �Ǵ��� �Ѵ�. 
		
		*/
		String s = "abc";
		String s1 = "abc";
		boolean b = s.equals(s1); // <-- java.lang.String.equals() �Լ��� ȣ��Ǿ ���ڿ� ���Ѵ�.
		System.out.println("System.identityHashCode(s) s >>> : " + System.identityHashCode(s));
		System.out.println("System.identityHashCode(s1) s1 >>> : " + System.identityHashCode(s1));		
		System.out.println("b >>> : " + b);

		Object o = new Object();
		Object o1 = new Object();
		boolean b1 = o.equals(o1); // <--- java.lang.Object.equals() �Լ��� ȣ��Ǿ �ּҰ��� ���Ѵ�.
		System.out.println("o >>> : " + o);
		System.out.println("o1 >>> : " + o1);		
		System.out.println("System.identityHashCode(o) o >>> : " + System.identityHashCode(o));
		System.out.println("System.identityHashCode(o1) o1 >>> : " + System.identityHashCode(o1));	
		System.out.println("b1 >>> : " + b1);		
				
		boolean b2 = o == o1; 
		System.out.println("b2 >>> : " + b2);
		
		// �ڹٿ����� ���ڿ� ���� ���� == ������, ������� ������ ��� ����
		// �ڹٽ�ũ��Ʈ������ ���ڿ�, ���� �񱳿� �� ��� ���� 
		boolean b3 = s == s1;
		System.out.println("b3 >>> : " + b3);

	}
}
