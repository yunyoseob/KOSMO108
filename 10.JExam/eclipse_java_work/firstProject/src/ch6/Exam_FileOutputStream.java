package a.b.c.ch6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import a.b.c.common.FilePath;

public class Exam_FileOutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// ���� �н� ����Ŭ�������� �ҷ����� 
		String filePath = FilePath.FILE_PATH_CH6;

		// ���� �н� �� ����� ���� ����� �ʱ�ȭ 
		String inFile = filePath + "/" + "Exam_FileOutputStream.java";
		String outFile = filePath + "/" + "Exam_FileOutputStream.bak";
		
		// �������� ����Ʈ ������ �ʱ�ȭ 
		FileInputStream fis = null;
		FileOutputStream fos = null;
		File f = null;		
		int data = 0;
		boolean bFile = false;
				
		try {
			
			f = new File(filePath);
			
			// ������ �ִ��� ���� üũ �ϴ� boolean 
			bFile = f.exists();
			System.out.println("bFile >>> : " + bFile);
			
			// ������ ���� ���� ���� �Ѵ�. 
			if(bFile) {

				// ������ �б� ���ؼ�
				fis = new FileInputStream(f);				
				System.out.println("fis >>> : " + fis);
				
				// ������ ���� ���ؼ� 
				fos = new FileOutputStream(outFile, true);
				System.out.println("fos >>> : " + fos);
				
				// ������ �о ���Ͽ� ����
				// public int read() throws IOException				
				while((data = fis.read()) !=-1) {
					System.out.print((char)data);
				}
				
				// io �� ���� ���� ���� ������ �ݴ�� �ݴ´�.
				// ���������� ������ �Ǿ��� �� ����Ǵ� ��ƾ 
				fos.close();
				fis.close();				
			}else {
				System.out.println("������ �����ϴ�. >>> : ");
			}
					
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("������ >>> : " + e.getMessage());
		}finally {
			
			if (fos !=null) {
				try { fos.close(); fos=null; }catch(Exception e) {}
			}

			if (fis !=null) {
				try { fis.close(); fis=null; }catch(Exception e) {}
			}
		}
	}
}
