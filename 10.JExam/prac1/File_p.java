package a.b.c.prac1;

import java.io.File;

public class File_p {

	public static void main(String[] args) {
		/*
		 *  java.io.File Ŭ������ �ڹٿ��� ���� �Ǵ� ���� ��ü�� �ٷ�� Ŭ�����̴�.
		 *  new File() : File Ŭ������ �ν��Ͻ� ����(���� �Ǵ� ������ �����Ͻÿ�.)
		 *  
		 * */
		File f=new File("���伷");
		System.out.println("f >>> : "+f);
		// ���伷
		System.out.println("f.getName() >>> : "+f.getName());
		// ���伷
		
		try {
			boolean b=f.createNewFile();
			System.out.println("b >>> : "+b);
			// C:\00.KOSMO108_YYS\10.JExam\eclipse_java_work\firstProject
			// �� ������ ����������.
			// ���Ⱑ ��Ŭ���� �ֻ���������.
			
		}catch(Exception e){
			System.out.println("������ >>>> : "+e.getMessage());
		}
	}

}
