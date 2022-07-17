package a.b.c.ch2;

// �����ڸ� ����� -> ������ �ʱ�ȭ �Ѵ� -> �����ڿ��� this.����=������ �μ��� �ʱ�ȭ�Ѵ�

class Const_VO{
	private String mid;
	private String mpw;
	private String mname;
	private int mage;
	// private�� Ŭ���� ��� ������ ������ ���Ѵ�.
	// public �����ڸ� ������ ���� ���
	// �ܺο��� ������ ���������� �ϴ� ����
	// ������ ����ȭ��� �Ѵ�.

	public Const_VO(){
		System.out.println("Const_VO() >>> this ::: "+this);
		System.out.println("Const_VO() >>> : "+this.getClass().getName());
		
	} // Const_VO ������ 1 (�Ű����� ����)

	public Const_VO(String mid, String mpw, String mname, int mage){
		this.mid=mid;
		this.mpw=mpw;
		this.mname=mname;
		this.mage=mage;
		// this.�����̸� �ʱ�ȭ �� ������ �� �����Ƿ� default���� ��µȴ�.
		// this.������ �μ��� �ʱ�ȭ �Ѵ�.
		System.out.println("\n 3. Const_VO 2��° ������ this.mid=mid >>> : "+this.mid);
		System.out.println("\n 4.Const_VO 2��° ������ this.mpw=mpw >>> : "+this.mpw);
		System.out.println("\n 4.Const_VO 2��° ������ this.mname=mname >>> : "+this.mname);
		System.out.println("\n 6.Const_VO 2��° ������ this.mage=mage >>> : "+this.mage);
	} // Const_VO ������ 2 (�Ű����� ����)

	// setter : ���� �޼ҵ� : ���� �Լ� : ���� �ʱ�ȭ �ϴ� �Լ�

	/*
	��Ģ
	private String mid ������ setter �Լ� �����
	1. set
	2. ��������� ������ ù ��° ���ڸ� �빮�ڷ� �����Ѵ�. : Mid
	3. set+Mid=setMid()
	4. public void setMid(String mid){this.mid=mid;}
	*/

	public void setMid(String mid){
		this.mid=mid;
	}

	public void setMpw(String mpw){
		this.mpw=mpw;
	}

	public void setMname(String name){
		this.mname=mname;
	}
	public void setMage(int mage){
		this.mage=mage;
	}

	// getter : ���� �޼ҵ� : ���� �Լ� : ���� �����ϴ� �Լ�
	/*
	private String mid ������ getter �Լ� �����
	1. get
	2. ��������� ������ ù ��° ���ڸ� �빮�ڷ� �����Ѵ�. : Mid
	3. get + Mid = getMid()
	4. public String getMid() {return this.mid;}
	*/

	public String getMid(){
		return this.mid;
	}

	public String getMpw(){
		return this.mpw;
	}

	public String getMname(){
		return this.mname;
	}

	public int getMage(){
		return this.mage;
	}


} // Const_VO class

public class Const_p_2{
	public static void main(String args[]){
		System.out.println("\n 1. main �Լ� ����");
		Const_VO rv=new Const_VO();
		// ��������� Ŭ���� Const_VO �� ����ϱ� ���� �����ߴ�.
		// Const_VO()�� �����ڷ� �μ����� ����.
		// Const_VO()�� public NameSpace(){} �⺻ �����ڸ� ȣ���Ѵ�.
		// �������� ������ ����ʵ带 �ʱ�ȭ�ϴ� ������, ����ʵ��� ��������
		// default������ �ʱ�ȭ�Ѵ�.
		System.out.println("\n 2. Const_VO �������� �������� �ּҰ� >>> : "+rv);

		Const_VO rv1= new Const_VO("HGD","HGD00","ȫ�浿",22);
		/* �������
			private String mid;
			private String mpw;
			private String mname;
			private int mage;
		*/
		System.out.println("\n 7. Const_VO �������� �������� �ּҰ� >>> : "+rv1);
		
		rv.setMid("KCS");
		rv.setMpw("KCS00");
		rv.setMname("��ö��");
		rv.setMage(21);
		System.out.println("\n 8. rv_1.getMid() >>> : "+rv.getMid());
		System.out.println("\n 9. rv_1.getMpw() >>> : "+rv.getMpw());
		System.out.println("\n 10. rv_1.getMname() >>> : "+rv.getMname());
		System.out.println("\n 11. rv_1.getMage() >>> : "+rv.getMage());
	} // main method
} // Const_p_2 class