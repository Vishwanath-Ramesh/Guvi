import java.util.*;
class StringReverse{
	public static void main(String args[]){
		//DataInputStreamReader g = new DataInputStreamReader(System.in);
		Scanner s = new Scanner(System.in);
		String s1,s2;
		System.out.println("Enter The String");
		s1 = s.nextLine();
		s2 = new StringBuffer(s1).reverse().toString();
		System.out.println("The Reversed String is "+s2);
		}
	}