2022-04-09
---------------------
������ ��� �����

//������ �߻��� �����
//https://blog.daum.net/janustop/61
//File Ŭ������ �ν��Ͻ��� ���� �Ұ����մϴ�. �ٽ� ���ؼ�, �� �� �����Ǹ�, File ��ü�� ���� ǥ���Ǵ� �߻� ��θ��� ����� ������ �ʽ��ϴ�.
//https://docs.microsoft.com/ko-kr/dotnet/standard/io/file-path-formats

���� 
-----------------------------------------------------------------------------------
1. 
   -������				Ž���� �ּ�ǥ���ٿ� �ߴ� C:\00.KOSMO108_PGW ����
   -����� & ������ :   �����, ������, ���, ������� �ʾҾ�. �׳� �� ��ü�� �޾Ƶ��δٰ� �����ϰ� �ۼ�
						���� ������� �ٸ� �ֱ���

	But! �ν��Ͻ��� �����Ѵ� = �޸𸮿� �ø��� =  ��ü�� �����Ѵ� = �����Ǵ� Ŭ�������� ���Ұ� ������ �ִ� <== �� ������ ì�ܰ�����.

2. File class : '����' �� '���丮' ��� �̸��� �߻� 'ǥ��'�Դϴ�.
				'����' �� '���丮' �� ����̹Ƿ� �����ڿ� ���� ���ڿ� ���� ������ �� ����, ���丮�� �� ����, �� �� ���ÿ� �� ���� �ֽ��ϴ�.
				cf1)

			    //���ݸ� �� ����� ����, �� Ŭ������ ������ ���* �̸��� ���� �߻����̰� �ý��� �������� ���⸦ �����մϴ�.
				//*������ ��� : ???

3. ���� �۾� ���丮 Ȯ��: String userDir = System.getProperty("user.dir");
					cf) getProperty()�� ���� ���ڿ� ���� ���ϴ� ������ �޶���, ex:"osName", "javaVersion"....
					�Լ� ��� �� ��θ� ���� ������� ���� ��쿡�� "user.dir"�� �⺻���� �Ͽ� ����/���丮�� ����


�⺻ ����
-----------------------------------------------------------------------------------
@@����1
-"abc.txt" ���� Ȥ�� ���丮 ��� �̸��� �߻�ǥ�� = ���ϵ� �� �� �ְ� ��ε� �� �� �ְ�.
File f1 = new File("abc.txt");
	
-"abc.txt" ��� �̸��� ������ ������ ������ּ���
f1.createNewFile();
System.out.println("f1.createNewFile() >>> : " +f1.createNewFile());

-"abc.txt"��� ���丮 ��� ������ ��θ� ������ּ���
f1.mkdir();
System.out.println("f1.mkdir() >>> : " + f1.mkdir());

==> �̷� ��� ��� �ɱ�??

-- ���� ���� �Լ��� ����, �ڿ� ���� ���� false

�û� : ���� "abc.txt" <== �̰� ���丮�� ���Ͽ� ���ӵǴ� Ű ���� �ִ� �� ����

@@����2
-"abc.txt" ���� Ȥ�� ���丮 ��� �̸��� �߻�ǥ�� = ���ϵ� �� �� �ְ� ��ε� �� �� �ְ�.
File f2 = new File("a/b");

-"a/b"��� ������ ������ּ���
f1.createNewFile();

==> �Ұ���, ���� �� / ���۷���Ʈ�� �� �� ���� false

@@����3
�⺻������ ������ �����ߴ� ���������� ���� ���丮�� �����ϰ�, ���ο� File �ν��Ͻ��� ���� ������ ����

File f1 = new File("a/b");
File f2 = new File(f1, "c.txt");
f2.createNewFile();

@@����4
-user.dir �����ε� ������ ����� ����
-�������� ���
File f3 = new File("C:\\00.KOSMO108_PGW\\10.JExam\\10.javaTest\\abc.txt");
f3.createNewFile(); // abc.txt �ؽ�Ʈ���� ���� OK
-������� ���



��� �� �Լ� ����
--------------------------------------------
java.lang.System 
public static String getProperty(String key)

java.io.File 
public boolean mkdir()
public boolean mkdirs()
public String getPath()
public String getName()
public boolean exists()
public boolean createNewFile() //atomically - ������ ����??
public File[] listFiles()
public String getAbsolutePath( )
public boolean isDirectory()
public boolean isFile()






