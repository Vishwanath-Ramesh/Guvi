#include<stdio.h>
int digit=0;
int digits(int temp){
    int count =0;
    while(temp != 0){
        temp /= 10;
        count++;
    }
    return count;
}
int split(int temp2){
    int temp3,temp4=1,sum=0,i;
    while(temp2 != 0){
    temp3 = temp2 % 10;
    temp2 /= 10;
    for(i=1;i<=digit;i++)
         temp4*=temp3;
    sum+=temp4;temp4=1;
    }
    return sum;
}
int main(){
    int value,total;
    printf("Enter the Number(>9):");
    scanf("%d",&value);
    digit = digits(value);
    total = split(value);
    printf("The Sum is %d",total);
    return 0;
}

