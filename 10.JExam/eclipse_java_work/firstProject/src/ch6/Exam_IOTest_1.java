package a.b.c.ch6;

import java.io.FileInputStream;


public class Exam_IOTest_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		����, ���丮 ������ 
		������ \ 
		��Ŭ���� \\
		���н�, ������ / 
		*/
		// ���� ��� :  ������ �ִ� ��ġ���� �� ���丮�� ��Ʈ ���� �о���� ��� 
		String filePath = "C:\\00.KOSMO108\\10.JExam\\eclipse_java_work\\firstProject\\src\\a\\b\\c\\ch6";
		String file = "Exam_IOTest_1.java";
		try {
			FileInputStream fis = new FileInputStream(filePath + "\\" + file);
			System.out.println("fis >>> : " + fis);
			
			// public int read() throws IOException
			int data = fis.read();
			System.out.println("data >>> : " + data);
			System.out.println("(byte)data >>> : " + (byte)data);
			System.out.println("(char)data >>> : " + (char)data);
			
			while((data = fis.read()) !=-1) {
				System.out.println(data + " : " + (char)data);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("������ >>> : " + e.getMessage());
		}
	}
}
