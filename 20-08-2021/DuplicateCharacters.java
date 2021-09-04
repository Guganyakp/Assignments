import java.util.Scanner;

public class DuplicateCharacters {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String str = s.nextLine();
	    	      char[] arr = str.toCharArray();
	    	      System.out.print("Duplicate Characters in above string are: ");
	    	      for (int i = 0; i < str.length(); i++) {
	    	         for (int j = i + 1; j < str.length(); j++) {
	    	            if (arr[i] == arr[j]) {
	    	               System.out.print(arr[j]);
	    	               break;
	    	            }
	    	         }
	    	      }
	    	   }
	    	}
		

	
