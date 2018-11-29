package dropbox;

import com.dropbox.core.DbxException;
import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.v2.DbxClientV2;
import com.dropbox.core.v2.files.FileMetadata;
import com.dropbox.core.v2.files.ListFolderResult;
import com.dropbox.core.v2.files.Metadata;
import com.dropbox.core.v2.users.FullAccount;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;

public class Upload {
    private static final String ACCESSTOKEN = "-rlCNtKZ95AAAAAAAAAACZfSpYr5KbrRxC3KHZXAKjUJIWI2ZxHEhaAZxGLf2wpj";

    @SuppressWarnings({ "deprecation", "unused" })
	public static void upload() throws DbxException, IOException {
        // Create Dropbox client
        DbxRequestConfig config = new DbxRequestConfig("dropbox/java-tutorial", "en_US");
        DbxClientV2 client = new DbxClientV2(config, ACCESSTOKEN);

        // Get current account info
        FullAccount account = client.users().getCurrentAccount();
        System.out.println("Owner of dropbox account: " + account.getName().getDisplayName());

        

        // Uploads File to Dropbox
        try (InputStream in = new FileInputStream("C:\\Programming Class\\Eclipse\\FinalProdject\\File")) {
            FileMetadata metadata = client.files().uploadBuilder("C:\\Programming Class\\Eclipse\\FinalProdject\\File")
                .uploadAndFinish(in);
        }
    }
}