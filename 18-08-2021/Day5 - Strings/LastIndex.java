public class LastIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "The quick brown fox jumps over the lazy dog";
		 char[] strArr = str.toCharArray();
	        for (int i = str.length()-1; i >= 0 ; i--){
	            if (strArr[i] == Character.toUpperCase(strArr[i])){
	                System.out.println(i);
	                break;
	            }
	        }
	    }
	
	}
