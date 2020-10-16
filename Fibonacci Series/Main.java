#include <stdio.h>
int fibo(int num)
{
  while(num!=0)
  if(num==1 || num==2)
  {
  return (num-1);
  }
  else
  {
  return (fibo(num-1)+fibo(num-2));
  }
}
int main()
{
  int n,result;
  scanf("%d",&n);
  result=fibo(n);
  printf("The term %d in the fibonacci series is %d",n,result);
   return 0;
}