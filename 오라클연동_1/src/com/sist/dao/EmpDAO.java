package com.sist.dao;
import java.security.AlgorithmParametersSpi;
// 오라클 연결 => 인터페이스 구현
// 인터페이스 => 서로 다른 프로그램을 연결할 때 사용 (LIKE 리모콘)
// 자바<>오라클 ==> 연결을 위해 이미 제공된 라이브러리를 이용 (라이브러리가 인터페이스로 만들어져있다)
// 자바-> 오라클: SQL을 이용한 인터페이스 구현 / 자바->브라우저: HTML을 이용한 인터페이스 구현
/*
 	1. 드라이버 등록 (thin드라이버/무료/대신 간단한 연결만 해준다/속도는 보통..느림..)
 		=> 소프트웨어 => 메모리 할당
 		Class.forName("oracle.jdbc.driver.OracleDriver");
 		================================================
 		=> 각 업체에서 제공 => ozjdbc8.jar (Build Path에 add external JARs)
 		10g,11g,12c,18c,21c
 		    ---     ---
 		   ojdbc6   ojdbc8 호환
 	2. 오라클 연결 => conn hr/happy
 		Connection => getConnection(URL,username,password)
 		
 	3. SQL문장 전송 (송수신)
 		Statement => executeQuery(SQL)
 		=> 결과값을 받는 클래스 ResultSet
 		=> ResultSet에 있는 데이터를 => List,VO에 넣기
 	4. resultSet.close()
 	5. statement.close()
 	6. connection.close()
 	
 	==========> 자바 프로그램
 		        1) 네트워크 프로그램 (애플리케이션)
 		        2) 데이터베이스 프로그램 (웹 애플리케이션) ***
 		        가장 쉬운 프로그램이 데이터베이스 프로그램..== 모든 개발자가 동일한 코딩을 하는 것
 		        
 */
import java.sql.*; //컴파일 예외가 포함되어 있어서 예외처리 필수! Checked Exception
import java.util.*;
public class EmpDAO {
	// 오라클을 연결하는 객체가 필요함.
	private Connection conn;
	
	// 오라클과 통신 (SQL 전송+ 결과값 받음)
	private PreparedStatement ps;
	//-------------------------
	// 오라클 주소
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
	// 드라이버 이름
	private final String DRIVER="oracle.jdbc.OracleDriver";
	// 사용자명
	private final String USERNAME="hr";
	// 비밀번호
	private final String PASSWORD="happy";
	//------------------------- 추후에는 파일에 저장 (보안해야하기 때문/secured code)

	
	//드라이버 => 한번만 수행(생성자)
	public EmpDAO()
	{
		try
		{
			Class.forName(DRIVER);
		}catch(Exception ex) {}
	}
	
	// 오라클 연결
	public void getConnection()
	{
		try
		{
			conn=DriverManager.getConnection(URL,USERNAME,PASSWORD);
			// 호출 시= conn hr/happy
			
		}catch(Exception ex) {}
	}
	// 오라클 해제
	public void disConnection()
	{
		try
		{
			if(ps!=null) ps.close();
			if(conn!=null) conn.close();
			// 호출 시 = exit
		}catch(Exception ex) {}
	}
	////////////////////////////////////////////===========오라클 연결 시 필수 조건( 클래스화 시켜서 연결시키는 방법)
	/*
	 	        ------1차        2차       3차
	 	JDBC === DBCP ==== ORM (MYBatis , JPA)
	 	---- 연습용
	 	
	 	요구사항
	 	----------------1. 언어 (자바) 
	 					2. 데이터베이스 (오라클 , MySQL-3차이용예정)
	 					3. Front(Vue,React) 
	 					4. 우대사항 (클라우드) => AWS
	 					==============================FULL STACK	 */
	
