#include<stdio.h>
int main()
{
  int a;
  scanf("%d",&a);
  int SecondLast=(a%100)/10;
  printf("%d",SecondLast);
  return 0;
}