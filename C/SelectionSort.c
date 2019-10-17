#include <stdio.h>


void selectionSort(int arr[],int n){
    int temp,min_index,i,j;

    for(i=0;i<n-1;i++){
        min_index=i;

        for(j=i+1;j<n;j++){
            if(arr[min_index]>arr[j]){
                min_index=j;
            }
        }

        if(min_index !=i){
            temp=arr[i];
            arr[i]=arr[min_index];
            arr[min_index]=temp;
        }
    }
    printArray(arr,n);
}

void printArray(int arr[],int n){
    printf("Sorted Array:\n");
    for(int i=0;i<n;i++){
        printf("%d :%d \n",i,arr[i]);
    }
}

int main()
{
    int n,i;
    int arr[100];
    printf("Enter size of array:\n");
    scanf("%d",&n);
    printf("Enter unsorted Array element:\n");

    for(i=0; i<n; i++)
    {
        scanf("%d",&arr[i]);
    }

   selectionSort(arr,n);

    /*
    Select algorithm Time complexity :O(n^2) and Space complexity O(1);
    */
}
