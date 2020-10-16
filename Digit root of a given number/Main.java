#include <stdio.h>
int sum_of_digit(int n) 
{  
  int sum;
    if (n == 0) 
       return 0; 
   sum=(n % 10) + sum_of_digit(n / 10);
  if(sum>=9)
  {
    sum=(sum % 10) + sum_of_digit(sum / 10);
  }
    return (sum); 
}
  
  
int main()
{
   int m,res;
  scanf("%d",&m);
      res=sum_of_digit(m);
  printf("%d",res);          
   return 0;
}