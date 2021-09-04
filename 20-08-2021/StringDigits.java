import java.util.Scanner;

public class StringDigits {
		int count=0;
		public int digits(String str, int n) {
			for (int i = 0; i < n; i++) {
				if (str.charAt(i) >= '0'&&str.charAt(i)<='9') {
					count++;
				}
			}

			return count;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			StringDigits std=new StringDigits();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter A String ");
			String str=sc.nextLine();
			int len=str.length();
			int n=std.digits(str, len);
			if(n==len)
			{
				System.out.println("It Contains Only Numbers");
			}
			else
			{
				System.out.println("It Contains Mixed Characters");
			}
			

		}

	}

