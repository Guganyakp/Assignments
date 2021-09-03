package Day1;

public class AddSub {
	
int b=10;
		static int a=5;

		public static void main(String[] args) {
			//addition
			AddSub as=new AddSub();
			int x=a;
			int y=as.b;
			while(as.b!=0)
			{
				int sum=(a & as.b);
				a=a^as.b;
				as.b=sum<<1;
			}
			System.out.println("sum "+a);
			
			//subtraction
			while(y!=0)
			{
				int sub=((~x)&y);
				x=x^y;
				y=sub<<1;
			}
			System.out.println("sub " +x);
			
		}

	}



