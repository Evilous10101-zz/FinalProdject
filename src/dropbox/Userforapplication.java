package dropbox;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

public class Userforapplication {
	public static void EULA() throws IOException {
	//Gets html file and opens it in default web browser
	
		File htmlFile = new File("C:\\Programming Class\\Eclipse\\FinalProdject\\index.html");
		Desktop.getDesktop().browse(htmlFile.toURI());
    //Works for now and gets what it needs to do done so this class is finished for now
		//index.html will be edited to look better and more formal. It looks better now but could be better
		
		
		Scanner input = new Scanner( System.in );
        String answer = null;
        
        do
        {
            // add your ATM stuff here
            
            // then when done:
            System.out.println( "Do you want to agree to the EULA?" + "please awnser Y for yes and N for no");
            answer = input.nextLine();
        }
        while( answer.equals( "N" ) );
    }


}


