import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener{
	public void showButton() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton button = new JButton();
		frame.add(button);
		frame.pack();
		button.addActionListener((ActionListener) this);
		 int rand = new Random().nextInt(5);
		 if(rand==1) {
			 JOptionPane.showMessageDialog(null, "You will live a long time.");
		 }
		 if(rand==2) {
			JOptionPane.showMessageDialog(null, "You will be happy for the rest of your life."); 
		 } 
		 if(rand==3) {
			 JOptionPane.showMessageDialog(null, "Nothing bad will ever happen to you.");
		 }
		 if(rand==4) {
			 JOptionPane.showMessageDialog(null, "You will find your passion soon!");
		 }
		 if(rand==5) {
			 JOptionPane.showMessageDialog(null, "You will become the smartest person alive.");
		 }
        System.out.println("Button clicked");
   }

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "Woohoo");
	}
}	

	


