#include <stdio.h>
int main(void) {
	int NoOfMembers = 0,i,temp,l,j,k,tallest;
	printf("Enter Number of Members in a class");
	scanf("%d",&NoOfMembers);
	int members[NoOfMembers];
	for(i = 0; i < sizeof(members)/sizeof(members[0]); i++)
	    scanf("%d",&members[i]);
	for(j = 0; j < sizeof(members)/sizeof(members[0]); j++){
	    for(k = 0; k < sizeof(members)/sizeof(members[0] && j != k); k++){
	        if(members[k] < members[j]){
	            temp = members[j];
	            members[j] = members[k];
	            members[k] = temp;
	        }
	    }
	}
	printf("\nEnter the value of tallest student:");
	scanf("%d",&tallest);
	printf("\nThe %d tallest student in class is: %d",tallest,members[tallest-1]);
	return 0;
}


