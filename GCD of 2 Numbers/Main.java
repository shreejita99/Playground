#include <stdio.h>
int gcd(int a,int c, int b)
{
  if((c%a == 0) && (b%a == 0))
  {
    return a;
  }
  gcd(a-1,c,b);
}
void main()
{
  int m,n,temp;
  scanf("%d%d",&m,&n);
  printf("G.C.D of %d and %d = ",m,n);
  if(m>n)
  {
    temp = m;
    m = n;
    n = temp;
  }
  printf("%d",gcd(m,m,n));
}
