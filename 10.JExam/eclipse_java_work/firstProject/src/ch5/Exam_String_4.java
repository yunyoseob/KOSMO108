// ��Ű�� ����
package a.b.c.ch5;

//����Ʈ ����
import java.util.StringTokenizer;

// Ŭ���� ����
public class Exam_String_4 {
	
	// ��� ����
	// ������� ����	
	// ������ ����
	// �Լ� ���� 
	public int wordSplit(String str) {
	
		int sCnt = 0;		
		
		// ���ڿ� ���� Validation
		if (str !=null && str.length() > 0 ) {
			
			String s[] = str.split(" ");
			
			sCnt = s.length;	
		}
				
		return sCnt;
		// return str.split(" ").length;
	}
	
	public int workToken(String str) {
		
		int tCnt = 0;
		
		if (str !=null && str.length() > 0 ) {
			StringTokenizer st = new StringTokenizer(str, " ");
			tCnt = st.countTokens();	
		}
		
		return tCnt;
		// return new StringTokenizer(str, " ").countTokens();
	}
	
	public int aCount(String str) {
		
		int aCnt = 0;

		if (str !=null && str.length() > 0 ) {
			
			for (int i=0; i < str.length(); i++) {
			
				if ('a' == str.charAt(i)) {
					
					aCnt++;
				}
			}			
		}
		
		return aCnt;
	}
	
	// main() �Լ� ���� 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "The Curious Case of Benjamin Button";
		Exam_String_4 es4 = new Exam_String_4();
		
		int sCnt = es4.wordSplit(str);
		System.out.println("sCnt >>> : " + sCnt);
		
		int tCnt = es4.workToken(str);
		System.out.println("tCnt >>> : " + tCnt);
		
		int aCnt = es4.aCount(str);
		System.out.println("aCnt >>> : " + aCnt);
	
	}
}
