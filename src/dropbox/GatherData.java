package dropbox;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public abstract class GatherData {
	public static void Data() {
		// TODO Auto-generated method stub
		
	 UI textPane = new UI();
	 PrintWriter writer = null;
	try {
		writer = new PrintWriter(new File("C:\\Programming Class\\Eclipse\\FinalProdject\\File"));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		writer.println(textPane);
		writer.close();
}
}
