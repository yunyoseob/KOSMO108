package a.b.c.prac1;

import java.io.File;
import java.io.FileReader;

import a.b.c.common.FilePath;

public class FileReader_p {

	public static void main(String[] args) {
		// ��������, ��ü, ��������
		// ��ü null �ʱ�ȭ
		FileReader fr = null;
		
		try{
			String filePath=FilePath.FILE_PATH_PRAC1;
			filePath=filePath+"/"+"FileReader_p.java";
			System.out.println("filePath >>> : "+filePath);
			
			File f=new File(filePath);
			
			boolean bFile=f.exists();
			System.out.println("bFile >>> : "+bFile);
			
			if(bFile){
				fr=new FileReader(f);
				System.out.println("fr >>> : "+fr);
				
				// public int read() throws IOException
				int data=0;
				while((data=fr.read()) !=-1){
					System.out.print((char)data);
				}
				
				// ���������� ������ �Ǿ��� �� ����Ǵ� ��ƾ
				// FileInputStream I/O ��ü�� �ݴ´�.
				// FileReader�� ��ü�� ��������
				// �ݾ��ݴϴ�.
				fr.close();				
			}else {
				System.out.println("������ �����ϴ�. >>> ");
			}
			
		}catch(Exception e){
			System.out.println("error >>> : "+e.getMessage());
		}finally{
			if (fr !=null){
				// ������ �÷��Ͱ� fr.close ���� ���� �� �ݾ���ų�
				// Ȥ�� catch ������ ���� ��� null���� �ƴ��� Ȯ��
				try {
					fr.close(); fr=null;}catch(Exception e){}	
			}
		}
	} // main method

} // FileReader_p class
