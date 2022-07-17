package a.b.c.prac1;

import java.io.File;
import a.b.c.common.DateUtil;

public class File_p5 {

	public static void main(String[] args) {
		try{
			// mkdirs() �Լ�
			// Creates the directory named by this abstract pathname, 
			// including any necessary but nonexistent parent directories.
			File f3=new File("test/aa/bb/cccc");
			f3.mkdirs();
			// ���丮�� ������ ����ڴ�.
			System.out.println("f3 >>> : "+f3);
			
			File f4=new File(f3, DateUtil.yyyymmdd() + "_"+f3.getName()+".txt");;
			f4.createNewFile();
			System.out.println("f4 >>> : "+f4);
			String getPath1=f4.getAbsolutePath();
			// File�� �Էµ� ���� ��θ� getPath1 String ������ ����
			System.out.println("getPath1 >>> : "+getPath1);
			// ���� ��� ���
			
			boolean bool=f4.exists();
			System.out.println("f4.exists() >>> : "+bool);
			if(f4.exists()){
				java.io.FileWriter fw=null;
				// FileWriter Ŭ������ fw ���������� null�̶�� ����. (����!)
				fw=new java.io.FileWriter(f4);
				// f4 ������ FileWriter Ŭ������ �ν��Ͻ�
				System.out.println("fw >>> : "+fw);
				fw.write("mkdirs :: ���� ������ �Ẹ����~~~~~!!!! ");
				fw.close();
			}
			
		}catch(Exception e){
			System.out.println("error >>> : "+e.getMessage());
		}

	}

}
