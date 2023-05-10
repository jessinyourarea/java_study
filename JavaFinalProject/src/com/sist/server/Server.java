package com.sist.server;
/*
 	1. 전화 / 우편
 			 -- 손실할 수도 있다 (속도가 빠르다) => UDP
 	   -- 신뢰성이 뛰어나다(속도가 늦다)	=> TCP 
 	   TCP + UDP 의 장점을 가져온
 	   	 신뢰성 + 속도 ==> RTCP (화상) => ZOOM, 웨일온 ...
 	2. TCP를 제작하기 위해서는?
 	   1) PORT(전화선) => 연결선
 	   	  0~65535까지 사용이 가능
 	   	  --> 알려진 포트(이미 사용 중인 포트) => 0~1023은 사용 중..
 	   	  	  80 : http (웹)
 	   	  	  23 : telnet
 	   	  	  25 : smtp
 	   	  	  21 : ftp
 	   	  	  8080 : proxy (temp port)
 	   	  	  4000 : 머드서버
 	   	  	  1521 : **오라클 서버
 	   	  	  1433 : MS-SQL
 	   	  	  3306 : MySQL
 	   	  	  3000 : ReactJS
 	   	  	  => 화상 ==> 30000번대 최적!
 	   	  	  => 음성 ==> 20000번대 최적!
 	   	  	  
 	   2) IP(전화번호) => 컴퓨터 구분
 	   	  ----------------------- 개통
 	   	  서버는 1대 / 클라이언트는 여러대
 	   	  -----------------------
 	 3. 프로그램 제작
 	    1) 서버 동작
 	       ServerSocket ss=
 	       			new ServerSocker(port번호)
 	       => bind() : 개통(ip,port) => 유심(통신)
 	       => listen() : 클라이언트 연결 시까지 대기
 	    2) 클라이언트가 접속 시 처리
 	       => ss.accept()
 	          ---------> 클라이언트가 서버 연결 시 호출 (연결시마다 호출)
 	          --------- 진동/음악 ...
 	          => 클라이언트 정보(ip,port)
 	          			    -------==Socket
 	    3) 클라이언트마다 따로 통신이 가능하게 넘겨준다
 	       ------------------------------- Thread
 	       Thread는 한개 프로그램 안에서 여러개의 프로그램이 동시에 작동하게 만든다
 	                -------- 프로세스
 	       Thread는 시분할 => CPU를 나눠서 작업하기 때문에 속도가 향상된다
 		    실시간, 동시에 수행 시에 사용되는 기술
 		    ---------------
 		      => 웹(Ajax , VueJS , React JS)
 		      => 쓰레드 : 게임
 		   쓰레드가 작동하는 과정
 		    	 생성	    start()		  run()		     sleep()	
 		    new Thread() ----> 2)대기상태 ----> 3) Running ----> 4)대기상태
	    										   |
 		    								      Dead => interrupt()
 		     => 서버는 1개 작동 => 통신하는 프로그램을 여러개 실행
 		     						== called Thread
   		 
 	
 */

import java.util.*;

import com.sist.common.Function;

import java.net.*;
import java.io.*;
public class Server implements Runnable {
	// 클라이언트 접속 시에 정보(IP)
	private Vector<Client> waitVc=new Vector<Client>();
	/*
	 	Vector => ArrayList
	 	------	  --------
	 	 동기화		비동기화
	 	 
	 	 add , get , size , 
	 */
	private ServerSocket ss;
	private final int PORT=10000;
	//서버 가동 ==> 한 컴퓨터 안에서 서버를 두개 실행할 수는 없다
	
