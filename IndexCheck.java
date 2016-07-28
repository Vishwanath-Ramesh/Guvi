import java.util.Scanner;
public class IndexCheck 
{
    public static void main(String[] args) 
    {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the "+n+" elements:");
        for (int i = 0; i < n; i++) 
        {
            a[i] = s.nextInt();
        }
        s.close();
        for (int k = 0; k < n ; k++) 
        {
        	if(a[k] == k){
            System.out.print("The number equal to its index is:"+k);
        	}
        }
    }
}