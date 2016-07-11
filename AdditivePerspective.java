import java.util.Scanner;
public class AdditivePerspective {
	static int x = 0,y = 0;
		public static void main(String args[]){
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter The Numbers:");
			int n = scanner.nextInt();
			scanner.close();
			AdditivePerspective obj = new AdditivePerspective();
			obj.function(n);
			if(y >= 10){
				obj.function(y);
				System.out.println("The Additive Perspective of the given number is:"+y);
			}
			else{
				System.out.println("The Additive Perspective of the given number is:"+y);
			}
	}
void function(int a){
	y=0;
	while(a != 0){
		x = a % 10;
		a = a / 10;
		y = x + y;		
	}
}

}
