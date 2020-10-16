#include <stdio.h>
int main()
{
  int n,a[15],i,even=0,odd=0;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  for(i=0;i<n;i++)
  {
    if(a[i]%2==0)
    {
      even=even+a[i];
    }
    else
    {
      odd=odd+a[i];
    }
  }
  printf("The sum of the even numbers in the array is %d\n",even);
  printf("The sum of the odd numbers in the array is %d",odd);
  
   return 0;
}