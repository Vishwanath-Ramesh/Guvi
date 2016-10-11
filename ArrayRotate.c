#include<stdio.h>
int main(){
	int num,i,j,k,count = 1,rotate;
	printf("Enter the number of elements");
	scanf("%d",&num);
	printf("Enter the number of elements to rotate");
	scanf("%d",&rotate);
	int values[num*2];
	printf("Enter the values");
	for(i = 1;i <= num;i++)
		scanf("%d",&values[i]);
	for(j = 1;j <= rotate;j++){
		values[num+j] = values[j];
		count++;
		}
	for(k = count;k < num+count;k++)
		printf("%d ",values[k]);
	return 0;
}
