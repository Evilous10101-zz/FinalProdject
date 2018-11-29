package dropbox;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Userforapplication {
	public static void EULA() throws IOException {
	//Gets html file and opens it in default web browser
	
		File htmlFile = new File("C:\\Programming Class\\Eclipse\\FinalProdject\\index.html");
		Desktop.getDesktop().browse(htmlFile.toURI());
    //Works for now and gets what it needs to do done so this class is finished for now
		//index.html will be edited to look better and more formal. It looks better now but could be better
}
}

