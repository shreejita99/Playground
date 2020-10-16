#include <stdio.h>

int main()
{
    int n,i,j,x=0,y=0;
   // printf("Enter the dimensions of the square array");
    scanf("%d",&n);
    int a[n][n];
   // printf("Enter the elements of the array");
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            scanf("%d",&a[i][j]);
            if(i==j)
            {
                x+=a[i][j];
            }
        }
        y+=a[i][n-1-i];
    }
   // printf("%d\n",x);
   // printf("Sum of the backward diagonal is %d\n",y);
    if(x==y)
    {
        printf("Yes");
    }
    else
    {
        printf("No");
    }
    return 0;
}