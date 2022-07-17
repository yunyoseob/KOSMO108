package a.b.c.prac1;

import java.io.File;
import java.io.FileInputStream;
import a.b.c.common.FilePath;

public class FileInputStream_p {

	public static void main(String[] args) {
		/*
		 * �ڹ� ���α׷������� �޸� ������ ���α׷����� ���� �ʴ´�.
		 * �ҽ����� �����ڰ� �޸𸮸� ����� ������ �� ���� ����.
		 * �ڹٿ��� �޸𸮸� ����ٴ� ����
		 * 
		 * ������ �÷��Ϳ��� ��û�ϴ� �Ͱ� ���� ���̴�.
		 * ���α׷� ���忡���� �޸𸮰� ���� ���������� �� ���� ����.
		 * */
		
		/*
		 * �ڹٿ��� null Ű���尡 �ִ�.
		 * null Ű���尡 �ǹ��ϴ� ����  �����͸� ����Ű�� �ʴ´�.
		 * ���� ���� �� ���������� �����Ͱ� ����.
		 * 
		 * Ŭ���� ��������=null;
		 * 
		 * �� Ŭ������ ����ִٶ�� �ǹ̰� �ƴ϶�
		 * �׳� ����ִٶ�� ���̴�.
		 * 
		 * ������ �ϸ�, ���뿡 ���� ���� ���� �ƴ϶�
		 * ������ü�� ���ٶ�� ���� �ǹ��Ѵ�.
		 * 
		 * */
		
		/*
		 * �������� ����ϴ� ���(How to use local variable)
		 * 
		 * 1. ���������� �Լ����� �¾�� �Լ����� �״´�.
		 * 	�� : ���̴� ���� GC(������ �÷���)�� �Ѵ�. (���α׷��Ӱ� �ϴ°� �ƴ�.)
		 * 
		 * 2. ���������� ������� ����� �� ���� ����.
		 * 3. ���������� ������ �÷��Ͱ� �� ���α׷��� �޸� ��Ȳ�� ����
		 * 4. ���α׷��� �켱������ ���� �����ٸ��� ���ؼ� �޸𸮿��� ���� �ȴ�.
		 * 
		 * */
		
		/*
		 * �������� ����ϴ� ��Ģ(local variable Rules)
		 * 
		 * 1. ���������� ����� ���ÿ� ����Ʈ ������ �ʱ�ȭ �Ѵ�.
		 * 	��ü ��������=null;
		 * 	�����ڷ��� ��������=����Ʈ��;
		 *  int ����Ʈ�� => 0
		 *  float, double ����Ʈ�� => 0.0
		 *  char ����Ʈ�� => \u0000
		 *  boolean ����Ʈ�� => false
		 *  
		 *  String s="";
		 *  String s1=null;
		 *  
		 *  ��� ����, I/O�� �߻��ϴ� ��ü�� ����� ��,
		 *  flush(), close(), null ó���� �ؾ� �Ѵ�.
		 *  
		 *  flush�� �ڷ� ��Ⱑ ���� �ʰ� ������Ƹ� ������ ����
		 *  
		 *  close�� ������� ���ε�, ���� ���׶����� ���� ���� ���� �����Ƿ�,
		 *  null�� �� �� �� Ȯ���ؾ� �� ���� ����.
		 *  
		 *  example)
		 *  
		 *  FileInputStream fis=null; => null �ʱ�ȭ
		 *  
		 *  fis = new FileInputStream(filePath+"/"+file); => ��ü ����
		 *  
		 *  fis.close => ��ü �ݱ�
		 *  
		 *  fis = null; => ���������� null�� �ʱ�ȭ
		 * */
		
		FileInputStream fis=null;
		// try~catch~finally ������ ���� ����
		// main method ������������ null�� �ʱ�ȭ�� �Ѵ�.
		// FileInputStream Ŭ������ null �� ���°� �ƴ϶�
		// FileInputStream Ŭ���� ��ü�� null�̶�� ������ִ� ���̴�.
		System.out.println("FileInputStream fis >>> : "+fis);
		// FileInputStream fis >>> : null
		// null�� ���� Ȯ�� �Ͽ���.
		
		try {
			String filePath=FilePath.FILE_PATH_PRAC1;
			System.out.println("filePath >>> : "+filePath);
			// a.b.c.common��Ű���� �ִ� FilePath Ŭ������
			// public static final String FILE_PATH_CH6 ������
			// FileInputStream_p ����  String �����ڷ����� filePath�� �������ش�.
			filePath=filePath+"/"+"FileInputStream_p.java";
			// filePath�� ���� ������ �����ش�.
			System.out.println("filePath <<<<<<<<<<<<<<<<<<<<<>>> : "+filePath);
			// ���� ��ΰ� ����� �Ǿ����� Ȯ���Ͽ� ����.
			// filePath >>> : 
			// C:/00.KOSMO108/10.JExam/eclipse_java_work/firstProject/src/a/b/c/
			// prac_1/FileInputStream_p.java
			// ����� ������ Ȯ���Ͽ���.
			
			// === �� �������� /�� \�� �ٲ�
			File f=new File(filePath);
			// new �ν��Ͻ� �����ڷ� ����� ���� ��θ� FileŬ������ �ν��Ͻ��Ѵ�.
			// Creates a new File instance by converting 
			// the given pathname string into an abstract pathname.
			// "abstract pathname" : ���� ��η� �Է��ؾ� �Ѵ�.
			// File ������ �����ε��߿� File(String pathname) �����ڷ� �ν��Ͻ�.
			System.out.println("File f >>> : "+f);
			// �׻� ������ �θ��ų� ã�ų� �� ���� ������ ����� ���Դ��� �ǽ��غ���
			// Ȯ���ؾ� ��.
			
			boolean bFile=f.exists();
			// File Ŭ������ exists �޼���
			// 	exists()
			// Tests whether the file or directory denoted 
			// by this abstract pathname exists.
			
			System.out.println("f.exists() true/false >>> : "+bFile);
			// boolean Ű����� ������ �����ϴ��� �� �� �� Ȯ���غ���.
			
			if(bFile){
				// if ���ǹ��ȿ� bFile�� �������ν�
				// true�� ���� ����ǰ� �Ѵ�.
				// checked exception�̸� eclipse���� ������ üũ���ֳ�
				// unchecked exception�̸� ����� ��ƾ� �ϱ� ������
				// File f Ȯ��, boolean���� f.exists() Ȯ��
				// if�� ���ǽ� �ȿ��� Ȯ�� �� 3���� Ȯ�� �۾��� ���ļ� �Ĳ��� Ȯ���غ���
				// ���߿� io �۾��� �������� ��Ȱ�ϰ� �۾��� �� �ִ�.
				fis=new FileInputStream(f);
				// FileInputStream 
				// ���ε��� ������ ��Ʈ���� �Է½�Ų��.
				System.out.println("fis >>> : "+fis);
				
				int data=0;
				while((data=fis.read()) !=-1) {
					// FileInputStream
					// read() : Reads a byte of data from this input stream.
					System.out.print((char)data);
					// ������ �����͸� char �ڷ������� ����ȯ �Ͽ� ��½�Ų��.
					// fis�� �дµ�, -1�� �� ������ �� �̻� ���� �� ���� �� �θ���� ���̴�.
				}
				fis.close();
				// ���������� if���� ����ǰ�, while���� ����Ǿ��� ��,
				// FileInputStream(f)�� �ݴ´�.
				// �� ������ ���� �ֱ� ������(����) finally���� �� �� �� üũ�ϰ�
				// Ȯ���ϰ� �ݴ´�.
			} 
			
			
		}catch(Exception e){
			System.out.println("error >>> : "+e.getMessage());
			// ����ó���� �� ������ ��½�Ų��.	
		}finally{
			if (fis!=null){
				// fis�� null���� ���������� üũ�ϰ�, �ƴ� �� try�� ����
				try {
					fis.close(); fis=null;
					// fis�� �ݰ�, null�� �ʱ�ȭ���ش�.
					// �� �� try���� ����� ������� ������, catch������ �ѱ��.
				}catch(Exception e){
					System.out.println("error >>> : "+e.getMessage());
				}
			}
			
		}
		
		

	} // main method

} // FileInputStream_p class
