package com.pknu.member.view;

import java.util.Vector;

import com.pknu.member.dao.MemberDao;
import com.pknu.member.vo.MemberVO;

public class TestMain {

	public static void main(String[] args) {
		MemberDao mDao = new MemberDao();
		
		
		//개인조회
		
		String id_search = "sea1";
		MemberVO mem = mDao.getMember(id_search);
		System.out.println(mem.info());
		
		//추가
		
//		MemberVO insert = new MemberVO("jk6581","1234","태화","학생","M","안녕");
//		int insertCnt = mDao.addMember(insert);
//		System.out.println(insertCnt+ "건이 추가되었습니다. ");
//		
//		//목록조회
//		List<MemberVO> mlist = mDao.getMemberList("태");
//		for (MemberVO memberVO : mlist) {
//			System.out.println(memberVO.listInfo());
//		}
		//목록조회
		System.out.println(""); //vector안에 vector 이다. 첫번째 사이즈는 2개가 왔는데 0번째 원석 1번째 진석이 와있음 . i = 0 일때 원석을 꺼내는데 j 는 컬럼이 온것 
		Vector mList = mDao.getMemberList("석");
		for (int i = 0; i < mList.size(); i++) {
			System.out.println();
			Vector v = (Vector) mList.get(i);
			for (int j = 0; j < v.size(); j++) {
				System.out.print(v.get(j)+" ");
				
			}
			
		}
//		
//	
//		//수정
//		MemberVO update = new MemberVO("jk6581","1234","권태화","직장인","F","바이");
//		int updateCnt = mDao.updateMember(update);
//		System.out.println(updateCnt+"건이 수정되었습니다.");
		
		//삭제
//		MemberVO delete = new MemberVO("jk6581");
//		int deleteCnt = mDao.deleteMember(delete);
//		System.out.println(deleteCnt+"건이 삭제되었습니다.");
		
		
		 
		
		
	}

}
