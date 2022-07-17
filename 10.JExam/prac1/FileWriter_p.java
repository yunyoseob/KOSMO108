package a.b.c.prac1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import a.b.c.common.FilePath;


public class FileWriter_p {

	public static void main(String[] args) {
		// ���� �н� ���� Ŭ�������� �ҷ�����
		String filePath=FilePath.FILE_PATH_PRAC1;
		
		// ���� �н� �� ����� ���� ����� �ʱ�ȭ
		String inFile=filePath+"/"+"FileWriter_p.java";
		String outFile=filePath+"/"+"FileWriter_p.bak";
		
		// �������� ����Ʈ ������ �ʱ�ȭ
		FileReader fr=null;
		FileWriter fw=null;
		File f=null;
		int data=0;
		boolean bFile=false;
		
		try {
			f=new File(inFile);
			System.out.println("f >>> : "+f);
			
			// ������ �ִ��� ������ ���� üũ �ϴ� boolean
			bFile=f.exists();
			System.out.println("bFile >>> : "+bFile);
			
			if(bFile){
				// ������ �б� ���ؼ�
				fr=new FileReader(f);
				System.out.println("fr >>> : "+fr);
				
				// ������ ���� ���ؼ�
				fw=new FileWriter(outFile, true);
				// Constructs a FileWriter object 
				// given a File object.
				System.out.println("fw >>> : "+fw);
				
				// ������ �о ���Ͽ� ����
				// public int read() throws IOException
				while((data=fr.read()) != -1){
					System.out.print((char)data);
					fw.write(data);
				}
				
				// io�� �������� �� ���� �ݴ�� �ݱ�!!!!
				// fr => fw ������� ��������
				// fw => fr ������� �ݾƾ� ��.
				fw.close();
				fr.close();
			}else{
				System.out.println("������ �����ϴ�. >>> : ");		
			}
		}catch(Exception e){
			System.out.println("error >>> : "+e.getMessage());
			
		}finally{
			if (fw!=null){
				try {fw.close(); fw=null; }catch(Exception e){}
				// .close�� null �� �Ѵ� ����, ���� close �� �� ���� ����.
			}
			if (fr!=null){
				try {fr.close(); fr=null;}catch(Exception e){}
			}
			// fw => fr ������
			
		}

	} // main method

} // FileWriter_p class
