import javax.swing.*;

public class Login2 extends JFrame {
	JPanel loginPanel = new JPanel();
	JLabel lblName = null;
	JLabel lblPwd = null;
	JTextField txtName=null;
	JPasswordField txtPwd=null;
	 static JButton btnLogin = null;
	 static JButton btnCancle = null;
	public  Login2() {
		super("登录");
		loginPanel.setLayout(null);

		//初始化标签对象
		lblName=new JLabel("用户名：");
		lblPwd=new JLabel("密码：");
		//初始化文本框对象
		txtName=new JTextField();
		txtPwd=new JPasswordField();
		//初始化按钮对象
		btnLogin=new JButton("登录");
		btnCancle=new JButton("取消");
		lblName.setBounds(10, 10, 120, 25);
		lblPwd.setBounds(10, 40, 120, 25);
		txtName.setBounds(140, 10, 120, 25);
		txtPwd.setBounds(140, 40 ,120, 25);
		loginPanel.add(lblName);
		loginPanel.add(lblPwd);
		loginPanel.add(txtName);
		loginPanel.add(txtPwd);
		loginPanel.add(btnLogin);
		loginPanel.add(btnCancle);
		btnLogin.setBounds(10, 80, 120, 25);
		btnCancle.setBounds(140, 80, 120, 25);
		this.getContentPane().add(loginPanel);
		this.setSize(300, 200);
		this.setResizable(false);
		this.setVisible(true);

	}
	public void login(){
		String statue[]=new String[]{"学生","教师","教授"};
		if(txtName.getText().equals("admin") && txtPwd.getText()
	.equals("admin")){
			int num=JOptionPane.showOptionDialog(this
	, "请选择您的身份", "选择"
	, JOptionPane. YES_NO_CANCEL_OPTION 
	, JOptionPane.INFORMATION_MESSAGE
	, null, statue, null);
			if(num >= 0){
				System.out.println("您以" + statue[num] 
	+ "身份登录系统");				
			}
		}else{
			JOptionPane.showMessageDialog(this
	, "您输入的用户名和密码不正确！"
	,"提示",JOptionPane.ERROR_MESSAGE);
		}
	}
	//退出方法的实现
	public void exit(){
		if(JOptionPane.showConfirmDialog(this
	, "您真的要退出吗？"
	,"退出",JOptionPane.YES_NO_OPTION
	,JOptionPane.QUESTION_MESSAGE
	)==JOptionPane.YES_OPTION){
			System.exit(0);
		}
	}
	public static void main(String[] args) {
		Login2 loginFrame=new Login2();
		
		BtnListener listener=new BtnListener(loginFrame);
		btnLogin.addActionListener(listener);
		btnCancle.addActionListener(listener);

	}



}
