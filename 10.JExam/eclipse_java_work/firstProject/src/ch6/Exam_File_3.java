package a.b.c.ch6;

import java.io.File;

import a.b.c.common.DateUtil;

public class Exam_File_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			// mkdirs() �Լ� 		
			File f3 = new File("test/aa/bb/cccc");
			f3.mkdirs();
			System.out.println("f3 >>> : " + f3);
			
			File f4 = new File(f3, DateUtil.yyyymmdd() + "_" + f3.getName() + ".txt");
			f4.createNewFile();
			String getPath1 = f4.getPath(); // File�� �Էµ� ��� ��� 
			System.out.println("getPath1 >>> : " + getPath1);
			
			if (f4.exists()) {
				java.io.FileWriter fw = null;
				fw = new java.io.FileWriter(f4);
				fw.write("mkdirs :: ���� ������ �Ẹ���� ~~~ !!! ");
				fw.close();
			}
			
		}catch(Exception e) {
			System.out.println("e >>> : " + e.getMessage());
		}
		
	}

}
