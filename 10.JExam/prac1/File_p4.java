package a.b.c.prac1;

import java.io.File;
import a.b.c.common.DateUtil;

public class File_p4 {

	public static void main(String[] args) {
		try{
			// mkdir() �Լ�
			File f1=new File("abc");
			// abc��� abstract pathname�� FileŬ�������� �˷���.
			f1.mkdir();
			// ������ ��ο� ���丮�� ���弼��.
			System.out.println("f1 >>> : "+f1);
			
			File f2=new File(f1, DateUtil.yyyymmdd() + "_"+f1.getName() + ".txt");
			// �����Ȱ�ο� ������ yyyymmdd�� ���� �ڿ� _�� �߰��ϰ� f1�̸��� ���� �� Ȯ�����̸� .txt�� �ٿ���
			// File Ŭ������ f2 ���������� �����Ѵ�.
			System.out.println("f2 >>> : "+f2);
			f2.createNewFile();
			// ���ο� ������ �����Ѵ�.
			String getPath=f2.getPath();
			// getPath��� �����ڷ��� ������ f2�� ������ ���ͼ� �����Ѵ�.
			System.out.println("getPath >>>> : "+getPath);
			
			boolean bool=f2.exists();
			System.out.println("f2.exists() >>> : "+bool);
			if (f2.exists()){
				java.io.FileWriter fw=null;
				// java.io ��Ű���� �ִ� FileWriter Ŭ������ f2 ���������� ���� null�̴�.
				// �׳� ����.
				fw=new java.io.FileWriter(f2);
				System.out.println("fw >>> : "+fw);
				// f2 ���Ͽ� �ۼ��ϵ��� �ϰڴ�.
				fw.write("mkdir :: ���� ������ �Ẹ����~~~!!!");
				fw.close();
				}
				
				File files[]=f1.listFiles();
				System.out.println("files.length >>> : "+files.length);
				for (int i=0; i<files.length; i++){
					String fileName=files[i].getName();
					System.out.println("fileName >>> : "+fileName);
				}
		}catch(Exception e){
			System.out.println("error >>> : "+e.getMessage());
		}

	}

}
