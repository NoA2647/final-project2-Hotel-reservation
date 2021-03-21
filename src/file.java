import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class file {
public static void WriteToMyFile(String string,String path) {
		
		try {
			Formatter formatter = new Formatter(path);
			formatter.format(string);
			formatter.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}
public static String ReadFromMyFile(String path)
{
	File ab=new File(path);
	Scanner scan = null;
	String string="";
	try {
		scan = new Scanner(ab);
	while(scan.hasNext())
	{
		string=string.concat(scan.nextLine()+"\n");
	}
	scan.close();
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	
	return string;
}
}
