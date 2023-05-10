package com.sist.temp;
import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.Color;

public class ControlPanel extends JPanel{
	NewsPanel np=new NewsPanel();
	ChatPanel cp=new ChatPanel();
	FindPanel fp=new FindPanel();
	HomePanel hp;
	DetailPanel dp;
	BoardListPanel bp;
	BoardInsertPanel ip;
	BoardDetailPanel bdp;
	CardLayout card=new CardLayout();
		public ControlPanel()
	{
			hp=new HomePanel(this);
			dp=new DetailPanel(this);
			bp=new BoardListPanel(this);
			ip=new BoardInsertPanel(this);
			bdp=new BoardDetailPanel(this);
			setLayout(card);
			add("home",hp);
			add("news",np);
			add("chat",cp);
			add("find",fp);
			add("detail",dp);
			add("board",bp);
			add("insert",ip);
			add("bdp",bdp);
	}

}
