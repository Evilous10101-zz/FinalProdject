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

}
}

