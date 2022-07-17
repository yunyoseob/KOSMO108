package a.b.c.prac1;

import java.io.File;
import java.io.IOException;

public class File_p2 {
	public static void main(String[] args) {
		/*
		 * java.io.File Ŭ������ �ڹٿ��� ���� �Ǵ� ���� ��ü�� �ٷ�� Ŭ�����̴�.
		 * new File() : File Ŭ������ �ν��Ͻ� ���� (���� �Ǵ� ������ �����Ͻÿ�).
		 * ���� �ϵ��ũ�� �������� ����/����(���丮)�� ��������  �ʴ´�.
		 * ���� ����/����(���丮)�� ����� ���ؼ��� File Ŭ������ �ִ� �Լ���
		 * ȣ���ؾ� �Ѵ�.
		 * 
		 * createNewFile()
		 * 
		 * Atomically creates a new, empty file named 
		 * by this abstract pathname 
		 * if and only if a file with this name does not yet exist.
		 * 
		 * mkdir()
		 * 
		 * Creates the directory named by this abstract pathname.
		 * 
		 * 
		 * mkdirs()
		 * 
		 * Creates the directory named by this abstract pathname, 
		 * including any necessary but nonexistent parent directories.
		 * File Ŭ������ ����Ű�� �⺻ ��ġ(default directory)�� �� Ȯ���ϰ� ����ؾ� �Ѵ�.
		 * 
		 * 
		 * ���丮�� ������ �� ó�� FileŬ�������� ������ ȯ�濡�� �����ΰ��� �ؾ��� ����
		 * JVM�� ��ɾ ���� �ش� OS�� ��û�� �ϸ�
		 * �ش� OS���� ����� �����Ͽ��ش�.
		 * 
		 * */
		
		File f=new File("���伷1");
		// Creates a new File instance by converting the given pathname 
		// string into an abstract pathname.
		
		System.out.println("f >>> : "+f);
		// ���伷1
		System.out.println("f.getName() >>> : "+f.getName());
		// ���伷1
		
		File fd=new File("aaaa");
		System.out.println("new File(aaaa) (fd) >>> : "+fd);
		// aaaa
		System.out.println("fd.getName() >>> : "+fd.getName());
		// aaaa
		
		File fds=new File("aa/bb/cc");
		System.out.println("new File(aa/bb/cc)fds >>> : "+fds);
		// aa\bb\cc
		System.out.println("fds.getName() >>> : "+fds.getName());
		// cc
		
		
		try{
			boolean b=f.createNewFile();
			// f >>> File f=new File("���伷1");
			// ���ο� ������ ������.
			/*
			 * Atomically creates a new, empty file named 
			 * by this abstract pathname if and only if a file 
			 * with this name does not yet exist.
			 * 
			 * Since 1.2
			 * 
			 * */
			System.out.println("���ο� ������ ��������� true, �ƴϸ� false >>> : "+b);
			// true
			
			boolean bdir=f.isDirectory();
			System.out.println("File f=new File(���伷1)�� ���丮�ΰ���? >>> : "+bdir);
			// File f=new File("���伷1");
			// 
			/*
			 * Tests whether the file denoted by this abstract pathname is a directory.
			 * 
			 * is�� ~���� ~�ƴ���
			 * 
			 * ���丮�ΰ���? ����
			 * 
			 * */			
			// false
			
			boolean bfile=f.isFile();
			System.out.println("File f=new File(���伷1)�� �����ΰ���? >>> : "+bfile);
			// File f=new File("���伷1");
			// 
			/*
			 * Tests whether the file denoted by this abstract pathname is a normal file.
			 * 
			 * is�� ~���� ~�ƴ���
			 * 
			 * �����ΰ���? ����
			 * 
			 * */
			// true
			
			boolean bd=fd.mkdir();
			System.out.println(" File fd=new File(aaaa) ���丮 �����߳���? >>> : "+bd);
			// File fd=new File("aaaa");
			/*
			 * Creates the directory named by this abstract pathname.
			 * 
			 * ���丮 ������ּ���.
			 * 
			 * */
			// true
			
			boolean bddir=fd.isDirectory();
			System.out.println("File fd=new File(aaaa)�� ���丮�ΰ���? >>> : "+bddir);
			// File fd=new File("aaaa");
			/*
			 * Tests whether the file denoted by this abstract pathname is a directory.
			 * 
			 * ���丮 �ΰ���?? ����
			 * 
			 * */
			// true
			
			boolean bdfile=fd.isFile();
			System.out.println("File fd=new File(aaaa)�� �����ΰ���? >>> : "+bdfile);
			// File fd=new File("aaaa");
			/*
			 * Tests whether the file denoted by 
			 * this abstract pathname is a normal file.
			 * 
			 * �����ΰ���?? ����
			 * 
			 * */
			// false
			
			boolean bds=fds.mkdirs();
			System.out.println("File fds=new File(aa/bb/cc) ���丮 �����߳���? >>> : "+bds);
			// File fds=new File("aa/bb/cc");
			/* Creates the directory named by this abstract pathname,
			 * including any necessary but nonexistent parent directories.
			 */
			// true 
			
		}catch (Exception e){
			System.out.println("error >>> : "+e.getMessage());
		}
		
	}

}
