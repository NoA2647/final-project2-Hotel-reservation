import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HotelShow {
	public static int num=0;
	public static void HotelShow()
	{
		JLabel l = new JLabel();
		l.setSize(850, 700);
		l.setVisible(true);
		l.setLayout(null);
		ImageIcon Button1= new ImageIcon("Pictures\\Hotel1.jpg");
		ImageIcon Button2= new ImageIcon("Pictures\\Hotel2.jpg");
		ImageIcon Button3= new ImageIcon("Pictures\\Hotel3.jpg");
		ImageIcon Button4= new ImageIcon("Pictures\\Hotel4.jpg");
		JFrame f = new JFrame();
		f.setVisible(true);
		f.setBounds(300, 20, 850, 700);
		f.setResizable(false);
		Image icon = Toolkit.getDefaultToolkit().getImage("Pictures\\images 1.jpg");
		f.setIconImage(icon);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton[] buttons= new JButton[9];
		for(int i=0; i<4;++i)
			buttons[i]=new JButton();
		buttons[0].setBounds(10, 20, 400, 300);
		buttons[1].setBounds(420, 20, 400, 300);
		buttons[2].setBounds(10, 350, 400, 300);
		buttons[3].setBounds(420, 350, 400, 300);
		buttons[0].setIcon(Button1);
		buttons[1].setIcon(Button2);
		buttons[2].setIcon(Button3);
		buttons[3].setIcon(Button4);
		buttons[0].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				num=0;
				HotelDetail.HotelDetail(num);
				f.dispose();
			}
		});
		buttons[1].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				num=1;
				HotelDetail.HotelDetail(num);
				f.dispose();
			}
		});
		buttons[2].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				num=2;
				HotelDetail.HotelDetail(num);
				f.dispose();
			}
		});
		buttons[3].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				num=3;
				HotelDetail.HotelDetail(num);
				f.dispose();
			}
		});
		for(int i=0; i<4;++i)
			l.add(buttons[i]);
		f.add(l);
	}
}
