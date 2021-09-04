public class Per {
		void permutation(String str,String ans)
		{
			if(str.length()==0)
			{
	}
				for(int i=0;i<str.length();i++)
				{
					char ch=str.charAt(i);
					String str1=str.substring(0,i)+str.substring(i+1);
					permutation(str1,ans+ch);
				}
				
			}
		

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String str="ab";
			
			Per permu=new Per();
			permu.permutation(str," ");
			
			

		}

	}

