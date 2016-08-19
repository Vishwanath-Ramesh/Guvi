import java.util.*;

public class Seed
{
	public static void main(String[] args)
	{
		int temp = 1,n=1,total=0,i=123,j;
		int remainder[] = new int[10];
		System.out.print("Enter the Seed(within the range of integer):");
		Scanner scanner = new Scanner(System.in);
		int seed = scanner.nextInt();
		scanner.close();
		for(i = 1;i <=Integer.MAX_VALUE;i++){
			n = i;
			for(j = 1;n != 0;j++){
				remainder[j] = n % 10;
				temp = temp * remainder[j];
				n = n / 10;
			    total = temp * i;
				}
			if(seed == total){
				System.out.print("The seeds of "+seed+" are: "+remainder[3]+" "+remainder[2]+" "+remainder[1]);
			}
			temp=1;
			}
		System.out.println("Seeds are Not Available for this number");
	}
}
