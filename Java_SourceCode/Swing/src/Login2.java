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
		super("��¼");
		loginPanel.setLayout(null);

		//��ʼ����ǩ����
		lblName=new JLabel("�û�����");
		lblPwd=new JLabel("���룺");
		//��ʼ���ı������
		txtName=new JTextField();
		txtPwd=new JPasswordField();
		//��ʼ����ť����
		btnLogin=new JButton("��¼");
		btnCancle=new JButton("ȡ��");
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
		String statue[]=new String[]{"ѧ��","��ʦ","����"};
		if(txtName.getText().equals("admin") && txtPwd.getText()
	.equals("admin")){
			int num=JOptionPane.showOptionDialog(this
	, "��ѡ���������", "ѡ��"
	, JOptionPane. YES_NO_CANCEL_OPTION 
	, JOptionPane.INFORMATION_MESSAGE
	, null, statue, null);
			if(num >= 0){
				System.out.println("����" + statue[num] 
	+ "��ݵ�¼ϵͳ");				
			}
		}else{
			JOptionPane.showMessageDialog(this
	, "��������û��������벻��ȷ��"
	,"��ʾ",JOptionPane.ERROR_MESSAGE);
		}
	}
	//�˳�������ʵ��
	public void exit(){
		if(JOptionPane.showConfirmDialog(this
	, "�����Ҫ�˳���"
	,"�˳�",JOptionPane.YES_NO_OPTION
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
