package dropbox;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import com.dropbox.core.DbxException;
import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.v2.DbxClientV2;
import com.dropbox.core.v2.files.FileMetadata;
import com.dropbox.core.v2.files.ListFolderResult;
import com.dropbox.core.v2.files.Metadata;
import com.dropbox.core.v2.files.UploadErrorException;
import com.dropbox.core.v2.users.FullAccount;

public class Upload {
	public static void upload() throws FileNotFoundException {
	 {
		 System.getProperty("File");
		 
			
	//Uploads Uploadingtxt.txt to dropbox
	DbxRequestConfig config = new DbxRequestConfig("dropbox/java-tutorial", "en_US");
    DbxClientV2 client = new DbxClientV2(config, "-rlCNtKZ95AAAAAAAAAACZfSpYr5KbrRxC3KHZXAKjUJIWI2ZxHEhaAZxGLf2wpj");
    
    try {
		FullAccount account = client.users().getCurrentAccount();
	} catch (DbxException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
    
	
    try (InputStream in = new FileInputStream("C:\\Programming Class\\Eclipse\\FinalProdject\\File")) {
        FileMetadata metadata = client.files().uploadBuilder("C:\\Programming Class\\Eclipse\\FinalProdject\\File")
            .uploadAndFinish(in);
	

} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (UploadErrorException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (DbxException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
}
}