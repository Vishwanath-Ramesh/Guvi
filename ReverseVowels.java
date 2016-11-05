import java.util.*;
class ReverseVowels{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		StringBuffer string = new StringBuffer(scanner.nextLine());
		char str_char;
		System.out.println(string.reverse());
		for(int i = 0; i < string.length(); i++){
		    str_char = Character.toLowerCase(string.charAt(i));
		    if(str_char == 'a' || str_char == 'e' || str_char == 'i' || str_char == 'o' || str_char == 'u'){
		        string.deleteCharAt(i);
		    }
		}
		System.out.println(string);
	}
}
