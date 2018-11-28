package dropbox;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public abstract class GatherData {
	public static void Data() {
		// TODO Auto-generated method stub
		System.out.println("Showing whate files Java can see. Trying to bug fix java not finding file");
		File file = new File(".");
		for(String fileNames : file.list()) System.out.println(fileNames);
		//Tests if files exist even though it says it does
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
	}
	{
	 UI textPane = new UI();
	 PrintWriter writer = null;
	try {
		writer = new PrintWriter(new File("C:\\Programming Class\\Eclipse\\FinalProdject\\File"));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		writer.println(textPane);
	}
}
