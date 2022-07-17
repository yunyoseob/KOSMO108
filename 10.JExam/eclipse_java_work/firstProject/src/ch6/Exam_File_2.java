package a.b.c.ch6;

import java.io.File;

import a.b.c.common.DateUtil;

public class Exam_File_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			// mkdir() �Լ� 
			File f1 = new File("abc");
			f1.mkdir();
			System.out.println("f1 >>> : " + f1);
			
			File f2 = new File(f1, DateUtil.yyyymmdd() + "_" + f1.getName() + ".txt");
			f2.createNewFile();
			String getPath = f2.getPath(); // File�� �Էµ� ��� ��� 
			System.out.println("getPath >>> : " + getPath);
			
			if (f2.exists()) {
				java.io.FileWriter fw = null;
				fw = new java.io.FileWriter(f2);
				fw.write("mkdir :: ���� ������ �Ẹ���� ~~~ !!! ");
				fw.close();
			}
			
			File files[] = f1.listFiles();
			System.out.println("files.length >>> : " + files.length);
			for (int i=0; i < files.length; i++) {
				String fileName = files[i].getName();
				System.out.println("fileName >>> : " + fileName);
			}
			
		}catch(Exception e) {
			System.out.println("������ >>> : " + e.getMessage());
		}
	}
}
