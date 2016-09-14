import java.util.Scanner;
public class LeastNumber 
{
    public static void main(String[] args) 
    {
        int n, temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of digits:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the "+n+" elements:");
        for (int i = 0; i < n; i++) 
        {
            a[i] = s.nextInt();
        }
        for(int i = 0;i<n;i++){
			for(int j = i+1;j<n;j++){
				if(a[i] > a[j]){
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
        System.out.printf("The numbers in Ascending Order are:");
        for (int i = 0; i < n ; i++) 
        {
            System.out.print(a[i]);
        }
		System.out.printf("\nEnter the number of digits to delete:");
		int d = s.nextInt();
		System.out.printf("\nThe Remaining numbers are:");
		for(int x = 0;x<n-d;x++){
			System.out.print(a[x]+" ");
		}
    }
}
