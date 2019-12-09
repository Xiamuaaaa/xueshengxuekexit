package xuankeGUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class Course1 extends JFrame {

	// 定义组件
//	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JCheckBox cb1, cb2, cb3;

	

	public Course1() {
		setTitle("学生选课"); // 标题
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置关闭时推出JVM
		setSize(500, 400); // 设置窗口大小
		setLocationRelativeTo(null); // 设置窗体居中
		contentPane = new JPanel(); // 内容面板
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0)); // 设置布局
		setContentPane(contentPane);
		JPanel panel = new JPanel(new GridLayout(5, 1, 5, 10)); // 5行1列的表格布局
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel, BorderLayout.CENTER); // 给panel添加边框
		// 第一行
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		// 第二行
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		cb1 = new JCheckBox("001----高等数学--任正民");
		panel_2.add(cb1);

		// 第三行
		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		cb2 = new JCheckBox("002----离散数学--魏薇");
		panel_3.add(cb2);
		// 第四行
		JPanel panel_4 = new JPanel();
		panel.add(panel_4);
		cb3 = new JCheckBox("003----JAVA--张世博");
		panel_4.add(cb3);
		// 第五行
		JPanel panel_5 = new JPanel();
		panel.add(panel_5);
		JButton jbOk = new JButton("确定");
		panel_5.add(jbOk);
		JButton jbRest = new JButton("取消");
		panel_5.add(jbRest);
		// 添加选课信息
		JPanel panelSouth = new JPanel();
		contentPane.add(panelSouth, BorderLayout.SOUTH);
		// 添加标题
		JPanel panelNorth = new JPanel();
		contentPane.add(panelNorth, BorderLayout.NORTH);
		JLabel labelTitle = new JLabel("学生选课");
		labelTitle.setForeground(Color.BLACK);
		panelNorth.add(labelTitle);

		// 给确定按钮添加事件处理代码
		jbOk.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});
	}
	public static void main(String args[]) {
	new    Course1();
	}

}