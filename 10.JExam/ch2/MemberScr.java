package a.b.c.ch2.scr;

// a.b.c.ch2.vo.MemberVO �� �ִ� Ŭ������ 
// a.b.c.ch2.scr.MemberScr Ŭ�������� ����Ϸ��� �ҷ��´�.

// �����ڸ� ����� ��Ģ 
// Ŭ�����̸� () {}
/*
	1. Ŭ�����̸� ���� (���� ����Ϸ��� �ϴ� Ŭ�����̸��� �����ϰ� �����Ѵ�).
	2. () �Ұ�ȣ�� �Ű������� ����� �� �ִ�. 
	3. {} ������ Ŭ������ �ν��Ͻ� �ϸ鼭 �� ���� �ؾ��� �Լ�(������) �����Ѵ�.
	4. �����ڴ� ��������� �ʱ�ȭ �Ѵ�.
*/
import a.b.c.ch2.vo.MemberVO;

// ȸ������ ���α׷�
public class MemberScr {
	
	public static void main(String args[]) {
		MemberVO mvo=new MemberVO();
		System.out.println("mov �������� �ּҰ� >>> : "+mvo);

		MemberVO mvo_1 = new MemberVO("HGD", "HGD00", "ȫ�浿", "010-1234-5678","����� �ູ��");
		System.out.println("mvo_1 �������� �ּҰ�  >>> : " + mvo_1);
	}
}
/*
a.b.c.ch2.vo.MemberVO  Ŭ������ import ���� �ʰ� ������ ���� �� ������ �߻��Ѵ�.
-----------------------------------------------------------------------
C:\00.KOSMO108\10.JExam\ch2>javac -d . MemberScr.java MemberVO.java
MemberScr.java:9: error: cannot find symbol
                MemberVO mvo = new MemberVO();
                ^
  symbol:   class MemberVO
  location: class MemberScr
MemberScr.java:9: error: cannot find symbol
                MemberVO mvo = new MemberVO();
                                   ^
  symbol:   class MemberVO
  location: class MemberScr
2 errors
*/

/*
C:\00.KOSMO108\10.JExam\ch2>javac -d . M*.java

C:\00.KOSMO108\10.JExam\ch2>javac -d . M*r.java M*O.java
*/