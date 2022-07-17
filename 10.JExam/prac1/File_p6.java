package a.b.c.prac1;

import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


public class File_p6 {
	static int totalFiles=0;
	static int totalDirs=0;
	static int cnt=0;
	
	public static void printFileList(File dir){
		cnt++;
		System.out.println("printFileList ȣ�� Ƚ��  >>> "+cnt);
		
		File[] files=dir.listFiles();
		
		ArrayList subDir=new ArrayList();
		
		for (int i=0; i<files.length; i++){
			String fileName=files[i].getName();
			if(files[i].isDirectory()){
				fileName="���丮 >>> : ["+fileName+"]";
				subDir.add(i+"");
			}
			System.out.println("���� >>> : "+fileName);
		}
		
		int dirNum=subDir.size();
		int fileNum=files.length-dirNum;
		
		totalFiles += fileNum;
		// fileNum ��ŭ ���� ���Ѷ�
		totalDirs += dirNum;
		// dirNum ��ŭ totalDirs �� �������Ѷ�.
		
		System.out.println(fileNum+" ���� ����, "+ dirNum + " ���� ���丮");
		System.out.println();
		
		System.out.println("subDir >>> : "+subDir);
		for (int i=0; i<subDir.size(); i++){
			System.out.println("subDir.get("+i+") >>> : "+subDir.get(i));
			// 1. subDir.get(i)
			// 2. (String)subDir.get(i)
			// 3. Integer.parseInt()
			int index=Integer.parseInt((String)subDir.get(i));
			
			printFileList(files[index]);
		}

	}
	
	public static void main(String[] args) {
		System.out.println("main �Լ� ���� >>> ");
		Scanner sc=new Scanner(System.in);
		
		try{
			System.out.println("ã�ƺ����� �ϴ� ���ϰ� ���丮�� ���� ��θ� �Է��ϼ���.");
			// C:\00.KOSMO108_YYS\10.JExam\eclipse_java_work
			String path=sc.next();
			System.out.println("�Է��Ͻ� path >>>> : "+path);
			// �Է��Ͻ� path >>>> : C:\00.KOSMO108_YYS\10.JExam\eclipse_java_work
			
			if(path!=null && path.length() >0){
				// path �Է� Ȯ��
				System.out.println("path �Է��� Ȯ�� �Ǿ����ϴ�.");
				// path �Է��� Ȯ�� �Ǿ����ϴ�.
				File dir=new File(path);
				
				boolean bool=dir.exists();
				System.out.println("dir.exists() >>> : "+bool);
				// dir.exists() >>> : true
				
				if (!dir.exists() || !dir.isDirectory()){
					// ���丮�� �����ϴ���, ���丮�� �´��� �������� Ȯ��
					System.out.println("��ȿ���� ���� ���丮�Դϴ�.");
					System.exit(0);
				}else{
					printFileList(dir);
					System.out.println();
					System.out.println(" ��  : "+totalFiles+" ���� ����");
					System.out.println(" �� : "+totalDirs+" ���� ���丮");
				}
			}
			
		}catch(Exception e){
			System.out.println("error >>> : "+e.getMessage());
		}finally{
			if(sc!=null){
				try{sc.close(); sc=null;}catch(Exception e){}
			}
			System.out.println("cnt >>> : "+cnt);
			// cnt >>> 381
		}
	} // main method

} // File_p6 class
