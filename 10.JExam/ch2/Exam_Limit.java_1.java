2022-02-08
--------------------

����
���ڿ� 

������ :		�ڹٿ����� ��� �����Ͱ� ��ü�̴�. All Object
			�ڹٿ��� ��ü�� �ƴ� ���� �ִ�. <-- Primitive Type �����ڷ��� (byte char short int long float double)
			Primitive type �����ڷ��� <--> Wrapper Class 
			JVM ���� int (Ű����, �����ڷ���, Integer Ŭ������ ���) --> Integer ����ȯ �Ǿ ���� �Ѵ�. 

�ڹٿ��� ���� 
	���� �ڷ���	primitive type	byte chsr short int long float double 
				���� ���ڿ� ���� ���� �����Ѵ�.

	���� �ڷ���	��� ���� �ڷ����̴�.
				���� ���ڿ� �ּҰ��� �����ϰ� �ּҰ����� ���� ����Ų��.
				����)		String Ŭ���� ..... 
						String str = "abc";
						String str1 = new String("abc");
						public static int identityHashCode(Object x) �� �Լ��� �̿��ؼ� �ּҰ��� �� �� �ִ�.


����		char			�����ڷ���
		char �ʱ�ȭ�� �̱� �����̼�  ���� ����ǥ
		char c =  ' ';
		�������� 16��Ʈ ����Ѵ�.(������ ������� �ʴ´�. ���ڸ� �ٷ�� �ϱ� ������)

					���ڵ�
		���� char <----------------> ���� 2����, 8����, 10����, 16���� : ASCII (ANSI)
					���ڵ�

���ڿ�	String	char[]	�����ڷ���		
		String �ʱ�ȭ�� ���� �����̼�  ū ����ǥ, null
		String s = "";
		String s1 = null;
		int length() : ��Ʈ�� ���̸� ���ϴ� �Լ� 
		char charAt(int index) : ��Ʈ�� ���ڿ����� ���ڸ� ���ϴ� �Լ� 