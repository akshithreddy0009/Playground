#include <stdio.h>
int main() {
  int n;
  scanf("%d",&n);
  while(n>99)
  {
  n=n/10;
  }
  int Second=n%10;
  printf("%d",Second);
  return 0;
}