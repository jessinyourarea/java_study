package com.sist.main2;
//포함 클래스
/*
 * 임포트 자바엑스.스윙
 * 
	JFrame f=new JFrame();
 */
import javax.swing.*;
public class MyWindow_2 {
	JFrame f=new JFrame(); 
	JLabel la1,la2;
	JTextField tf;
	JPasswordField pf;
	JButton b1,b2;	// new뺴고 얘들도 다 포함 클래스
	public MyWindow_2()
	{
		la1=new JLabel("아이디");
		la2=new JLabel("비밀번호");
		tf=new JTextField();
		pf=new JPasswordField();
		b1=new JButton("로그인");
		b2=new JButton("취소");
		f.setLayout(null);
		la1.setBounds(10,15,55,30);
		la2.setBounds(10,50,55,30);
		tf.setBounds(70,15,150,30);
		pf.setBounds(70,50,150,30);
		JPanel p=new JPanel();
		p.add(b1);
		p.add(b2);
		p.setBounds(10,90,210,35);
		f.add(p);
		f.add(la1);f.add(tf);
		f.add(la2);f.add(pf);
		f.setSize(640,480);
		f.setVisible(true);	// 포함은 오버라이딩 불가능(변경안됨)
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyWindow_2(); // 생성자 호출은 반드시 new

	}

}
