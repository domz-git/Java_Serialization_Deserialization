import java.io.Serializable;

public class User implements Serializable{
	
	private static final long serialVersionUID = 6529685098267757690L;
	
	public String name;
	public String password;
	
public void SayHello() {
		
		System.out.println("Hello "+name);
	}
	

}
