import java.util.Scanner;
class Reverse_String
{

	public String ReverseString(String str) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Reverse_String rs=new Reverse_String();
		
		System.out.println("Enter A String :");
		String str=sc.nextLine();
		
		String rev=rs.ReverseString(str);
		
		if(str.equals(rev))
		{
			System.out.println("Given String is A Palindrome");
		}
		else
		{
			System.out.println("Given String is Not A Palindrome");
		}

	} 

	public String ReverseString(String str) {
		if(str.length()==0)
		{
			return str;
		}
		else
		{
			return ReverseString(str.substring(1))+str.charAt(0);
		}
		
	}

}