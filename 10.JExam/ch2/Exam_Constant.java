package a.b.c.ch2.common;

public abstract class Exam_Constant {

	// ��� Constant :: ������ �ʴ� �� :: �����ϸ� �ʵǴ� ��
	/*
		1. �����ϸ� �ʵǴ� ��
		2. ����� Ŭ������ �ε��� �� �� ���� �޸𸮿� �ε�ȴ�.(��� Ǯ, Constant Pool)
		3. ����� Ŭ���� �� �� ���� �ۼ��Ѵ�.
		4. ������ �����ϸ� ����� ���� ����Ѵ�. 
	*/
	// ���ε� 
	public static final String FILE_UPLOAD_PATH = "C:\\00.KOSMO108\\30.Web\\fileUpload";
	public static final String IMG_UPLOAD_PATH = "C:/00.KOSMO108/30.Web/imgUpload";
	public static final int FILE_UPLOAD_SIZE = 10 * 1024 * 1024; // 10�ް� 
	public static final int IMG_UPLOAD_SIZE = 10 * 1024 * 1024; // 10�ް� 

	// JDBC ����
	public static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
	public static final String JDBC_URL = "jdbc:oracle:thin:@localhost:1521:orclHBE00";
	public static final String JDBC_USER = "scott";
	public static final String JDBC_PWD = "tiger";
}