package a.b.c.ch2.aaaa;

public class Inter_1_ClassImpl implements Inter_1{
	@Override
	// public abstract void aM()���� abstract ����
	public void aM(){
		System.out.println("Inter_1 �������̽����� �������̵� �ؼ� aM() {} ���� ����� �������ϴ� �Լ�");
	}

	@Override
	// public abstract void bM()���� abstract ����
	public void bM(){
		System.out.println("Inter_1 �������̽����� �������̵��ؼ� bM(){} ���� ����� �������ϴ� �Լ�");
	}

	@Override
	// public abstract void cM()���� abstract ����
	public void cM(){
		System.out.println("Inter_1 �������̽����� �������̵� �ؼ� cM(){} ���� ����� ������");
	}
}