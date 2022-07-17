package a.b.c.ch1;

public class Operator_p_1{
	public void ternary_Oper(){
	/* 
	���� ������ : ternary operator
	���ǽ� ? ���1 : ���2;
	���ǽ��� ����� TRUE �̸� ���1, FALSE �̸� ���2

	���� ������ �� if�� ���� if�� �Ұ�ȣ�� ���� �Է��ϱ����� 

	boolean���� �α׸� �� Ȯ���غ����� �ʿ伺�� ���� ������ �߾���.

	�̴� ��� boolean ����������� �� �ؾ��ϴ� �����̴�.

	��?

	Short Circuit ���� �����̴�.

	�װ� ����?

	�ܶ� ȸ�� ��(Short Circuit Evaluation :SCU)����
	�� ��(&&) ����� �� ��(||) ������ �� �� �� ���� ��� ��������
	�ʴ��� ��� ���� �� �� �ִ� ��쿡, ������ ���� ������� �ʴ´�.

	��� ǥ������� ���� �ð��� ������ üũ�ϴ� ������ �ڵ��� ����ð���
	�ľ��ϱ� ���ؼ��̴�. ���� ������ �α��ִ� ������ �ڵ� ���� �ӵ��� ������
	�����̴�.

	��ǻ�ʹ� �⺻������ ���� ���� ���� ������, ���ʿ��� ������ �����ϰų�,
	���ÿ� �����ϴ� �Ϳ� ������ ������ �ִ�.

	�������� ������ ����� ���� ������ ����� �� �� �ִ� ��쿡��
	��ǻ�ʹ� �������� �ʴ´�.

	��ٱ��Ϻм��� Apriori �˰���ó�� ���ʿ��� ��쿡 ������ �� ������� ����.

	�׷��ٸ� �� ���� �� ���� ��� ����Ǵµ�?

	�� �� (&&) 

	&& ����
	T AND T = T
	T AND F = F
	F AND T = F
	F AND F = F

	ù ��° ����� F���?
	�� ��° ����� T, F ���� ���͵�
	���� F�� ����������

	�̷� ��� ��ǻ�ʹ� �ڿ� ��� ������ ����


	�� �� (||)

	|| ����
	T OR T = T
	T OR F = T
	F OR T =T
	F OR F =F

	ù ��° ����� T���?
	�� ��° ����� T, F ���� ���͵�
	���� T�� ����������

	�̷� ��� ��ǻ�ʹ� �ڿ� ��� ������ ����

	�׷��ϱ� boolean ������ ����ϰų�, �� ���� ���ؾ��ϴ� �����ڸ� Ȱ���� ����
	�α׸� �� ������ �Ѵ�. (������ ���� ��� ����� Ȯ���϶�� ��)
	*/
	int num1 = 10;
	int i =2;

	boolean b0=(num1=num1+10) < 10;
	boolean b1=(i=i+2) < 10;
	boolean b2=b0&&b1;
	System.out.println("b0 >>> : "+b0);
	System.out.println("\n b1 >>> : "+b1);
	System.out.println("\n b2 >>> : "+b2);

	boolean value=((num1=num1+10) < 10)&&((i=i+2)<10);
	System.out.println("\n value >>> : "+value);
	System.out.println("\n num1 >>> : "+num1);
	System.out.println("\n i >>> : "+i);

	boolean b3 = (num1=num1+10)>10;
	boolean b4 = (i=i+2)>10;
	boolean b5 = b3 || b4;
	System.out.println("\n b3 >>> : "+b3);
	System.out.println("\n b4 >>> : "+b4);
	System.out.println("\n b5 >>> : "+b5);

	boolean value1=((num1=num1+10))>10;
	System.out.println("\n value1 >>> : "+value1);
	System.out.println("\n num1 >>> : "+num1);
	System.out.println("i >>> : "+i);
	} // end of ternary_Oper method


	public static void main(String args[]){
		System.out.println("main �Լ� ���� \n");
		Operator_p_1 rv= new Operator_p_1();
		System.out.println("\n �������� rv �ּ� >>> :"+rv);
		rv.ternary_Oper();
	} // end of main method
} // end of Operator_p_1 class