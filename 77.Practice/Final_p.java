package a.b.c.ch2;

public class Final_p{
	public static final String FILE_UPLOAD_PATH="C:\\Java_Practice\\fileUpload";
	// �Ű������� final
	void finalMethod(final String s){
		// s="velog_post";
		// error: final parameter s may not be assigned
		String ss=s;
		// ss="velog_post";
		// ���� ���� ���� �ٲٰڴ��ϸ� �̷��� �ٲٸ� �Ǳ� �Ѵ�.
		// �׷��� final�� ������ ������ �ٲٴ� ���� �ſ� �����ؾ� �Ѵ�.
		System.out.println("ss >>> : "+ss);
	} // fianlMethod method

	public static void main(String args[]){
		String s = Final_p.FILE_UPLOAD_PATH;
		System.out.println(" s >>> : "+s);

		Final_p rv = new Final_p();
		rv.finalMethod("velog");
	} // main method	
} // Final_p class