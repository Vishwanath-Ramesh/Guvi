import java.util.*;
class LectureNotes
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int totalstrength = scanner.nextInt();
		int totalfriends = scanner.nextInt();
		String wakedfriends = scanner.next();
		char[] wakedfriends_char = wakedfriends.toCharArray();
		int friends[] = new int[totalstrength];
		for(int i = 1;i <= totalfriends; i++){
			friends[i] = scanner.nextInt();
		}
		scanner.close();
		for(int j=1;j<=totalfriends;j++){
			if(wakedfriends_char[friends[j]-1] == '0'){
				System.out.printf("Yes");
				break;}
			else{
				if(j==totalfriends)
				System.out.printf("No");}
		}
	}
}
