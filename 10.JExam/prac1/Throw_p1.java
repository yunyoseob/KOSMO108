package a.b.c.prac1;

// ����� ���� ���� Ŭ����
@SuppressWarnings("serial")
class IDFormatException extends Exception{
/* The serializable class IDFormatException
 * does not declare a static final serialVersionUID
 * filed of type long
 * 
 * �ذ��� @SuppressWarnings("serial")
 * �����϶�� ��
 */
	
	//������
	public IDFormatException(String s) {
		super(s);
		// ���� ���� s�� �θ��� Exception���� ������.
	}
}

// IDFormatTest ����� ���� Ŭ����
class IDFormatTest{
		
		private String userID;
		// private ����
		
		public String getUserID(){
			return userID;
		}
		// getUserID() �Լ�
		// �Ű������� String ���;� �ϰ�, 
		// return���� ������ �ڷ����� String
		
		public void setUserID(String userID) throws IDFormatException{
			boolean aBool= userID==null;
			// String�ε� equals�� ������� �ʴ� ����????
			// ������ �غ���. String.equlas(String)��
			// ���ڿ��� ���ϴ� �Լ��̴�. "null"������ �ñ��Ѱ� �ƴ϶�, null������ �ñ��� ���̴�.
			// �׷��� ������ ==(��� ������ �� ��)???
			System.out.println("userID==null >>> "+aBool);
			// �׷��� Ȥ�� �𸣴� boolean �����ڷ� ��½�Ű�� Ȯ���ϱ�
			if (userID==null){
				IDFormatException ide=new IDFormatException("���̵�� null�� �� �����ϴ�.");
				throw ide;
			}else if (userID.length() < 8 || userID.length() >20){
				throw new IDFormatException("���̵�� 8~20�� ���� �Դϴ�.");
			}
			this.userID = userID;	
		} // setUserID method
} // IDFormatTest class
	
public class Throw_p1 {
	// main �Լ��� �ִ� Ŭ���� (ù ������)
	public static void main(String[] args) {
		IDFormatTest idt=new IDFormatTest();
		
		String userID = null;
		try {
			idt.setUserID(userID);
			// IDFormatTest Ŭ������ �ִ� setUserID �޼���
		}catch(IDFormatException i){
			// ���� ó���� Exception Ŭ������ ����� ����
			// ����� ���� ���� Ŭ���� IDFormatException���� ó���ض�.
			System.out.println("i.getMessage() >>> : "+i.getMessage());	
			// error message�� ���ܹ����� ����ϼ���.
		}
		
		userID="1234567";
		try {
			idt.setUserID(userID);
			// IDFormatTest Ŭ������ �ִ� setUserID �޼���
		}catch(IDFormatException i){
			System.out.println("i.getMessage() >>> : "+i.getMessage());
			// error message�� ���ܹ����� ����ϼ���.
		}
		
		System.out.println("\n try-catch ��");
	} // main method
} // Throw_p1 class
