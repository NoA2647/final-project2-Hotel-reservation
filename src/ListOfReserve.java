import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ListOfReserve {
	
	int day;
	String place;
	public static final String KEY_PLACE = "place";
	public static final String KEY_DAY = "day";
	
	public ListOfReserve(String place, int day) {
		this.day = day;
		this.place = place;
	}

public static void AddReserve(ListOfReserve listOfReserve) {
		
		JSONObject object = new JSONObject();
		try {
			object.put(ListOfReserve.KEY_DAY, listOfReserve.day);
			object.put(ListOfReserve.KEY_PLACE, listOfReserve.place);
		} catch (JSONException e1) {
			
			e1.printStackTrace();
		}
		
		String json = file.ReadFromMyFile("Reserve.txt");
		try {
			JSONArray array = new JSONArray(json);
			array.put(object);
			file.WriteToMyFile(array.toString(), "Reserve.txt");
		} catch (JSONException e) {
			
			e.printStackTrace();
		}
	}
public static void ShowReserve()
{
	JLabel l = new JLabel();
	l.setSize(450, 300);
	l.setVisible(true);
	l.setLayout(null);
	ImageIcon background = new ImageIcon("Pictures\\images.jpg"); 
	l.setIcon(background);
	JFrame f = new JFrame();
	f.setVisible(true);
	f.setBounds(150, 200, 450, 300);
	f.setResizable(false);
	Image icon = Toolkit.getDefaultToolkit().getImage("Pictures\\images 1.jpg");
	f.setIconImage(icon);
	f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	JTextField t = new JTextField();
	t.setText(file.ReadFromMyFile("Reserve.txt"));
	t.setSize(450, 300);
	t.setEditable(false);
	l.add(t);
	f.add(l);
}
}
