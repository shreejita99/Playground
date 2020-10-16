#include <stdio.h>
int main()
{
   int n,count=0;
  scanf("%d",&n);
  printf("%d\n",n);
  while(n!=1)
  {
    if(n%2==0)
    {
      n=n/2;
      printf("%d",n);
      printf("\n");
     }
    else
    {
      n=(3*n)+1;
      printf("%d",n);
      printf("\n");
    }
    count++;
   
  }
    printf("%d",count);
   return 0;
}