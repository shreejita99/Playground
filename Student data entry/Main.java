#include <stdio.h>
struct student
   {
     char name[100];
     int roll;
     int marks;
   }s;
int main()
{

  scanf("%[^\n]",&s.name);
  scanf("%d",&s.roll);
  scanf("%d",&s.marks);
  printf("\nStudent Details\n");
  printf("Name: %s\n",s.name);
  printf("Roll: %d\n",s.roll);
  printf("Marks: %d",s.marks);

   return 0;
}