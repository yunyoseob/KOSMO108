package a.b.c.ch2;

public class MessageEngImpl implements MessageInterface{
	// Impl�� �ƹ����� ���̴°� �ƴ϶�, ���� ������ ���� �� ���� ���ٰ� �Ѵ�.
	@Override
	public void sayHello(String name){
		System.out.println("Hello, "+name+"!!");	
	}
} // MessageEngImpl class