package com.sist.exception;
/*
 	예외 처리 방법 (4가지)
 	------------------
 	1. 예외 복구 : try~catch ~finally ***가장 많이 사용하는 예외 처리
 	-----------------------------------------
 	2. 예외 회피 : throws			
 	-----------------------------------------라이브러리에 주로 있따
 	3. 임의 발생 : throw
 	-----------------------------------------
 	4. 사용자 정의 : 지원하지 않는 경우에 직접 제작 (사용 빈도는 거으ㅣ 없음)
 		-----------------------> 대신 if문을 주로 사용한다
 
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class 예외처리_예외복구_7 extends JFrame implements ActionListener {
	private JTextField tf;
	private JButton b1,b2;   //부분적으로 예외 처리
	private int com;
	public  예외처리_예외복구_7() //생성자 . 초기화 및 시작과 동시에 처리하는 내용이 있을때 사용
	{
		tf=new JTextField(20);
		b1=new JButton("시작");
		b2=new JButton("종료");
		tf.setEnabled(false);
		JPanel p=new JPanel();
		p.add(tf);p.add(b1);p.add(b2);
		add("Center",p);
		setSize(390,150);
		setVisible(true);
		
		b1.addActionListener(this);
		//b1번을 클릭하면 =>  actionPerformed 를 호출하라는 뜻 (이벤트 등록)
		b2.addActionListener(this);
		tf.addActionListener(this);
		//tf에서 엔터를 눌렀을때 actionPerformed 호출
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new 예외처리_예외복구_7();	
	}
	//버튼 처리하는 메소드 : 정의 (용도가 여러개이기 떄문에 구현하지 못함;선언만 된 상태)
	//호출은 해준다(자동호출)=> 그러나 구현은 사용자에게 맡긴다
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b2) 	//b2 버튼을 눌렀는지?
		{
			System.exit(0); // end program
		}
		else if(e.getSource()==b1)
		{
			com=(int)(Math.random()*100)+1;	//
			JOptionPane.showMessageDialog(this, "게임을 시작합니다");
			tf.setEnabled(true);
			tf.requestFocus();
			b1.setEnabled(false);	//시작 후 다시 누르지 못하게 비활성화
		
		}
		else if(e.getSource()==tf)
		{
			String strNum=tf.getText(); // 사용자의 입력값을 읽어온다
			if(strNum.trim().length()<1) //입력값이 없다면 (1보다 작은 건 0, 즉 입력을 안했을때) +trim(좌우 공백 제거까지)
			{
				JOptionPane.showMessageDialog(this, "1~100까지 사이의 정수 입력");
				tf.requestFocus();
				return;
			}
			//입력이 됐다면
			int num=0;
			try
			{
				num=Integer.parseInt(strNum); //문자열을 정수형으로 변경 / 정수를 문자열로 변경할떄는 valueOf()
			}catch(NumberFormatException ex)
			{
				//잘못된 입력일 때 복구
				JOptionPane.showMessageDialog(this, "정수만 입력 가능합니다");
				tf.setText("");
				tf.requestFocus();
				return;								//continue 대신 return을 이용!!
			}
			//비교
			if(com>num)
			{
				JOptionPane.showMessageDialog(this, "입력한 정수보다 큰 정수를 입력하세요.");
				tf.setText("");
				tf.requestFocus();
			}
			else if(com<num)
			{
				JOptionPane.showMessageDialog(this, "입력한 정수보다 작은 정수를 입력하세요.");
				tf.setText("");
				tf.requestFocus();
			}
			else 
			{
				JOptionPane.showMessageDialog(this, "Game Over!!");
				tf.setText("");
				tf.setEnabled(false);
				b1.setEnabled(true);
			}
		}
	}

}
