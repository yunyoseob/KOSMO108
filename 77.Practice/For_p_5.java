package a.b.c.ch1;

public class For_p_5{

	public static void main(String args[]){
		/*
		1. �������� : �ʱ�ȭ �ؼ� ����ؾ� �Ѵ�.
		2. ���� ���� : �ּҰ��� ���´� (����)
		// public static int identityHashCode(Object x)
		3. rt.jar : java.lang.String : import ���� �ʾƵ� ��� ����
		4. ���ڿ��� �ٷ�� ��Ʈ�� Ŭ����
		
		������ Ÿ�� ����
		�������� s0�� ����
		���ڿ� "abc" ������ �ʱ�ȭ �߾��
		*/
		String s0="abc";
		// public String toUpperCase(Locale locale)
		// static�� ������ �������� s0�� ����
		String s1=s0.toUpperCase();	
		// �빮�ڷ� �ٲ㼭 �������� s1�� ����

		for (int i=0; i<s0.length(); i++){
			System.out.println("s0.charAt("+i+") >>> "+s0.charAt(i));
		}

		for (int i=0; i<s1.length(); i++){
			System.out.println("s1.charAt("+i+") >>> : "+s1.charAt(i));
		}

		// public String toLowerCase()
		String s2=s1.toLowerCase();
		// �빮�ڷ� �ٲ������ �ٽ� �ҹ��ڷ� �ٲ㼭 �������� s2�� ����
		for (int i=0; i<s2.length(); i++){
			System.out.println("s2.charAt("+i+") >>>: "+s2.charAt(i));
		}
	} // end of main method
} // end of For_p_5 class