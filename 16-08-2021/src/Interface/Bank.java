package Interface;

public class Bank {
}
	
	class Account
	{
		String Name;
		String Account_Type;
		int Account_Number;
		int Account_Balance;
		
		Account()
		{
			
		}

		public Account(String name, String account_Type, int account_Number, int account_Balance) {
			Name = name;
			Account_Type = account_Type;
			Account_Number = account_Number;
			Account_Balance = account_Balance;
		}
	}
	
	class Create_Account extends Account
	{

		Create_Account(String name, String account_Type, int account_Number, int account_Balance) 
		{
			Name = name;
			Account_Type = account_Type;
			Account_Number = account_Number;
			Account_Balance = account_Balance;
		}
		
		Create_Account()
		{
			super();
		}
		
		void Display_Details()
		{
			System.out.println("Depositor name "+ Name);
			System.out.println("Account number "+Account_Number);
			System.out.println("Account Balance " +Account_Balance);
			System.out.println("Account type " +Account_Type);
		}
		
		void deposit(int Account_Number,int money)
		{
			Account_Balance=money;
		}
		
		int withdraw(int withdrawn)
		{
			Account_Balance=Account_Balance-withdrawn;
			return Account_Balance;
		}

		public void insert(String name, String account_Type, int account_Number) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public String toString() {
			return "Create_Account [Name=" + Name + ", Account_Type=" + Account_Type + ", Account_Number="
					+ Account_Number + ", Account_Balance=" + Account_Balance + ", getClass()=" + getClass()
					+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
		}

}
