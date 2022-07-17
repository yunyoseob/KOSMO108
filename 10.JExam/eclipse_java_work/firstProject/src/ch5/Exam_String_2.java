package a.b.c.ch5;
// ����ǥ������ 1.4���� �����Ѵ�.
import java.util.StringTokenizer;

public class Exam_String_2 {
	
	public void charSplit(String sVal){
		
		System.out.println("charSplit(String sVal) sVal >>> : " + sVal);

		if (sVal !=null && sVal.length() > 0){
			
			String sChar[] = sVal.split("@"); // �������� delimiter, ������
			
			for (int i=0; i < sChar.length; i++ ){
				System.out.println("sChar["+i+"] >>> : " + sChar[i]);
			}
		}
	}
	
	public void charToken(String sVal){
		System.out.println("charToken(String sVal) sVal >>> : " + sVal);

		if (sVal !=null && sVal.length() > 0){
			
			StringTokenizer st = new StringTokenizer(sVal, "@^ |");
			
			while (st.hasMoreTokens()) {
				System.out.println(">>> : " + st.nextToken());
			}
			// �ݵ�� hasMoreTokens()�� nextToken()�� ¦������ ����Ѵ�. (API����) 
			
			for (int i=0; st.hasMoreTokens(); i++ ){
				System.out.println(i + "��° : " + st.nextToken());
			}
		}
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sVal = "a b^c,d ef,g|h^i,jk|l,m^no";
		System.out.println("sVal >>> : " + sVal);
		
		sVal = sVal.replace(',', '@');
		System.out.println("sVal >>> : " + sVal);	
		
	
		Exam_String_2 ex2 = new Exam_String_2();
		ex2.charSplit(sVal);
		ex2.charToken(sVal);
	
	}
}
