package a.b.c.prac1;

import java.util.HashMap;
import java.util.Iterator;

// HashMap�� Iterator�� java.util�� �����Ƿ�,
// import ���ش�.


public class HashMap_p5 {

	public static void main(String[] args) {
		HashMap<String, String> hm=new HashMap<String, String>();
		hm.put("�̸�","ȫ�浿");
		hm.put("��ȣ","010");
		hm.put("�ּ�","���ѹα�");
		String name=hm.get("�̸�");
		String num=hm.get("��ȣ");
		String addr=hm.get("�ּ�");
		
		System.out.println("HashMap�� �Է��� �̸�, �ּ�, ��ȣ Ȯ���غ��� \n");
		System.out.println("�̸� >>> : "+name);
		System.out.println("��ȣ >>> : "+num);
		System.out.println("�ּ� >>> : "+addr);
		
		// Iterator ���ͷ����� : �ڷḦ ���������� ������ �� �ֵ��� ó���ϴ� ��ü : �ݺ���
		Iterator keys = hm.keySet().iterator();
		
		// keySet() : Returns a Set view of the keys contained in this map.
		System.out.println("hm.keySet() >>> : "+hm.keySet());
		// �� �״�� Ű���� �����ε�,
		// HashMap�� ������ ArrayList�� �ٸ��� index�� ������ ����.
		// ����, �̸�, ��ȣ, �ּ� ������� Ű���� ������ �Ǵ� ���� �ƴ϶�,
		// Ű ���� �������� ���� ���̶� ������� ������ ���� ���� ����.
		// �߿��� ���� Ű�� ������(����) ���� �� �ִٴ� ����.
		
		System.out.println("Iterator keys >>> : "+keys);
		
		// Iterator �������� keys�� �̿��ؼ� ���ͷ����Ϳ� ��� �ִ� �����͸�
		// hasNext() �Լ��� Ȯ���Ѵ�.
		// has : Ŀ�� �Լ� �����Ÿ��鼭 true, false���� Ȯ���ϴ� �۾�
		// Next : ���� �ɷ� �Ѿ�� ���ִ� Ű����
		// hasNext() : �����ɷ� �Ѿ��, Ŀ���Լ��� �����̸�, true���� false���� Ȯ���Ѵ�.
		// has�� Next�� ���� �� ��Ʈ
		
		while (keys.hasNext()){
			String key=(String)keys.next();
			// HashMap�� Object�̱� ������ �ٿ� ĳ������ ���־�� �Ѵ�.
			System.out.println("\n while(keys.hasNext()) ���� key >>> : "+key);
			String value="";
			System.out.println("value �ʱ�ȭ >>>> : "+value+"\n");
			// value�� ����ϱ� ���� �ʱ�ȭ �س��´�.
			if ("�̸�".equals(key)){
				// �̸��� key�� ���ٸ� if ���ǹ��� �����϶�
				value=(String)hm.get(key);
				System.out.println("�̸�.equals(key) >>> : "+value+"\n");
			}
			if ("��ȣ".equals(key)){
				value=(String)hm.get(key);
				System.out.println("��ȣ.equals(key) >>> : "+value+"\n");
				
			}
			if ("�ּ�".contentEquals(key)){
				value=(String)hm.get(key);
				System.out.println("�ּ�.equals(key) >>> : "+value+"\n");
			}
			System.out.println(key+ " : " + value);
		}	
	}
}
