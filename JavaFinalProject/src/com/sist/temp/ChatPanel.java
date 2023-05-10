package com.sist.temp;
//750 730
import java.awt.Color;

import javax.swing.*;
import javax.swing.table.*;
import javax.swing.text.Document;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;

import com.sist.inter.ChatInterface;
public class ChatPanel extends JPanel implements ChatInterface{
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
	public ChatPanel()
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
		model=new DefaultTableModel(row,col)
		{
			@Override
			public boolean isCellEditable(int row, int column) {	
			return false;
			}
		};
		table=new JTable(model);
		JScrollPane js2=new JScrollPane(table);
		b1=new JButton("쪽지보내기");
		b2=new JButton("정보보기");
		JPanel p=new JPanel();
		p.add(b1);
		p.add(b2);
		b1.setEnabled(false); //비활성화
		b2.setEnabled(false); //비활성화
		
		
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
//		String[] data= {"HONG","홍길동","남자"};
//		model.addRow(data);
		
		// 이벤트
		
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
}
