package dropbox;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public abstract class GatherData {
	public static void Data() {
		// TODO Auto-generated method stub
		
	 Order editorPane = new Order();
	 PrintWriter writer = null;
	 //Gathers Order and outputs to File
	try {
		writer = new PrintWriter(new File("File"));
		//C:\\Programming Class\\Eclipse\\FinalProdject\\File (This is here if above doesn't work)
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		writer.println(editorPane);
		writer.close();
		System.out.println("Data has been saved. That you for your time.");
}
}
