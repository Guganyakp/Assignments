import java.util.Scanner;

public class NonRepeatedCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String str1 = s.next();
		for (int i = 0; i < str1.length(); i++) 
		{
			   boolean unique = true;
			   for (int j = 0; j < str1.length(); j++) 
			   {
			    if (i != j && str1.charAt(i) == str1.charAt(j)) 
			    {
			     unique = false;
			     break;
			    }
			   }
			   if (unique) 
			   {
			    System.out.println("The first non repeated character in String is: " + str1.charAt(i));
			    break;
			   }
			  }
			 }
			}