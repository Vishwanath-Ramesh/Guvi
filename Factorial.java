import java.io.*;
class Factorial{
	public static void main(String args[]) throws IOException{
		DataInputStream g = new DataInputStream(System.in);
		int val,fact = 1;
		System.out.print("Enter The Number ");
		val = Integer.parseInt(g.readLine());
		for(int i = 1;i<=val;i++){
			fact = fact * i;
			}
		System.out.println("The Factorial of "+val+" is " +fact);
		}
	}