
package com.sist.temp;
import java.awt.*;
import javax.swing.*;
public class RecvMessage extends JFrame {
		JLabel la;
		JTextField tf;
		JTextArea ta;
		JButton b1,b2;
		public RecvMessage()
		{
			la=new JLabel("보내는 사람");
			tf=new JTextField(20);
			ta=new JTextArea();
			JScrollPane js=new JScrollPane(ta);
			b1=new JButton("답장하기");
			b2=new JButton("취소");
			tf.setEditable(false);
			ta.setEditable(false);
			
			JPanel p1=new JPanel();
			p1.add(la);
			p1.add(tf);
			
			JPanel p2=new JPanel();
			p2.add(b1);
			p2.add(b2);
			
			
			add("North",p1);
			add("Center",js);
			add("South",p2);
			
			setSize(350, 400);
//			setVisible(true);
			
		

		
		}
//		public static void main(String[] args) {
//			new SendMessage();
//		}
//	}
}
