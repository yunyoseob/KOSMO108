package a.b.c.ch6;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.FileInputStream;

import a.b.c.common.FilePath;

public class Exam_InStrReadTest{

	public static void main(String args[]){
		/*	
			InputStreamReader isr = 
				new InputStreamReader(
				new FileInputStream("Exam_InStrReadTest.java"));
			while ((data=isr.read()) !=-1)
			{
				// �о�� �����͸� ���ڷ� ����ȯ �ؼ� �ֿܼ� ����Ѵ�. 
				System.out.print((char)data);
			}
		*/
		
		// ���� �н� ����Ŭ�������� �ҷ����� 
		String filePath = FilePath.FILE_PATH_CH6;

		// ���� �н� �� ����� ���� ����� �ʱ�ȭ 
		String inFile = filePath + "/" + "Exam_InStrReadTest.java";

		File ff = null;
		FileInputStream fis = null;
		InputStreamReader isr = null; // byte -> char ��ȯ�Ѵ� io ������Ʈ�� Ŭ���� 
		
		BufferedReader br = null;
		
		int data = 0;
		boolean bFile = false;

		try{
			ff = new File(inFile);			
			bFile = ff.exists();

			if (bFile){
				fis = new FileInputStream(ff);
				isr = new InputStreamReader(fis);
				
				br = new BufferedReader(isr);
				
				while ((data=br.read()) !=-1){
					// �о�� �����͸� ���ڷ� ����ȯ �ؼ� �ֿܼ� ����Ѵ�. 
					System.out.print((char)data);					
				}

			}else{
				System.out.println("�ش� ��ο� ������ �������� �ʽ��ϴ�. >>> : ");
			}
			
			br.close(); br=null;
			isr.close(); isr=null;
			fis.close(); fis=null;
		}
		catch (Exception e){
			System.out.println("e >>> : " + e);
		}finally{
			if (br !=null){
				try{br.close(); br=null;}catch (Exception e){}
			}
			if (isr !=null){
				try{isr.close(); isr=null;}catch (Exception e){}
			}
			if (fis !=null){
				try{fis.close(); fis=null;}catch (Exception e){}
			}
		}
	}
}