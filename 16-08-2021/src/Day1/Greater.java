package Day1;

public class Greater {
	static int a=70;
	int b=22;

	public static void main(String[] args) {
		Greater gr=new Greater();
		int c=(a>gr.b) ? a:gr.b ;
		System.out.println(c);

	}

}