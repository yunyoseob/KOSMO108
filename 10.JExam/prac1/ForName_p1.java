package a.b.c.prac1;

import java.lang.reflect.Method;

public class ForName_p1 {
	public void classForName(){
		try {
			Class cl = Class.forName("a.b.c.prac1.ForNameSample");
			System.out.println("\n 1. cl >>> : "+cl);
			ForNameSample fs=(ForNameSample)cl.newInstance();
			System.out.println("\n 2. ForNameSample fs >>> : "+fs);
			System.out.println("\n 3. fs.aM()");
			fs.aM();
			System.out.println("\n 4. fs.bM()");
			fs.bM();
			System.out.println("\n 5. fs.cM()");
			fs.cM();
		
			// Ŭ������ ����� �޼ҵ� ã��
			Method m[]=cl.getDeclaredMethods();
			for (int i=0; i<m.length; i++){
				String findM=m[i].getName();
				System.out.println("\n m["+i+"].getName() >>> :: "+findM);
			}
		
			Class d=Class.forName("java.util.Date");
			java.util.Date dd=(java.util.Date)d.newInstance();
			System.out.println("\n 6. dd >>> : "+dd);
		
			Class aList=Class.forName("java.util.ArrayList");
			java.util.ArrayList aList_1=(java.util.ArrayList)aList.newInstance();
			// java.lang�� ���� ����������
			// java.util.Ŭ�����̸��� ��Ű���� �ٸ��Ƿ�
			// import �ؼ� ����ؾ� �Ѵ�.
			// �׷���, Class.forName�� newInstance()����
			// ���� �ʾƵ� �ȴ�.
			
			System.out.println("\n 7. aList_1 >>> : "+aList_1);
			}catch(Exception e){
				System.out.println("\n 8. ���� >>> : "+e);
			}
		}

	public static void main(String[] args) {
		new ForName_p1().classForName();
		// throws ��� �� �ص� �� ���ư�.
	}
}
