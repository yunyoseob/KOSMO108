package a.b.c.prac1;

public class Tostring_p {
	
	@Override
	public String toString(){
		return "java.lang.Object Ŭ�������� �������̵��� toString() �Լ��̴�.";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tostring_p tp=new Tostring_p();
		// Tostring_p Ŭ�������� ��ü�� �����߱� ������
		// ���� Ŭ�������� Override�� ������ ��µȴ�.
		System.out.println("\n 1. ToString_p tp �������� �ּҰ�  >>> : "+tp);
		// �ش� Ŭ�������� Override�� ������ ��µ�.
		System.out.println("\n 2. tp.toString() �������� �ּҰ� >>> : "+tp.toString());
		// toString �޼��带 ���� Ŭ�������� ���Ǹ� �߱� ������, Override�� ������ ��µȴ�.
		
		/*
		 * Tip
		 * �������� �ּҰ�  >>>  �ϰ� ���������� ����� �Ͱ�
		 * ��������.toString >>> �� �Ͱ� ����� ����.
		 * ������ ��������(.toString)�� �����Ǿ��� �����̴�.
		 * */
		System.out.println("\n 3. tp.getClass().getName() >>> : "+tp.getClass().getName());
		// �ش�Ŭ������ Name Space�� ��µȴ�. Name Space�� ��Ű���̸�.Ŭ�����̸�
		
		TostringVO etvo=new TostringVO("VELOG",30);
		// ToStringVO Ŭ�������� ��ü�� �����ߴµ�,
		// ToStringVO Ŭ������ Override�� ������ ��µȴ�.
		System.out.println("\n 4. etvo >>> : "+etvo);
		System.out.println("\n 5. etvo.toString >>> : "+etvo.toString());
	}
}
