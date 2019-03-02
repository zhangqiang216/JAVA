import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BtnListener implements ActionListener {
	Login2 loginFrame;
	public BtnListener(Login2 loginFrame){
		this.loginFrame=loginFrame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("µÇÂ¼")){
			loginFrame.login();
		}else if(e.getActionCommand().equals("È¡Ïû")){
			loginFrame.exit();
		}

	}
	


}
