package a.b.c.prac1;

import java.util.ArrayList;
import java.util.HashMap;


public class HashMap_p2 {

	public static void main(String[] args) {
		// HashMap ���� 2
		ArrayList aList=new ArrayList();
		System.out.println("aList >>> : "+aList);
		System.out.println("aList >>> : "+System.identityHashCode(aList));
		
		HashMap hp=new HashMap();
		System.out.println("HashMap >>> : "+hp);
		System.out.println("HasMap >>> : "+System.identityHashCode(hp));
		
		
		hp.put("������","��Ÿ�� �ݿ���");
		
		// Object �ڷ�� ��µȴ�.
		// Object�� �޾Ƽ� String Ŭ���� ����ȯ�� ���� ���
		Object obj0=hp.get("������");
		System.out.println("obj0 >>> : "+obj0);
		String s0=(String)obj0;
		System.out.println("s0 >>> : "+s0);
		
		System.out.println();
		
		// Object.toString() ���
		String s2=hp.get("������").toString();
		System.out.println("s2 >>> : "+s2);
		
		// String.valueOf(Object)
		String s3=String.valueOf(hp.get("������"));
		System.out.println("s3 >>> : "+s3);
	}

}
