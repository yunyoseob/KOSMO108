package a.b.c.prac1;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import a.b.c.common.FilePath;

public class InStrReadTest_p {

	public static void main(String[] args) {
		/*
		 * InputStreamReader isr=
		 * 	new InputStreamReader(
		 *  new FileInputStream("InStrReadTest_p.java"));
		 *  while ((data=isr.read())!=-1)
		 *  {
		 *  	// �о�� �����͸� ���ڷ� ����ȯ �ؼ� �ֿܼ� ����Ѵ�.
		 *  	System.out.print((char)data);
		 *  }
		 * 
		 * byte�� �ҷ��� ���, �ѱ��� ũ�Ⱑ ���� �ʾ� ������ ������ �߻��ϴµ�,
		 * InputStreamReader Ŭ������ ���� ó���ϸ�
		 * byte�� char�� �ٲ�� ���ڰ� ������ �ʴ´�.
		 * 
		 * */
		
		// ���� �н� ����Ŭ�������� �ҷ�����
		String filePath=FilePath.FILE_PATH_PRAC1;
		
		// ���� �н� �� ����� ���� ����� �ʱ�ȭ
		String inFile=filePath+"/"+"InStrReadTest_p.java";
		
		File ff=null;
		FileInputStream fis=null;
		InputStreamReader isr=null;
		// byte -> char ��ȯ�ϴ� io ������Ʈ�� Ŭ����
		BufferedReader br=null;
		
		int data=0;
		boolean bFile=false;
		
		try{
			ff=new File(inFile);
			System.out.println("ff >>> : "+ff);
			bFile=ff.exists();
			System.out.println("bFile >>> : "+bFile);
			
			if(bFile){
				fis=new FileInputStream(ff);
				System.out.println("fis >>> : "+fis);
				isr=new InputStreamReader(fis);
				// FileInputStream���� ���� ���� Ŭ���� ����������
				// byte���� char�� ��ȯ�ϴ� Ŭ������ ���������� ����
				br=new BufferedReader(isr);
				
				while((data=br.read())  !=-1){
					// �о�� �����͸� ���ڷ� ����ȯ �ؼ� �ֿܼ� ����Ѵ�.
					System.out.print((char)data);
				}
				
			}else{
				System.out.println("�ش� ��ο� ������ �������� �ʽ��ϴ�. >>> : ");			
			}
			
			br.close(); br=null;
			isr.close(); isr=null;
			fis.close(); fis=null;
			
			
		}catch(Exception e){
			System.out.println("e >>> : "+e.getMessage());
		}finally{
			if(br!=null){
				try{br.close(); br=null;}catch(Exception e){}
				}
			if(isr!=null){
				try{isr.close(); isr=null;}catch(Exception e){}
				}
			if(fis!=null){
				try{fis.close(); fis=null;}catch(Exception e){}
				}
			
		}
	}

}
