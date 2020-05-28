package com.pknu.member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

import com.pknu.member.vo.MemberVO;

public class MemberDao {
	//10.필드생성
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	//11.생성자
	public MemberDao() {}
	//12.메소드
	private void close() {
		try {
			//rs.close();//13.적고 surround
			if( rs!= null) rs.close();
			if( pstmt!= null) pstmt.close();
			if( conn!= null) conn.close();
				
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//14.조회 ( 한 회원의 정보만 보여줌 ) 
	public MemberVO getMember(String userid) { //import 패키지가 다른경우에 import를 해야함. 
		
		MemberVO mem = null;
		conn = DBConn.getInstance();
		//pstmt = conn.prepareStatement(sql);//15.surround
		try {
			String sql ="select id, pwd, name, job, gender, intro, regdate from member2 where id = ? ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userid);//물음표에 대한 처리 
			rs = pstmt.executeQuery();
			if(rs.next()) {
				//방법1.
				String [] cols = new String[7];
				for (int i = 0; i < cols.length; i++) {
					cols[i] = rs.getString(i+1);
				}
				mem = new MemberVO(cols);
				//방법2
				/*
				String id = rs.getString(1);
				String pwd = rs.getString(2);
				String name = rs.getString(3);
				String job = rs.getString(4);
				String gender = rs.getString(5);
				String intro = rs.getString(6);
				String regdate = rs.getString(7);
				
				mem = new MemberVO(id, pwd, name, job, gender, intro, regdate);*/
			}
					
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			// close();
		}
		
		return mem;
	}
	
	
	
	/* swing은  제네릭을 인식못한다....ㅋㅋㅋㅋ 
	public Vector<MemberVO> getMemberList(String string){
		Vector<MemberVO> mList = new Vector<MemberVO>(); //Vector 만약에 게임의 경우 공격과 소리가 함께 나야하니깐 그럴때 사용하는게 Vector이다 . 
		MemberVO mem = null;
		
		try {
			conn = DBConn.getInstance();
			String sql ="select id, pwd, name, job, gender, intro, regdate from member2 where name like ? " ; //'%석%' 이거 전체가 물음표가 되어야 한다. 
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%"+ string + "%");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String id = rs.getString(1);
				String pwd = rs.getString(2);
				String name = rs.getString(3);
				String job = rs.getString(4);
				String gender = rs.getString(5);
				String intro = rs.getString(6);
				String regdate = rs.getString(7);
				
				mem = new MemberVO(id, pwd, name, job, gender, intro, regdate);
				mList.add(mem);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return mList;
	}
	*/
	//Swing용 : list는 한줄한줄이 memberVO이다. 
	// 근데 Vector은 
	public Vector getMemberList(String string){
		Vector mList = new Vector(); //Vector 만약에 게임의 경우 공격과 소리가 함께 나야하니깐 그럴때 사용하는게 Vector이다 . 
		
		try {
			conn = DBConn.getInstance();
			String sql ="select id, pwd, name, job, gender, intro, regdate from member2 where name like ? " ; //'%석%' 이거 전체가 물음표가 되어야 한다. 
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%"+ string + "%");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String id = rs.getString(1);
				String pwd = rs.getString(2);
				String name = rs.getString(3);
				String job = rs.getString(4);
				String gender = rs.getString(5);
				String intro = rs.getString(6);
				String regdate = rs.getString(7);
				
				Vector mem = new Vector();
				mem.add(id); 
				mem.add(pwd);
				mem.add(name);
				mem.add(job);
				mem.add(gender);
				mem.add(intro);
				mem.add(regdate);
				
				mList.add(mem);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return mList;
	}
	
	
	

	public int addMember(MemberVO insert) {
		int insertCnt = 0;
		conn = DBConn.getInstance();
		try {
			String sql = " insert into member2 (id, pwd, name, job, gender, intro) values (?,?,?,?,?,?) ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, insert.getId());
			pstmt.setString(2, insert.getPwd());
			pstmt.setString(3, insert.getName());
			pstmt.setString(4, insert.getJob());
			pstmt.setString(5, insert.getGender());
			pstmt.setString(6, insert.getIntro());
			
			insertCnt = pstmt.executeUpdate(); //여기서는 sql넣으면 안돼...
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return insertCnt;
	}
	public int updateMember(MemberVO update) {
		int updateCnt = 0;
		conn = DBConn.getInstance();
		
		try {
			String sql = "update member2 set pwd = ? , name = ?, job = ? , gender = ?, intro = ? where id = ?";
			pstmt = conn.prepareStatement(sql); //preparecall 은 프로시저 
			pstmt.setString(1, update.getPwd());
			pstmt.setString(2, update.getName());
			pstmt.setString(3, update.getJob());
			pstmt.setString(4, update.getGender());
			pstmt.setString(5, update.getIntro());
			pstmt.setString(6, update.getId());
			
			updateCnt = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return updateCnt;
	}
	public int deleteMember(MemberVO delete) {
		int deleteCnt = 0;
		conn = DBConn.getInstance();
		try {
			String sql = " delete from member2 where id = ? ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, delete.getId());
			deleteCnt = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return deleteCnt;
	}
	

}
