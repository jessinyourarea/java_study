package com.sist.client;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class NetworkMain extends JFrame implements ActionListener{
	ControlPanel cp;
	MenuPanel mp;
	JButton b1,b2,b3,b4;
	TopPanel tp;

	public NetworkMain()
	{
		mp=new MenuPanel();
		cp=new ControlPanel();
		tp=new TopPanel();
		
		
		setLayout(null);
		mp.setBounds(10,50,200,600);
		cp.setBounds(220,50,800,600);
		tp.setBounds(1030,50,250,600);
		
		b1=new JButton("홈");
		b2=new JButton("강의검색");
		b3=new JButton("뉴스검색");
		b4=new JButton("채팅");
		mp.setLayout(new GridLayout(5,1,20,20));
		mp.add(b1);
		mp.add(b2);
		mp.add(b3);
		mp.add(b4);
		
		//추가
		add(mp);
		add(cp);
		add(tp);
				
		//윈도우 크기
		setSize(1300,800);
		setVisible(true);
		
		//종료
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
		}catch(Exception ex){}
		new NetworkMain();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			cp.card.show(cp,"home");
		}
		else if(e.getSource()==b2)
		{
			cp.card.show(cp,"find");
		}
		else if(e.getSource()==b3)
		{
			cp.card.show(cp, "news");
		}
		else if(e.getSource()==b4)
		{
			cp.card.show(cp, "chat");
		}
		
	}

}
