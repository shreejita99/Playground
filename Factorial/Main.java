#include <stdio.h>
int factorial(int num)
{
  int res;
  if(num==0)
  {
    return 1;
  }
    res=num * factorial(num-1);
  
}
  
int main()
{
   int n,fact;
  scanf("%d",&n);
  fact=factorial(n);
  printf("The factorial of %d is %d",n,fact);
   return 0;
}