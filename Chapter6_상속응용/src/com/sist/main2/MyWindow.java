package com.sist.main2;
// 상속 받기
/*
 JFrame(윈도우창)
 */
import javax.swing.*;
import java.awt.*;
// 생성자 , 초기화블록 , static => 상속에서 제외 /멤버변수,인스턴스변수만 가져온다
public class MyWindow extends JFrame{	//MyWindow안에 JFrame기능이 들어왓기 떄문에 new생성할 필요 없음
	JLabel la1,la2;
	JTextField tf;
	JPasswordField pf;
	JButton b1,b2;
	public MyWindow()
	{
		la1=new JLabel("아이디");
		la2=new JLabel("비밀번호");
		tf=new JTextField();
		pf=new JPasswordField();
		b1=new JButton("로그인");
		b2=new JButton("취소");
		setLayout(null);
		la1.setBounds(10,15,55,30);
		la2.setBounds(10,50,55,30);
		tf.setBounds(70,15,150,30);
		pf.setBounds(70,50,150,30);
		JPanel p=new JPanel();
		p.add(b1);
		p.add(b2);
		p.setBounds(10,90,210,35);
		add(p);
		add(la1);add(tf);
		add(la2);add(pf);
		setSize(640,480);
		setVisible(true); // 오버라이딩 가능
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyWindow m=new MyWindow();
	}

}
