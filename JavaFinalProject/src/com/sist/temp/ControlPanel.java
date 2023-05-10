package com.sist.temp;
import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.Color;

public class ControlPanel extends JPanel{
	NewsPanel np=new NewsPanel();
	ChatPanel cp=new ChatPanel();
	FindPanel fp=new FindPanel();
	RecommendPanel rp=new RecommendPanel();
	HomePanel hp;
	DetailPanel dp;
	CardLayout card=new CardLayout();
		public ControlPanel()
	{
			hp=new HomePanel(this);
			dp=new DetailPanel(this);
			setLayout(card);
			add("home",hp);
			add("news",np);
			add("chat",cp);
			add("find",fp);
			add("recomm",rp);
			add("detail",dp);

	}

}
