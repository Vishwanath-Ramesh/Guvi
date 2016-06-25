import java.io.*;
class ReverseInteger{
	public static void main(String args[]) throws IOException{
		BufferedReader g = new BufferedReader(new InputStreamReader(System.in));
		int num,i;
		int a[] = new int[20];
		System.out.print("Enter The Number ");
		num = Integer.parseInt(g.readLine());
		for(i = 0;num!=0;i++){
			a[i] = num % 10;
			num = num / 10;
			}
		System.out.print("The Reversed Number is ");
		for(int j = 0;j < i;j++){			
			System.out.print(a[j]);
			}		
		}
	}