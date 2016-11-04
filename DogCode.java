import java.util.*;
class DogCode
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int smile=1,cry=2,fear=3;
		String string = new String(scanner.nextLine());
		String[] string_array = string.split(" ");
		for(String str:string_array){
			if(str.equalsIgnoreCase("smile"))
				System.out.print(smile);
			else if(str.equalsIgnoreCase("cry"))
				System.out.print(cry);
			else if(str.equalsIgnoreCase("fear"))
				System.out.print(fear);
		}
	}
}
