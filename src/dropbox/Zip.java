package dropbox;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Zip {
	public static void Create() throws IOException  {
		
	
	StringBuilder sb = new StringBuilder();
	sb.append("Test String");

	File f = new File("test.zip");
	ZipOutputStream out = new ZipOutputStream(new FileOutputStream(f));
	ZipEntry e = new ZipEntry("File");
	ZipEntry b = new ZipEntry("Users.txt");
	out.putNextEntry(e);
	out.putNextEntry(b);

	byte[] data = sb.toString().getBytes();
	out.write(data, 0, data.length);
	out.closeEntry();

	out.close();
	System.out.println("Files has been ziped up");

}
}
