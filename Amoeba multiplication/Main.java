#include <stdio.h>
int main()
{
   int n,a=0,b=1,c,i;
  scanf("%d",&n);
  for(i=0;i<=n-3;i++)
  {
    c=a+b;
    a=b;
    b=c;
    //printf("%d",c);
    
  }
    printf("%d",c);

  
   return 0;
}