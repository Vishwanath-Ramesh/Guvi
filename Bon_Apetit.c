#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
	int n = 0,a = 0,i,j,total,paid = 0,b = 0,repay = 0;
	int items[n-1];
    	printf("Enter the number of items");
	scanf("%d",&n);
	printf("Enter the item which A didn't buy");
	scanf("%d",&a);
	printf("Enter the cost of each items");
	for(i = 0; i<n; i++)
		scanf("%d",&items[i]);
	for(j = 0; j<n; j++)
		total = total + items[j];
	printf("A is:%d",total);
	printf("Enter the amount A pays");
	scanf("%d",&paid);
	b = (total - items[a])/2;
	if(b == paid)
		printf("Bon Apetit");
	else{
		repay = paid - b;
		printf("The amount B has to repay to A is: %d",repay);
		}
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */    
    return 0;
}

