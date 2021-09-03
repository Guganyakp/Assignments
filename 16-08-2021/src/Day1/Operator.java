package Day1;

public class Operator {

		public static void main(String[] args) {
			int a=100;
			int b=50;
			//ARITHMETIC OPERATORS
			System.out.println("sum: "+ (a+b));
			System.out.println("sub: "+ (a-b));
			System.out.println("mul: "+ (a*b));
			System.out.println("div: "+ (a/b));
			System.out.println("per: "+ (a%b));
			
			//RELATIONAL OPERATOR
			System.out.println("greater: "+ (a>b));
			System.out.println("greater than equal to: "+ (a>=b));
			System.out.println("lesser: "+(a<b));
			System.out.println("lesser than equal to: "+ (a<=b));
			System.out.println("equal to: "+ (a==b));
			System.out.println("not equal to: "+ (a!=b));
			
			//LOGICAL OPERATOR
			boolean x=true;
			boolean y=false;
			System.out.println("and: "+ (x&&y));
			System.out.println("or: "+ (x||y));
			System.out.println("not: "+ (!x));
			
			//BITWISE OPERATOR
			System.out.println("bitwise:" + (45/5*3-7+2));
			
			//ASSIGNMENT OPERATOR
			int ab=89,bc=56,cd=334,de=23,ef=21,fg=76;
			int z=ab=bc=cd=de=ef=fg=66;
			System.out.println(ab+" "+bc+" "+cd+" "+de+" "+ef+" "+fg);
			
			//INCREMENT & DECREMENT OPERATOR
			int c=++a;
			int d=++b;
			System.out.println("incre: "+ c);
			System.out.println("decre: "+ d);
			
			//COMPOUND OPERATOR
			int xy=20;
			xy+=20;
			System.out.println("compound :" +xy); 
			
			

		}

	


}
