package a.b.c.prac1;

//import java.util.StringToTokenizer;

public class String_p4 {

	public void charSplit(String sVal){
		System.out.println("charSplit �Լ� ����");
		if (sVal !=null && sVal.length()>0){
			sVal=sVal.replace('#', ' ');
			// #�� ��������� �ٲ۴�.
			// �����ؾ� �� ���� char, char�� �μ��� �Է��ؾ� �Ѵ�.
				
			String sChar[]=sVal.split(" ");
			
			System.out.println("sChar.length >>> : "+sChar.length);
			for (int i=0; i<sChar.length; i++){
				String s=sChar[i];
				System.out.println("sChar["+i+"] >>> : "+s);
			}
		}
		
		
	}
	
	public static void main(String []args) {
		System.out.println("main �Լ� ����");
		String sVal="A BC#D EF#G HI#J KL#M NO";
		System.out.println("sVal >>> : "+sVal);
		//String_p4 rv=new String_p4();
		

		
		

	} // main method

} // String_p4 class
