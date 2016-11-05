import java.util.*;
class ArraySplit{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int values[] = new int[5];
		int temp_arr[] = new int[5];
		for(int itr = 0; itr < values.length; itr++)
		    values[itr] = scanner.nextInt();
		float temp1 = 0,temp2 = 0,count1 = 0,count2 = 0,avg1 = 0,avg2 = 0;
		int j = 0,k = 0;
		for(int i = 0; i < values.length; i++){
			for(j = 0; j <= i; j++){
				temp1 += values[j];
				temp_arr[j] = values[j];
				count1++;
			}avg1 = temp1 / count1;
			for(k = i+1; k < values.length; k++){
				temp2 += values[k];
				temp_arr[k] = values[k];
				count2++;
			}avg2 = temp2 / count2;
			if(avg1 == avg2){
				for(int l = 0; l < temp_arr.length;l++){
					if(l == count1-1)
					   System.out.print(temp_arr[l]+"  ");
					else
					   System.out.print(temp_arr[l]+" ");
				}
				break;
			}
			else if(i == values.length - 1)
			    System.out.println("Not Possible");
			temp1 = temp2 = count1 = count2 = 0;
		}
	}
}
