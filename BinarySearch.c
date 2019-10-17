#include<stdio.h>

int binartSearch(int arr[],int n,int x)
{
    int left,mid,right;
    left=0;
    right=n-1;

    while(left<=right)
    {
        mid=(left+right)/2;

        if(arr[mid]==x)
        {
            return mid;
        }
        else if(arr[mid]>x)
        {
            right=mid-1;
        }
        else
        {
            left=mid+1;
        }
    }

    return -1;
}

int main()
{
    int n,x,i;
    int arr[100];
    printf("Enter size of array:\n");
    scanf("%d",&n);
    printf("Enter Array element:\n");

    for(i=0; i<n; i++)
    {
        scanf("%d",&arr[i]);
    }
    printf("Enter your Search Item:\n");
    scanf("%d",&x);

    printf("Your Search Result is:\n");
    int result=binartSearch(arr,n,x);
    if(result!=-1)
    {
        printf("%d",arr[result]);
    }
    else
    {
        printf("Not found");
    }

    /*
    Binary Search algorithm Time complexity :O(log2^n) and Space complexity O(1);


    */
}
