package a.b.c.prac1;

import java.util.ArrayList;
import java.util.Arrays;

public class Arranging_Seats {
	
	public static String[] sList={"���伷","������","����","�����","��ι�","Ȳ�ž�"
			,"�ΰ�ȣ","�ڰǿ�","�ڼ���","������","���ҿ�","���ؼ�","������"
			,"������","������","�迵��","���ѽ�","������","������"
			,"������","������","Ȳ����","�躰"};
	
	
	public static String random_num(int n, ArrayList<String> aList){
		int a=0;
		String s="";
		
		while(true){
			a=(int)(Math.random()*23);
			if (a<n){
				s=(String)aList.get(a);
				break;
			}
		}
		
		return s;
	}

	public static void main(String[] args) {
		System.out.println("aList.length >>> : "+sList.length);
		ArrayList<String> aList=new ArrayList<>(Arrays.asList(sList));
		
		String r="";
		int i=0;
		int n=0;
		n=aList.size();
		
		while(true) {
			r=Arranging_Seats.random_num(n, aList);
			System.out.println(i+" ��° �ڸ� ���ΰ� >>> : "+r);
			aList.remove(r);
			n--;
			i++;
			if(n==0){
				break;
			}
		}
	}
}
