package a.b.c.ch2.aaa;

/*
�������̽� interface
	1. �����ڸ� ���� �� ����.
	2. new �����ڷ� �ν��Ͻ� �� �� ����.
	3. �Լ��� ��� �߻��Լ��̴�. abstract Ű���尡 ���� �� �����̴�.
		�Լ��� ���� abstract Ű���带 ������� �ʴ´�.
		(��? �������ϱ�)
	4. ������ ��� ����̴�.
		������ ���� static final Ű���带 ������� �ʴ´�.
		(��? �������ϱ�)

	5. static �Լ� ���� & default �Լ� ���� (���� ���� �Ǵ� ����)
*/

public interface Inter_p{
	// �� ������ ���·� �������غ���
	/*  Complie issue #1
	 Ŭ�������� �⺻ �޼ҵ带 ã�� �� �����ϴ�. ���� �������� �⺻ �޼ҵ带 �����Ͻʽÿ�.
     public static void main(String[] args)
	*/

	// public String s;
	/* Complie issue
	error: = expected
	*/

	// public /* static final (���� ����) */ String s="String �Դϴ�.";
	/* Complie issue #2
	Ŭ�������� �⺻ �޼ҵ带 ã�� �� �����ϴ�. ���� �������� �⺻ �޼ҵ带 �����Ͻʽÿ�.
    public static void main(String[] args)
    */
	
	// public static final String str="str �Դϴ�.";
	/* Complie issue #3
	Ŭ�������� �⺻ �޼ҵ带 ã�� �� �����ϴ�. ���� �������� �⺻ �޼ҵ带 �����Ͻʽÿ�.
    public static void main(String[] args)
    */

	/* ������ ������
	 
	public Inter_p(){
		
	}
	 Compile issue #4
	 error: <identifier> expected
	*/

	// new �����ڷ� �ν��Ͻ� �ϱ� 
	// Inter_p rv = new Inter_p();
	/* Compile issue #5
	error: Inter_p is abstract; cannot be instantiated
	*/

	public /*abstract Ű���� (���� ����) */ void aM();
	public abstract void bM();
	/* Complie issue #6
	Ŭ�������� �⺻ �޼ҵ带 ã�� �� �����ϴ�. ���� �������� �⺻ �޼ҵ带 �����Ͻʽÿ�.
    public static void main(String[] args)
    */
} // interface Inter_p