package com.sist.server;
//750 730
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.*;
import java.util.*;
import java.io.*;

import javax.swing.*;
import javax.swing.table.*;
import javax.swing.text.Document;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;

import com.sist.common.Function;
public class ClientMain extends JFrame implements ActionListener, Runnable{
	JTextPane pane;		//편집 가능 vs TextArea(편집불가능)
	JTextField tf;
	JButton b1,b2;
	JTable table;	//화면 UI
	DefaultTableModel model; // 테이블의 데이터 관리
	JComboBox<String> box;
	/*
	 	화면 관리/ 데이터 관리를 따로 하는 프로그램
	 	------  --------
	 	 View    Model  ==>둘을 연결하는 Controller == MVC구조
	 	 										   Spring은 모두 MVC구조로 되어있음.
	 */
	// 네트워크에 필요한 클래스 설정
	Socket s; 	// 서버 연결
	BufferedReader in; //서버에서 보내주는 데이터를 읽는다
	// HttpServletRequest
	OutputStream out; //서버에 요청하는
	// HttpServletResponse
	
	
	public ClientMain()
	{
		// 초기화
		pane=new JTextPane();
		pane.setEditable(false);
		JScrollPane js1=new JScrollPane(pane);
		tf=new JTextField();
		box=new JComboBox<String>();
		// red=알림 ex)누구님이 나가셨습니다. 들어오셨습니다.
		box.addItem("black");
		box.addItem("pink");
		box.addItem("yellow");
		box.addItem("green");
		box.addItem("red");
		box.addItem("orange");
		box.addItem("cyan");
		
		//테이블
		String[] col= {"아이디","이름","성별"};
		String[][] row=new String[0][3];
		model=new DefaultTableModel(row,col);
		table=new JTable(model);
		JScrollPane js2=new JScrollPane(table);
		b1=new JButton("서버연결");
		b2=new JButton("서버해제");
		JPanel p=new JPanel();
		p.add(b1);
		p.add(b2);
		
		// 배치
		setLayout(null);
		js1.setBounds(10,15,500,600);
		tf.setBounds(10,620,380,30);
		box.setBounds(395,620,115,30);
		js2.setBounds(520,15,230,250);
		p.setBounds(520,270,230,35);
		add(js1);
		add(tf); add(box);
		add(js2);
		add(p);
		String[] data= {"HONG","홍길동","남자"};
		model.addRow(data);
		
		// 이벤트
		setSize(790, 700);
		setVisible(true);
		
		b1.addActionListener(this); // 서버연결
		tf.addActionListener(this); // 채팅
	}
	public static void main(String[] args) {
		new ClientMain();
	}
	public void initStyle()
	{
		Style blue=pane.addStyle("blue", null);
		StyleConstants.setForeground(blue, Color.blue);
	
		Style yellow=pane.addStyle("yellow", null);
		StyleConstants.setForeground(yellow, Color.yellow);
	
		Style green=pane.addStyle("green", null);
		StyleConstants.setForeground(green, Color.green);
	
		Style pink=pane.addStyle("pink", null);
		StyleConstants.setForeground(pink, Color.pink);

		Style cyan=pane.addStyle("cyan", null);
		StyleConstants.setForeground(cyan, Color.cyan);

		Style red=pane.addStyle("red", null);
		StyleConstants.setForeground(red, Color.red);
		
		Style orange=pane.addStyle("orange", null);
		StyleConstants.setForeground(orange, Color.orange);

	}
	public void append(String msg, String color)
	{
		try
		{
			Document doc=pane.getDocument();
			doc.insertString(doc.getLength(),msg+"\n", 
					pane.getStyle(color));
		}catch(Exception ex) {}
	}
	
	//서버와 연동
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try
		{
			while(true)
			{
				//서버에서 들어오는 값을 받는다
				String msg=in.readLine();
				StringTokenizer st=new StringTokenizer(msg,"|");
				int protocol=Integer.parseInt(st.nextToken());
				switch(protocol)
				{
					case Function.CHAT:
					{
						initStyle();
						append(st.nextToken(),st.nextToken());
					}
					break;
				}
			}
		}catch(Exception ex) {}
		
	}
	//버튼 눌렀을때 처리 
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			try
			{
				s=new Socket("211.238.142.108",10000);
				in=new BufferedReader(
						new InputStreamReader(s.getInputStream()));
				out=s.getOutputStream();
				
			}catch(Exception ex) {}
			new Thread(this).start();
		}
		else if(e.getSource()==tf)
		{
			try
			{
				//입력한 데이터 읽기 > 서버에 값을 보내는 과정
				String msg=tf.getText();
				if(msg.length()<1) return;
				String color=box.getSelectedItem().toString();
				out.write((Function.CHAT+"|"
						+msg+"|"+color+"\n").getBytes());
				tf.setText("");
			}catch(Exception ex) {}
		}
	}
}
