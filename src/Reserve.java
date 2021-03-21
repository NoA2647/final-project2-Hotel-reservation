import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;

public class Reserve {
	public static  void Reserve(int num)
	{
		JLabel l = new JLabel();
		l.setSize(600, 400);
		l.setVisible(true);
		l.setLayout(null);
		JFrame f = new JFrame();
		f.setVisible(true);
		f.setBounds(300, 225, 450, 300);
		f.setResizable(false);
		Image icon = Toolkit.getDefaultToolkit().getImage("Pictures\\images 1.jpg");
		f.setIconImage(icon);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		JButton b = new JButton("show reserve");
		b.setBounds(250, 50, 150, 50);
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ListOfReserve.ShowReserve();
				
			}
		});
		String data[][]= {{"Room101",String.valueOf(Hotel.readAllHotels().get(num).rooms.get(0).R101)},
				{"Room102",String.valueOf(Hotel.readAllHotels().get(num).rooms.get(0).R102)},
				{"Room103",String.valueOf(Hotel.readAllHotels().get(num).rooms.get(0).R103)},
				{"Room104",String.valueOf(Hotel.readAllHotels().get(num).rooms.get(0).R104)},
				{"Room105",String.valueOf(Hotel.readAllHotels().get(num).rooms.get(0).R105)}};
		String column[]={"Rooms","Is Empty?"};
		JTable jt=new JTable(data,column);
		jt.setBounds(30,40,200,100);
		jt.enable(false);
		JScrollPane sp=new JScrollPane(jt);
		sp.setSize(200, 100);
		String choice[][]= {{"",""}};
		String choose[]= {"Date for Exit","NO.Room"};
		JTable jt1= new JTable(choice,choose);
		JScrollPane sp1 = new JScrollPane(jt1);
		sp1.setBounds(100, 150, 200, 38);
		JButton b1 =  new JButton("set");
		b1.setBounds(150, 200, 80, 30);
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Integer.parseInt(choice[0][0])>0&&Integer.parseInt(choice[0][0])<15)
				{
					if(Integer.parseInt(choice[0][1])==101||Integer.parseInt(choice[0][1])==102||Integer.parseInt(choice[0][1])==103||Integer.parseInt(choice[0][1])==104||Integer.parseInt(choice[0][1])==105)
					{
						String x= "R"+choice[0][1];
						
						if(Check.CheckRoom(num, x))
						{
							JOptionPane.showMessageDialog(null, "Your Room reserves", "set room", JOptionPane.INFORMATION_MESSAGE);
							Hotel.EditRooms(num, x);
							ListOfReserve person=new ListOfReserve(Hotel.readAllHotels().get(num).Name+","+choice[0][1], Integer.parseInt(choice[0][0]));
							ListOfReserve.AddReserve(person);
						}
						else
							JOptionPane.showMessageDialog(null, "Your Room is full\nplease choose another Room", "Error", JOptionPane.ERROR_MESSAGE);
					}		
					else
						{
						JOptionPane.showMessageDialog(null, "Please set your No.Room in: \n{101,102,103,104,105}", "Error", JOptionPane.ERROR_MESSAGE);
						}
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Please set your date between 1 to 14", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		l.add(b);
		l.add(b1);
		l.add(sp1);
		l.add(sp);
		f.add(l);
	}
}
