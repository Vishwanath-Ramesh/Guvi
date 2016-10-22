import java.util.*;
class Holiday{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String string = new String(scanner.nextLine());
		if(string.equalsIgnoreCase("sunday"))
			System.out.println("True");
		else
			System.out.println("False");
	}
}
