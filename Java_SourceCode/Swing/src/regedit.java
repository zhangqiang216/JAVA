import javax.swing.JFrame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class regedit extends JFrame {
	private JPanel jpContainer=new JPanel();
	private JLabel jlUser;
	private JTextField jfUser;
	private JLabel jlPassword;
	private JPasswordField jpPassword;
	private JLabel jlPWDSure;
	private JPasswordField jpPWDSure;
	private JLabel jlRemark;//������ʾ��ע
	private JTextArea jaRemark;//���ڽ����û�����ĸ��˼����Ϣ
	private JLabel result;
	private JButton jbInsert1;//ע�������
	private JButton jbInsert2;
	public regedit(){
		jpContainer.setLayout(null);
		jlUser=new JLabel("�û�����");
		jlPassword=new JLabel("���룺");
		jlPWDSure=new JLabel("ȷ�����룺");
		jlRemark=new JLabel("���˼��");
		jfUser=new JTextField();jpPassword=new JPasswordField();
		jpPWDSure=new JPasswordField();
		jaRemark=new JTextArea(4,25); result =new JLabel("  ");
		jbInsert1=new JButton("ע��");
		jbInsert2=new JButton("����");
		jpPassword.setEchoChar('*');
		jpPWDSure.setEchoChar('*');
		jlUser.setBounds(20, 20, 70, 20);
		jfUser.setBounds(100, 20, 100, 20); 
		jlPassword.setBounds(20, 60, 70, 20);
		jlPWDSure.setBounds(20, 100, 70, 30);
		jpPassword.setBounds(100, 60, 100, 20);		
		jpPWDSure.setBounds(100, 100, 100, 20);
		jlRemark.setBounds(20, 140, 70, 20);
		jaRemark.setLineWrap(true);//�Զ�����
		
		result.setBounds(20,350,400,100);
		result.setBorder(BorderFactory.createLineBorder(Color.blue,2));
		jbInsert1.setBounds(40, 290, 100, 20);
		jbInsert2.setBounds(200, 290, 100, 20);
		JScrollPane jsp = new JScrollPane(jaRemark);
		jsp.setBounds(20, 180, 200, 100);
		jpContainer.add(jsp);
		jbInsert1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String strs = "";
				String str1=jlUser.getText().toString();
				String str2=jpPassword.getText().toString();
				String str3=jpPWDSure.getText().toString();
				if(str1.equals("")||str2.equals("")||str3.equals("")){
					strs+="�뽫��Ϣ��д����";
					}
					else if(!str2.equals(str3)) {
						strs+="�������벻һ��";
					}
					else{
						strs+="ע��ɹ�";
					}
					result.setText(strs);


			}
			
		});
		jbInsert2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jfUser.setText("");
				jpPassword.setText("");
				jpPWDSure.setText("");
				jaRemark.setText("");
				result.setText("");
			}
		});
		jpContainer.add(jlUser);
		jpContainer.add(jlPassword);//�����ǩ
		jpContainer.add(jlPWDSure);//ȷ�������ǩ
		jpContainer.add(jfUser);jpContainer.add(jpPassword);
		jpContainer.add(jpPWDSure);jpContainer.add(jlRemark);
		jpContainer.add(jaRemark);jpContainer.add(result);
		jpContainer.add(jbInsert1);jpContainer.add(jbInsert2);
		this.setBounds(200,200,500,500);
		this.setVisible(true);
		this.setResizable(false);
		this.add(jpContainer);








	}
	public static void main(String[] args){
		new regedit();
	}




}
