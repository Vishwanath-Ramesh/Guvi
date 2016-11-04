#include<stdio.h>
int main(){
    int turns = 1,distance=1,value;
    scanf("%d",&value);
    while(1){
        if(turns==1){
           distance=1;
           turns++;}
        else{
        distance += distance;
        turns++;}
        if(distance==value){
            printf("True");
            printf("\nThe Dog reaches the end at %d Jumps/Turns.",turns-1);
            break;}
        else if(distance > value){
            printf("False");
            break;}
    }
    return 0;
}

