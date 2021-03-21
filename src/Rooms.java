import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Rooms {
	public Rooms(boolean R101,boolean R102,boolean R103,boolean R104,boolean R105)
	{
		this.R101=R101;
		this.R102=R102;
		this.R103=R103;
		this.R104=R104;
		this.R105=R105;
	}
	boolean R101,R102,R103,R104,R105;
	public static final String KEY_R101="R101";
	public static final String KEY_R102="R102";
	public static final String KEY_R103="R103";
	public static final String KEY_R104="R104";
	public static final String KEY_R105="R105";
	public static ArrayList<Rooms> ReadAllRooms(JSONArray array1)
	{
		ArrayList<Rooms> rooms = new ArrayList<Rooms>();
		try {
			JSONObject object = array1.getJSONObject(0);
				 Rooms room = new Rooms(object.getBoolean(KEY_R101),
						object.getBoolean(KEY_R102),
						object.getBoolean(KEY_R103),
						object.getBoolean(KEY_R104),
						object.getBoolean(KEY_R105));
				rooms.add(room);
			
		}
	 catch (JSONException e) {
		
		e.printStackTrace();
	}
	return rooms;
	}
}
