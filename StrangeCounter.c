#include<stdio.h>
int main(){
    int value[10];
    int time,num = 3,t = 0;
    for(time = 1;time < 10;time++){
        while(num >= 1){
            if(num == 1){
              value[time]=num;
                num = value[time]+3;
              }
            else{
              value[time]=num;
            }
            num--;
            break;
    }
        }
    printf("Enter the time\n");
    scanf("%d",&t);
    printf("The value at time %d is %d\n",t,value[t]);
    return 0;
}

