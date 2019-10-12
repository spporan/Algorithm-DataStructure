#include<stdio.h>

int linearSearch(int arr[],int n,int x){
int j;

for(j=0;j<n;j++){
    if(arr[j]==x){
        return j;
    }
}
 j=-1;
    return j;

}

int main(){
    int n,x,i;
    int arr[100];
    printf("Enter size of array:\n");
     scanf("%d",&n);
     printf("Enter Array element:\n");

     for(i=0;i<n;i++){
        scanf("%d",&arr[i]);
     }
     printf("Enter your Search Item:\n");
     scanf("%d",&x);

     printf("Your Search Result is:\n");
     int result=linearSearch(arr,n,x);
     if(result!=-1){
        printf("%d",arr[result]);
     }else{
        printf("Not found");
     }

     /*
     This algorithm Time complexity :O(n) and Space complexity O(n);


     */
}

