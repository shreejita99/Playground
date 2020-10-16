#include <stdio.h>
void main()
{
  int i,y;
  char str[100];
  scanf("%[^\n]s",str);
  y = strlen(str);
  for(i=y-1;i>=0;i--)
  {
    printf("%c",str[i]);
  }
}