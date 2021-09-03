package Interface;

import java.util.Scanner;

public class BankMain {

	static int accno;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Create_Account ac=new Create_Account();
		
		Scanner sc=new Scanner(System.in);
		
		boolean quit = false;
		do
		{
			System.out.println(" 1 : Create Account");
			System.out.println(" 2 : Deposit Money");
			System.out.println(" 3 : Withdrawn Money");
			System.out.println(" 4 : Check Balance");
			System.out.println(" 5 : Display Account Details");
			System.out.println(" 6 : Quit");
			System.out.println("Enter Your choice");
			int User_Choice=sc.nextInt();
			switch(User_Choice)
			{
			case 1:
			{
				System.out.println("Enter your Name");
				String Name = sc.next();
				System.out.println("Enter Account Number");
				int Account_Number=sc.nextInt();
				System.out.println("Enter Account Type");
				String Account_Type=sc.next();
				ac.insert(Name,Account_Type,Account_Number);
				System.out.println("Your details");
				ac.Display_Details();
				break;
			}
			case 2:
			{
				System.out.println("Enter account number");
				accno=sc.nextInt();
				if(accno==ac.Account_Number)
				{
					System.out.println("Enter the amount ");
					int Amount=sc.nextInt();
					ac.Account_Balance=Amount;
					System.out.println("Amount Deposited");
				}
				else
					System.out.println("Wrong Account number");
				break;
			}
			case 3:
			{
				System.out.println("Enter the account number");
				accno=sc.nextInt();
				if(accno==ac.Account_Number)
				{
					if(ac.Account_Balance==0)
					{
						System.out.println("Your account is empty");
					}
					else
					{
						System.out.println("Enter the amount you want");
						int withdraw_amount=sc.nextInt();
						int current_balance = 0;
						if(withdraw_amount>ac.Account_Balance)
						{
							System.out.println("enter sufficient amount to withdraw");
							withdraw_amount=sc.nextInt();
						}
						else
						current_balance = sc.nextInt();
						System.out.println("the current balance is "+current_balance);
					}
				}
				else
					System.out.println("Wrong account number");
				break;
			}
			case 4:
			{
				System.out.println("Enter account number");
				accno=sc.nextInt();
				if(accno==ac.Account_Number)
				{
					System.out.println("Your balance is "+ac.Account_Balance);
				}
				else
				{
					System.out.println("You entered wrong account number");
				}
				break;
			}
			case 5:
			{
				System.out.println("Enter account number");
				accno=sc.nextInt();
				if(accno==ac.Account_Number)
				{
				ac.Display_Details();
				}
				else
					System.out.println("Wrong account number");
				break;
			}
			case 6:
			{
				quit = true;
				break;
			}
			default:
				System.out.println("Wrong choice");
				break;
			
			}
			System.out.println("\n");
	}
	while(!quit);
	System.out.println("Thankss !!");
}
}
			
		
	