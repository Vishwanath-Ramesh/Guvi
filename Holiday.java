import java.util.*;
class Holiday{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String string = new String(scanner.nextLine());
		if(string.toLowerCase().equals("sunday"))
			System.out.println("true");
		else
			System.out.println("false");
	}
}
	
