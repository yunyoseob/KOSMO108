package a.b.c.ch4.mem.service;

import java.util.ArrayList;

import a.b.c.ch4.mem.vo.MemberVO;

public class MemberServiceImpl implements MemberService {

	@Override
	public ArrayList<MemberVO> memSelect() {
		// TODO Auto-generated method stub
		System.out.println("MemberServiceImpl.memSelect() ����  >>> : ");
		return null;
	}

	@Override
	public int memInsert(MemberVO mvo) {
		// TODO Auto-generated method stub
		System.out.println("MemberServiceImpl.memInsert() ���� >>> : ");
		return 0;
	}

	@Override
	public int memUpdate(MemberVO mvo) {
		// TODO Auto-generated method stub
		System.out.println("MemberServiceImpl.memUpdate() ����  >>> : ");
		return 0;
	}

	@Override
	public int memDelete(MemberVO mvo) {
		// TODO Auto-generated method stub
		System.out.println("MemberServiceImpl.memDelete() ���� >>> : ");
		return 0;
	}

}
