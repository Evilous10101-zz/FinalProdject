package dropbox;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Downloader {
	public static void Test() throws MalformedURLException, IOException {
		
		try (BufferedInputStream in = new BufferedInputStream(new URL("https://mega.nz/#!yLZ31QTJ!81zBVG7rRwF-jRfkNEbhCeL8FWO63a-vt0zfLOHpSuc").openStream());
				  FileOutputStream fileOutputStream = new FileOutputStream("Git-2.18.0-64-bit.exe")) {
				    byte dataBuffer[] = new byte[1024];
				    int bytesRead;
				    while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
				        fileOutputStream.write(dataBuffer, 0, bytesRead);
				    }
				} catch (IOException e) {
				    // handle exception
				}
System.out.println("Git installer should be downloaded");
}
}
