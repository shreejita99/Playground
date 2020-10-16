#include <stdio.h>
int main()
{
   int weight,adult,child;
  scanf("%d",&weight);
  scanf("%d",&adult);
  scanf("%d",&child);
  if(weight>=(adult*75) + (child*30))
  {
    printf("Boat is stable");
  }
  else
   printf("Boat will drow");
  return 0;
}