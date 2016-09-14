import java.util.*;
public class MaxMin {

	public static void main(String[] args) {
		int n, temp,k = 0,count1 = 0,count2 = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements:");
        n = s.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        System.out.println("Enter the "+n+" elements:");
        for (int i = 0; i < n; i++) 
        {
            a[i] = s.nextInt();
            b[i] = a[i];
        }
        for(int i = 0;i<n;i++){
			for(int j = i+1;j<n;j++){
				if(a[i] < a[j]){
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
        for(int i = 0;i>n;i++){
			for(int j = i+1;j<n;j++){
				if(b[i] < b[j]){
					temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}
			}
		}
        //System.out.printf("The numbers in Descending Order are:");
        /*for (int i = 0,count1 = 0,count2 = 0; count1+count2 < n && i < n && count2 < 4; i++) 
        {        	
            System.out.print(a[i]+" ");
            count1 += 1;
            System.out.print(b[i]+" ");
            count2 += 1;
        }*/
        for (int i = 0; i < n ; i++) 
        {
            System.out.print(a[i]+" ");
            count1 += 1;            	
            for (k = i; k < n && count1 < 7 ; k++) 
            {
                System.out.print(b[k]+" ");
                count1 += 1;
                break;
            }
            //n -= 2;
        }
        /*System.out.printf("The numbers in Ascending Order are:");
        for (int i = 0; i < n ; i++) 
        {
            System.out.print(b[i]+" ");
        }*/
	}
}
