import java.util.*;
class SitasGifts{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int rates[] = new int[4];
		int temp = 0,min_price = 0,max_price = 0,budget;
		budget = scanner.nextInt();
		for(int itr = 0; itr < 4; itr++){
			rates[itr] = scanner.nextInt();
		}
			 for(int i = 0;i<rates.length;i++){
			 	for(int j = i+1;j<rates.length;j++){
			 		if(rates[i] > rates[j]){
			 	 		temp = rates[i];
			 	 		rates[i] = rates[j];
			 	 		rates[j] = temp; 
			 	 		} 
			 	 } 		
			 }
			for(int k = 0;k < 3; k++)
				min_price += rates[k];
			 for(int l = rates.length - 1;l > 0; l--)
				max_price += rates[l];
			 System.out.printf("%d\n%d",min_price,max_price);
	}
}
