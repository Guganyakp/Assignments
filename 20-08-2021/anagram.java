import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
			public static void main (String [] args) { 
				Scanner s=new Scanner(System.in);
				System.out.println("Enter string 1");
				String str1 = s.next();
				str1 = str1.toLowerCase();
				System.out.println("Enter string 2");
			    String str2 = s.next();
			    str2 = str2.toLowerCase();
			    if(str1.length() == str2.length()) 
			    {
			    	char[] arr1 = str1.toCharArray();
			    	char[] arr2 = str2.toCharArray();
			    	Arrays.sort(arr1);
			        Arrays.sort(arr2);
			        if(Arrays.equals(arr1, arr2)) 
			        {
			        	System.out.println(str1 + " and " + str2 + " are anagram.");
			        }
			        else 
			        {
			        System.out.println(str1 + " and " + str2 + " are not anagram.");
			        }
			    }
			    else 
			    {
			      System.out.println(str1 + " and " + str2 + " are not anagram.");
			    }
			  }
			}
