package com.sist.client;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JPanel;

public class ControlPanel extends JPanel {
	HomePanel hp=new HomePanel();
	FindPanel fp=new FindPanel();
	NewsPanel np=new NewsPanel();
	ChatPanel cp=new ChatPanel();
	
	CardLayout card=new CardLayout();
	public ControlPanel()
	{
		setLayout(card);
		add("home",hp);
		add("news",np);
		add("chat",cp);
		add("find",fp);
		
//		setBackground(Color.blue);
	}
}
