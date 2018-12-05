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
	UI x = new UI();
	
	//Parts to confirm if EULA was read
	
		File htmlFile = new File("index.html");
		Desktop.getDesktop().browse(htmlFile.toURI());
    //Works for now and gets what it needs to do done so this class is finished for now
		//index.html will be edited to look better and more formal. It looks better now but could be better
		//C:\\Programming Class\\Eclipse\\FinalProdject\\index.html
		
		Scanner input = new Scanner( System.in );
        String answer = null;
        
        do
        {
            // add your ATM stuff here
            System.out.println("After you say yes or no, You should close the program since it might freeze up");
            // then when done:
            System.out.println( "Do you want to agree to the EULA?" + "please awnser Y for yes and N for no (This will repeat until you say yes)");
            answer = input.nextLine();
        }
        while( answer.equals( "N" ) );
        System.out.println("System will exit");
        System.exit(0);
    }
 //int x = 1;

}


