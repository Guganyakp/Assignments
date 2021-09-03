package Day2;

import java.util.*;
public class Employees {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		   String []name=new String [100];
	       int []id=new int[100];
	       int []experience=new int[100];
	       int ind=0,n=0,num=0,exp=0,ID=0;String s1="";
	       do
	       {
	          System.out.println("Enter the choice: ");
	          System.out.println("Adding employee");
	          System.out.println("Deleting employee");
	          System.out.println("Editing employee");
	          System.out.println("Displaying employee");
	          System.out.println("Exit");
	          n=sc.nextInt();sc.nextLine();
	          if(n==1)
	          {
	        	  System.out.println("Enter the name: ");
	        	  s1=sc.nextLine();
	        	  System.out.println("Enter the ID: ");
	        	  num=sc.nextInt();sc.nextLine();
	        	  System.out.println("Enter the experience: ");
	        	  exp=sc.nextInt();sc.nextLine();
	              name=add_name(name,s1,ind);
	              id=add_id(id,num,ind);
	              experience=add_experience(experience,exp,ind);
	              ind++;
	          }
	          else if(n==2)
	          {
	              System.out.println("Enter the ID: ");
	              ID=sc.nextInt();sc.nextLine();
	              ID=check(ID,id);
	              name=del_name(name,ind,ID);
	              id=del_id(id,ind,ID);
	              experience=del_experience(experience,ind,ID);
	              ind--;
	          }
	          else if(n==3)
	          {
	        	  System.out.println("Enter the ID: ");
	        	  ID=sc.nextInt();sc.nextLine();
	        	  System.out.println("Enter the name you would like to Edit: ");
	        	  s1=sc.nextLine();
	        	  System.out.println("Enter the experience you would like to Edit: ");
	        	  exp=sc.nextInt();sc.nextLine();
	        	  ID=check(ID,id);
	        	  System.out.println(ID);
	        	  name[ID]=s1;
	        	  experience[ID]=exp;
	          }
	          else if(n==4)
	          {
	             for(int i=0;i<ind;i++) 
	             {
	               System.out.println("The Employee name is:"+name[i]+" The Employee ID is:"+id[i]+" Employee Experience is:"+experience[i]);
	               salary(experience[i]);
	             }
	          }
	          else if(n==5) break;
	       }while(n<5);
	       System.out.println("You have entered the choice: 5 so exit");	
	}
	public static void salary(int exp)
    {
         if(exp>5) System.out.println("The Salary is RS:30000");
         else if(exp>5&&exp<10) System.out.println("The Salary is RS:40000");
         else if(exp>10&&exp<15) System.out.println("The Salary is RS:50000");
         else if(exp>15) System.out.println("The Salary is RS:60000");
    }
	public static int check(int ID,int []id)
	{
		int res=0;
		for(int i=0;i<id.length;i++)
		{
			if(ID==id[i]) 
			{
				res=i; 
			    break;
			}
		}
		return res;
	}
	public static String[] add_name(String []name,String s1,int ind)
    {
		name[ind++]=s1;
        return name;    
    }
    public static int[] add_id(int []id,int num,int ind)
    {
        id[ind++]=num;
        return id;    
    }
    public static int[] add_experience(int []experience,int exp,int ind)
    {
        experience[ind++]=exp;
        return experience;    
    }
    public static String[] del_name(String []name,int ind,int ID)
    {
        for(int i=ID;i<ind;name[i]=name[i+1],i++);
        return name;    
    }
    public static int[] del_id(int []id,int ind,int ID)
    {
        for(int i=ID;i<ind;id[i]=id[i+1],i++);
        return id;    
    }
    public static int[] del_experience(int []experience,int ind,int ID)
    {
        for(int i=ID;i<ind;experience[i]=experience[i+1],i++);
        return experience;    
    }
}