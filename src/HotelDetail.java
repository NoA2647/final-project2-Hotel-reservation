import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class HotelDetail {
	public static void HotelDetail(int num)
	{
		JLabel l = new JLabel();
		l.setSize(450, 300);
		l.setVisible(true);
		l.setLayout(null);
		JFrame f = new JFrame();
		f.setVisible(true);
		f.setBounds(300, 225, 450, 300);
		f.setResizable(false);
		ImageIcon background= new ImageIcon("Pictures\\"+(num+1)+".jpg");
		l.setIcon(background);
		Image icon = Toolkit.getDefaultToolkit().getImage("Pictures\\images 1.jpg");
		f.setIconImage(icon);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTextArea[] details = new JTextArea[18];
		JButton ReserveButton = new JButton();
		ReserveButton.setBounds(160, 200, 100, 50);
		ImageIcon button= new ImageIcon("Pictures\\button.jpg");
		ReserveButton.setIcon(button);
		ReserveButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Reserve.Reserve(num);
				f.dispose();
			}
		});
		for(int i =0; i <5;i++)
		{
			details[i]= new JTextArea();
			details[i].setBounds(5, 30*i+10, 50, 20);
		}
		for(int i =5; i <9;i++)
		{
			details[i]= new JTextArea();
			details[i].setBounds(210, 30*(i-5)+10, 50, 20);
		}
		for(int i =9; i <14;i++)
		{
			details[i]= new JTextArea();
			details[i].setBounds(60, 30*(i-9)+10, 110, 20);
		}
		for(int i =14; i <18;i++)
		{
			details[i]= new JTextArea();
			details[i].setBounds(265, 30*(i-14)+10, 110, 20);
		}
		details[0].setText(Hotel.KEY_NAME);
		details[1].setText(Hotel.KEY_STARS);
		details[2].setText(Hotel.KEY_NO);
		details[3].setText(Hotel.KEY_STATE);
		details[4].setText(Hotel.KEY_CITY);
		details[5].setText(Hotel.KEY_ADRREESS);
		details[6].setText(Hotel.KEY_PHONE);
		details[7].setText(Hotel.KEY_PARKING);
		details[8].setText(Hotel.KEY_INTERNET);
		details[9].setText(Hotel.readAllHotels().get(num).Name);
		details[10].setText(String.valueOf(Hotel.readAllHotels().get(num).Stars));
		details[11].setText(String.valueOf(Hotel.readAllHotels().get(num).NO));
		details[12].setText(Hotel.readAllHotels().get(num).State);
		details[13].setText(Hotel.readAllHotels().get(num).City);
		details[14].setText(Hotel.readAllHotels().get(num).Address);
		details[15].setText(String.valueOf(Hotel.readAllHotels().get(num).Phone));
		details[16].setText(String.valueOf(Hotel.readAllHotels().get(num).Parking));
		details[17].setText(String.valueOf(Hotel.readAllHotels().get(num).Internet));
		for(int i = 0; i < 18; i++)
		{
			details[i].setEditable(false);
			l.add(details[i]);
		}
		l.add(ReserveButton);
		f.add(l);
	}
}
