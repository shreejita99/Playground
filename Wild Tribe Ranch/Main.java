#include <stdio.h>
int main()
{
  int a,b;
  scanf("%d",&a);
  scanf("%d",&b);
  if(a>b)
  {
    printf("Yes, you can enter.");
  }
  else if (a<b)
  {
    printf("Sorry, you can't enter");
  }
  else
  {
    printf("Yes, you can enter. Kindly use a rope.");
  }
  return 0;
}