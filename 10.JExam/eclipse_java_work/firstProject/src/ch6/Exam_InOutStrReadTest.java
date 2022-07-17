package a.b.c.ch6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import a.b.c.common.FilePath;

public class Exam_InOutStrReadTest{

	public static void main(String args[]) {
		
		// ���� �н� ����Ŭ�������� �ҷ����� 
		String filePath = FilePath.FILE_PATH_CH6;

		// ���� �н� �� ����� ���� ����� �ʱ�ȭ 
		String inFile = filePath + "/" + "Exam_InOutStrReadTest.java";
		String outFile = filePath + "/" + "Exam_InOutStrReadTest.bak";
		
		File ff = null;
		FileInputStream fis = null;
		FileOutputStream fos = null;
		InputStreamReader isr = null; // byte -> char ��ȯ�Ѵ� io ������Ʈ�� Ŭ���� 
		OutputStreamWriter osw = null; // char -> byte ��ȯ�Ѵ� io ������Ʈ�� Ŭ����
	
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		int data = 0;
		boolean bFile = false;

		try{
			ff = new File(inFile);			
			bFile = ff.exists();  

			if (bFile){
				
				fis = new FileInputStream(ff);
				isr = new InputStreamReader(fis);
				
				br = new BufferedReader(isr);

				fos = new FileOutputStream(outFile);
				osw = new OutputStreamWriter(fos);
				
				bw = new BufferedWriter(osw);

				while ((data=br.read()) !=-1){
					// �о�� �����͸� ���ڷ� ����ȯ �ؼ� �ֿܼ� ����Ѵ�. 
					System.out.print((char)data);
					bw.write(data);
				}
				// flush() �ϱ� 
//				osw.flush();
				bw.flush();
			}else{
				System.out.println("�ش� ��ο� ������ �������� �ʽ��ϴ�. >>> : ");
			}
			
			
			bw.close(); bw=null;	
			br.close(); br=null;
			osw.close(); osw=null;	
			isr.close(); isr=null;
			fos.close(); fos=null;
			fis.close(); fis=null;
		}catch (Exception e){
			System.out.println("e >>> : " + e);
		}finally{	
			if (bw !=null){
				try{bw.close(); bw=null;}catch (Exception e){}
			}
			if (br !=null){
				try{br.close(); br=null;}catch (Exception e){}
			}
			if (isr !=null){
				try{isr.close(); isr=null;}catch (Exception e){}
			}
			if (osw !=null){
				try{osw.close(); osw=null;}catch (Exception e){}
			}
			if (fis !=null){
				try{fis.close(); fis=null;}catch (Exception e){}
			}
			if (fos !=null){
				try{fos.close(); fos=null;}catch (Exception e){}
			}
		}
	}
}