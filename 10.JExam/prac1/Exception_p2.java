package a.b.c.prac1;

public class Exception_p2 {
	public static void main(String[] args) {
		String s0=args[0];
		String s1=args[1];
		try {
			int x=Integer.parseInt(s0);
			int y=Integer.parseInt(s1);
			
			int z=x/y;
			System.out.println("x/y = "+z);
			/*Exception in thread "main" java.lang.ArithmeticException: / by zero
			at a.b.c.prac1.Exception_p2.main(Exception_p2.java:8)
			
			���� ó�� �ʿ�
			*/
		}catch(ArithmeticException e){
			System.out.println("error log >>> : "+e);
			// error log >>> : java.lang.ArithmeticException: / by zero
		}finally{
			// finally�� ��κ� ������ �����ϴ�.
			System.out.println("finally ���� �Ϸ�");
			// finally ���� �Ϸ�
		}
		System.out.println("try, catch, finally ���� ���� �Ϸ�");
		// try, catch, finally ���� ���� �Ϸ�
	}
}
