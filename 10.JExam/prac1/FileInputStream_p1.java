package a.b.c.prac1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import a.b.c.common.FilePath;


public class FileInputStream_p1 {

	public static void main(String[] args) {
		// ���� �н� ����Ŭ�������� �ҷ�����
		String filePath=FilePath.FILE_PATH_PRAC1;
		System.out.println("filePath >>> : "+filePath);
		// filePath >>> : C:/00.KOSMO108/10.JExam/eclipse_java_work
		// /firstProject/src/a/b/c/prac1
		
		// ���� �н� �� ����� ���� ����� �ʱ�ȭ
		String inFile=filePath+"/"+"FileInputStream_p1.java";
		String outFile=filePath+"/"+"FileInputStream_p1.bak";
		
		// �������� ����Ʈ ���� �ʱ�ȭ
		FileInputStream fis=null;
		FileOutputStream fos=null;
		File f=null;
		int data=0;
		boolean bFile=false;
		System.out.println("fis, fos, f, data, bFile >>> \n");
		System.out.print(fis+" ,");
		System.out.print(fos+" ,");
		System.out.print(f+" ,");
		System.out.print(data+" ,");
		System.out.print(bFile);
		System.out.println();
		
		try{
			f=new File(filePath);
			System.out.println("f = new File(filePath) >>> : "+f);
			
			bFile=f.exists();
			System.out.println("f.exists() >>> : "+bFile);
			
			// ������ �ִ��� ���� üũ�ϴ� boolean
			bFile=f.exists();
			System.out.println("bFile >>> : "+bFile);
			
			// ������ �ִ��� Ȯ�������� if���� �����Ѵ�.
			if(bFile){
				// ������ �б� ���ؼ�
				System.out.println("if�� ������ ���Դ�.");
				
				fis=new FileInputStream(inFile);
				System.out.println("FileInputStream �Ϸ�");
				System.out.println("fis >>> : "+fis);
				
				// ������ ���� ���ؼ�
				fos=new FileOutputStream(outFile, true);
				// Creates a file output stream to write to the file 
				// represented by the specified File object.
				System.out.println("fos >>> : "+fos);
				
				// ������ �о ���Ͽ� ����
				// public int read() throws IOException
				while((data=fis.read()) != -1){
					System.out.print((char)data);
				}
				// io�� ���� ���� ���� ������ �ݴ�� �ݴ´�.
				// ������ �� �� ������ ����
				// ���� ���Թ� => ������ => �����̹�(�Ź��幮) => �湮		
				// ������ ���� �� ����
				// �湮 => �����̹�(�Ź��幮) => ������ => ���� ���Թ�
				// fis -> fos ������ �ڵ带 �Է��Ͽ�����,
				// fos -> fis ������ ���� �ݴ´�.
				fos.close();
				fis.close();
			}else{
				System.out.println("������ �����ϴ�. >>> : ");
			}
			
		}catch(Exception e){
			System.out.println("error >>> : "+e.getMessage());
		}finally {
			if (fos != null){
				// Ȥ�ó� close�� �� ���� ���� �ִ�. ������ �÷��� �����̱� ������
				// ���α׷��Ӱ� ��Ź�ϴ� �����̱� ������....
				try {fos.close(); fos=null;}catch(Exception e){}
			}
			if (fis != null){
				try {fis.close(); fis=null;}catch(Exception e){}
			}
		}

	} // main method

} // FileInputStream_p1 class
