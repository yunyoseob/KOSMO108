������ ��F�� �а� ����



���� 
-----------------------------------------------
0. /**/ �� �о �׸�, ���о �׸�
1. �ڹٴ� �⺻������ Byte ������ ������� �̷���
2. �ѱ��� 2Byte��
3. ����
4. ���� 2Byte�� �ѱ��� �а� ���� ���� ���� ���� ��Ʈ���� ����

/*
cf 1)����Ʈ ���� ��Ʈ��: �̹���, ������, ���� ���� �� ��κ��� ���� �б� / ����.
Ŭ���� �̸��� Stream���� ������ ���»� ����Ʈ ���� ��Ʈ��.
cf 2)���� ���� ��Ʈ��: ���ڸ� �а� ���µ� ����ϴ� ��Ʈ��.
�������� ��쿡�� ����Ʈ ���� ��Ʈ�����ε� �б� / ���� ����.
Reader�� Writer�� ������ �̸��� ���ڸ� ���� ��Ʈ�� Ŭ����.
*/

ǥ����� - package a.b.c.ch6; public class Exam_InOutStrReadTest
------------------------------------------
public static final String FILE_PATH_CH6 = "C:\\00.KOSMO108_PGW\\10.JExam\\eclipse_java_work\\firstProject\\src\\a\\b\\c\\ch6";
String inFile = filePath +"/"+ "Exam_InOutStrReadTest.java";
String outFile = filePath +"/"+ "Exam_InOutStrReadTest.bak";
int data = 0;
if(bFile) {	
//�б�
fis = new FileInputStream(ff);
isr = new InputStreamReader(fis);
br = new BufferedReader(isr);
//����
fos = new FileOutputStream(outFile);
osw = new OutputStreamWriter(fos);
bw = new BufferedWriter(osw);

while ((data=br.read()) !=-1) {
	System.out.print((char)data);
	bw.write(data);
}
cf) bw.write(date); =  �ش� ��ο� ���� ����
cf2) read() : public int read(), Return : the next byte of data, or -1 if the end of the file is reached.

���� 
------------------------------------------
1. ������ ��θ� ����� ����
2. ���ο�(new) File Ŭ���� ����, �������� ���ڷ� ������ ��θ� ����
- File(inFile) : ���� �� ���� ��θ� �߻� ��� �̸����� ��ȯ�Ͽ� �� File �ν��Ͻ��� ����ϴ�.

3. ���ο�(new) FileInputStream Ŭ���� ����, �������� ���ڷ� 2.���� ������ File�ν��Ͻ��� ����
-FileInputStream(File file) : ���� �ý����� File ��ü ���Ͽ� ���� ���� ������ ���� ���Ͽ� ���� ������ ���� FileInputStream�� ����ϴ�.

4. ���ο�(new) InputStreamReader Ŭ���� ����, �������� ���ڷ� 3.���� ������ FileInputStream(File inFile)�ν��Ͻ��� ����
- InputStreamReader(FileInputStream(File file)) : �⺻ ���� ������ ����ϴ� InputStreamReader�� ����ϴ�.

5. ���ο�(new) BufferedReader Ŭ���� ����, �������� ���ڷ� 4.���� ������ InputStreamReader(FileInputStream(File file)) �ν��Ͻ��� ����
- BufferedReader(InputStreamReader(FileInputStream(File file))) : �⺻ ũ���� �Է� ���۸� ����ϴ� ���۸� ���� �Է� ��Ʈ���� ����ϴ�.

6. ����� �ݴ�� 2.���� outFile�� �����ϰ� 3.���� FileOutputStream �� �ְ�, 4.���� OutputStreamWriter �� �ְ�, 5.���� BufferedWriter�� �ְ� write() �����ָ� ��!

/*
������ �о���̴µ� �ʿ��� Ŭ���� ����
------------------------------------------
1. File class : ���ϰ� ���丮�� ���� Ŭ����, exist()�Լ��� ������ ��ο� ������ �����ϴ°��� boolean���� ����
		���� �� ���丮 ��� �̸��� �߻�'ǥ��'.(�߻�Ŭ���� �ƴ�.)
		�� Ŭ������ ������ ��� �̸��� ���� �߻����̰� �ý��� �������� ���ظ� �����մϴ�.

2. FileInputStream class : FileInputStream�� ���� �ý����� ���Ͽ��� �Է� ����Ʈ�� ����ϴ�.
						��� : Object - InputStream - FileInputStream

3. InputStreamReader class: InputStreamReader�� ����Ʈ ��Ʈ������ ���� ��Ʈ�������� �긮���Դϴ�. 
			    byte-> char ��ȯ�ϴ� io ������Ʈ�� Ŭ����
			    ����Ʈ�� �а� ������ ���� ������ ����Ͽ� ���ڷ� ���ڵ��մϴ�.
			    ��� : Object - Reader - InputStreamReader
4. BufferedReader class: ���� �Է� ��Ʈ������ �ؽ�Ʈ�� �а� ����, �迭 �� ���� ȿ�������� ���� �� �ֵ��� ���ڸ� ���۸��մϴ�.
*/						
						

�Ʒ��� �Լ��� �ƴ� ���������� ����
-------------------------------------------
���� ������ ��θ� ��� inFile
���Ӱ� ���� ������ ��θ� ��� outFile�̶� ���� ��
//�б�
File(inFile) - FileInputStream() - InputStreamReader() - BufferedReader() 
//����
File(outFile) - FileOutputStream() - OutputStreamWriter() -BufferedWriter()

/*
BufferedInputStream		2048byte ���밡��
BufferedOutputStream	512byte ���밡��

BufferedReader
BufferedWriter	8192char~16384byte ���밡�� <-- Ȯ��ġ�� �ʾ�

����Ʈ ���� ��Ʈ��
----------------
InputStream
	DataInputStream
	FileInputStream
	BufferedInputStream		2048byte
OutputStream
	DataOutputStream
	FileOutputStream
	BufferedOutputStream		512byte
	PrintStream

���� ���� ��Ʈ��
----------------
Reader
	FileReader
	BufferedReader
	InputStreamReader
Writer
	FileWriter
	BufferedWriter		16384byte
	OutputStreamWriter
	PrintWriter
*/