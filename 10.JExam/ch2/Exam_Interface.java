package a.b.c.ch2;


class Interface_B_Impl implements Interface_B{
								  
	public void inter_b(){
		System.out.println("Interface_B_Impl.inter_b() �Լ� ����");
	}
}

interface Interface_B {
	
	public void inter_b();
}

class Interface_A_Impl implements Interface_A{

	public void inter_a(){
		System.out.println("Interface_A_Impl.inter_a() �Լ� ����");
	}
}

interface Interface_A {
	
	public void inter_a();
}

public class Exam_Interface  {

	public static void main(String args[]) {
		
		// �θ�_�������̽�Ŭ���� ���� �������� = new �ڽ�Ŭ����();
		Interface_A ia = new Interface_A_Impl();
		ia.inter_a();

		// �ڽ�Ŭ�������� �������� = new �ڽ�Ŭ����();
		Interface_A_Impl iai = new Interface_A_Impl();
		iai.inter_a();
	}
}