package a.b.c.ch4;

public class Exam_ToString extends Object{

	// java.lang.Object Ŭ������ �ִ� toString �Լ��� �������̵� �ؼ� 
	// java.lang.Object Ŭ�������� Exam_ToString Ŭ������ toString() �Լ��� �̻� �Դ�.
	// �̻�� ǥ���� @Override �������̵� ������̼����� ǥ�� �Ѵ�. 
	// �̻������  toString() �Լ��� ���� ��  getClass().getName() + '@' + Integer.toHexString(hashCode())
	// �� 
	// �̻�� toString() �Լ� ������ 
	// "java.lang.Object Ŭ�������� �������̵��� toString() �Լ��̴�." ���� �����Ѵ� : �������Ѵ�.
	// Exam_ToString Ŭ������ ����ϴ� ������ toString() �Լ��� ȣ���ϸ� ���� ���ʹ� 
	// getClass().getName() + '@' + Integer.toHexString(hashCode()) ���� �ƴϰ� 
	// "java.lang.Object Ŭ�������� �������̵��� toString() �Լ��̴�." ���� ���� �ȴ�.
	@Override
	public String toString() {
		// getClass().getName() + '@' + Integer.toHexString(hashCode())
		return "java.lang.Object Ŭ�������� �������̵��� toString() �Լ��̴�.";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Exam_ToString et ���������� �ν��Ͻ� �ߴ�. 
		Exam_ToString et = new Exam_ToString();
		// et ���������� toString() �Լ��� ���� �Ǿ� �ִ�. 
		System.out.println("et �������� �ּҰ�  >>> : " + et);
		//                     getClass().getName() + '@' + Integer.toHexString(hashCode())
		// et �������� �ּҰ�  >>> : a.b.c.ch4.Exam_ToString@15db9742
		System.out.println("et.toString() �������� �ּҰ�  >>> : " + et.toString());
		System.out.println("et.getClass().getName()  >>> : " + et.getClass().getName());
		
		// Exam_ToStringVO ȣ���ϱ� 
		Exam_ToStringVO etvo = new Exam_ToStringVO("�ڰǿ�", 30);
		// et ���������� toString() �Լ��� ���� �Ǿ� �ִ�.		
		System.out.println("etvo >>> : " + etvo);
		System.out.println("etvo.toString() >>> : " + etvo.toString());		
	}
}
