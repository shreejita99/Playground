#include <stdio.h>
#include<math.h>
int main()
{
   int m,n,a,req;
  scanf("%d",&m);
  scanf("%d",&n);
  scanf("%d",&req);
  a=pow(m,n);
  //printf("%d",a);
  if(req<=a)
    printf("Doctor, you can proceed with your experiment.");
  else
    printf("Sorry Doctor! You need more bacteria.");
   return 0;
}