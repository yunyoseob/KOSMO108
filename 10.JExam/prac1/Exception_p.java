package a.b.c.prac1;

public class Exception_p {

	public static void main(String[] args) {
		// Stirng[] args : ����� �μ�
		// 4, "��" �Է�
		
		// ���콺 ��Ŭ�� ��,
		// Run Configuration
		// name�� main  �°� ������ Ȯ���ϰ�,
		// arguments���� �Է�
		try {
		String s0=args[0];
		String s1=args[1];
		
		int x=Integer.parseInt(s0);
		int y=Integer.parseInt(s1);
		// �ش� �������� ������ ����. (����ó��)
		
		int z=x+y;
		
		System.out.println("x + y ="+z);
		}catch(Exception e){
			System.out.println("�߸� �Է��� ��  : "+e.getMessage());
			// �߸� �Է��� ��  : For input string: "��"
			// java.lang.Throwable �θ� Ŭ����
			// getMessage
			// public String getMessage()
			// Returns the detail message string of this throwable. 
			// java.lang.Exception Ŭ����
			// Exception �ڽ� Ŭ�������� Throwable �θ� Ŭ������ getMessage �����ͼ� ���� ���� ���
		}finally {
		System.out.println("\n ���ϱ� ���α׷��� �����մϴ�.");
		}

	}

}
