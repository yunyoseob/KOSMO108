package a.b.c.prac1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import a.b.c.common.FilePath;


public class BufferStream_p {

	public static void main(String[] args) {
		// ���� �н� ����Ŭ�������� �ҷ�����
		String filePath=FilePath.FILE_PATH_PRAC1;
		System.out.println("filePath >>> : "+filePath);
		
		// ���� �н� �� ����� ���� ����� �ʱ�ȭ
		String inFile=filePath+"/"+"FileWriter_p.java";
		String outFile=filePath+"/"+"FileWriter_p.bak";
		
		//========�ʱ�ȭ===================		
		BufferedInputStream inbuf=null;
		BufferedOutputStream outbuf=null;
		FileInputStream fis=null;
		FileOutputStream fos=null;
		File f=null;
		int data=0;
		//================================
		
		try {
			f=new File(inFile);
			System.out.println("new File(inFile) >>> : "+f);
			
			// ������ �ִ��� ���� üũ�ϴ� boolean
			boolean bFile=f.exists();
			System.out.println("boolean bFile >>> : "+bFile);
			
			if(bFile){
				System.out.println("come in if(bFile)");
				// ������ �б� ���ؼ�
				fis=new FileInputStream(f);
				System.out.println("new FileInputStream fis >>> : "+fis);
				inbuf=new BufferedInputStream(fis);
				System.out.println("new BufferedInputStream inbuf >>> : "+inbuf);
				
				// inbuf=new BufferedInputStream(new FileInputStream(new File(inFile)));
				// �̷��� �ᵵ �����ϴ�. File => FileInputStream => BufferedInputStream ������
				// �ȿ��� ������, �׷���, �ʺ��ڴ� �����ϴ� ���� ����.
				
				// ������ ���� ���ؼ�
				fos=new FileOutputStream(outFile, true);
				System.out.println("new FileOutputStream(outFile, true) fos >>> : "+fos);
				outbuf=new BufferedOutputStream(fos);
				System.out.println("new BufferedOutputStream(fos) outbuf >>> : "+outbuf);
				
				// ������ �о ���Ͽ� ����
				while((data=inbuf.read())!=-1){
					System.out.print((char)data);
					outbuf.write(data);
				}
				System.out.println("outbuf.flush ���� >>> : "+outbuf);
				outbuf.flush();
				System.out.println("outbuf.flush ���� >>> : "+outbuf);
				
				/*
				 * ������ ����
				 * 
				 * File -> FileInputStream
				 * -> BufferedInputStream -> FileOutStream 
				 * -> BufferedOutputStream
				 * 
				 * */
				
				// buffer
				outbuf.close(); outbuf=null;
				inbuf.close(); inbuf=null;

				fos.close(); fos=null;
				fis.close(); fis=null;

				
				/*
				 * ���� ����
				 * 
				 * BufferedInputStream -> BufferOutputStream
				 * -> FileInputStream ->FileOutStream
				 * 
				 * */
			
			}else{
				System.out.println("����Ϸ��� �ش� ������(����)�� �����ϴ�.");
			}
			
		}catch(Exception e){
			System.out.println("error >>>  : "+e.getMessage());
		}finally{
			if (inbuf != null){
				try{inbuf.close(); inbuf=null;}catch(Exception e){}
				
			}
			if (outbuf !=null){
				try {outbuf.close(); outbuf=null;}catch(Exception e){}
			}
			if (fis!=null){
				try{fis.close(); fis=null;}catch(Exception e){}
			}
			if (outFile !=null){
				try {fos.close(); fos=null;}catch(Exception e){}
			}
			
		}
		

	}

}
