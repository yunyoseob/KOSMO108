package a.b.c.ch6;

public class Exam_File_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String javaVersion = System.getProperty("java.version");		
		System.out.println("javaVersion >>> : " + javaVersion);

		String userDir = System.getProperty("user.dir");		
		System.out.println("userDir ������丮 >>> : " + userDir);

		String osName = System.getProperty("os.name");		
		System.out.println("osName �ü���̸� >>> : " + osName);

		String userHome = System.getProperty("user.home");		
		System.out.println("userHome ����Ȩ >>> : " + userHome);				

		String fileSeparator = System.getProperty("file.separator");		
		System.out.println("fileSeparator ���� ���й��� >>> : " + fileSeparator);
		System.out.println("java.io.File.separator ���� ���й��� >>> : " + java.io.File.separator);

		String pathSeparator = System.getProperty("path.separator");		
		System.out.println("pathSeparator ��� ���й��� >>> : " + pathSeparator);
		
		System.out.println("\n=======================================================");
		java.util.Properties p = System.getProperties();
		System.out.println("System.getProperties() \n" + p);
		System.out.println("\n=======================================================\n");
		
		System.out.println("\n=======================================================");
		for (java.util.Enumeration e = p.propertyNames(); e.hasMoreElements();) {
			String key = (String)e.nextElement();
			String value = p.getProperty(key);	
			System.out.println(key + "=" + value);
		}
		System.out.println("\n=======================================================");
		
		System.out.println("\n=======================================================");
		System.out.println("p.list(System.out) \n");
		p.list(System.out);	
		System.out.println("\n=======================================================");
	}
}
