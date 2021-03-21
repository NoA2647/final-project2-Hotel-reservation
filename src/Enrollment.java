import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Enrollment {
	public static void Enrollment()
	{
		JFrame f = new JFrame();
		f.setVisible(true);
		f.setBounds(300, 200, 325, 450);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTextField A1=new JTextField("Name");
		JTextField B1=new JTextField("Family");
		JTextField C1=new JTextField("NO.BC");
		JTextField D1=new JTextField("Home Phone");
		JTextField E1=new JTextField("Cell Phone");
		JTextField F1=new JTextField("Address");
		JTextField A2=new JTextField();
		JTextField B2=new JTextField();
		JTextField C2=new JTextField();
		JTextField D2=new JTextField();
		JTextField E2=new JTextField();
		JTextField F2=new JTextField();
		f.setLayout(null);
		A1.setEditable(false);
		B1.setEditable(false);
		C1.setEditable(false);
		D1.setEditable(false);
		E1.setEditable(false);
		F1.setEditable(false);
		A1.setBounds(15,10,80,30);
		A2.setBounds(105,10,200,30);
		B1.setBounds(15,55,80,30);
		B2.setBounds(105,55,200,30);
		C1.setBounds(15,100,80,30);
		C2.setBounds(105,100,200,30);
		D1.setBounds(15,145,80,30);
		D2.setBounds(105,145,200,30);
		E1.setBounds(15,190,80,30);
		E2.setBounds(105,190,200,30);
		F1.setBounds(15,235,80,30);
		F2.setBounds(105,235,200,30);
		JButton b1=new JButton("Complete");
		b1.setBounds(115, 300, 90, 35);
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Person person = new Person();
				person.setName(A2.getText());
				person.setFamily(B2.getText());
				person.setNOBC(Integer.parseInt(C2.getText()));
				person.setHomePhone(D2.getText());
				person.setCellPhone(E2.getText());
				person.setAddress(F2.getText());
				Person.AddPerson(person);
				JOptionPane.showMessageDialog(null, "succeessful invite", "invite", JOptionPane.INFORMATION_MESSAGE);
				Main.main(null);
				f.dispose();
				
			}
		});
		f.add(A1);
		f.add(B1);
		f.add(C1);
		f.add(D1);
		f.add(E1);
		f.add(F1);
		f.add(A2);
		f.add(B2);
		f.add(C2);
		f.add(D2);
		f.add(E2);
		f.add(F2);
		f.add(b1);
	}
}
