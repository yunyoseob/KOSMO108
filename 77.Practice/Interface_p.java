package a.b.c.ch2;

/*
implements ���ǻ���

1. class �빮�ڷν���~~~Impl implements Ŭ�����̸�{}
   interface Ŭ�����̸�{}
   �� ¦���̴�. �ݵ�� ���� ��� �Ѵ�.
2. extends�� implements ����
   ���ϻ���� extends�� ����.
   ���߻���� implements�� ����.
   ��, implements ������ extends�� ����.
3. implements�� ����ϴ� Ŭ�������� ���������ڰ� Impl��� ��Ģ��
   �ִ�.
4. interface �������̽��̸� �ȿ� ��Ͽ��� �Լ��� ����� ����.
	�Լ��̸�(); (O) 
	�Լ��̸�(){} (X)
*/

//===========================================
// ù ��° implements
// ���� ======================================

class Interface_B_Impl implements Interface_B{
	public void inter_b(){
		System.out.println("Interface_B_Impl.inter_b() �Լ� ����");		
	} // inter_b method
} // implements(Impl) Interface_B_Impl class

interface Interface_B{
	public void inter_b();
} // Interface_B interface

// �� =======================================

//==========================================
// �� ��° implements
// ���� =====================================

class Interface_A_Impl implements Interface_A{
	public void inter_a(){
		System.out.println("Interface_A_Impl.inter_a() �Լ� ����");
	} // inter_a method
} // implements(Impl) Interface_A_Impl class

interface Interface_A{
	public void inter_a();
} // Interface_A interface

// �� ======================================

public class Interface_p{
	public static void main(String args[]){
		// �θ� �������̽� Ŭ���� ���� �������� = new �ڽ�Ŭ����();
		Interface_A ia=new Interface_A_Impl();
		ia.inter_a();
		Interface_B ib=new Interface_B_Impl();
		ib.inter_b();

		/*
		�θ𿡼� �ڽ� �� ����ϴ� �� ������ �� Down Casting�� ���� �ʳ���?
		�θ𿡼� �ڽ� �� ����ϴ� �� �ƴ϶� implements ��Ģ ��ü��
		class���� �޼ҵ带 ������ �ϴ� ���̴�.
		������ ��޵Ǿ���, �� ���� Ŭ������ ��ӽ�Ű�� ���̶��� �ٸ���
		class�� interface�� �ϳ��� ¦���̶�
		������ Down Casting�ʹ� ��Ȳ�� �ٸ���.
		*/

		/*
		������
		// �ڽ�Ŭ�������� �������� = new �ڽ�Ŭ����();
		Interface_A_Impl iai = new Interface_A_Impl();
		iai.inter_a();

		Interface_B_Impl ib=new Interface_B_Impl();
		ib.inter_b();
		
		�������� ����
		�θ𿡼� �������� �����ѰŶ� �ڽĿ��� �������� �����ѰŶ�
		�޸� ����� �翬�� �ٸ� �� �ۿ� ���ٰ� ����

		���� ��� 1���� �θ� 10000000���� �ڽ��� ������ ������
		1���� �θ� �������� ���� �ڽ� 3�� ȣ�� �ҰŸ� 
		�ʿ��� 3���� �͸� ȣ���ϸ� ��.

		�ٵ� �ڽĿ��ٰ� �������� �����ϸ� 10000000���� �ڽ���
		�� �޸𸮿� �ö� ���̱� ������ �ڿ��� ���̰� Ŭ �� �ۿ� ����.
		*/
	} // main method
} // Interface_p class