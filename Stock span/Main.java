#include <stdio.h>
int main()
{
  
int n,x=1,y=0,i;

scanf("%d",&n);

 int a[n];

 for(int i=0;i<n;i++)

   scanf("%d",&a[i]);

 printf("%d",x);

 for(int i=1;i<n;i++){

   if(a[i]<a[i-1])

     printf("\n%d",x);

   else
   {
     y+=2;

     printf("\n%d",y);
            }
 }
   return 0;
            }

 


