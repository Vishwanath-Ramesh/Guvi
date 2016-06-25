import java.util.*;
public class StringToInteger {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter The String ");
		String str = s.nextLine();
		try{
			int in = Integer.parseInt(str);
			System.out.println("The String "+str+ " is converted into integer "+in);
		}
		catch(Exception e){
			System.out.println("The String cannot be converted to integer due to "+e);
		}
	}

}
