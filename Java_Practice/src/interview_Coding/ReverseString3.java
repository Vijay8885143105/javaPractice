package interview_Coding;

public class ReverseString3 {

	public static void main(String[] args) {
		//Using concatenation 
		String str="ABCDEF";
		String rev="";      //initializes an empty string and rev to store the reversed string.
		/*int	len=str.length(); //6
		System.out.println(len);
		for (int i = len-1; i >=0; i--) {
			rev =rev+str.charAt(i);    //appends each character of str (starting from the end)
		}
		System.out.println(rev); //FEDCBA*/
		
		//Using char array
		char a[]=str.toCharArray();
		int len=str.length();
		for (int i = len-1; i >=0; i--) {
			rev=rev+a[i];
		}
		System.out.println(rev); //FEDCBA
		
		//Using StringBuffer Class
		/*StringBuffer sb=new StringBuffer(str);
		StringBuffer reverse=sb.reverse();
		System.out.println(reverse);  //FEDCBA*/
	}
}
