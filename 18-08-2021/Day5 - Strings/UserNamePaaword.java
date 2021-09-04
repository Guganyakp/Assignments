import java.util.Scanner;

public class UsernamePassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsernamePassword up=new UsernamePassword();
		up.username();
		up.password();

	}
	Scanner s=new Scanner(System.in);

public void username()
{
	
	System.out.println("Enter username");
	String str=s.nextLine();
	System.out.println("The username is :" +str);

}
public void password()
{
	System.out.println("Enter the password");
	String password=s.nextLine();
	if(password.matches(".*[0-9]{1,}.*") && password.matches(".*[@#$]{1,}.*") && password.length()>=6 && password.length()<=20)
		                    {
		                         System.out.println("the valid password");
		                    }
		                    else
		                    {
		                          System.out.println("not a valid password");
		                    }
		       }
}
