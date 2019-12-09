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
private JPanel jp1,jp2,jp3;  //定义面板
private JLabel User,Password;  //定义用户名和密码标签
private JTextField user;  //定义文本类型的用户名
private JPasswordField passwordField; //定义密码
private JButton jb1,jb2,jb3;  //定义三个按钮
public Login(){

                    //创建相应对象
jp1 = new JPanel(new BorderLayout());   //边界布局  
jp2 = new JPanel(new GridLayout(3,4));   //网格布局
jp3 = new JPanel();

User = new JLabel("用户名：");
Password = new JLabel("密码：");


user = new JTextField(10);
passwordField = new JPasswordField(10);

jb1 = new JButton("登录");
jb2 = new JButton("注册");
jb3 = new JButton("取消");
//添加相应组件
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
//屏幕宽度(高度)减去窗口宽度(高度)后，再除以2，就会使窗口在屏幕居中显示了
//this.getWidth()用于获取窗口的宽度，
int height = Toolkit.getDefaultToolkit().getScreenSize().height;


this.setLocation(width/4-200, height/2-150);
//添加监听器，按按钮会弹出对话框
 jb1.addActionListener(new ActionListener(){  
            @Override  
            public void actionPerformed(ActionEvent e) {  
            	if(user.getText().trim().length()==0||new String(passwordField.getPassword()).trim().length()==0){
					JOptionPane.showMessageDialog(null, "用户名密码不允许为空");
					return;
				}
				if(user.getText().trim().equals("Lily")&&new String(passwordField.getPassword()).trim().equals("2019322036")){
					JOptionPane.showMessageDialog(null, "登录成功");
					new Chooseclass().show();
					
				}
				else{
					JOptionPane.showMessageDialog(null, "用户名或密码错误");
					
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
                        "正在跳转...","温馨提示",JOptionPane.INFORMATION_MESSAGE);  
               
//System.out.println("正在跳转...");
}

});
 jb3.addActionListener(new ActionListener(){  
            @Override  
            public void actionPerformed(ActionEvent e) {  
                System.exit(0);//退出
            }             
        });  


this.setTitle("登录窗口");  //标题
this.setSize(300, 180);  //窗口大小
this.setVisible(true);   //窗口可见

this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);  //关闭窗口按钮  右上角的X


}
public  static void main(String args[]){
	new   Login();
	
}
}


