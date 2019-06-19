#include<stdio.h>
int main()
{
  int a;
  scanf("%d",&a);
  int FirstDigit=a/100;
  int ThirdDigit=a%10;
  printf("%d",FirstDigit+ThirdDigit);
  return 0;
}