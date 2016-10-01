#include<stdio.h>
int main(){
int value[200];
int time = 1,t = 0;
int interval = 3,num = 3;
for(time;time <100;time++){
	while(num >= 1){
		if(num ==1){
			value[time] = num;
			interval *= 2;
			num = interval;
			}
		else{
			value[time] = num;
			num--;
			}
	break;
	}
}
printf("Enter the time");
scanf("%d",&t);
printf("\nThe value at time %d is %d",t,value[t]);
return 0;
} 
