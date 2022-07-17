package a.b.c.prac1;

import java.io.FileInputStream;

public class IO_p2 {

	public static void main(String[] args) {
		// ���� ��� : ������ �ִ� ��ġ���� �� ���丮�� ��Ʈ���� �о� ���� ���
		// String filePath="C:\\00.KOSMO108\\10.JExam\\eclipse_java_work\\firstProject\\src\\a\\b\\c\\prac1\\";
		
		//  \\ or / ��� ����
		/*
		 * ����, ���丮 ������
		 * ������ \
		 * ��Ŭ���� \\ or /
		 * ���н� ������ /
		 * */
		String filePath="C:/00.KOSMO108/10.JExam/eclipse_java_work/firstProject/src/a/b/c/prac1/";
		
		// 
		// filePath.replace('\', '/');
				
		
		// ���� ���
		String file="IO_p1.java";	
		
		try{
			FileInputStream fs=new FileInputStream(filePath+file);
			// �����θ� FileInputStream Ŭ������ newŰ����� �ν��Ͻ��Ѵ�.
			// �� �� ���������� fs�� �Ѵ�.
			System.out.println("fs >>> : "+fs);
			// �׻� ������ ã�ų�, �����ϰų�, ����ų�, ���鶧��
			// ������ �ִ��� üũ�Ͽ��� �Ѵ�.
			// fs >>> : java.io.FileInputStream@15db9742
			
			// public int read() throws IOException
			int data=0;
			while((data=fs.read())!=-1){
				// while �Ұ�ȣ �ȿ��� ���������� �о���̴µ�
				// ���� ���� �ϳ��� ���� ������(-1)���� ��� �ݺ� ��Ų��.
				System.out.print((char)data);
				// �����͸� ��½�Ų��.
				// �ѱ��� ��� byte�� ��ȯ��ų�ÿ� ������.
				// ������ ������ 1byte�ε�, ����
				// �ѱ��� 1byte�� �ƴϱ� ������ ������ ���ϴ� ���̴�.
			}
			
		}catch(Exception e){
			System.out.println("Error >>> : "+e.getMessage());
		}
	}

}
