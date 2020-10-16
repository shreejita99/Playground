#include <stdio.h>
int main()
{
  int m,n,i,j,b;
  scanf("%d",&m);
  scanf("%d",&n);
  int a[m][n];
  for(i=0;i<m;i++)
  {
    for(j=0;j<n;j++)
    {
      scanf("%d",&a[i][j]);
    }
  }
  for(j=0;j<n;j++)
  {
    for(i=0;i<m-1;i++)
    {
      if(a[i][j]>a[i+1][j])
      {
        b=a[i][j];
      }
     else
       b=a[i+1][j];
    }
    printf("%d\n",b);
  }

   return 0;
}