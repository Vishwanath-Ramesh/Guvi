import java.util.*;
class SubString{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the First String:");
		String str1 = scanner.nextLine();
		System.out.printf("\nEnter the Second String:");
		String str2 = scanner.nextLine();
		String sub_str = "";
		for(int i = 0;i<str1.length()-1;i++){
			sub_str = str1.substring(i,i+2);
		    if(str2.contains(sub_str)){
    			System.out.printf("\nTrue");
    			break;
    			}
		    else if(i == str1.length() - 2)
		        System.out.printf("\nFalse");
		} 
	}
}
