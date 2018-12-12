package dropbox;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class DownloadingWebpageForBasicViewing {
	

	    public static void Downloading()  {
	    	
	    	
	    
     System.out.println("This will get the source code from github");
      
      
      Desktop d = Desktop.getDesktop();
      try {
          d.browse(new URI("https://github.com/Evilous10101/FinalProdject"));
      } catch (IOException | URISyntaxException e2) {
          e2.printStackTrace();
      } 
	    }
	}


