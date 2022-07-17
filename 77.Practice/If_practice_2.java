package a.b.c.ch1;

public class If_practice_2{
	public void result_1(String args_1[]){
		//  ù ��° boolean üũ �� �� if��
		System.out.println("\n boolean üũ ���� �ʴ� if�� ���� �մϴ�. \n");
		if (args_1.length==2){
			// String ���ڿ� Ŭ������ �������� s0��
			// ����� �μ� ù ��° ���� �Ҵ�
			String s0=args_1[0];

			// String ���ڿ� Ŭ������ �������� s1��
			// ����� �μ� �� ��° ���� �Ҵ�
			String s1=args_1[1];

			// public static int parseInt(String s)
			// ���� ��� : "1" �̷��� ���� �ֵ�
			int x=Integer.parseInt(s0);
			int y=Integer.parseInt(s1);

			int add=x+y;
			int subtract=x-y;
			int multiply=x*y;
			int devide=x/y;
	
			System.out.println("add(x,y) >>> : "+add);
			System.out.println("subtract(x,y) >>> : "+subtract);
			System.out.println("multiply(x,y) >>> : "+multiply);
			System.out.println("devide(x,y) >>> : "+devide);
		} // end of if args_1.length
		else{
			System.out.println("������ ���� �� �Է��ϼ��� >>> : ");
		} // end of else args_1.length

		System.out.println("\n boolean üũ ���� �ʴ� if�� �������� �ϰڽ��ϴ�. \n");
	} // end of result_1 method

	public void result_2(String args_2[]){
		// �� ��° boolean üũ �� if ��
		System.out.println("\n boolean üũ�� if�� ���� �ϵ��� �ϰڽ��ϴ�. \n");
		int argsLength=args_2.length;
		boolean aBool=argsLength==2;
		if (aBool){
			String s0=args_2[0];
			// ù ��° �� �Ҵ�
			String s1=args_2[1];
			// �� ��° �� �Ҵ�

			// public static int parseInt(String s)
			// parseInt(String s) : ���� ���ڸ� ���ڷ� �ٲٴ� �Լ�
			int x=Integer.parseInt(s0);
			int y=Integer.parseInt(s1);

			int add=x+y;
			int subtract=x-y;
			int multiply=x*y;
			int devide=x/y;

			System.out.println("add(x,y) >>> : "+add);
			System.out.println("subtract(x,y) >>> : "+subtract);
			System.out.println("multiply(x,y) >>> : "+multiply);
			System.out.println("devide(x,y) >>> : "+devide);
			} // end of if aBool
		else {
			System.out.println("������ ���� �� �Է��ϼ��� >>> : ");
		} // end of else aBool	
		System.out.println("\n boolean üũ�� if�� �������� �ϰڽ��ϴ�. \n");
	} // end of result_2 method


	public static void main(String args[]){
		// String args[]=new String[];
		// String args[]={}
		If_practice_2 rv_1 = new If_practice_2();
		System.out.println(" If_practice_2 rv_1 ���� ���� �ּ� >>> : "+rv_1);
		rv_1.result_1(args);

		If_practice_2 rv_2=new If_practice_2();
		System.out.println("If_practice_2 rv_2(��������)�� �ּҰ� >>> : "+rv_2);
		rv_2.result_2(args);
	} // end of main method
} // end of If_practice_2 class