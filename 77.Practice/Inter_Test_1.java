package a.b.c.ch2;

import a.b.c.ch2.aaaa.Inter_1;
import a.b.c.ch2.aaaa.Inter_1_ClassImpl;

public class Inter_Test_1{
	public static void main(String args[]){
		
		Inter_1 i_1 = new Inter_1_ClassImpl();
		System.out.println("i_1 �������� �ּҰ� >>> : "+i_1);
		System.out.println("i_1.aM() �Լ� ���� \n");
		i_1.aM();
		i_1.bM();
		i_1.cM();
	}
}