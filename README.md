# xueshengxuekexit
* 分析学生选课系统

## 综合性实验  学生选课系统设计
### 一、实验目的
* 分析学生选课系统
* 使用GUI窗体及其组件设计窗体界面
* 完成学生选课过程业务逻辑编程
* 基于文件保存并读取数据
* 处理异常

### 二、实验要求
* 1、设计GUI窗体，支持学生注册、课程新加、学生选课、学生退课、打印学生选课列表等操作。
* 2、基于事件模型对业务逻辑编程，实现在界面上支持上述操作。
* 3、针对操作过程中可能会出现的各种异常，做异常处理
* 4、基于输入/输出编程，支持学生、课程、教师等数据的读写操作。

### 三、实验过程
* 1.打开Eclipse软件，新建Project名为xuankeGUI，再在包xuankeGUI中新建class名为Login。
* 2.首先定义面板jp1,jp2,jp3，和相关的JLabel、JTextField、JPasswordField、JButton。
* 3.并将三个其声明，设置为边界布局、设置相关的JLabel用户名、密码，把按钮设置为确定、
注册、取消。
* 4.当你在弹出框输入正确的用户名密码时，则会弹出“登录成功”的消息框，否则就会弹出“用户名密码不允许为空”或是“用户名或密码错误”的消息框。
* 5.当你登录成功后，会弹出你的选择，是开课、选课、退课还是打印信息。当你选择开课时，则会进入到开课信息系统，
点击选课，则会进入到选课信息系统里面。
* 6.最后在原有的基础上加入异常事件即可。

### 四、核心代码和注释
```javascript
Login中
jb1.addActionListener(new ActionListener(){  
            @Override  //Login中的确定按钮单击事件
            public void actionPerformed(ActionEvent e) {  
                if(user.getText().trim().length()==0||new String(passwordField.getPassword()).trim().length()==0){
					JOptionPane.showMessageDialog(null, "用户名密码不允许为空");
					return;//用户名或者密码为空
				}
				if(user.getText().trim().equals("Lily")&&new String(passwordField.getPassword()).trim().equals("2019322036")){
					JOptionPane.showMessageDialog(null, "登录成功");
					new Chooseclass().show();
					//登录成功，跳转到选择界面
				}
				else{
					JOptionPane.showMessageDialog(null, "用户名或密码错误");
					//用户名或者密码输入错误
				}
			}

			@SuppressWarnings("deprecation")
			private void closeThis() {
				// TODO Auto-generated method stub
				jb1.disable();
			}
            });  

//Chooseclass中的确定按钮单击事件
button2.addActionListener(new ActionListener() {
    		@Override  
			public void actionPerformed(ActionEvent etv) {
				// TODO Auto-generated method stub
				// 得到事件源对象
				Object src = etv.getSource();

				if (src.equals(button2)) { // 如果事件源对象为bt按钮，则
					szEvtSource = "选择成功";
				} //当确定按钮点击时，会出现选择成功

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
        button2.addActionListener(new   ActionListener() {
    		
			@Override    //确定按钮单击事件
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			 
					 Object temp = e.getSource();
					 if(temp==bt1){
						 new  TestMian();
						 new  TestMian().show(); 
					 }//点击开课时，回跳转到开课界面
	              else if(temp==bt2){
	            	  new Course1();
					    new Course1().show(); 
	              }//点击选课时，回跳转到选课界面
            else{
    						System.out.println("您的选择");
						}
        public void mouseReleased(MouseEvent e) {
				// 鼠标松开
				int row = table.getSelectedRow();
				seletd = person.get(row);
				if (row != -1) {
					textField.setText(seletd.getFid());
					textField_1.setText(seletd.getFname());
					textField_2.setText(seletd.getFage() + "");
					textField.setEnabled(false);
				}

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// 鼠标点下

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// 鼠标移出

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// 鼠标移入

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// 鼠标点了一下

			}
		});
		scrollPane.setViewportView(table);
		scrollPane.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// 点击表格空白处，输入框清空，序号无法选择
				// TODO 自动生成的方法存根
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField.setEnabled(true);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO 自动生成的方法存根

			}
		});
		addWindowListener(new WindowListener() {

			@Override
			public void windowOpened(WindowEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void windowIconified(WindowEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO 自动生成的方法存根

			}

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO 自动生成的方法存根
				int i = JOptionPane.showConfirmDialog(null, "是否保存数据");
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
						// TODO 自动生成的 catch 块
						e1.printStackTrace();
					} finally {
						try {
							oos.close();
						} catch (IOException e1) {
							// TODO 自动生成的 catch 块
							e1.printStackTrace();
						}
						try {
							os.close();
						} catch (IOException e1) {
							// TODO 自动生成的 catch 块
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
				// TODO 自动生成的方法存根

			}

			@Override
			public void windowActivated(WindowEvent e) {
				// TODO 自动生成的方法存根

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
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} finally {
			try {
				ois.close();
			} catch (IOException e1) {
				// TODO 自动生成的 catch 块
				e1.printStackTrace();
			}
			try {
				is.close();
			} catch (IOException e1) {
				// TODO 自动生成的 catch 块
				e1.printStackTrace();
			}
		}
		getinfo();

	}

	// 修改
	public void modify() {
		String aid = textField.getText();
		String naem = textField_1.getText();
		String age = textField_2.getText();
		seletd.setFid(aid);
		seletd.setFname(naem);
		seletd.setFage(Integer.parseInt(age));
		getinfo();

	}

	// 增加
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

	// 刷新
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

							
						
```	
### 五、系统运行结果
![Image text](https://raw.githubusercontent.com/Xiamuaaaa/xueshengxuekexit/master/%E5%BE%AE%E4%BF%A1%E6%88%AA%E5%9B%BE_20191208171648%20(1).jpg)
![Image text](https://raw.githubusercontent.com/Xiamuaaaa/xueshengxuekexit/master/%E5%BE%AE%E4%BF%A1%E6%88%AA%E5%9B%BE_20191208171648%20(2).jpg)
![Image text](https://raw.githubusercontent.com/Xiamuaaaa/xueshengxuekexit/master/%E5%BE%AE%E4%BF%A1%E6%88%AA%E5%9B%BE_20191208171648%20(3%20(1).jpg)
![Image text](https://raw.githubusercontent.com/Xiamuaaaa/xueshengxuekexit/master/%E5%BE%AE%E4%BF%A1%E6%88%AA%E5%9B%BE_20191208171648%20(3%20(2).jpg)
![Image text](https://raw.githubusercontent.com/Xiamuaaaa/xueshengxuekexit/master/%E5%BE%AE%E4%BF%A1%E6%88%AA%E5%9B%BE_20191208171648%20(3%20(3).jpg)
![Image text](https://raw.githubusercontent.com/Xiamuaaaa/xueshengxuekexit/master/%E5%BE%AE%E4%BF%A1%E6%88%AA%E5%9B%BE_20191208171648%20(3%20(4).jpg)
### 六、实验心得
* 在这次实验中，是基于这学期所学课程进行的一次综合性实验，是检验我们对本学期的知识进行掌握，
也是让我们对本学期的知识有了系统的理解。综合本学期知识，将其运用到学生选课系统当中，使我对String、
异常、GUI有了更加深刻的印象。也让我对于它们的使用更加熟练。对于逻辑运用也有了更加深刻的印象。
使我更加进步。


