/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vishwanath
 */
import java.util.*;
class LectureNotes
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int totalstrength = scanner.nextInt();
		int totalfriends = scanner.nextInt();
		//int j=0;
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
