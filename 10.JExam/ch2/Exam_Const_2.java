package a.b.c.ch2;

// �� ������Ʈ : Bean Component : Beans
import java.util.ArrayList;

class Exam_ConstVO{

	private String mid;
	private String mpw;
	private String mname;
	private int mage;

	public Exam_ConstVO(){
		//System.out.println("Exam_ConstVO() >>> this ::: " + this);
		//System.out.println("Exam_ConstVO() >>> : " 
		//						+ this.getClass().getName());
		
	}

	public Exam_ConstVO(String mid,  String mpw, String mname, int mage){
		//System.out.println("Exam_ConstVO(String mid ... ) >>> this ::: " + this);
		//System.out.println("Exam_ConstVO(String mid ... ) >>> : " 
		//						+ this.getClass().getName());
		this.mid = mid;
		this.mpw = mpw;
		this.mname = mname;
		this.mage = mage;
	}

	// setter : ���� �޼ҵ� : ���� �Լ� : ���� �ʱ�ȭ �ϴ� �Լ�
	/*
		private String mid ������ setter �Լ� ����� 
		1. set 
		2. ��������� ������ ù ��° ���ڸ� �빮�ڷ� �����Ѵ�. : Mid
		3. set + Mid = setMid()
		3. public void setMid(String mid) { this.mid = mid; }
	*/
	public void setMid(String mid){
		this.mid = mid;
	}
	public void setMpw(String mpw){
		this.mpw = mpw;
	}
	public void setMname(String mname){
		this.mname = mname;
	}
	public void setMage(int mage){
		this.mage = mage;
	}

	// getter : ���� �޼ҵ� :  ���� �Լ� : ���� �����ϴ� �Լ� 
	/*
		private String mid ������ getter �Լ� ����� 
		1. get 
		2. ��������� ������ ù ��° ���ڸ� �빮�ڷ� �����Ѵ�. : Mid
		3. get + Mid = getMid()
		3. public String getMid() { return this.mid; }
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
}

public class Exam_Const_2 {

	public static void main(String args[]) {

		Exam_ConstVO ecvo = new Exam_ConstVO("SJH", "SJH00", "������", 27);
		//System.out.println("ecvo �������� �ּҰ� >>> : " + ecvo);
		//System.out.println("ecvo.getMid() >>> : " + ecvo.getMid() + "\n");

		Exam_ConstVO ecvo_1 = new Exam_ConstVO();
		//System.out.println("ecvo_1 �������� �ּҰ� >>> : " + ecvo_1);
		ecvo_1.setMid("HSA");
		ecvo_1.setMpw("HSA00");
		ecvo_1.setMname("Ȳ�ž�");
		ecvo_1.setMage(23);
		//System.out.println("ecvo_1.getMid() >>> : " + ecvo_1.getMid() + "\n");


		ArrayList aList = new ArrayList();
		for (int i=0; i < 3; i++){
			
			Exam_ConstVO ecvo_2 = new Exam_ConstVO();
			System.out.println("ecvo_2 �������� �ּҰ� >>> : " + ecvo_2);
			
			ecvo_2.setMid("HSA_" + i);
			ecvo_2.setMpw("HSA00_" + i);
			ecvo_2.setMname("Ȳ�ž�_" + i);
			ecvo_2.setMage(23 + i);
			// System.out.print(ecvo_2.getMid() + " : ");
			// System.out.print(ecvo_2.getMpw() + " : ");
			// System.out.print(ecvo_2.getMname() + " : ");
			// System.out.println(ecvo_2.getMage() + "\n");
			System.out.println("aList <<<>>> : " + aList + "\n");
			
			aList.add(ecvo_2);
			System.out.println("aList >>> : " + aList + "\n");
		}

		System.out.println("aList.get(0) >>> : " + aList.get(0));
		System.out.println("aList.get(1) >>> : " + aList.get(1));
		System.out.println("aList.get(2) >>> : " + aList.get(2));

		int aListSize = aList.size();
		System.out.println("aListSize >>> : " + aListSize);
		for (int i=0; i < aListSize; i++ ){
			Exam_ConstVO ecvo_3 = (Exam_ConstVO)aList.get(i);
			System.out.println("ecvo_3 �������� �ּҰ� >>> : " + ecvo_3);
			System.out.print(ecvo_3.getMid() + " : ");
			System.out.print(ecvo_3.getMpw() + " : ");
			System.out.print(ecvo_3.getMname() + " : ");
			System.out.println(ecvo_3.getMage() + "\n");

		}
	}
}
