package com.sist.temp;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;
import java.util.List;

import javax.swing.*;
import javax.swing.table.*;
import com.sist.manager.*;
import java.net.*;
import java.text.SimpleDateFormat;
public class BoardListPanel extends JPanel implements ActionListener, MouseListener {	//버튼담당 actionListener 테이블담당 mouseListener
	JTable table;
	DefaultTableModel model;
	JLabel pageLa,titleLa;
	JButton b1,b2,b3;
	//전체 사용 변수
	int curpage=1; //현재페이지
	int totalpage=0;
	TableColumn column;
	BoardManager bm=new BoardManager();	// 데이터 관리 매니쟈
	ControlPanel cp;	//화면 변경
	
	public BoardListPanel(ControlPanel cp)
	{
		this.cp=cp;
		b1=new JButton("새글");
		b2=new JButton("이전");
		b3=new JButton("다음");
		pageLa=new JLabel("0 page / 0 pages");
		titleLa=new JLabel("자유게시판");
		titleLa.setFont(new Font("맑은 고딕",Font.BOLD,45));
		titleLa.setHorizontalAlignment(JLabel.CENTER);
		
		String[] col= {"번호","제목","이름","작성일","조회수"};
		String[][] row=new String[0][5];
		model=new DefaultTableModel(row,col)
		{
			@Override
			public boolean isCellEditable(int row, int column) {	//해당 셀 편집 가능? => return false ㄴㄴ불가능 
				return false; //편집 방지
				// 상속 없이 오버라이딩이 가능 == 이게 바로 익명의 클래스
				// 윈도우 / 빅데이터 분석 => 웹에서는 거의 사용 없음.
			}	
		};
		table=new JTable(model); 
		JScrollPane js=new JScrollPane(table);
		
		//배치
		setLayout(null);
		titleLa.setBounds(10, 15, 720, 60);
		add(titleLa);
		b1.setBounds(10, 100, 100, 30);
		add(b1);
		js.setBounds(10, 140, 720, 500);
		add(js);
		JPanel p=new JPanel();
		p.add(b2);
		p.add(pageLa);
		p.add(b3);
		p.setBounds(10, 650, 720, 35);
		add(p);
		
		//컬럼 간격 조절
		table.getColumn("번호").setPreferredWidth(30);
		table.getColumn("제목").setPreferredWidth(400);
		table.getColumn("이름").setPreferredWidth(100);
		table.getColumn("작성일").setPreferredWidth(150);
		table.getColumn("조회수").setPreferredWidth(50);
		table.getTableHeader().setReorderingAllowed(false);
		table.setShowVerticalLines(false);	// 게시판 테이블 내 그리드 라인 안보이게
		table.setRowHeight(45);
		
		// 데이터 정렬 (인덱스1(no)빼고 가운데정렬)
		for(int i=0;i<col.length;i++)
		{
			column=table.getColumnModel().getColumn(i);
			DefaultTableCellRenderer dt=
					new DefaultTableCellRenderer();
			if(i!=1)
			{
				dt.setHorizontalAlignment(JLabel.CENTER);
			}
			column.setCellRenderer(dt);
		}
		boardPrint();	//생성자에서 호출하면 한 페이지를 띄우고 실행 ?
		
		//이벤트 등록
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		table.addMouseListener(this);
		
	}
	
	public void boardPrint()
	{
		//테이블에 출력된 내용을 지우기	(새로 작성하기 위해서)
		for(int i=model.getRowCount()-1;i>=0;i--)
		{
			model.removeRow(i);
		}
		// 다시 출력
		// 1. 데이터 읽기
		List<BoardVO> list=
				bm.boardListData(curpage);
		totalpage=bm.boardTotalPage();
		pageLa.setText(curpage+" page / "+totalpage+" pages");
		
		for(int i=list.size()-1;i>=0;i--)	//역순 출력 (최신글 부터 상위에 뜨도록)
		{
			BoardVO vo=list.get(i);
			String[] data= {
				String.valueOf(vo.getNo()),
				vo.getSubject(),
				vo.getName(),
				new SimpleDateFormat("yyyy-MM-dd").format(vo.getRegdate()),
				String.valueOf(vo.getHit())
			};
			model.addRow(data);
			
		}
		
	}
	// 테이블 더블 클릭시 => 상세보기 이동
	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource()==table)
		{
			if(e.getClickCount()==2)
			{
				int row=table.getSelectedRow();
				String no=table.getValueAt(row, 0).toString();
				BoardVO vo=bm.boardDetailData(Integer.parseInt(no));
				cp.bdp.noLa.setText(String.valueOf(vo.getNo()));
				cp.bdp.nameLa.setText(vo.getName());
				cp.bdp.subLa.setText(vo.getSubject());
				cp.bdp.pane.setText(vo.getContent());
				cp.bdp.dateLa.setText(new SimpleDateFormat("yyyy-MM-dd").format(vo.getRegdate()));
				cp.bdp.hitLa.setText(String.valueOf(vo.getHit()));
				cp.card.show(cp, "bdp"); // 상세보기 화면변경
				
			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	//버튼 처리
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)	//글쓰기
		{
			cp.ip.tf1.setText("");
			cp.ip.tf2.setText("");
			cp.ip.ta.setText("");
			cp.ip.pf.setText("");
			cp.card.show(cp, "insert");
		}
	}
}
