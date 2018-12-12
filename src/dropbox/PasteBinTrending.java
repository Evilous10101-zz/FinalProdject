package dropbox;

import java.util.List;

import com.besaba.revonline.pastebinapi.Pastebin;
import com.besaba.revonline.pastebinapi.impl.factory.PastebinFactory;
import com.besaba.revonline.pastebinapi.paste.Paste;
import com.besaba.revonline.pastebinapi.response.Response;

public class PasteBinTrending {
	public static void Master() 
	
	{
		//Gathers paste that I created, It only has the word Testing on it
	System.out.println("If the word ( Testing ) comes up then it works");
	System.out.println("");
	final PastebinFactory factory = new PastebinFactory();
	final Pastebin pastebin = factory.createPastebin("fe184858294cd01f8a00d4495057aaf0");
	final String pasteKey = "jdmWPpV1";
	final Response<String> pasteResponse = pastebin.getRawPaste(pasteKey);
	if (pasteResponse.hasError()) {
	  System.out.println("Unable to read paste content!");
	  return;
	}
	System.out.println(pasteResponse.get());
	System.out.println("It works");
}
	
	
	
	public static void Trending() {
		//Shows trending pastes
		final PastebinFactory factory = new PastebinFactory();
		final Pastebin pastebin = factory.createPastebin("fe184858294cd01f8a00d4495057aaf0");
		final Response<List<Paste>> pasteResponse = pastebin.getTrendingPastes();
		if (pasteResponse.hasError()) {
		  System.out.println("Unable to read trendings!");
		  return;
		}
		final List<Paste> pastes = pasteResponse.get();
		for(Paste paste : pastes) {
		  System.out.println("Paste title: " + paste.getTitle());
		}
	}
	
}