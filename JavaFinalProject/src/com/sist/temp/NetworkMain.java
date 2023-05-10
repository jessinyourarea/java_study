package com.sist.temp;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

import com.sist.common.Function;
import com.sist.common.ImageChange;
import com.sist.manager.GenieMusicVO;
import com.sist.manager.MusicSystem;
import java.util.*;
/////////////////////// ↓ import 3종세트 for 네트워크 관련
import java.util.List;
import java.io.*;
import java.net.*;
/*
 	java.net.* 관련 프로그램 2개
 	1) 로그인 , 채팅 문자열 입력 ... 일반 사용자
 	2) 서버에서 전송되는 데이터를 출력
 	   ----------------------> Thread로 수행
 	   
 	웹에서 필요한 기술
 	=> 데이터 베이스
 */
public class NetworkMain extends JFrame implements ActionListener, Runnable, MouseListener{
	MenuPanel mp;
	ControlPanel cp;
	TopPanel tp;
	JButton b1,b2,b3,b4,b5;
	JLabel logo;
	Login login=new Login();
	//페이지 지정
	int curpage=1;
	int totalpage=0;
	MusicSystem ms=new MusicSystem();
	
	//네트워크 관련 클래스
	// 서버 연결 -> 연결 기기
	Socket s; //서버의 메모리 연결
	// 서버에서 보내준 값을 받는다
	BufferedReader in;
	// 서버로 값을 전송
	OutputStream out;
	// ID 저장
	String myId;
	//테이블 선택 인덱스번호
	int selectRow=-1;
	//쪽지보내기
	SendMessage sm=new SendMessage();
	RecvMessage rm=new RecvMessage();
	public NetworkMain()
	{
		logo=new JLabel();
		Image img=ImageChange.getImage(
				new ImageIcon("c:\\javaDev\\logo.png"), 200,130);
		logo.setIcon(new ImageIcon(img));
		mp=new MenuPanel();
		cp=new ControlPanel();
		tp=new TopPanel();
		
		setLayout(null); //Layout없이 직접 배치
		logo.setBounds(10,15,200,130);
		mp.setBounds(10,150,200,200);
		cp.setBounds(220,15,750,780);
		tp.setBounds(980,15,200,730);
	
		b1=new JButton("홈");
		b2=new JButton("뮤직검색");
		b3=new JButton("채팅");
		b4=new JButton("뉴스검색");
		b5=new JButton("커뮤니티");
		mp.setLayout(new GridLayout(5,1,10,10));  // 메뉴패널에 메뉴리스트를 넣는다
		mp.add(b1);
		mp.add(b2);
		mp.add(b3);
		mp.add(b4);
		mp.add(b5);
		
		//추가
		add(mp);
		add(cp);
		add(tp);
		add(logo);
		
		//윈도우 크기
		setSize(1200,800);
//		setVisible(true);
		
		//종료
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("네트워크 뮤직 프로그램");
		
		//이벤트 등록
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		
		//로그인
		login.b1.addActionListener(this);
		login.b2.addActionListener(this);
		
		//채팅
		cp.cp.tf.addActionListener(this);	//controlPanel >chatPanel
		
		
		//HomePage
		musicDisplay();
	
		List<GenieMusicVO> list=ms.musicListData(curpage);
		cp.hp.cardInit(list);
		cp.hp.cardPrint(list);
		totalpage=ms.musicTotalPage();
		cp.hp.b1.addActionListener(this);	//이전 버튼
		cp.hp.b2.addActionListener(this);	//다음 버튼
		cp.hp.pageLa.setText(curpage+" page /"
				+ totalpage+" pages");

		cp.cp.b1.addActionListener(this);	//쪽지보내기
		cp.cp.b2.addActionListener(this);	//정보 보기
		cp.cp.table.addMouseListener(this);	
		
		sm.b1.addActionListener(this);
		sm.b2.addActionListener(this);
		sm.b2.addActionListener(this);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
//			UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HifiLookAndFeel");
			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
//			UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
//			UIManager.setLookAndFeel("com.jtattoo.plaf.luna.LunaLookAndFeel");
//			UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
//			UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
//			UIManager.setLookAndFeel("com.jtattoo.plaf.fast.FastLookAndFeel");
//			UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
//			UIManager.setLookAndFeel("com.Jtattoo.plaf.NetBeans3.6with.NetBeans3.6withLookAndFeel");
		}catch(Exception ex){}
		new NetworkMain();
	}
	
	
	// 버튼처리할 떄 쓰는
	public void musicDisplay()
	{
		List<GenieMusicVO> list=ms.musicListData(curpage);
		cp.hp.cardInit(list);
		cp.hp.cardPrint(list);
		totalpage=ms.musicTotalPage();
		cp.hp.pageLa.setText(curpage+" page /"
				+ totalpage+" pages");
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			curpage=1;
			musicDisplay();
			cp.card.show(cp, "home");
		}
		else if(e.getSource()==b2)
		{
			cp.card.show(cp, "find");
		}
		else if(e.getSource()==b3)
		{
			cp.card.show(cp, "chat");	
		}
		else if(e.getSource()==b4)
		{
			cp.card.show(cp, "news");
		}
		else if(e.getSource()==b5)
		{
			cp.card.show(cp, "recomm");
		}
		else if(e.getSource()==login.b1)
		{
			//로그인 데이터 읽어오기
			String id=login.tf1.getText();
			if(id.length()<1)
			{
				JOptionPane.showMessageDialog(this, "ID를 입력하세요");
				login.tf1.requestFocus();
				return;
			}
			String name=login.tf2.getText();
			if(name.length()<1)
			{
				JOptionPane.showMessageDialog(this, "이름을 입력하세요");
				login.tf2.requestFocus();
				return;
			}
			String sex=login.rb1.isSelected()?"남자":"여자";
			
			// 위에 입력한 3개를 서버로 전송
			try
			{
				//서버 연결
				s=new Socket("211.238.142.108",10000);	//localhost는 본인컴퓨터의 서버, 추후에는 서버로 쓸 IP번호 입력
				//서버 컴퓨터 => IP 
				//211.238.142.108 
				
				//읽는 위치 / 쓰는 위치
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));
				//s는 서버의 메모리 (s.getInputStream) ==> 서버메모리로부터 값을 읽어 온다는 뜻
				
				//서버에서 읽어갈 수 있게 메모리에 저장
				out=s.getOutputStream();
				
				// 서버로 로그인 요청
				out.write((Function.LOGIN+"|"
						+id+"|"+name+"|"+sex+"\n").getBytes());
			}catch(Exception ex) {}
			// 서버로부터 전송된 값을 받아온다
			new Thread(this).start(); //run 호출
						
		}
		else if(e.getSource()==login.b2)
		{
			System.exit(0);
		}
		else if(e.getSource()==cp.cp.tf)
		{
//			cp.cp.initStyle();
			String msg=cp.cp.tf.getText();
			String color=cp.cp.box.getSelectedItem().toString();
			if(msg.length()<1) return;
			
			//서버로 전송 
			try
			{
				out.write((Function.CHAT+"|"
						+msg+"|"+color+"\n").getBytes());
			}catch(Exception ex) {}
//			cp.cp.append(msg, color);
			
			cp.cp.tf.setText("");			//채팅 입력 후 공백으로 두기
		}
		else if(e.getSource()==cp.hp.b1)
		{
			if(curpage>1)
			{
				curpage--;
				musicDisplay();
			}
		}
		else if(e.getSource()==cp.hp.b2)
		{
			if(curpage<totalpage)
			{
				curpage++;
				musicDisplay();
			}
		}
		else if(e.getSource()==cp.cp.b2)
		{
			//정보 보기
			if(selectRow==-1)
			{
				JOptionPane.showMessageDialog(this, "정보를 볼 대상을 선택하세요.");
				return;
			}
			//선택된 경우
			String youId=cp.cp.table.getValueAt(selectRow, 0).toString();
			try
			{
				//선택된 Id의 정보를 보여달라 (서버에 요청)
				out.write((Function.INFO+"|"+youId+"\n").getBytes());
				//out.write=> 서버 요청 ==> \n 포함되어야 한다
				//Server에서 처리 후 client에서 출력한다
			}catch(Exception ex) {}
		}
		else if(e.getSource()==cp.cp.b1)
		{
			//쪽지보내기
			sm.ta.setText("");
			String youId=cp.cp.table.getValueAt(selectRow, 0).toString();
			sm.tf.setText(youId);
			sm.setVisible(true);
		}
		//쪽지보내기 관련
		else if(e.getSource()==sm.b2)
		{
			sm.setVisible(false);
		}
		else if(e.getSource()==rm.b2)
		{
			rm.setVisible(false);
		}
		else if(e.getSource()==sm.b1)
		{
			String youId=sm.tf.getText();
			String msg=sm.ta.getText();
			if(msg.length()<1)
			{
				sm.ta.requestFocus();
				return;
			}
			try
			{
				out.write((Function.MSGSEND+"|"
						+youId+"|"+msg+"\n").getBytes());
				// youId를 찾아서 msg를 보내주는 기능 수행
			}catch(Exception ex) {}
			//보내고 창을 감추기
			sm.setVisible(false);
		}
		else if(e.getSource()==rm.b1)
		{
			sm.tf.setText(rm.tf.getText());
			sm.ta.setText("");
			sm.setVisible(true);
			rm.setVisible(false);
		}
		
		
	}

	// 서버에서 결과값을 받아서 출력 => Thread(자동화)
	// member.jsp?id=aaa&pwd=1234&name=홍길동
	// 100 
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try
		{
			while(true)
			{
				String msg=in.readLine(); // 서버에서 보낸 값
				StringTokenizer st=
						new StringTokenizer(msg,"|");
				int protocol=Integer.parseInt(st.nextToken());
				switch(protocol)
				{
				//서버에 로그인이 들어왔을 때
				//LOGIN => 테이블에 정보를 출력한다
				case Function.LOGIN:
					{
						String[] data= {
								st.nextToken(), //ID
								st.nextToken(), //name
								st.nextToken() //sex
						};
						cp.cp.model.addRow(data);
						
					}
				// C / S (client/server) => 모든 명령이 서버로부터 받아서 처리
			    // MYLOG => 로그인 종료하고 메인창을 보여준다
					break;
				case Function.MYLOG:
					{
						setTitle(st.nextToken());
						myId=st.nextToken();
						login.setVisible(false);
						setVisible(true);
					}
					break;
				case Function.CHAT:
					{
					cp.cp.initStyle();
					cp.cp.append(st.nextToken(), st.nextToken());
					//			  채팅문자열		  색상
					}
				break;	
					case Function.INFO:
					{
						String data="아이디:"+st.nextToken()+"\n"
								+"이름:"+st.nextToken()+"\n"
								+"성별:"+st.nextToken();
						JOptionPane.showMessageDialog(this, data);
					}
					break;
					case Function.MSGSEND:
					{
						String id=st.nextToken();
						String strMsg=st.nextToken();
						rm.tf.setText(id);
						rm.ta.setText(strMsg);
						rm.setVisible(true);
					}
					break;
					}
			}
		}catch(Exception ex) {}
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==cp.cp.table)
		{
//			if(e.getClickCount()==2)	//더블 클릭
//			{
				selectRow=cp.cp.table.getSelectedRow();
				String id=cp.cp.table.getValueAt(selectRow, 0).toString();
//				JOptionPane.showMessageDialog(this, "선택된 ID:"+id);
			if(id.equals(myId))	// 본인
			{
				cp.cp.b1.setEnabled(false);
				cp.cp.b2.setEnabled(false);
			}
			else	//본인이 아닌 경우
			{
				cp.cp.b1.setEnabled(true);
				cp.cp.b2.setEnabled(true);
			}
//			}
		}
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
