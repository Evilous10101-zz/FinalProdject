package dropbox;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CreateUser {
	
	// TODO Auto-generated method stub
	public static void User() 
	{
		 AskForUser textArea = new AskForUser();
		 AskForUser textArea_1 = new AskForUser();
		 AskForUser textArea_2 = new AskForUser();
		 AskForUser textArea_3 = new AskForUser();
		 AskForUser textArea_4 = new AskForUser();
	 PrintWriter writer = null;
	try {
		writer = new PrintWriter(new File("Users"));
		//C:\\Programming Class\\Eclipse\\FinalProdject\\Users.txt
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		writer.println("Username: " + textArea);
		writer.println("Password: " + textArea_1);
		writer.println("Email: " + textArea_2);
		writer.println("Retyped Password: " + textArea_3);
		writer.println("Testing " + textArea_4);
		writer.close();
		System.out.println("Data stored in file");
}
	
	
	
	public static void writeFile3() throws IOException {
		PrintWriter pw = new PrintWriter(new FileWriter("Users"));
		 AskForUser textArea = new AskForUser();
		 AskForUser textArea_1 = new AskForUser();
		 AskForUser textArea_2 = new AskForUser();
		 AskForUser textArea_3 = new AskForUser();
		 AskForUser textArea_4 = new AskForUser();
		for (int i = 0; i < 7; i++) {
			pw.write("Username: " + textArea);
			pw.write("Password: " + textArea_1);
			pw.write("Email: " + textArea_2);
			pw.write("Retyped Password: " + textArea_3);
			pw.write("Testing " + textArea_4);
			pw.write("something");
		}
	 
		pw.close();
	}
}
	


