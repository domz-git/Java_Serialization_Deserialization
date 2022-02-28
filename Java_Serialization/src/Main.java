import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		User user = new User();

		user.name = "Dude";
		user.password = "passwordDude";
	
	FileOutputStream fileOut = new FileOutputStream("UserDetails.ser");
	ObjectOutputStream out = new ObjectOutputStream(fileOut);
	out.writeObject(user);
	out.close();
	fileOut.close();
	
	
	
	System.out.println("Object details saved.");
	
	}
}
