package a.b.c.d.ch2;

public abstract class Constant_p{
/*
��� Constant :: ������ �ʴ� �� :: �����ϸ� �ȵǴ� ��

1. �����ϸ� �ȵǴ� ��
2. ����� Ŭ������ �ε��� �� �� ���� �޸𸮿� �ε�ȴ�.
(��� Ǯ, Constant Pool)
3. ����� Ŭ���� �� �� ���� �ۼ��Ѵ�.
4. ������ �����ϸ� ����� ���� ����Ѵ�.
*/

//���ε�
public static final String FILE_UPLOAD_PATH = "C:\\Java_Practice\\fileUpload";
public static final String IMG_UPLOAD_PATH = "C:/Java_Practicefile/imgUpload";
public static final int FILE_UPLOAD_SIZE = 10 * 1024 * 1024; // 10�ް� 
public static final int IMG_UPLOAD_SIZE = 10 * 1024 * 1024; // 10�ް� 

// JDBC ����
public static final String JDBC_DRIVER ="oracle.jdbc.driver.OracleDriver";
public static final String JDBC_URL ="jdbc:oracle:thin:@localhost:1521:orclVELOG00";
public static final String JDBC_USER ="velog";
public static final String JDBC_PWD ="posting";
} // Constant_p abstract class