	public Server()
	{
		try
		{
			ss=new ServerSocket(PORT);
			// bind () => listen()
			//  Port () => 50명 한정
			System.out.println("Server Strart...");
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	//접속 시마다 처리
	public void run()
	{
		try
		{
			while(true)
			{
				Socket s=ss.accept();
				//접속시마다 발신자 정보를 확인
				// 접속사 정보는 전화번호 => Socket(ip)
				Client client=new Client(s);
//				waitVc.add(client);
				client.start();
				//클라이언트마다 따로 생성 = 각자 통신이 가능하다
			}
			
		}catch(Exception ex){}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server server=new Server();
		new Thread(server).start();
		//Server안에 있는 run을 호출한다
		
	}
		/*
		 내부 클래스
		 
		 */
		class Client extends Thread
		{
			String id,name,sex;
			
			//클라이언트에서 보낸 값 읽기
			BufferedReader in;
			
			//클라이언트로 결과값 전송
			OutputStream out;
			
			// 클라이언트와 연결 ==> 연결 기기(전화기)
			Socket s;
			
			//연결시도
			public Client(Socket s)
			{
				try
				{
					this.s=s;
					in=new BufferedReader(new InputStreamReader(s.getInputStream()));
					// socket => 클라이언트의 메모리
					out=s.getOutputStream();
				}catch(Exception ex) {}
			}
			// 개인적으로 전송
			public synchronized void messageTo(String msg)
			{
				//synchronized : 동기화
				//디폴트는 비동기화 ... 
				// => VueJS ==> async 메소드명() , sync 메소드명 ()
				try
				{
					out.write((msg+"\n").getBytes());
					//전송단위Byte ==> char로 변경해줘야함
					// InputStreamReader();
				}catch(Exception ex) {}
			}
			// 접속자 전체 전송	
			public synchronized void messageAll(String msg)
			{
				try
				{
					for(Client c: waitVc)
					{
						c.messageTo(msg);
					}
				}catch(Exception ex) {}
			}
			// 요청에 대한 처리
			public void run()
			{
				while(true)
				{
					try
					{
						// 요청값을 받는다
						String msg=in.readLine();
						// 100|id|name|sex (맨앞은 기능번호)
						System.out.println("Client 전송값:"+msg);
						StringTokenizer st=
								new StringTokenizer(msg,"|");
						int protocol=Integer.parseInt(st.nextToken());
						switch(protocol)
						{
							case Function.LOGIN:
							{
								id=st.nextToken();
								name=st.nextToken();
								sex=st.nextToken();
								
								//이미 접속자에게 정보 전송
								messageAll(Function.LOGIN+"|"
										+id+"|"+name+"|"+sex);
								//waitVC에 첨부
								waitVc.add(this);
								
								//로그인은 종료 => Main창을 보여준다
								messageTo(Function.MYLOG+"|"+name+"|"+id);
								
								// 로그인하는 사람에게 모든 정보를 전송
								for(Client user:waitVc)
								{
									messageTo(Function.LOGIN+"|"
											+user.id+"|"
											+user.name+"|"
											+user.sex);
								}
								
							}
							break;
							case Function.CHAT:
							{
								String strMsg=st.nextToken();
								String color=st.nextToken();
								messageAll(Function.CHAT+"|["+name+"]"
										+strMsg+"|"+color);
							}
							break;
							case Function.INFO:
							{
								//상대방의 ID를 받는다
								String youId=st.nextToken();
								for(Client user:waitVc)
								{
									/*	정보 볼 대상을 찾는다
									 	서버의 역할
									 	1)저장 (클라이언트 정보)
									 		=> waitVc (Vector)
									 	2)검색 : ID NAME
									 	3)수정 : ID, PWD ...
									 	4)클라이언트로 전송 기능
									 	5)요청에 대한 처리 기능
									 	
									 	
									 */
									if(youId.equals(user.id))
									{
										//전송 기능
										messageTo(Function.INFO+"|"
												+user.id+"|"
												+user.name+"|"
												+user.sex);
										break;
									}
								}
							}
							break;
							case Function.MSGSEND:
							{
								String youId=st.nextToken();
								String strMsg=st.nextToken();
								for(Client user:waitVc)
								{
									if(youId.equals(user.id))
									{
										user.messageTo(Function.MSGSEND+"|"
												+id+"|"+strMsg);
										break;
									}
								}
							}
							break;
							case Function.EXIT:
							{
								String mid=st.nextToken();
								int i=0;
								for(Client user:waitVc)
								{
									if(user.id.equals(mid))
									{
										user.messageTo(Function.MYEXIT+"|");
										waitVc.remove(i);
										in.close();
										out.close();
										//서버종료 
										break;
									}
									i++;
								}
								messageAll(Function.EXIT+"|"+mid);
							}
							break;
							}
					}catch(Exception ex) {}
				}
			}
		
			
	}

}
