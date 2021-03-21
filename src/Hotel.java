import java.awt.List;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Hotel {
	public Hotel(int Stars,int NO,String Name,String State,String City,String Address,boolean Internet,boolean Parking,int Phone,ArrayList<Rooms> rooms)
	{
		this.Address=Address;
		this.City=City;
		this.Internet=Internet;
		this.Name=Name;
		this.NO=NO;
		this.Parking=Parking;
		this.Phone=Phone;
		this.Stars=Stars;
		this.State=State;
		this.rooms=rooms;
	}
	int Stars,NO,Phone;
	String Name,State,City,Address;
	boolean Internet,Parking;;
	ArrayList<Rooms> rooms;
	public static final String KEY_STARS="stars";
	public static final String KEY_NO="NO";
	public static final String KEY_NAME="name";
	public static final String KEY_STATE="state";
	public static final String KEY_CITY="city";
	public static final String KEY_PHONE="phone";
	public static final String KEY_ADRREESS="address";
	public static final String KEY_INTERNET="internet";
	public static final String KEY_PARKING="parking";
	public static final String KEY_ROOMS="rooms";
	public static ArrayList<Hotel> readAllHotels() {
		ArrayList<Hotel> hotels = new ArrayList<Hotel>();
		String json = file.ReadFromMyFile("Hotel.txt");
		try {
			JSONArray array = new JSONArray(json);
			for(int i = 0; i < array.length(); i++) {
				JSONObject object = array.getJSONObject(i);
				JSONArray array1= object.getJSONArray(KEY_ROOMS);
				Hotel hotel = new Hotel(object.getInt(Hotel.KEY_STARS), 
						object.getInt(Hotel.KEY_NO), 
						object.getString(Hotel.KEY_NAME),
						object.getString(Hotel.KEY_STATE),
						object.getString(Hotel.KEY_CITY),
						object.getString(Hotel.KEY_ADRREESS),
						object.getBoolean(Hotel.KEY_INTERNET),
						object.getBoolean(Hotel.KEY_PARKING),
						object.getInt(Hotel.KEY_PHONE),
						Rooms.ReadAllRooms(array1));
				hotels.add(hotel);
			}
		}
	 catch (JSONException e) {
		
		e.printStackTrace();
	}
	return hotels;
}
	public static void EditRooms(int num,String x)
	{
		String json = file.ReadFromMyFile("Hotel.txt");
		try {
			JSONArray array = new JSONArray(json);
				JSONObject object = array.getJSONObject(num);
				JSONArray array1= object.getJSONArray(KEY_ROOMS);
				JSONObject object1= array1.getJSONObject(0);
				object1.put(x, false);
				array1.put(0, object1);
				object.put(KEY_ROOMS, array1);
				array.put(num, object);
				file.WriteToMyFile(array.toString(), "Hotel.txt");
		}
	 catch (JSONException e) {
		
		e.printStackTrace();
	}
	}
}
