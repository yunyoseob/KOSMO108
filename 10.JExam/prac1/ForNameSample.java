package a.b.c.prac1;

public class ForNameSample {
	// �⺻ ������
	ForNameSample(){
		System.out.println("ForNameSample �⺻ ������ ");
		aM();
	}
	
	void aM(){
		System.out.println("ForNameSample Ŭ������ aM() �޼���");
		bM();
	}
	
	void bM(){
		System.out.println("ForNameSample Ŭ������ bM() �޼���");
		cM();
	}
	
	void cM(){
		System.out.println("ForNameSample Ŭ������ cM() �޼���");
	}
	

	public static void main(String[] args) {
		new ForNameSample();
	}
}
