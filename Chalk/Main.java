#include <stdio.h>
int main()
{
   int n,small,total;
  scanf("%d",&n);
  small=n*(1/(sqrt(n)));
  total=n+(small+1);
  printf("%d",total);
  return 0;
}
