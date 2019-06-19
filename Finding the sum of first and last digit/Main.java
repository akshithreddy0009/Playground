#include <stdio.h>
int main() {
	int n;
  scanf("%d",&n);
  int Last=n%10;
  while(n>9)
  {
  n=n/10;
  }
  int First=n;
  printf("%d",First+Last);
	return 0;
}