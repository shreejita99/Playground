#include <stdio.h>
int main()
{
   int n,m,res;
  scanf("%d",&n);
  scanf("%d",&m);
  if(n<m)
    res=n;
  else
    res=m;
  if(res%2==0)
    printf("Mani Iyer");
  else
    printf("Arun Gupta");
    return 0;
}