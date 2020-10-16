#include <stdio.h>
int main()
{
  int a,b,c,d,dollar,cent,rem;
  scanf("%d",&a);
  scanf("%d",&b);
  scanf("%d",&c);
  scanf("%d",&d);
  dollar=a+c;
  cent=b+d;
  if(cent>100)
  {
    rem=cent%100;
    dollar+=(cent/100);
  printf("%d",dollar);
  printf("\n");
  printf("%d",rem);
  }
  else
  {
    printf("%d",dollar);
    printf("\n");
    printf("%d",cent);
  }
  return 0;
}