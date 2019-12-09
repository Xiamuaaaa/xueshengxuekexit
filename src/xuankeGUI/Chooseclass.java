package xuankeGUI;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Chooseclass extends JFrame implements ActionListener {
	// GridLayout gridLayout;
	private String szEvtSource;
	private ButtonGroup buttongroup;
	private JRadioButton b1, b2, b3, b4;
	private JLabel lab;
	private JButton button1, button2;

	public Chooseclass() {
		setSize(300, 350);
		setTitle("您的选择");
		setLocation(200, 330);
		JPanel pane = new JPanel();
		setContentPane(pane);
		// gridLayout =new GridLayout(6,0);
		// pane.setLayout(gridLayout);
		pane.setLayout(null);// 空布局

		lab = new JLabel("您的选择是:");
		b1 = new JRadioButton("开课");
		b2 = new JRadioButton("选课");
		b3 = new JRadioButton("退课");
		b4 = new JRadioButton("打印课程");
		lab.setBounds(30, 0, 70, 60);
		b1.setBounds(30, 73, 70, 30);
		b2.setBounds(30, 100, 70, 30);
		b3.setBounds(30, 130, 70, 30);
		b4.setBounds(30, 160, 120, 30);

		buttongroup = new ButtonGroup();
		buttongroup.add(b1);
		buttongroup.add(b2);
		buttongroup.add(b3);
		buttongroup.add(b4);

		pane.add(lab);
		pane.add(b1);
		pane.add(b2);
		pane.add(b3);
		pane.add(b4);

		button1 = new JButton("取消");
		button2 = new JButton("确定");
		button2.setBounds(30, 240, 200, 120);
		button1.setBounds(190, 240, 200, 120);
		button2.setSize(80, 40);
		button1.setSize(80, 40);

		pane.add(button2);
		pane.add(button1);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent etv) {
				// TODO Auto-generated method stub
				// 得到事件源对象
				Object src = etv.getSource();

				if (src.equals(button2)) { // 如果事件源对象为bt按钮，则
					szEvtSource = "选择成功";
				}

				/*
				 * 另一种得到事件源对象名称的方法 szEvtSource = src.toString();
				 */

				Graphics g = getGraphics();
				draw(g);
			}

			// 在ButtonPanel上绘制事件信息
			public void draw(Graphics g) {
				String szMsg;
				szMsg = "您已经" + szEvtSource;
				g.drawString(szMsg, 110, 330);
			}

		});

		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);// 退出
			}
		});
		button2.addActionListener(new   ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			 
					 Object temp = e.getSource();
					 if(temp==button1){
						 new  TestMian();
						 new  TestMian().show(); 
					 }
	              else if(temp==button2){
	            	  new Course1();
					    new Course1().show(); 
	              }
							
						
					else{
							System.out.println("您的选择");
						}
			}
			
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	public static void main(String args[]) {
		new Chooseclass();
    // 
	}

}