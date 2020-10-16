#include <stdio.h>
int power(int c,int d)
{
  int r;
  if(d==0)
    return 1;
  r=(c * power(c,d-1));
  return r;
}
int main()
{
  int a,n,res;
  printf("Enter the value of a\n");
  scanf("%d",&a);
  printf("Enter the value of n\n");
  scanf("%d",&n);
  res=power(a,n);
  printf("The value of %d power %d is %d",a,n,res);
   return 0;
}