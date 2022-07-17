package a.b.c.ch4.mem.scr;

import java.util.ArrayList;
import java.util.Scanner;

import a.b.c.ch4.mem.service.MemberService;
import a.b.c.ch4.mem.service.MemberServiceImpl;
import a.b.c.ch4.mem.vo.MemberVO;

public class MemberScr {
	
	// ȸ���� ����(�Է�), ����, ����, ��ȸ 
	// CRUD : CREATE �Է�,  READ ��ȸ,  UPDATE  ����, DELETE ���� 
	// ISUD : INSERT �Է�,  SELECT ��ȸ,  UPDATE  ����, DELETE ����
	
	// ȸ�� ��ȸ
	public ArrayList<MemberVO> memSelect(){
		System.out.println("MemberScr.memSelect() ����  >>> : ");
		return null;
	}
	
	// ȸ�� ����
	public int memInsert(MemberVO mvo) {
		return 0;
	}
	
	// ȸ�� ����
	public int memUpdate(MemberVO mvo) {
		return 0;
	}
	
	// ȸ�� ����
	public int memDelete(MemberVO mvo) {
		return 0;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MemberScr mscr = new MemberScr();
		
		System.out.println("CRUD�� �����ϼ���  >>> ");
		System.out.println("I  �Է�,  S ��ȸ, U ����, D ����, Q ����");
		Scanner sc = new Scanner(System.in);
		String crudType ="";
				
		while(true) {
			crudType=sc.next();
			crudType=crudType.toUpperCase();
			boolean bool_1=crudType.length()>0;
			boolean bool_2=crudType != null;
			System.out.println("crudType.length()�� 0���� ũ�� true, �ƴϸ� false >>> : "+bool_1);
			System.out.println("crudType != null�̸� true, �ƴϸ� false >>> : "+bool_2);
			
		if ("I".equals(crudType)) {		
			System.out.println("MemberScr.main() ����  >>> : crudType ::: " + crudType);
			MemberService sci=new MemberServiceImpl();
			MemberVO mvo = new MemberVO();
			sci.memInsert(mvo);
		}
		if ("S".equals(crudType)) {
			System.out.println("MemberScr.main() ����  >>> : crudType >>> : " + crudType);
			MemberService sci=new MemberServiceImpl();
			MemberVO mvo=new MemberVO();
			sci.memSelect();
		}
		if ("U".equals(crudType)) {
			System.out.println("MemberScr.main() ����  >>> : crudType >>> : " + crudType);
			MemberService sci=new MemberServiceImpl();
			MemberVO mvo = new MemberVO();
			sci.memUpdate(mvo);
		}
		if ("D".equals(crudType)) {
			System.out.println("MemberScr.main() ����  >>> : crudType >>> : " + crudType);
			MemberService sci=new MemberServiceImpl();
			MemberVO mvo = new MemberVO();
			sci.memDelete(mvo);
		}
		if ("Q".equals(crudType)){
			System.out.println("\n ���α׷��� �����մϴ�.");
			break;
		}
		} // while
	} // main
} // MemberScr class







