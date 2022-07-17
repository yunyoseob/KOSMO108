package a.b.c.ch6;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Exam_File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		java.io.File Ŭ������ �ڹٿ��� ���� �Ǵ� ���� ��ü�� �ٷ�� Ŭ�����̴�. 
		new File() : File Ŭ������ �ν��Ͻ� ����(���� �Ǵ� ������ �����Ͻÿ�).
		���� �ϵ��ũ�� �������� ����/����(���丮)�� �������� �ʴ´�.
		���� ����/����(���丮)�� ����� ���ؼ��� File Ŭ������ �ִ� �Լ��� ȣ���ؾ� �Ѵ�.
			createNewFile()
			mkdir()
			mkdirs() 
		File Ŭ������ ����Ű�� �⺻ ��ġ(default directory)�� �� Ȯ���ϰ� ����ؾ� �Ѵ�.
		*/
				
		File f = new File("�ڰǿ�");
		System.out.println("f >>> : " + f);
		System.out.println("f.getName() >>> : " + f.getName());
				
		File fd = new File("aaaa");
		System.out.println("fd >>> : " + fd);
		System.out.println("fd.getName() >>> : " + fd.getName());
		
		File fds = new File("aa/bb/cc");
		System.out.println("fds >>> : " + fds);
		System.out.println("fds.getName() >>> : " + fds.getName());
		
		try {
			// C:\00.KOSMO108\10.JExam\eclipse_java_work\firstProject\�ڰǿ�			
			boolean b = f.createNewFile();
			System.out.println("b >>> : " + b);
			
			boolean bdir = f.isDirectory();
			System.out.println("bdir >>> : " + bdir);
			boolean bfile = f.isFile();
			System.out.println("bfile >>> : " + bfile);
			
			boolean bd = fd.mkdir();
			System.out.println("bd >>> : " + bd);
			
			boolean bddir = fd.isDirectory();
			System.out.println("bddir >>> : " + bddir);
			boolean bdfile = fd.isFile();
			System.out.println("bdfile >>> : " + bdfile);
			
			boolean bds = fds.mkdirs();
			System.out.println("bds >>> : " + bds);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("������ >>> : " + e.getMessage());
		}
	}
}
