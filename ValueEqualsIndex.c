#include<stdio.h>
int main(){
	int values[] = {-3,-1,1,3,5},i = 0;
	for(i = 0; i < sizeof(values)/sizeof(values[0]); i++){
		if(values[i] == i)
			printf("%d",values[i]);
	}
	return 0;
}
