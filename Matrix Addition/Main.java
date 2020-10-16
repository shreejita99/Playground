#include <stdio.h>
int main()
{
  int row,column,a[50][50],b[50][50],sum[50][50],i,j;
  scanf("%d",&row);
  scanf("%d",&column);
  for(i=0;i<row;i++)
  {
    for(j=0;j<column;j++)
    {
      scanf("%d",&a[i][j]);
    }
  }
  for(i=0;i<row;i++)
  {
    for(j=0;j<column;j++)
    {
      scanf("%d",&b[i][j]);
    }
  }
   for(i=0;i<row;i++)
  {
    for(j=0;j<column;j++)
    {
      sum[i][j]=a[i][j]+b[i][j];
      printf("%d ",sum[i][j]);
      if (j == column - 1) 
      printf("\n");
    }
   }
   return 0;
}