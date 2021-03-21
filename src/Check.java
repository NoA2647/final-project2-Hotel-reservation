
public class Check {
	public static Boolean CheckRoom(int num,String x)
	{
		if(x.equals(Rooms.KEY_R101))
			return Hotel.readAllHotels().get(num).rooms.get(0).R101;
		if(x.equals(Rooms.KEY_R102))
			return Hotel.readAllHotels().get(num).rooms.get(0).R102;
		if(x.equals(Rooms.KEY_R103))
			return Hotel.readAllHotels().get(num).rooms.get(0).R103;
		if(x.equals(Rooms.KEY_R104))
			return Hotel.readAllHotels().get(num).rooms.get(0).R104;
		if(x.equals(Rooms.KEY_R105))
			return Hotel.readAllHotels().get(num).rooms.get(0).R105;						
		return false;
	}

}
