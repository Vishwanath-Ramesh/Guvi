import java.util.*;
public class StringTerminator {
		public static void main(String args[]){
			Scanner scanner = new Scanner(System.in);
			String str = new String(scanner.nextLine());
			scanner.close();
			int a = str.length();
			int b = 0,j=0,c = 0;
			for(int i = 0;i < a;i++){
				if(str.charAt(i) == '#'){
					b = i;
				}
			}
			for(j = b;j > 0 ;j--){
				if((str.charAt(j)) == 32){
					c = j;
					j = 0;
				}
			}
			char[] strtochar = str.toCharArray();
			for(int k = 0;k < c;k++){
				System.out.print(strtochar[k]);
			}
		}
}
