import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Main {
	
	public static void main(String[] args) {
		JLabel l = new JLabel();
		l.setSize(450, 300);
		l.setVisible(true);
		l.setLayout(null);
		ImageIcon background = new ImageIcon("Pictures\\images.jpg"); 
		l.setIcon(background);
		JFrame f = new JFrame();
		f.setVisible(true);
		f.setBounds(300, 225, 450, 300);
		f.setResizable(false);
		Image icon = Toolkit.getDefaultToolkit().getImage("Pictures\\images 1.jpg");
		f.setIconImage(icon);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTextField A1=new JTextField("Family");
		JTextField B1=new JTextField("NO.BC");
		JTextField A2=new JTextField();
		JTextField B2=new JTextField();
		f.setLayout(null);
		A1.setBounds(80, 120, 45, 25);
		B1.setBounds(300, 120, 45, 25);
		A2.setBounds(15,150,200,30);
		B2.setBounds(230,150,200,30);
		JButton b1=new JButton("Enter");
		b1.setBounds(100, 200, 90, 35);
		JButton b2=new JButton("Invite");
		b2.setBounds(235, 200, 90, 35);
		A1.setEditable(false);
		B1.setEditable(false);
		b1.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				if(Comparison.Comparison(A2.getText(), Integer.parseInt(B2.getText())))
				{
					JOptionPane.showMessageDialog(null, "Your Welcome", "Enter", JOptionPane.INFORMATION_MESSAGE);
					HotelShow.HotelShow();
					f.dispose();
				}
				else
					JOptionPane.showMessageDialog(null, "This person doesnt exist", "Enter", JOptionPane.ERROR_MESSAGE);
				
			}
		});
		b2.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				Enrollment.Enrollment();
				f.dispose();
			}
		});
		l.add(A1);
		l.add(A2);
		l.add(B1);
		l.add(B2);
		l.add(b1);
		l.add(b2);
		f.add(l);
	}
}
