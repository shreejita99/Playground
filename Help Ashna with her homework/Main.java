#include<stdio.h>
int main()
{
  int a,b,sum,dif,p,q,rem;
  scanf("%d",&a);
  scanf("%d",&b);
  sum=a+b;
  dif=a-b;
  p=a*b;
  q=a/b;
  rem=a%b;
  printf("a+b=%d\n",sum);
    printf("a-b=%d\n",dif);
    printf("a*b=%d\n",p);
    printf("a/b=%d\n",q);
    printf("a%b=%d\n",rem);
}