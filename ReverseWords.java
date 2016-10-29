import java.util.*;
class ReverseWords
{
	public static void main (String[] args)
		{
			Scanner scanner = new Scanner(System.in);
			String str = new String(scanner.nextLine());
			String[] str_array = str.split(" ");
			for(int i = str_array.length - 1; i >= 0; i--){
			    System.out.print(str_array[i]+" ");
			}
		}
}

