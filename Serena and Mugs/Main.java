#include <stdio.h>
int main()
{
  int a,b,c,d,e;
  scanf("%d%d",&a,&b);
  scanf("%d%d%d",&c,&d,&e);
  if(b>=(c+d+e))
     {
     printf("YES");
     }
     else
     {
     printf("NO");
     }
  
   return 0;
}