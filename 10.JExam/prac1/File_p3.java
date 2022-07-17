package a.b.c.prac1;

public class File_p3 {

	public static void main(String[] args) {
		String javaVersion=System.getProperty("java.version");
		// public static String getProperty(String key)
		// Key : java.version
		// Description of Associated Value : Java Runtime Environment version
		System.out.println("System.getProperty java.version >>> : "+javaVersion);
		// 1.8.0_202
		
		String userDir=System.getProperty("user.dir");
		// Key : user.dir
		// Description of Associated Value : User's current working directory
		System.out.println("System.getProperty(user.dir) >>> : "+userDir);
		// C:\00.KOSMO108_YYS\10.JExam\eclipse_java_work\firstProject
		
		String osName=System.getProperty("os.name");
		// Key : os.name
		// Description of Associated Value : Operating system name
		System.out.println("System.getProperty(os.name) >>> : "+osName);
		// Windows 10
		
		String userHome=System.getProperty("user.home");
		// Key : user.home
		// Description of Associated Value : User's home directory
		System.out.println("System.getProperty(user.home) >>> : "+userHome);
		// C:\Users\kosmo
		// ��� ������Ʈ â ó�� Ű�� ������ ��  >>>> C:\Users\kosmo>
		
		String fileSeparator=System.getProperty("file.separator");
		// Key : file.separator
		// Description of Associated Value : File separator ("/" on UNIX)
		System.out.println("System.getProperty(file.separator) >>> : "+fileSeparator);
		// \ : ���� ȯ���� ������ ü���̱� ������ ������ �������� \�� ��µȴ�.
		System.out.println("java.io.File.separator ���� ���й���(separator) >>> : "+java.io.File.separator);
		// java.io ��Ű���� File Ŭ������ separator �������  >>> \
		// The system-dependent default name-separator character, 
		// represented as a string for convenience.
		// This string contains a single character, namely separatorChar.
		System.out.println("java.io.File.separator ���� ���й��� >>>(separatorChar) : "+java.io.File.separatorChar);
		// \
		
		String pathSeparator=System.getProperty("path.separator");
		System.out.println("System.getProperty( path.separator) >>> : "+pathSeparator);
		// Key: path.separator 
		// Description of Associated Value : Path separator (":" on UNIX)
		// ;
		
		
		// �� ���� ��½�Ű�� ���
		//================================================================================
		System.out.println("\n ===========================================================");
		System.out.println("getProperties() �� ���� ��½�Ű�� ��� \n");
		java.util.Properties p=System.getProperties();
		System.out.println("System.getProperties() \n "+p);
		System.out.println("\n ===========================================================");
		//================================================================================
		
		// ��½�Ű��, �� ���� ������ ��½�Ű�� ���
		//================================================================================
		System.out.println("getProperties() ��½�Ű��, �� ���� ������ ��½�Ű�� ��� \n");
		for (java.util.Enumeration e=p.propertyNames(); e.hasMoreElements();){
			// the keys of a hashtable, and the values in a hashtable. 
			String key=(String)e.nextElement();
			String value=p.getProperty(key);
			System.out.println(key+"="+value);
		}
		// java.util Interface Enumeration<E>
		
		
		//================================================================================
		System.out.println("\n ===========================================================");
		System.out.println("������ �� ���� ���ϰ� ����ϴ� ��� ");
		System.out.println("p.list(System.out) \n");
		
		p.list(System.out);
		System.out.println("\n ===========================================================");
		
		
		
		
	}

}