	// 기능 : 사용자 요청 시에 데이터베이스로 => SQL문장을 만들어서 오라클 연동 -JDBS program
	// 1. 사용자가 사원 전체 목록 요청
	public List<EmpVO> empListData()
	{
		List<EmpVO> list=
				new ArrayList<EmpVO>();
		try
		{
			// 정상 수행 문장
			// 1. 오라클 연결 ==> XE는 50명까지만 접근하는 테스트 서버 
			getConnection();
			
			//2. 사용자가 요청한 SQL 문장을 제작
			String sql="SELECT empno,ename,job,hiredate,sal "
					+ "FROM emp "
					+ "ORDER BY 1";
			
			//3. 오라클로 전송
			ps=conn.prepareStatement(sql);
			
			//4. 오라클에 명령을 내린다 (SQL 문장 실행 후 결과값을 가지고 온다)
			ResultSet rs=ps.executeQuery();
			
			/*
			 	rs
			 	  1	      2      3      4        5
			 	---------------------------------------------
			 	empno   ename   job   hiredate   sal
			 	---------------------------------------------
			 	7788     -									 ====> 위치 (rs.next())
			 	---------------------------------------------
			 	7897     -
			 	---------------------------------------------
			 	7355										 ====> 위치 (rs.previous())
			 	---------------------------------------------
			 	V 실행 후 커서는 여기에 (커서 위치를 옮길 때 next()/previous() )
			*/
			while(rs.next())
			{
				EmpVO vo=new EmpVO();
				vo.setEmpno(rs.getInt(1));
				vo.setEname(rs.getString(2));
				vo.setJob(rs.getString(3));
				vo.setHiredate(rs.getDate(4));
				vo.setSal(rs.getInt(5));
				list.add(vo);
			}
			rs.close();
		}catch(Exception ex) 
		{
			ex.printStackTrace();
		}
		finally
		{
			disConnection(); // 오라클 닫기
		}
		return list;
	}
	// 2. 상세보기
	public EmpVO empDetailData(int empno)
	{
		EmpVO vo=new EmpVO();
		try
		{
			//1. 오라클 연결
			getConnection();
			//2. SQL 문장 만들기
			String sql="SELECT * "
					+"FROM emp "
					+"WHERE empno="+empno;
			//3. 오라클 전송
			ps=conn.prepareStatement(sql);
			//4. 실행 후에 결과값 받기
			ResultSet rs=ps.executeQuery();
			//5. rs에 있는 데이터를 vo에 담기
			rs.next(); // 데이터가 메모리에 출력된 첫번째 줄에 커서를 이동
			vo.setEmpno(rs.getInt(1));
			vo.setEname(rs.getString(2));
			vo.setJob(rs.getString(3));
			vo.setMgr(rs.getInt(4));
			vo.setHiredate(rs.getDate(5));
			vo.setSal(rs.getInt(6));
			vo.setComm(rs.getInt(7));
			vo.setDeptno(rs.getInt(8));
			rs.close();
					
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			disConnection();
		}
		return vo;
	}
	//2-1 사번 읽기
	public List<Integer> empGetEmpno()
	{
		List<Integer> list=new ArrayList<Integer>();
		try
		{
			//1. 연결
			getConnection();
			//2. SQL 문장 제작
			String sql="SELECT DISTINCT empno "
						+"FROM emp";
			//3. SQL 문장 보내기
			ps=conn.prepareStatement(sql);
			//4. 결과값 받기
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				list.add(rs.getInt(1));
			}
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			disConnection();
		}
		return list;
	}
	// 3. 검색 
	public EmpVO empFindData(String ename)
	{
		EmpVO vo= new EmpVO();
		try
		{	
			getConnection();
			String sql="SELECT * "
					+ "FROM emp "
					+ "WHERE ename LIKE +'%"+ename.toUpperCase()+"%'";
			ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			rs.next();
			vo.setEmpno(rs.getInt(1));
			vo.setEname(rs.getString(2));
			vo.setJob(rs.getString(3));
			vo.setMgr(rs.getInt(4));
			vo.setHiredate(rs.getDate(5));
			vo.setSal(rs.getInt(6));
			vo.setComm(rs.getInt(7));
			vo.setDeptno(rs.getInt(8));
			rs.close();
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			disConnection();
		}
		return vo;
	}
	//3-1
	public List<EmpVO> empSearchData(String ename)
	{
		List<EmpVO> list=new ArrayList<EmpVO>();
		try
		{
			getConnection();
			String sql="SELECT empno,ename,job,hiredate,sal "
					+ "From emp "
					+ "WHERE ename LIKE '%'||?||'%'";
			//							CONCAT('%',?,'%') =>? MySQL,MariaDB
			ps=conn.prepareStatement(sql);
			ps.setString(1, ename.toUpperCase());
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				
			}
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			disConnection();
		}
		return vo;
	}
	
	
}















