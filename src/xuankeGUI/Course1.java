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

	// �������
//	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JCheckBox cb1, cb2, cb3;

	

	public Course1() {
		setTitle("ѧ��ѡ��"); // ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���ùر�ʱ�Ƴ�JVM
		setSize(500, 400); // ���ô��ڴ�С
		setLocationRelativeTo(null); // ���ô������
		contentPane = new JPanel(); // �������
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0)); // ���ò���
		setContentPane(contentPane);
		JPanel panel = new JPanel(new GridLayout(5, 1, 5, 10)); // 5��1�еı�񲼾�
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel, BorderLayout.CENTER); // ��panel��ӱ߿�
		// ��һ��
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		// �ڶ���
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		cb1 = new JCheckBox("001----�ߵ���ѧ--������");
		panel_2.add(cb1);

		// ������
		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		cb2 = new JCheckBox("002----��ɢ��ѧ--κޱ");
		panel_3.add(cb2);
		// ������
		JPanel panel_4 = new JPanel();
		panel.add(panel_4);
		cb3 = new JCheckBox("003----JAVA--������");
		panel_4.add(cb3);
		// ������
		JPanel panel_5 = new JPanel();
		panel.add(panel_5);
		JButton jbOk = new JButton("ȷ��");
		panel_5.add(jbOk);
		JButton jbRest = new JButton("ȡ��");
		panel_5.add(jbRest);
		// ���ѡ����Ϣ
		JPanel panelSouth = new JPanel();
		contentPane.add(panelSouth, BorderLayout.SOUTH);
		// ��ӱ���
		JPanel panelNorth = new JPanel();
		contentPane.add(panelNorth, BorderLayout.NORTH);
		JLabel labelTitle = new JLabel("ѧ��ѡ��");
		labelTitle.setForeground(Color.BLACK);
		panelNorth.add(labelTitle);

		// ��ȷ����ť����¼��������
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