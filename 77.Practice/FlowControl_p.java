package a.b.c.ch1;

import java.util.Scanner;
/*
java.lang�� ��� import�� ���� �ʾƵ�
���� ������ �Ǿ� �����Ƿ� ���� ���� ������ ������.
�׷���, java.util�� ������ �Ǿ��ִ� ���� �ƴϹǷ�,
import ��ɾ�� �ش� ��Ű���� �ִ� Ŭ������ �����´�.

���ǻ��� 1: Name Space���� Ŭ���� ù ���ڴ� �빮�ڴ�
import java.util.scanner; (X)

���ǻ��� 2: Name Space�� �ʿ��� �͸� ����� �ҷ��;� �Ѵ�.
import java.util.* (X)
- ���� ���� Ŭ������ ������ �� �� ����. �̴� ������ ���Ϲ��� �߻�

���ǻ��� 3: �ݵ�� import�� �ϱ����� ���� �θ� ��Ű���� Ŭ������
������ api�� ���� Ȯ���Ѵ�. 
- ȸ�縶�� ����ϴ� JAVA ������ �� �ٸ��� ������ Ȯ������ ������,
- version�� ���� �ʾ� import�� �� �Ǵ� ������ ���� �� ����.

���ǻ��� 4 : ��Ʈ�� Ŭ������ ������������ �ּҰ��� �����ִ� ��찡 �ְ�, �ƴ� ��쵵 �ִ�.

���ǻ��� 5 : Ŭ������ �޸𸮿� �ø��� ������ new Ű���� ���� �ٸ� �͵��� ���������� �ִ�.
*/


public class FlowControl_p{
	public int add(int x, int y){
		return x+y;
		// �μ��� �� ���� ������, ���� ���ؼ� ������ִ� �Լ�
		// public�ڿ� int, �Ķ������ int x, int y, 
		// return �ڿ� x+y�� �ڷ����� ��� ���ƾ� �Ѵ�.
	} // end of add method
	public static main(String args[]){
		System.out.println("���ϰ��� �ϴ� �� ���� �Է��ϼ���. >>> : ");
		/* 
		java se 8 api : System.in 
		public static InputStream in 
		The "standard" input stream.
		
		InputStream�� ��ɾ ���� ���� �ִ´ٴ� �ǹ��̴�.
		*/

		/*
		Scanner(File source)
		File source�� Scanner�� �ִ´�.
		*/

		

		Scanner rv=new Scanner(System.in);
		// Scanner���� nextInt()�� ����� �ǵ�
		// api�� ������ public int nextInt()
		// ���� �Ǿ��ִ�. static�� ���� ������ Ŭ����.�޼���� ����ϴ°� 
		// �ƴ϶� ���������� ���� ����ϵ��� �Ѵ�.
		// System.in�� ������ ��ɾ ��ü�� �����Ͽ� 
		// ���������� �����ϰڴٴ� ���̴�.

		int x=rv.nextInt();
		int y=rv.nextInt();
		// �ý��ۿ� ���� �μ��� �� ��
		// int x, int y�� �����Ѵ�.
		// �� �� �����ؾ� �� ���� ���׿� �ִ� int �ڷ�����
		// ���׿� �ڷ����� ���ƾ� �Ѵٴ� ���̴�.
		System.out.println("x >>>> : "+x);
		// x���� �� ���Դ��� Ȯ���غ���
		System.out.println("y >>> : "+y);
		// y���� �� ���Դ��� Ȯ���غ���

		FlowControl_p rv_f=new FlowControl_p();
		// add �Լ��� ��� static ������ Ű���尡 ���� ������
		// new Ű����� ��ü ����

		int addSum=rv_f.add(x,y);

		System.out.println("addSum >>> : "+addSum);

	
	} // end of main method
} // end of FlowControl_p class




