import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.*;

public class Login extends JFrame {
	JPanel panel = new JPanel();
	ButtonGroup radio_group = new ButtonGroup();
	JLabel name_label;
	JTextField name_text;
	JLabel pass_label;
	JPasswordField pass_text;
	JLabel repass_label;
	JPasswordField repass_text;
	JLabel sex_lable;
	JRadioButton sex_selection1;
	JRadioButton sex_selection2;
	JLabel hobby_lable;
	JCheckBox hobby_basketball;
	JCheckBox hobby_football;
	JCheckBox hobby_pingpang;
	JLabel cource_lable;
	JComboBox<String> course_box;
	JLabel info_lable;
	JTextArea info_area;
	JButton ok_button;
	JButton reset_button;
	public Login(){
		panel.setLayout(null);
		name_label = new JLabel("�û���:");
		name_text = new JTextField();//������д����
		pass_label = new JLabel("����:");
		pass_text = new JPasswordField();//������д����
		repass_label = new JLabel("ȷ������:");
		repass_text = new JPasswordField();//������дȷ������
		sex_lable = new JLabel("�Ա�");
		sex_selection1 = new JRadioButton("��");
		sex_selection2 = new JRadioButton("Ů");
		hobby_lable = new JLabel("���ã�");
		hobby_basketball = new JCheckBox("����");
		hobby_football = new JCheckBox("����");
		hobby_pingpang = new JCheckBox("ƹ����");
		cource_lable = new JLabel("ѡ�޿γ�:");
		course_box = new JComboBox<String>();//������ʾѡ����Ϣ
		info_lable = new JLabel("���˼��");
		info_area = new JTextArea(5,20);
		ok_button = new JButton("ȷ��");
		reset_button = new JButton("����");
		name_label.setBounds(20, 10, 50, 30);
		name_text.setBounds(80, 10, 100, 30);
		pass_label.setBounds(25,50,50,30);
		pass_text.setBounds(80,50,100,30);
		pass_text.setEchoChar('*');
		repass_label.setBounds(10,90,60,30);
		repass_text.setBounds(80,90,100,30);
		sex_lable.setBounds(20, 130, 50, 30);
		sex_selection1.setBounds(80,130,40,30);
		sex_selection2.setBounds(130,130,40,30);
		hobby_lable.setBounds(20, 160, 50, 30);
		hobby_basketball.setBounds(80, 160, 60, 30);
		hobby_football.setBounds(150, 160, 60, 30);
		hobby_pingpang.setBounds(220, 160, 80, 30);
		cource_lable.setBounds(20, 190, 70, 30);
		course_box.setBounds(100, 190, 100, 30);
		info_lable.setBounds(20, 220, 100, 30);
		ok_button.setBounds(30, 380, 80, 30);
		reset_button.setBounds(140, 380, 80, 30);
		info_area.setLineWrap(true); JScrollPane jsp = new JScrollPane(info_area);
		jsp.setBounds(20, 260, 200, 100);
		panel.add(jsp);
		course_box.insertItemAt("JAVA", 0);
		course_box.insertItemAt("c#", 1);
		course_box.insertItemAt("OS", 2);
		ok_button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String str = "";			
				if(!name_text.getText().equals("")&& 
						!pass_text.getPassword().toString().equals("")	&&
						!repass_text.getPassword().toString().equals("")){
					if(Arrays.equals(pass_text.getPassword(), repass_text.getPassword()))
					{
						str += "�û�����" +name_text.getText() + "\n" +
								"�Ա�" + (sex_selection1.isSelected()?"��":"") + (sex_selection2.isSelected()?"Ů":"")+"\n" + 
								"���ã�"+(hobby_basketball.isSelected()?"����":"")+(hobby_football.isSelected()?"����":"")+(hobby_pingpang.isSelected()?"ƹ����":"")+"\n" + 
								"ѡ�޿γ̣�" +course_box.getItemAt(course_box.getSelectedIndex()) + "\n"+ 
								"���˼��:" +info_area.getText();
					}
					else
					{
						str = "������������벻һ����";
					}
				}
				else
				{
					str = "�������Ҫ����Ϣ��";
				}
				JOptionPane.showConfirmDialog(null, str, "���������Ϣ", JOptionPane.CLOSED_OPTION);
			}

			
		});
		reset_button.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				name_text.setText("");
				pass_text.setText("");
				repass_text.setText("");
				radio_group.clearSelection();
				course_box.setSelectedIndex(-1);
				info_area.setText("");
				hobby_basketball.setSelected(false);
				hobby_football.setSelected(false);
				hobby_pingpang.setSelected(false);
			}
		});
		radio_group.add(sex_selection1);
		radio_group.add(sex_selection2);
		panel.add(name_label);panel.add(name_text);
		panel.add(pass_label);panel.add(pass_text);
		panel.add(repass_label);panel.add(repass_text);panel.add(sex_lable);panel.add(sex_selection1);
		panel.add(sex_selection2);panel.add(hobby_lable);
		panel.add(hobby_basketball);panel.add(hobby_football);
		panel.add(hobby_pingpang);panel.add(cource_lable);
		panel.add(course_box);panel.add(info_lable);
		panel.add(ok_button);panel.add(reset_button);
		this.add(panel);
		this.setResizable(false);
		this.setBounds(300, 300, 400, 500);
		this.setVisible(true);







	}
	public static void main(String[] args){
		new Login();
	}



}
