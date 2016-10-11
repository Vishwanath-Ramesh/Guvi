#include<stdio.h>
#include<string.h>
int i = 0;
char string[] = "",temp = ' ';
int main(){
	scanf("%s",string);
	for(i = 0;i < strlen(string);i++){
		if(i%2 == 0){
			temp = string[i];
			string[i] = string[i+1];
			string[i+1] = temp;
			}
		}
	printf("%s",string);
	return 0;
}
