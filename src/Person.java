import java.io.ObjectInputStream.GetField;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Person {
	
	private int NOBC;
	private String NO,Name,Family,HomePhone,CellPhone,Address;
	public static final String KEY_NAME ="Name";
	public static final String KEY_FAMILY ="Family";
	public static final String KEY_NOBC ="NOBC";
	public static final String KEY_HOMEPHONE ="HomePhone";
	public static final String KEY_CELLPHONE ="CellPhone";
	public static final String KEY_ADDRESS ="Address";
	public static final String KEY_NO ="NO";
	public int getNOBC() {
		return NOBC;
	}
	public void setNOBC(int nOBC) {
		NOBC = nOBC;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getFamily() {
		return Family;
	}
	public void setFamily(String family) {
		Family = family;
	}
	public String getHomePhone() {
		return HomePhone;
	}
	public void setHomePhone(String homePhone) {
		HomePhone = homePhone;
	}
	public String getCellPhone() {
		return CellPhone;
	}
	public void setCellPhone(String cellPhone) {
		CellPhone = cellPhone;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public static void AddPerson(Person person)
	{
		JSONObject object = new JSONObject();
		try {
			object.put(KEY_NAME,person.getName());
			object.put(KEY_FAMILY,person.getFamily());
			object.put(KEY_NOBC,person.getNOBC());
			object.put(KEY_HOMEPHONE,person.getHomePhone());
			object.put(KEY_CELLPHONE,person.getCellPhone());
			object.put(KEY_ADDRESS,person.getAddress());
			object.put(KEY_NO,"#"+person.getNOBC());
			
		} catch (JSONException e) {
			e.printStackTrace();
		}
		String string = file.ReadFromMyFile("Persons.txt");
		try {
			JSONArray json = new JSONArray(string);
			json.put(object);
			file.WriteToMyFile(json.toString(), "Persons.txt");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
