package xuankeGUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class TestMian extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;
	private List<Person> person = new ArrayList<Person>();
	private String[] columnNames = { "ID��", "�γ���", "�ο���ʦ" };
	private Person seletd;

	TestMian() {
		setSize(1200, 2000);
		setVisible(true);
		setTitle("ѧ��ѡ��ϵͳ");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100, 595, 620);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// setBounds(int x,int y,width,heigth)
		JLabel label = new JLabel("�γ̺�:");
		label.setBounds(14, 13, 50, 24);
		contentPane.add(label);

		// setBounds(int x,int y,width,heigth)
		textField = new JTextField();
		textField.setBounds(60, 13, 90, 24);
		contentPane.add(textField);
		textField.setColumns(10);
        
		
		// setBounds(int x,int y,width,heigth)
		JLabel label_1 = new JLabel("�γ���:");
		label_1.setBounds(170, 13, 50, 24);
		contentPane.add(label_1);
        
		// setBounds(int x,int y,width,heigth)
		textField_1 = new JTextField();
		textField_1.setBounds(230, 13, 90, 24);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
        
		// setBounds(int x,int y,width,heigth)
		JLabel label_2 = new JLabel("�ο���ʦ");
		label_2.setBounds(350, 13, 70, 24);
		contentPane.add(label_2);
        
		// setBounds(int x,int y,width,heigth)
		textField_2 = new JTextField();
		textField_2.setBounds(420, 13, 90, 24);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
        
		// setBounds(int x,int y,width,heigth)
		JButton button = new JButton("����");
		button.setBounds(520, 13, 86, 27);
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				add();
			}

		});
		contentPane.add(button);

		JButton button_1 = new JButton("ɾ��");
		button_1.setBounds(620, 13, 80, 27);
		button_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int row = table.getSelectedRow();
				System.out.println(row);
				int a = table.getSelectedRows().length;
				System.out.println(a);
				if (row != -1) {
					for (int i = 0; i < a; i++) {

						person.remove(row);

					}
				}
				getinfo();
			}
		});
		contentPane.add(button_1);

		JButton button_2 = new JButton("����");
		button_2.setBounds(720, 13, 80, 27);
		button_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				modify();
			}
		});
		contentPane.add(button_2);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(14, 78, 549, 468);
		contentPane.add(scrollPane_1);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane_1.setViewportView(scrollPane);

		table = new JTable();
		table.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// ����ɿ�
				int row = table.getSelectedRow();
				seletd = person.get(row);
				if (row != -1) {
					textField.setText(seletd.getFid());
					textField_1.setText(seletd.getFname());
					textField_2.setText(seletd.getFage() + " ");
					textField.setEnabled(false);
				}

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// ������

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// ����Ƴ�

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// �������

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// ������һ��

			}
		});
		scrollPane.setViewportView(table);
		scrollPane.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// ������հ״����������գ�����޷�ѡ��
				// TODO �Զ����ɵķ������
				textField.setText(" ");
				textField_1.setText(" ");
				textField_2.setText(" ");
				textField.setEnabled(true);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO �Զ����ɵķ������

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO �Զ����ɵķ������

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO �Զ����ɵķ������

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO �Զ����ɵķ������

			}
		});
		addWindowListener(new WindowListener() {

			@Override
			public void windowOpened(WindowEvent e) {
				// TODO �Զ����ɵķ������

			}

			@Override
			public void windowIconified(WindowEvent e) {
				// TODO �Զ����ɵķ������

			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO �Զ����ɵķ������

			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO �Զ����ɵķ������

			}

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO �Զ����ɵķ������
				int i = JOptionPane.showConfirmDialog(null, "�Ƿ񱣴�����");
				switch (i) {
				case 0:
					OutputStream os = null;
					ObjectOutputStream oos = null;
					try {
						os = new FileOutputStream("an.data");
						oos = new ObjectOutputStream(os);
						for (Person pp : person) {
							oos.writeObject(pp);
						}
					} catch (Exception e1) {
						// TODO �Զ����ɵ� catch ��
						e1.printStackTrace();
					} finally {
						try {
							oos.close();
						} catch (IOException e1) {
							// TODO �Զ����ɵ� catch ��
							e1.printStackTrace();
						}
						try {
							os.close();
						} catch (IOException e1) {
							// TODO �Զ����ɵ� catch ��
							e1.printStackTrace();
						}
					}
					System.exit(0);
					break;
				case 1:
					System.exit(0);
					break;
				case 2:

					break;

				default:
					break;
				}

			}

			@Override
			public void windowClosed(WindowEvent e) {
				// TODO �Զ����ɵķ������

			}

			@Override
			public void windowActivated(WindowEvent e) {
				// TODO �Զ����ɵķ������

			}
		});
		InputStream is = null;
		ObjectInputStream ois = null;

		try {
			is = new FileInputStream("D:\b.txt");
			ois = new ObjectInputStream(is);
			while (true) {
				Person p = (Person) ois.readObject();
				person.add(p);
			}
		} catch (EOFException e1) {

		} catch (Exception e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} finally {
			try {
				ois.close();
			} catch (IOException e1) {
				// TODO �Զ����ɵ� catch ��
				e1.printStackTrace();
			}
			try {
				is.close();
			} catch (IOException e1) {
				// TODO �Զ����ɵ� catch ��
				e1.printStackTrace();
			}
		}
		getinfo();

	}

	// �޸�
	public void modify() {
		String aid = textField.getText();
		String naem = textField_1.getText();
		String age = textField_2.getText();
		seletd.setFid(aid);
		seletd.setFname(naem);
		seletd.setFage(Integer.parseInt(age));
		getinfo();

	}

	// ����
	public void add() {
		String aid = textField.getText();
		String naem = textField_1.getText();
		String age = textField_2.getText();
		Person p = new Person(aid, naem, Integer.parseInt(age));
		person.add(p);
		getinfo();
		textField.setText("");
		textField_1.setText("");
		textField_2.setText("");
	}

	// ˢ��
	public void getinfo() {
		System.out.println(person);
		Object[][] tableValues = new Object[person.size()][];
		for (int i = 0; i < person.size(); i++) {
			Person p1 = person.get(i);
			System.out.println(p1);
			Object[] ff = { p1.getFid(), p1.getFname(), p1.getFage() };
			System.out.println(Arrays.toString(ff));
			tableValues[i] = ff;
		}
		table.setModel(new DefaultTableModel(tableValues, columnNames));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
