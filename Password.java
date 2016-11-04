import java.util.*;
class Password{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String str1 = scanner.nextLine();
		String str2 = scanner.nextLine();
		int count1 = 1,count2 = 1,size=(str1.length()>str2.length())?str1.length():str2.length();
			for(int j = 0; j < size; j++){
				try{
					System.out.print(str1.charAt(j));}
				catch(Exception e){
					System.out.print(count1);
					count1++;}
				try{
					System.out.print(str2.charAt(j));}
				catch(Exception e){
					System.out.print(count2);
					count2++;}
			}
	}
}