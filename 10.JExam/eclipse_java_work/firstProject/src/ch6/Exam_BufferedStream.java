package a.b.c.ch6;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import a.b.c.common.FilePath;

public class Exam_BufferedStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ���� �н� ����Ŭ�������� �ҷ����� 
		String filePath = FilePath.FILE_PATH_CH6;

		// ���� �н� �� ����� ���� ����� �ʱ�ȭ 
		String inFile = filePath + "/" + "Exam_BufferedWriter.java";
		String outFile = filePath + "/" + "Exam_BufferedWriter.bak";
		
		BufferedInputStream inbuf = null;
		BufferedOutputStream outbuf = null;
		FileInputStream fis = null;
		FileOutputStream fos = null;
		File f = null;		
		int data = 0;
				
		try {
			
			f = new File(inFile);
			
			// ������ �ִ��� ���� üũ �ϴ� boolean 
			boolean bFile = f.exists();
			System.out.println("bFile >>> : " + bFile);
			
			// ������ ���� ���� ���� �Ѵ�. 
			if (bFile) {
				
				// ������ �б� ���ؼ� 
				fis = new FileInputStream(f);
				inbuf = new BufferedInputStream(fis);
				
				// inbuf = new BufferedInputStream(new FileInputStream(new File(inFile)));
				
				// ������ ���� ���ؼ� 
				fos = new FileOutputStream(outFile, true);
				outbuf = new BufferedOutputStream(fos);
				
				// ������ �о ���Ͽ� ���� 
				while ((data=inbuf.read()) != -1) {
					System.out.print((char)data);
					outbuf.write(data);
				}
				
				outbuf.flush();
				
				outbuf.close();	outbuf=null;
				inbuf.close(); inbuf=null;	
				
				fos.close(); fos=null;
				fis.close(); fis=null;
			}else {
				System.out.println("����Ϸ��� �ش� ������(������)�� �����ϴ�. ");
			}
				
		}catch (Exception e) {
			System.out.println("������ e.getMessage() >>> : " + e.getMessage());
		}finally{
			if (inbuf !=null){
				try{inbuf.close(); inbuf=null;}catch(Exception e){}
			}
			if (outbuf !=null){
				try{outbuf.close(); outbuf=null;}catch(Exception e){}
			}	
			if (fis !=null){
				try{fis.close(); fis=null;}catch(Exception e){}
			}
			if (outFile !=null){
				try{fos.close(); fos=null;}catch(Exception e){}
			}	
		}		
	}
}
