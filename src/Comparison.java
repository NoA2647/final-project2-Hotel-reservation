import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Comparison {
	public static boolean Comparison(String family,int nobc)
	{
		String string= file.ReadFromMyFile("Persons.txt");
		try {
			JSONArray json = new JSONArray(string);
			for(int i=0;i<json.length();++i)
			{
				JSONObject object=json.getJSONObject(i);
				if(family.equals(object.getString(Person.KEY_FAMILY))&&nobc==object.getInt(Person.KEY_NOBC))
					return true;
			}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
