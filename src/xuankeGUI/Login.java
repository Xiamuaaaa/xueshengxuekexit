package xuankeGUI;


import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
public class Login extends JFrame{
/**
 * 
 */
private JPanel jp1,jp2,jp3;  //�������
private JLabel User,Password;  //�����û����������ǩ
private JTextField user;  //�����ı����͵��û���
private JPasswordField passwordField; //��������
private JButton jb1,jb2,jb3;  //����������ť
public Login(){

                    //������Ӧ����
jp1 = new JPanel(new BorderLayout());   //�߽粼��  
jp2 = new JPanel(new GridLayout(3,4));   //���񲼾�
jp3 = new JPanel();

User = new JLabel("�û�����");
Password = new JLabel("���룺");


user = new JTextField(10);
passwordField = new JPasswordField(10);

jb1 = new JButton("��¼");
jb2 = new JButton("ע��");
jb3 = new JButton("ȡ��");
//�����Ӧ���
jp3.add(jb1);
jp3.add(jb2);
jp3.add(jb3);

jp2.add(User);
jp2.add(Password);
jp2.add(user);
jp2.add(passwordField);
jp1.add(jp2);
jp1.add(jp3,"South");
this.add(jp1);
int width = Toolkit.getDefaultToolkit().getScreenSize().width;
//��Ļ���(�߶�)��ȥ���ڿ��(�߶�)���ٳ���2���ͻ�ʹ��������Ļ������ʾ��
//this.getWidth()���ڻ�ȡ���ڵĿ�ȣ�
int height = Toolkit.getDefaultToolkit().getScreenSize().height;


this.setLocation(width/4-200, height/2-150);
//��Ӽ�����������ť�ᵯ���Ի���
 jb1.addActionListener(new ActionListener(){  
            @Override  
            public void actionPerformed(ActionEvent e) {  
            	if(user.getText().trim().length()==0||new String(passwordField.getPassword()).trim().length()==0){
					JOptionPane.showMessageDialog(null, "�û������벻����Ϊ��");
					return;
				}
				if(user.getText().trim().equals("Lily")&&new String(passwordField.getPassword()).trim().equals("2019322036")){
					JOptionPane.showMessageDialog(null, "��¼�ɹ�");
					new Chooseclass().show();
					
				}
				else{
					JOptionPane.showMessageDialog(null, "�û������������");
					
				}
			}

			@SuppressWarnings("deprecation")
			private void closeThis() {
				// TODO Auto-generated method stub
				jb1.disable();
			}
            });  


jb2.addActionListener(new ActionListener(){

@Override
public void actionPerformed(ActionEvent e){
Component frame = null;
JOptionPane.showMessageDialog(frame,  
                        "������ת...","��ܰ��ʾ",JOptionPane.INFORMATION_MESSAGE);  
               
//System.out.println("������ת...");
}

});
 jb3.addActionListener(new ActionListener(){  
            @Override  
            public void actionPerformed(ActionEvent e) {  
                System.exit(0);//�˳�
            }             
        });  


this.setTitle("��¼����");  //����
this.setSize(300, 180);  //���ڴ�С
this.setVisible(true);   //���ڿɼ�

this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);  //�رմ��ڰ�ť  ���Ͻǵ�X


}
public  static void main(String args[]){
	new   Login();
	
}
}


