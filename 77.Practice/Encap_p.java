package a.b.c.ch2;

/*
������ ����ȭ
	Java Encapsulation
	information hiding
*/

// n���� �ܼ�â ��� ����
class EncapVO{
	private String sval;
	private int ival;
	// private�� class ��� �ۿ��� ������� ���ϴ� ����������
	
	// ������ 1
	public EncapVO(){
		System.out.println("\n 2�� EncapVO�� private sval >>> : "+sval);
		// null -> String �ʱⰪ
		System.out.println("\n 3�� EncapVO�� private ival >>> : "+ival);
		// 0 -> int �ʱⰪ
		System.out.println("\n 4�� EncapVO�� private this.sval >>> : "+this.sval);
		// null -> ���� String sval�� �ʱⰪ�� �����̹Ƿ�, this�� �ᵵ �״�� null 
		System.out.println("\n 5�� EncapVO�� private this.ival >>> : "+this.ival);
		// 0 -> ���� int ival�ʱⰪ�� �����̹Ƿ�, this�� �ᵵ �״�� 0
	} // end of public EncapVo ������ 1
	
	// ������ 2
	public EncapVO(String sval, int ival){
		System.out.println("\n 9�� EncapVO(String sval, int ival) �Ű������� �μ��� ������ ���� >>> : "+sval);
		// �Ű����� String sval�� �μ��� String "This Year"�� ������ �Ǿ, This Year�� ��µ˴ϴ�.
		System.out.println("\n 10�� EncapVO(String sval, int ival) �Ű������� �μ��� ������ ���� >>> : "+ival);
		// �Ű����� int ival�� �μ��� int 2022�� ������ �Ǿ, 2022�� ����� �˴ϴ�.
		System.out.println("\n 11�� EncapVO(String sval, int ival) �Ű������� �ƴ� ������� >>> : "+this.sval);
		// EncapVO Ŭ������ private String sval�� ���� null�Դϴ�. (�ʱⰪ)
		System.out.println("\n 12�� EncapVO(String sval, int ival) �Ű������� �ƴ� ������� >>> : "+this.ival);
		// EncapVO Ŭ������ private int ival�� ���� 0�Դϴ�. (�ʱⰪ)

		this.sval=sval;
		// �Լ��� ���� sval�� ���� private String sval�� �����Ͽ� �ݴϴ�.
		this.ival=ival;
		// �Լ��� ���� ival�� ���� private int ival�� �����Ͽ� �ݴϴ�.

		System.out.println("\n 13�� EncapVO(String sval, int ival) �Ű������� ������� sval, ival�� ������ ���� >>> : "+this.sval);
		// ���� ���� Ŭ������ EncapVO Ŭ������ private String sval�� This Year�� �Ǿ����ϴ�.
		// ����, This Year�� ��µ˴ϴ�.
		System.out.println("\n 14�� EncapVO(String sval, int ival) �Ű������� ������� sval, ival�� ������ ���� >>> : "+this.ival);
		// ���� ���� Ŭ������ EncapVO Ŭ������ private int ival�� 2022�� �Ǿ����ϴ�.
		// ����, 2022�� ��µ˴ϴ�.
		} // end of EncapVO class ������ 2


	public void setSval(String sval){
		this.sval=sval;
	}

	public String getSval(){
		return this.sval;
	}

	public void setIval(int ival){
		this.ival=ival;
	}
	public int getIval(){
		return this.ival;
	}
} // end of EncapVO class 

public class Encap_p{
	public static void main(String args[]){
		System.out.println("\n 1�� main �Լ� ���� \n");
		
		// ������ 1 Test
		EncapVO rv=new EncapVO();
		// new �ν��Ͻ� �����ڷ� ��ü�� �����Ѵ�.
		System.out.println("\n 6�� Encap_p�� �������� �ּ� >>> : "+rv);
		// a.b.c.ch2.EncapVO@15db9742
		System.out.println("\n 7�� rv.getSval() >>> : "+rv.getSval());
		// null : 4������ �����ϴ�. (���� String sval�� �ʱⰪ�� ����)
		System.out.println("\n 8�� rv.getIval() >>> : "+rv.getIval());
		// 0 : 5������ �����ϴ�. (���� int ival�ʱⰪ�� ����)

		// ������ 2 Test
		EncapVO rv_2=new EncapVO("This Year", 2022);
		// new �ν��Ͻ� �����ڷ� ��ü�� �����Ѵ�.
		System.out.println("\n 15�� rv_2�� �������� �ּ� >>> : "+rv_2);
		// a.b.c.ch2.EncapVO@6d06d69c
		System.out.println("\n 16�� rv_2.getSval() >>> : "+rv_2.getSval());
		// This Year : 9~14���� �������Ƿ�, this.sval=This Year�� �Ǿ��ִ� �����Դϴ�.
		// ����, This Year�� ��µ˴ϴ�.
		System.out.println("\n 17�� rv_2.getIval() >>> : "+rv_2.getIval());
		//  2022 : 9~14���� �������Ƿ�, this.ival=2022�� �Ǿ��ִ� �����Դϴ�.
		// ����, 2022�� ��µ˴ϴ�.

		rv_2.setSval("Last Year");
		rv_2.setIval(2021);
		System.out.println("\n 18�� this.sval�� null�̿��µ�, this.sval=Last Year�� �Ǿ����Ƿ� >>> "+rv_2.getSval());
		System.out.println("\n 19�� this.ival�� 0�̿��µ�, this.ival=2021�� �Ǿ����Ƿ� >>> "+rv_2.getIval());
	} // end of main method
} // end of Encap_p class