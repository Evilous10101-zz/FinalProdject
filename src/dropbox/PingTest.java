package dropbox;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public abstract class PingTest {
	
	
	public static void Test() {
		// TODO Auto-generated method stub
		
	//This works so no more edits to this for now
	{
	HttpURLConnection connection = null;
	{
		System.out.println("This Ping test will see if Dropbox is online");
		System.out.println("If the system prints out the number 200 or above dropbox is online");
    try {
        URL u = new URL("http://drive.google.com/");
        connection = (HttpURLConnection) u.openConnection();
        connection.setRequestMethod("HEAD");
        int code = connection.getResponseCode();
        System.out.println(code);
        // 200 is success. Later will be changed to a simpler number
    } catch (MalformedURLException g) {
        
        g.printStackTrace();
    } catch (IOException g) {
        //catches what the ping test has gathered to see if it is good or not. It didn't worth without this so far
        g.printStackTrace();
    } finally {
        if (connection != null) {
        	System.out.println("It works, so the upload can work");
            connection.disconnect();
        }
    }
	}
	}

}
}
