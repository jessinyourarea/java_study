package com.sist.temp;
/*
 	Window => javax.swing
 	------------------------------------------------------
 	Container : 윈도우 
 		|
 	  JFrame : 일반 윈도우
 	  --------> 주로 사용
 	  JDialog : 정보창 , 입력창
 	  JWindow(타이블바가 없음) : 사용빈도가 거의 없음
 	  JPanel : 독립적으로 사용이 불가능 => JFrame위에 설정
 	  		   주로 화면 분할할때 사용 => Component를 모아서 사용
 	Component 
 	    |
 	Button
 	  => JButton, Menu, JCheckBox, JRadioButton
 	입력창
 	  => 한 줄 입력: JTextField , JPasswordField
 	    여러 줄 입력: JTestArea
 	목록 출력
 	  => JComboBox , JTable , JTree
 	Label : 정보/이미지 
 	
 	JScrollPane
 	------------------------------------------------------
 	
 	배치
 	  => BorderLayout
 	  	 ( 위 / 아래 / 좌 / 우 / 가운데 )
 	  => FlowLayout
 	  => GridLayout
 	  => CardLayout
 	  => 사용자 정의( 위치를 잡아서 처리)
 	     x,y,width,height
 	     
 	  ==> 윈도우
 	      1) 크기 결정
 	      	 setSize(width,height)
 	      2) 윈도우를 보여준다
 	         setVisible(true)
 	      3) 상속 => 이미 만들어져 있는 기능을 재사용
 	             => 변경이 가능
 	      
 	      
 	  
 */
import java.awt.*; //Layout
import javax.swing.*; //Window
import java.awt.event.*; //ButtonClick etc.
public class MainClass_1 extends JFrame{
	// 시작과 동시에 윈도우를 설정
	// ---------> 생성자 1)초기화 담당 2)시작과 동시에 처리하는 일이 있을 때
	// 생성자는 모든 클래스에서 사용이 가능하게 만들어야 한다 => public
	JButton b1,b2,b3,b4,b5;
	JMenuItem home,find,chat,news,board;
	JTabbedPane pane;
	public MainClass_1()
	{
		home=new JMenuItem("홈");
		find=new JMenuItem("검색");
		chat=new JMenuItem("채팅");
		news=new JMenuItem("뉴스");
		board=new JMenuItem("커뮤니티");
		JMenu menu=new JMenu("메뉴");
		menu.add(home);
		menu.add(find);
		menu.add(chat);
		menu.add(news);
		menu.add(board);
		JMenuBar bar=new JMenuBar();
		bar.add(menu);
		setJMenuBar(bar);
		
		pane=new JTabbedPane();
		pane.addTab("홈", new JPanel());
		pane.addTab("검색", new JPanel());
		pane.addTab("채팅", new JPanel());
		pane.addTab("뉴스", new JPanel());
		pane.addTab("커뮤니티", new JPanel());
		add("Center",pane);
		// 윈도우 크기 설정
		b1=new JButton("홈");
		b2=new JButton("검색");
		b3=new JButton("채팅");
		b4=new JButton("뉴스");
		b5=new JButton("커뮤니티");
		
		JPanel p=new JPanel(); //일자배치
		p.setLayout(new GridLayout(1,5,5,5)); //줄 수 : 1줄에 5개씩
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		
		JPanel p1=new JPanel(); //일자배치
		p1.setLayout(new GridLayout(5,1,5,5)); //줄 수 : 5줄에 1개씩 (뒤에 5,5 간격)
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		p1.add(b5);
		add("West",p1);
		
		//윈도우에 배치
		add("North",p); // North,South,East,West,Center
		//JFrame => BorderLayout
		// JPanel => FlowLayout
	
		setSize(1200,850);
		// 윈도우를 보여준다
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// X를 눌렀을때 메모리를 해제하는 => 클릭시 메모리 해제
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 생성자만 호출 
		try 
		{
//			UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HifiLookAndFeel");
//			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
//			UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
//			UIManager.setLookAndFeel("com.jtattoo.plaf.luna.LunaLookAndFeel");
//			UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
//			UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
//			UIManager.setLookAndFeel("com.jtattoo.plaf.fast.FastLookAndFeel");
			UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
//			UIManager.setLookAndFeel("com.Jtattoo.plaf.NetBeans3.6with.NetBeans3.6withLookAndFeel");
			
		}catch(Exception ex){}
		new MainClass_1();
	}

}





