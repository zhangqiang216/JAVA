import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;


public class frame {
	public static int num=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jframe=new JFrame();

		jframe.setSize(500,500);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setTitle("测试窗口");
		Container contentPane=jframe.getContentPane();
		
		JPanel jjj=new JPanel(new FlowLayout(FlowLayout.LEFT)
);
		jjj.setSize(200, 200);
		JLabel jlabel=new JLabel("0");
		jjj.add(jlabel);
		JButton button =new JButton();
		button.setSize(200, 200);
		button.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				num++;
				jlabel.setText(num+"");
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		jjj.add(button);
		JRadioButton j1=new JRadioButton("男");
		JRadioButton j2=new JRadioButton("女");
	
		ButtonGroup bg=new ButtonGroup();
		bg.add(j1);
		bg.add(j2);
		jjj.add(j1);
		jjj.add(j2);
		contentPane.add(jjj);
		JMenuBar jmenuBar=new JMenuBar();
		jframe.setJMenuBar(jmenuBar);
		JMenu jmenu1=new JMenu("file");
		JMenuItem item=new JMenuItem("new");
		jmenuBar.add(jmenu1);
		jmenu1.add(item);	
		jframe.setVisible(true);
//		JPopupMenu jpop=new JPopupMenu();
//		jpop.add(jmenu1);
//		jframe.addMouseListener(new MouseListener() {
//
//			@Override
//			public void mouseClicked(MouseEvent arg0) {
//				// TODO Auto-generated method stub
//				
//			}
//
//			@Override
//			public void mouseEntered(MouseEvent arg0) {
//				// TODO Auto-generated method stub
//				
//			}
//
//			@Override
//			public void mouseExited(MouseEvent arg0) {
//				// TODO Auto-generated method stub
//				
//			}
//
//			@Override
//			public void mousePressed(MouseEvent e) {
//				// TODO Auto-generated method stub
//				int mods=e.getModifiers();
//				if((mods&InputEvent.BUTTON3_MASK)!=0){
//				//调用show方法显示弹出式菜单
//				jpop.show(jframe,e.getX(),e.getY());
//				}
//			}
//
//			@Override
//			public void mouseReleased(MouseEvent arg0) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//		});
		
	}

}
