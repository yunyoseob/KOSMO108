package a.b.c.ch2;

/*
������ ����ȭ
	Java Encapsulation
	information hiding
*/

class Exam_EncapVO{

	// information hiding
	// private ���������� Access Modifie Ŭ���� ���� ������
	private String sval;
	private int ival;

	public Exam_EncapVO(){
		System.out.println("Exam_EncapVO() ::: sval >>> : " + sval);
		System.out.println("Exam_EncapVO() ::: ival >>> : " + ival);
		System.out.println("Exam_EncapVO() ::: this.sval >>> : " + this.sval);
		System.out.println("Exam_EncapVO() ::: this.ival >>> : " + this.ival);
	}
	// String sval = "�ڼ���";
	// int ival = 27;
	public Exam_EncapVO(String sval, int ival){
		System.out.println("Exam_EncapVO(String sval, int ival) ::: sval >>> : " 
							+ sval);
		System.out.println("Exam_EncapVO(String sval, int ival) ::: ival >>> : " 
							+ ival);
		System.out.println("Exam_EncapVO(String sval, int ival) ::: this.sval >>> : " 
							+ this.sval);
		System.out.println("Exam_EncapVO(String sval, int ival) ::: this.ival >>> : " 
							+ this.ival);
		this.sval = sval;
		this.ival = ival;
		System.out.println("Exam_EncapVO(String sval, int ival) ::: this.sval = sval >>> : " 
							+ this.sval);
		System.out.println("Exam_EncapVO(String sval, int ival) ::: this.ival = ival>>> : " 
							+ this.ival);
	}

	public void setSval(String sval){
		this.sval = sval;
	}
	public String getSval(){
		return this.sval;
	}

	public void setIval(int ival){
		this.ival = ival;
	}
	public int getIval(){
		return this.ival;
	}
}


public class Exam_Encapsulation {

	public static void main(String args[]) {

		Exam_EncapVO ee = new Exam_EncapVO();
		System.out.println("ee �������� �ּҰ� >>> : " + ee);
		// System.out.println("ee.sval >>> : " + ee.sval);
		// System.out.println("ee.ival >>> : " + ee.ival);
		System.out.println("ee.getSval() >>> : " + ee.getSval());
		System.out.println("ee.getIval() >>> : " + ee.getIval());

		Exam_EncapVO ee_1 = new Exam_EncapVO("�ڼ���", 27);
		System.out.println("ee_1 �������� �ּҰ� >>> : " + ee_1);
		System.out.println("ee_1.getSval() >>> : " + ee_1.getSval());
		System.out.println("ee_1.getIval() >>> : " + ee_1.getIval());

		ee_1.setSval("�躰");
		ee_1.setIval(23);
		System.out.println("ee_1.setSval('�躰'); ===> ee_1.getSval() >>> : " 
							+ ee_1.getSval());
		System.out.println("ee_1.setIval(23); ===> ee_1.getIval() >>> : " 
							+ ee_1.getIval());

	}
}
