#include <stdio.h>
int main()
{
  int r,c,i,j,x=0,sum=0;
  scanf("%d%d",&r,&c);
  int a[r][c];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      scanf("%d",&a[i][j]);
    }
    x+=a[i][c-1-i];
    } 
  for(j=0;j<c-1;j++)
  {
      i=0;
   x+=a[i][j];
   }
   for(j=1;j<c;j++)
   {
     i=r-1;
     x+=a[i][j];
   }
  printf("Sum of Zig-Zag pattern is %d",x);
  
   return 0;
}